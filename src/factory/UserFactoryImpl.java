package factory;

import business.model.Usuario;

public class UserFactoryImpl implements UserFactory {
    @Override
    public Usuario createUser(String username, String password, String nomeCompleto, String dataNascimento, String telefone, String endereco, Boolean aluno, Boolean professor) {
        return new Usuario(username, password, nomeCompleto, dataNascimento, telefone, endereco, aluno, professor);
    }

}
