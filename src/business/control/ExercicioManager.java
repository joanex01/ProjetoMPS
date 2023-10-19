package business.control;

import business.model.Exercicio;

import infra.ExerciseFile;
import infra.InfraException;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ExercicioManager {
    private List<Exercicio> exercicios;
    private ExerciseFile exerciseFile;
    private final String FILENAME = "src/database/exercises.bin";

    public ExercicioManager() throws InfraException {
        exerciseFile = new ExerciseFile();
        exercicios = exerciseFile.loadExercises();
        /*File file = new File(FILENAME);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            exercicios = exerciseFile.loadExercises(); // Carregue os exercícios do arquivo, se o arquivo existir
        }*/
    }

    public void adicionarExercicio(Exercicio exercicio) {
        exercicios.add(exercicio);
        exerciseFile.saveExercises(exercicios); // Após adicionar um novo usuário, salve a lista atualizada no arquivo
    }

    public List<Exercicio> getExercicios() {
        return exercicios;
    }

        public Exercicio buscarExercicio(String name) {
        for (Exercicio exercicio : exercicios) {
            if (exercicio.getName().equals(name)) {
                return exercicio; // Retorna o usuário se encontrado
            }
        }
        return null; // Retorna null se o usuário não for encontrado
    }
}
