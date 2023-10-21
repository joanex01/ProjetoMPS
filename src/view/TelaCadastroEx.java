package view;

import business.control.ExercicioManager;
import business.model.Exercicio;
import infra.InfraException;

import javax.swing.*;
import java.awt.*;

public class TelaCadastroEx extends javax.swing.JPanel {

    private ExercicioManager exercicioManager;

    public TelaCadastroEx() throws InfraException {
        initComponents();

        exercicioManager = ExercicioManager.getInstance();
    }

    // @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        txtName = new javax.swing.JTextField();
        txtDescription = new javax.swing.JTextField();
        txtDescription.setPreferredSize(new Dimension(500, 100));
        jSeparator1 = new javax.swing.JSeparator();

        btnCadastrarEx = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de exercício"));

        txtName.setToolTipText("No mínimo 8 letras, no máximo 20");
        txtName.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome do exercício"));
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });

        txtDescription.setToolTipText("No mínimo 8 letras, no máximo 100");
        txtDescription.setBorder(javax.swing.BorderFactory.createTitledBorder("Descrição do exercício"));
        txtDescription.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescKeyTyped(evt);
            }
        });

        btnCadastrarEx.setText("Cadastrar exercício");
        btnCadastrarEx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarExActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup() //javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                .addGap(229, 229, 229)
                                                                                .addComponent(btnCadastrarEx)))
                                                        )))
                                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(112, 112, 112)
                                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtDescription, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(30, 30, 30)
                                                .addComponent(btnCadastrarEx)))
                                .addContainerGap(11, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    private void btnCadastrarExActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarExActionPerformed
        // TODO add your handling code here:
        String nome = txtName.getText();
        String descricao = txtDescription.getText();

        exercicioManager.adicionarExercicio(nome, descricao);
        JOptionPane.showMessageDialog(this, "Cadastro bem-sucedido!");
        SwingUtilities.getWindowAncestor(this).dispose();

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        // LIMITA O USERNAME A 12 caracteres
        if (txtName.getText().length() > 20) {
            evt.consume(); // Ignora a tecla digitada
            JOptionPane.showMessageDialog(this, "Máximo de 20 caracteres atingido.");

        }

    }//GEN-LAST:event_txtNameKeyTyped

    private void txtDescKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescriptionKeyTyped
        // Limita a senha a ter no máximo 20 caracteres
        if (txtDescription.getText().length() > 100) {
            evt.consume(); // Ignora a tecla digitada
            JOptionPane.showMessageDialog(this, "Máximo de 100 caracteres atingido.");
        }
    }//GEN-LAST:event_txtDescriptionKeyTyped

    private boolean isValidUsername(String username) {
        return username.matches("^[a-zA-Z]{8,}$"); // Pelo menos 8 letras
    }

    private boolean isValidPassword(String password) {
        // Pelo menos 8 caracteres, letras e ao menos 2 números
        return password.matches("^(?=.*[a-zA-Z])(?=.*\\d.*\\d)[a-zA-Z\\d]{8,}$");

        /*(?=.*[a-zA-Z]): verifica se a string contém pelo menos uma letra (maiúscula ou minúscula).
        / O .* corresponde a qualquer caractere (exceto quebras de linha) zero ou mais vezes.
        / (?=.*\\d.*\\d): lookahead que verifica se a string contém pelo menos dois dígitos (números), \\d corresponde a dígitos.
        / {8,}: exige que haja pelo menos 8 desses caracteres {8,}
        / $: final da string.
        */
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarEx;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
