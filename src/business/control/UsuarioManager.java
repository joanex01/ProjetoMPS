package business.control;

import business.model.Usuario;
import factory.UserFactoryImpl;
import infra.InfraException;
import infra.InfraException;
import infra.UserFile;
import infra.UsuarioMemento;
import util.LoginInvalidException;
import util.PasswordInvalidException;
import util.UserValidador;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class UsuarioManager {
    private Stack<UsuarioMemento> historico = new Stack<>();
    private List<Usuario> usuarios;
    UserFile userFile;
    UserFactoryImpl userFactory = new UserFactoryImpl();
    private static UsuarioManager instance;
    //private final String FILENAME = "src/database/usuarios.bin";

    public UsuarioManager() throws InfraException {
        userFile = new UserFile();
        usuarios = userFile.carregarUsuarios();
    }

    public static UsuarioManager getInstance() throws InfraException {
        if (instance == null) {
            instance = new UsuarioManager();
        }
        return instance;
    }
    public void adicionarUsuario(String username, String password, String nomeCompleto, String dataNascimento, String telefone, String endereco, Boolean aluno, Boolean professor) throws LoginInvalidException, PasswordInvalidException {
        Usuario usuario = userFactory.createUser(username, password, nomeCompleto, dataNascimento, telefone, endereco, aluno, professor);
        salvarEstado();
        userFactory.salvarUsuarios(usuarios, usuario); // Após adicionar um novo usuário, salve a lista atualizada no arquivo
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
    public void removerUsuario(Usuario usuario) {
        // Remova o usuário da lista
        usuarios.remove(usuario);
        // Salve o estado atual antes da atualização
        salvarEstado();
    }
    public void desfazerAtualizacao() {
        if (!historico.isEmpty()) {
            UsuarioMemento memento = historico.pop();
            List<Usuario> usuariosRestaurados = memento.getEstadoSalvo();
            // Substitua a lista de usuários atual pelos dados restaurados
            this.usuarios = new ArrayList<>(usuariosRestaurados);
        }
    }
    private void salvarEstado() {
        historico.push(new UsuarioMemento(new ArrayList<>(usuarios)));
    }
}
