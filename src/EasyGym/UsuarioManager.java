package EasyGym;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioManager {
    private List<Usuario> usuarios;
    private final String FILENAME = "usuarios.bin";

    public UsuarioManager() {
        usuarios = new ArrayList<>();
        File file = new File(FILENAME);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            carregarUsuarios(); // Carregue os usuários do arquivo, se o arquivo existir
        }
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        salvarUsuarios(); // Após adicionar um novo usuário, salve a lista atualizada no arquivo
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void salvarUsuarios() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILENAME))) {
            oos.writeObject(usuarios);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void carregarUsuarios() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILENAME))) {
            usuarios = (List<Usuario>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
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
