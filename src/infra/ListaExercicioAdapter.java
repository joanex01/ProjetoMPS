package infra;

import business.control.ExercicioManager;
import business.model.Exercicio;

import java.util.List;

public class ListaExercicioAdapter implements ListaExercicio {

    private ExerciseFile exerciseFile;

    public ListaExercicioAdapter(ExerciseFile exerciseFile) {
        this.exerciseFile = exerciseFile;
    }

    @Override
    public List<Exercicio> obterListaExercicio() throws InfraException {
        List<Exercicio> exercicios = exerciseFile.loadExercises();
        return exercicios;
    }
}
