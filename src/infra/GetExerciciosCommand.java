package infra;

import business.control.ExercicioManager;
import business.model.Exercicio;

import java.util.List;

public class GetExerciciosCommand implements Command{
    private ExercicioManager exercicioManager;
    private List<Exercicio> exercicios;

    public GetExerciciosCommand(ExercicioManager exercicioManager) {
        this.exercicioManager = exercicioManager;
    }

    @Override
    public void execute() {
        exercicios = exercicioManager.getExercicios();
    }

    public List<Exercicio> getExercicios() {
        return exercicios;
    }
}
