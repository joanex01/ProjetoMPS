/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import business.model.Exercicio;
import business.model.Usuario;
import infra.InfraException;
import infra.ListaExercicioAdapter;

import java.util.List;

/**
 *
 * @author Marcus
 */
public class TelaAluno extends javax.swing.JPanel {

     List<Exercicio> exercicios;

    public TelaAluno(Usuario aluno) throws InfraException {
        ListaExercicioAdapter adapter = new ListaExercicioAdapter();
        try {
            exercicios = adapter.obterListaExercicio();
        } catch (InfraException e) {
            throw new RuntimeException(e);
        }

        initComponents(aluno.getNomeCompleto());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents(String nomeCompleto) {
        jPanel1 = new javax.swing.JPanel();
        btnCadastroTreino = new javax.swing.JButton();
        btnVerTreino = new javax.swing.JButton();
        nomeUsuario = new javax.swing.JLabel(nomeCompleto);

        btnCadastroTreino.setText("Cadastrar treino");
        btnCadastroTreino.setToolTipText("");
        btnCadastroTreino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroTreinoActionPerformed(evt);
            }
        });

        btnVerTreino.setText("Ver treino");
        btnVerTreino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerTreinoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(nomeUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnCadastroTreino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnVerTreino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(155, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(nomeUsuario)
                                .addGap(29, 29, 29)
                                .addComponent(btnCadastroTreino)
                                .addGap(29, 29, 29)
                                .addComponent(btnVerTreino)
                                .addContainerGap(95, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup() // javax.swing.GroupLayout.Alignment.TRAILING,
                                .addContainerGap(32, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(10, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastroTreinoActionPerformed(java.awt.event.ActionEvent evt) {

    }
    private void btnVerTreinoActionPerformed(java.awt.event.ActionEvent evt) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastroTreino;
    private javax.swing.JButton btnVerTreino;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nomeUsuario;

    // End of variables declaration//GEN-END:variables
}
