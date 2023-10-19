package infra;

import business.model.Usuario;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class LoadUser {
    public List<Usuario> carregarUsuarios(String FILENAME, List<Usuario> usuarios) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILENAME))) {
            usuarios = (List<Usuario>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return usuarios;
    }
}
