package business.control;

import business.model.Exercicio;

import factory.ExerciseFactory;
import factory.ExerciseFactoryImpl;
import infra.ExerciseFile;
import infra.InfraException;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ExercicioManager {
    private List<Exercicio> exercicios;
    private ExerciseFile exerciseFile;
    private static ExercicioManager instance;
    private static ExerciseFactoryImpl exerciseFactory = new ExerciseFactoryImpl();

    public ExercicioManager() throws InfraException {
        exerciseFile = new ExerciseFile();
        exercicios = exerciseFile.loadExercises();
    }
    public static ExercicioManager getInstance() throws InfraException {
        if (instance == null) {
            instance = new ExercicioManager();
        }
        return instance;
    }

    public void adicionarExercicio(String name, String description) {
        Exercicio exercicio = exerciseFactory.createExercise(name, description);
        exercicios.add(exercicio);
        exerciseFile.saveExercises(exercicios); // Após adicionar um novo usuário, salve a lista atualizada no arquivo
    }

    public List<Exercicio> getExercicios() {
        return exercicios;
    }

    public Exercicio buscarExercicio(String name) {
        for (Exercicio exercicio : exercicios) {
            if (exercicio.getName().equals(name)) {
                return exercicio; // Retorna o exercício se encontrado
            }
        }
        return null; // Retorna null se o exercício não for encontrado
    }
}
