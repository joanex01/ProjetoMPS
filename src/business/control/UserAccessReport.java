package business.control;
import java.util.List;
import java.util.Map;

import business.model.Usuario;
import infra.InfraException;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public abstract class UserAccessReport {

    protected abstract FileWriter openFile(String fileName);
    protected abstract void generateHeader(BufferedWriter bufferedWriter) throws IOException;
    protected abstract void generateBody(Usuario usuario, BufferedWriter bufferedWriter) throws IOException;
    protected abstract void generateFooter(BufferedWriter bufferedWriter) throws IOException;

    public final void generateReport(String fileName) throws InfraException, IOException{

        FileWriter fileWriter = openFile(fileName);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        generateHeader(bufferedWriter);
        
        UsuarioManager usuarioManager = new UsuarioManager();
        List<Usuario> usuarios = usuarioManager.getUsuarios();

        for (Usuario usuario : usuarios){
            generateBody(usuario, bufferedWriter);
        }

        generateFooter(bufferedWriter);

        bufferedWriter.close();
        fileWriter.close();
    }
}
