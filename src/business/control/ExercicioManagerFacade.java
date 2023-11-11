package business.control;

import business.model.Exercicio;
import factory.ExerciseFactoryImpl;
import infra.*;
import util.LoginInvalidException;
import util.PasswordInvalidException;

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

    public void adicionarExercicio(String name, String description) throws LoginInvalidException, PasswordInvalidException {
        Command adicionarExercicioCommand = new AdicionarExercicioCommand(exercicioManager, name, description);
        adicionarExercicioCommand.execute();
    }

    public List<Exercicio> getExercicios() {
        GetExerciciosCommand getExerciciosCommand = new GetExerciciosCommand(exercicioManager);
        getExerciciosCommand.execute();
        return getExerciciosCommand.getExercicios();
    }

    public Exercicio buscarExercicio(String name) throws LoginInvalidException, PasswordInvalidException {
        BuscarExercicioCommand buscarExercicioCommand = new BuscarExercicioCommand(exercicioManager, name);
        buscarExercicioCommand.execute();
        return buscarExercicioCommand.getExercicioEncontrado();
    }

    public void desfazerAtualizacaoUsuarios() {
        exercicioManager.desfazerAtualizacao();
    }
}
