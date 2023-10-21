package infra;

import business.model.Exercicio;

import java.util.List;

public interface ListaExercicio {
    List<Exercicio> obterListaExercicio() throws InfraException;
}
