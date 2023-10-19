package business.model;

import java.io.Serializable;

public class Exercicio implements Serializable {

    private static final long serialVersionUID = -4698430657586903637L;
    private String name;
    private String description;
    //private boolean administrador;


    public Exercicio(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
