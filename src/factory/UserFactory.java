package factory;

import business.model.Usuario;
import util.LoginInvalidException;
import util.PasswordInvalidException;

public interface UserFactory {
    Usuario createUser(String username, String password, String nomeCompleto, String dataNascimento, String telefone, String endereco, Boolean aluno, Boolean professor) throws LoginInvalidException, PasswordInvalidException;
}
