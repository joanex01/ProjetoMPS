package business.control;

import business.model.Exercicio;
import factory.ExerciseFactoryImpl;
import infra.ExerciseFile;
import infra.InfraException;

import java.util.List;

public class ExercicioManagerFacade {
    private static ExercicioManagerFacade instance;
    private ExercicioManager exercicioManager;

    private ExercicioManagerFacade() throws InfraException {
        exercicioManager = ExercicioManager.getInstance();
    }

    public static ExercicioManagerFacade getInstance() throws InfraException {
        if (instance == null) {
            instance = new ExercicioManagerFacade();
        }
        return instance;
    }

    public void adicionarExercicio(String name, String description) {
        exercicioManager.adicionarExercicio(name, description);
    }

    public List<Exercicio> getExercicios() {
        return exercicioManager.getExercicios();
    }

    public Exercicio buscarExercicio(String name) {
        return exercicioManager.buscarExercicio(name);
    }
}
