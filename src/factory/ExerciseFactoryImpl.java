package factory;

import business.model.Exercicio;

public class ExerciseFactoryImpl implements ExerciseFactory {
    @Override
    public Exercicio createExercise(String name, String description) {
        return new Exercicio(name, description);
    }

}
