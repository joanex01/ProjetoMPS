package infra;

import business.control.ExercicioManager;
import business.model.Exercicio;

import java.util.List;

public class ListaExercicioAdapter implements ListaExercicio {
    public ListaExercicioAdapter() {
    }

    public List<Exercicio> obterListaExercicio() throws InfraException {
        ExerciseFile exerciseFile = new ExerciseFile();
        List<Exercicio> exercicios = exerciseFile.loadExercises();

        return exercicios;
    }
}
