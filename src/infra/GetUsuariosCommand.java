package infra;

import business.control.UsuarioManager;
import business.model.Usuario;

import java.util.List;

public class GetUsuariosCommand implements Command{
    private UsuarioManager usuarioManager;
    private List<Usuario> usuarios;

    public GetUsuariosCommand(UsuarioManager usuarioManager) {
        this.usuarioManager = usuarioManager;
    }

    @Override
    public void execute() {
        usuarios = usuarioManager.getUsuarios();
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }
}
