package factory;

import business.model.Exercicio;
import infra.ExerciseFile;

import java.util.List;

public class ExerciseFactoryImpl implements ExerciseFactory {
    @Override
    public Exercicio createExercise(String name, String description) {
        return new Exercicio(name, description);
    }
    public void salvarExercicio(List<Exercicio> exercicios, Exercicio exercicio){
        ExerciseFile exerciseFile = new ExerciseFile();
        exercicios.add(exercicio);
        exerciseFile.saveExercises(exercicios);
    }

}
