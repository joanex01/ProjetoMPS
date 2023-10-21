package factory;

import business.model.Usuario;

public interface UserFactory {
    Usuario createUser(String username, String password, String nomeCompleto, String dataNascimento, String telefone, String endereco, Boolean aluno, Boolean professor);
}
