package infra;

import business.control.ExercicioManager;
import business.model.Exercicio;

public class BuscarExercicioCommand implements Command{
    private ExercicioManager exercicioManager;
    private String name;
    private Exercicio exercicioEncontrado;

    public BuscarExercicioCommand(ExercicioManager exercicioManager, String name) {
        this.exercicioManager = exercicioManager;
        this.name = name;
    }

    @Override
    public void execute() {
        exercicioEncontrado = exercicioManager.buscarExercicio(name);
    }

    public Exercicio getExercicioEncontrado() {
        return exercicioEncontrado;
    }
}
