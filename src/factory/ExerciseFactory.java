package factory;

import business.model.Exercicio;

public interface ExerciseFactory {
    Exercicio createExercise(String name, String description);
}
