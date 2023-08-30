/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EasyGym;

/**
 *
 * @author Marcus
 */

import java.io.Serializable;

public class Usuario implements Serializable {
    private String username;
    private String password;
    private String nomeCompleto;
    private String dataNascimento;
    private String telefone;
    private String endereco;
    private boolean aluno;
    private boolean professor;
    private boolean administrador;

    public Usuario(String username, String password, String nomeCompleto, String telefone,
                   String endereco, boolean aluno, boolean professor, boolean administrador) {
        this.username = username;
        this.password = password;
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.endereco = endereco;
        this.aluno = aluno;
        this.professor = professor;
        this.administrador = administrador;
    }

    // Getters e setters para todos os campos

    // Outros métodos, se necessário

    Object getPassword() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

