package infra;

import business.model.Exercicio;
import business.model.Usuario;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class LoadExercicio {
    public List<Exercicio> carregarExercicios(String FILENAME, List<Exercicio> exercicios) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILENAME))) {
            exercicios = (List<Exercicio>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return exercicios;
    }
}
