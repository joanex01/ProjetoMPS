package infra;

import business.model.Exercicio;
import business.model.Usuario;

import java.util.List;

public class ExercicioMemento {
    private List<Exercicio> estado;

    public ExercicioMemento(List<Exercicio> estado) {
        this.estado = estado;
    }

    public List<Exercicio> getEstadoSalvo() {
        return estado;
    }
}
