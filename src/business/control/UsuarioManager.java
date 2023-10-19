package business.control;

import business.model.Usuario;
import infra.InfraException;
import infra.InfraException;
import infra.UserFile;
import util.LoginInvalidException;
import util.PasswordInvalidException;
import util.UserValidador;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioManager {
    private List<Usuario> usuarios;
    UserFile userFile;
    //private final String FILENAME = "src/database/usuarios.bin";

    public UsuarioManager() throws InfraException {
        userFile = new UserFile();
        usuarios = userFile.carregarUsuarios();
        /*usuarios = new ArrayList<>();
        File file = new File(FILENAME);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            usuarios = carregarUser.carregarUsuarios(FILENAME, usuarios); // Carregue os usuários do arquivo, se o arquivo existir
        }*/
    }

    public void adicionarUsuario(Usuario usuario) throws LoginInvalidException, PasswordInvalidException {
        UserValidador.validateName(usuario.getUsername());
        UserValidador.validatePassword(usuario.getPassword());
        usuarios.add(usuario);
        userFile.saveUsers(usuarios); // Após adicionar um novo usuário, salve a lista atualizada no arquivo
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public Usuario buscarUsuario(String username) {
        for (Usuario usuario : usuarios) {
            if (usuario.getUsername().equals(username)) {
                return usuario; // Retorna o usuário se encontrado
            }
        }
        return null; // Retorna null se o usuário não for encontrado
    }
}
