package infra;

import business.control.UsuarioManager;
import business.model.Usuario;

public class BuscarUsuarioCommand implements Command {
    private UsuarioManager usuarioManager;
    private String name;
    private Usuario usuarioEncontrado;

    public BuscarUsuarioCommand(UsuarioManager usuarioManager, String name) {
        this.usuarioManager = usuarioManager;
        this.name = name;
    }

    @Override
    public void execute() {
        usuarioEncontrado = usuarioManager.buscarUsuario(name);
    }

    public Usuario getUsuarioEncontrado() {
        return usuarioEncontrado;
    }
}
