package business.model;

import java.io.Serializable;

public class Usuario implements Serializable {

    private static final long serialVersionUID = -4698430657586903637L;
    private String username;
    private String password;
    private String nomeCompleto;
    private String dataNascimento;
    private String telefone;
    private String endereco;
    private boolean aluno;
    private boolean professor;
    //private boolean administrador;


    public Usuario(String username, String password, String nomeCompleto, String dataNascimento,
                   String telefone, String endereco, boolean aluno,
                   boolean professor) {
        this.username = username;
        this.password = password;
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.endereco = endereco;
        this.aluno = aluno;
        this.professor = professor;
        //this.administrador = administrador;
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean isAluno() {
        return aluno;
    }

    public void setAluno(boolean aluno) {
        this.aluno = aluno;
    }

    public boolean isProfessor() {
        return professor;
    }

    public void setProfessor(boolean professor) {
        this.professor = professor;
    }

//    public boolean isAdministrador() {
//        return administrador;
//    }

//    public void setAdministrador(boolean administrador) {
//        this.administrador = administrador;
//    }


}
