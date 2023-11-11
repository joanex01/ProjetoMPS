package factory;

import business.model.Usuario;
import util.LoginInvalidException;
import util.PasswordInvalidException;
import util.UserValidador;
import infra.UserFile;

import java.util.List;

public class UserFactoryImpl implements UserFactory {
    @Override
    public Usuario createUser(String username, String password, String nomeCompleto, String dataNascimento, String telefone, String endereco, Boolean aluno, Boolean professor) throws LoginInvalidException, PasswordInvalidException {
        Usuario usuario = new Usuario(username, password, nomeCompleto, dataNascimento, telefone, endereco, aluno, professor);
        UserValidador.validateName(usuario.getUsername());
        UserValidador.validatePassword(usuario.getPassword());
        return usuario;
    }

    public void salvarUsuarios(List<Usuario> usuarios, Usuario usuario) {
        UserFile userFile = new UserFile();
        usuarios.add(usuario);
        userFile.saveUsers(usuarios); // Após adicionar um novo usuário, salve a lista atualizada no arquivo
    }

}
