package infra;

import business.model.Exercicio;
import business.model.Usuario;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class SalvarExercicio {
    public void salvarExercicio(String FILENAME, List<Exercicio> exercicios) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILENAME))) {
            oos.writeObject(exercicios);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
