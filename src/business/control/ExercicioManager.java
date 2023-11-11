package business.control;

import business.model.Exercicio;

import factory.ExerciseFactory;
import factory.ExerciseFactoryImpl;
import infra.ExercicioMemento;
import infra.ExerciseFile;
import infra.InfraException;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// ExercicioManager
public class ExercicioManager {
    private List<Exercicio> exercicios;
    private ExerciseFile exerciseFile;
    private static ExercicioManager instance;
    private static ExerciseFactoryImpl exerciseFactory = new ExerciseFactoryImpl();
    private Stack<ExercicioMemento> historico = new Stack<>();

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
        salvarEstado();
        exerciseFactory.salvarExercicio(exercicios, exercicio); // Após adicionar um novo usuário, salve a lista atualizada no arquivo
    }

    public void removerExercicio(Exercicio exercicio) {
        // Remova o usuário da lista
        exercicios.remove(exercicio);
        // Salve o estado atual antes da atualização
        salvarEstado();
    }

    public List<Exercicio> getExercicios() {
        return exercicios;
    }

    public void desfazerAtualizacao() {
        if (!historico.isEmpty()) {
            ExercicioMemento memento = historico.pop();
            List<Exercicio> exerciciosRestaurados = memento.getEstadoSalvo();
            this.exercicios = new ArrayList<>(exerciciosRestaurados);
        }
    }


    public Exercicio buscarExercicio(String name) {
        for (Exercicio exercicio : exercicios) {
            if (exercicio.getName().equals(name)) {
                return exercicio; // Retorna o exercício se encontrado
            }
        }
        return null; // Retorna null se o exercício não for encontrado
    }

    private void salvarEstado() {
        historico.push(new ExercicioMemento(new ArrayList<>(exercicios)));
    }
}
