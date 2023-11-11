package infra;

import business.control.ExercicioManager;

public class AdicionarExercicioCommand implements Command {
    private ExercicioManager exercicioManager;
    private String name;
    private String description;

    public AdicionarExercicioCommand(ExercicioManager exercicioManager, String name, String description) {
        this.exercicioManager = exercicioManager;
        this.name = name;
        this.description = description;
    }

    @Override
    public void execute() {
        exercicioManager.adicionarExercicio(name, description);
    }
}
