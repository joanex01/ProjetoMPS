package infra;

import business.control.UsuarioManager;
import util.LoginInvalidException;
import util.PasswordInvalidException;

public class AdicionarUsuarioCommand implements Command{
    private UsuarioManager usuarioManager;
    private String username;
    private String password;
    private String nomeCompleto;
    private String dataNascimento;
    private String telefone;
    private String endereco;
    private Boolean aluno;
    private Boolean professor;

    public AdicionarUsuarioCommand(UsuarioManager usuarioManager, String username, String password, String nomeCompleto, String dataNascimento, String telefone, String endereco, Boolean aluno, Boolean professor) {
        this.usuarioManager = usuarioManager;
        this.username = username;
        this.password = password;
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.endereco = endereco;
        this.aluno = aluno;
        this.professor = professor;
    }

    @Override
    public void execute() throws LoginInvalidException, PasswordInvalidException {
        usuarioManager.adicionarUsuario(username, password, nomeCompleto, dataNascimento, telefone, endereco, aluno, professor);
    }
}
