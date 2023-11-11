package infra;

import business.model.Usuario;

import java.util.List;
import java.util.Map;

public class UsuarioMemento {
    private List<Usuario> estado;

    public UsuarioMemento(List<Usuario> estado) {
        this.estado = estado;
    }

    public List<Usuario> getEstadoSalvo() {
        return estado;
    }
}
