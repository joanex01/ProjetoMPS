package business.control;

import business.model.Exercicio;

import factory.ExerciseFactory;
import factory.ExerciseFactoryImpl;
import infra.ExerciseFile;
import infra.InfraException;

import java.io.File;
import java.io.IOException;
import java.util.List;

// ExercicioManager
public class ExercicioManager {
    private List<Exercicio> exercicios;
    private ExerciseFile exerciseFile;
    private static ExercicioManager instance;
    private static ExerciseFactoryImpl exerciseFactory = new ExerciseFactoryImpl();

    private ExercicioManager() throws InfraException {
        try {
            exerciseFile = new ExerciseFile();
            exercicios = exerciseFile.loadExercises();
        } catch (InfraException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao inicializar ExercicioManager", e);
        }
    }

    public static ExercicioManager getInstance() {
        if (instance == null) {
            try {
                instance = new ExercicioManager();
            } catch (InfraException e) {
                throw new RuntimeException("Erro ao criar a instância de ExercicioManager", e);
            }
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
