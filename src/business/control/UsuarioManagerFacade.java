package business.control;

import business.model.Exercicio;
import business.model.Usuario;
import infra.*;
import util.LoginInvalidException;
import util.PasswordInvalidException;

import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class UsuarioManagerFacade {
    private static UsuarioManagerFacade instance;
    private Stack<UsuarioMemento> historico = new Stack<>();

    private UsuarioManager usuarioManager;

    UsuarioManagerFacade() throws InfraException {
        usuarioManager = UsuarioManager.getInstance();
    }

    public static UsuarioManagerFacade getInstance() throws InfraException {
        if (instance == null) {
            instance = new UsuarioManagerFacade();
        }
        return instance;
    }

    public void adicionarUsuario(String username, String password, String nomeCompleto, String dataNascimento, String telefone, String endereco, Boolean aluno, Boolean professor) throws LoginInvalidException, PasswordInvalidException {
        Command adicionarUsuarioCommand = new AdicionarUsuarioCommand(usuarioManager, username, password, nomeCompleto, dataNascimento, telefone, endereco, aluno, professor);
        try {
            adicionarUsuarioCommand.execute();
        } catch (LoginInvalidException | PasswordInvalidException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Usuario> getUsuarios() {
        GetUsuariosCommand getUsuariosCommand = new GetUsuariosCommand(usuarioManager);
        try {
            getUsuariosCommand.execute();
            return getUsuariosCommand.getUsuarios();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Usuario buscarUsuario(String name) {
        BuscarUsuarioCommand buscarUsuarioCommand = new BuscarUsuarioCommand(usuarioManager, name);
        try {
            buscarUsuarioCommand.execute();
            return buscarUsuarioCommand.getUsuarioEncontrado();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void desfazerAtualizacaoUsuarios() {
        usuarioManager.desfazerAtualizacao();
    }
}
