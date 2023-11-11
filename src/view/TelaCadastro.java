package view;

import business.control.UsuarioManager;
import business.control.UsuarioManagerFacade;
import business.model.Usuario;
import factory.UserFactoryImpl;
import infra.InfraException;
import util.LoginInvalidException;
import util.PasswordInvalidException;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import java.awt.*;

public class TelaCadastro extends javax.swing.JPanel {

    private UsuarioManagerFacade usuarioManager;

    public TelaCadastro() throws InfraException {
        initComponents();

        usuarioManager = UsuarioManagerFacade.getInstance();


        ButtonGroup checkBoxGroup = new ButtonGroup();
        checkBoxGroup.add(jCheckBox1);
        checkBoxGroup.add(jCheckBox2);
        //checkBoxGroup.add(jCheckBox3);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        txtUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        txtNomeCompleto = new javax.swing.JTextField();
        txtDataDeNascimento = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        //jCheckBox3 = new javax.swing.JCheckBox();
        btnCadastrar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro"));

        txtUser.setToolTipText("No mínimo 8 letras no máximo 12");
        txtUser.setBorder(javax.swing.BorderFactory.createTitledBorder("User Name"));

        txtPass.setToolTipText("No mínimo 8 letras, máximo 20");
        txtPass.setBorder(javax.swing.BorderFactory.createTitledBorder("Senha"));

        txtNomeCompleto.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome Completo"));

        txtDataDeNascimento.setBorder(javax.swing.BorderFactory.createTitledBorder("Data de Nascimento"));

        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Aluno");

        jCheckBox2.setText("Professor");

        //jCheckBox3.setText("Administrador");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    btnCadastrarActionPerformed(evt);
                } catch (LoginInvalidException e) {
                    throw new RuntimeException(e);
                } catch (PasswordInvalidException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        jTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder("Telefone"));

        txtEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jCheckBox1)
                                                                                .addGap(30, 30, 30)
                                                                                .addComponent(jCheckBox2))
                                                                        //.addGap(39, 39, 39)
                                                                        //.addComponent(jCheckBox3))
                                                                        .addGroup(layout.createSequentialGroup() //javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                .addGap(229, 229, 229)
                                                                                .addComponent(btnCadastrar)))
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(txtEndereco)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(txtDataDeNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                        .addComponent(txtNomeCompleto))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE))
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
                                                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(22, 22, 22)
                                                .addComponent(txtNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtDataDeNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jCheckBox1)
                                                        .addComponent(jCheckBox2))
                                                //.addComponent(jCheckBox3))
                                                .addGap(30, 30, 30)
                                                .addComponent(btnCadastrar)))
                                .addContainerGap(11, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) throws LoginInvalidException, PasswordInvalidException {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
        UserFactoryImpl usuarioFactory = new UserFactoryImpl();
        String username = txtUser.getText();
        String password = new String(txtPass.getPassword());
        String nomeCompleto = txtNomeCompleto.getText();
        String dataNascimento = txtDataDeNascimento.getText();
        String telefone = jTextField1.getText();
        String endereco = txtEndereco.getText();

        boolean aluno = jCheckBox1.isSelected();
        boolean professor = jCheckBox2.isSelected();
        //boolean administrador = jCheckBox3.isSelected();
        if (aluno) {
            try {
                usuarioManager.adicionarUsuario(username, password, nomeCompleto, dataNascimento, telefone, endereco, aluno, professor);
                JOptionPane.showMessageDialog(this, "Cadastro bem-sucedido!");

                // Fecha a janela de cadastro
                SwingUtilities.getWindowAncestor(this).dispose();
            } catch (LoginInvalidException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (PasswordInvalidException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

        } else {
            // Exige senha de administração
            String adminPassword = JOptionPane.showInputDialog(this, "Digite a senha de administração:");

            if (adminPassword.equals("adm2023")) {
                try {
                    usuarioManager.adicionarUsuario(username, password, nomeCompleto, dataNascimento, telefone, endereco, aluno, professor);
                    JOptionPane.showMessageDialog(this, "Cadastro bem-sucedido!");

                    // Fecha a janela de cadastro
                    SwingUtilities.getWindowAncestor(this).dispose();
                } catch (LoginInvalidException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                } catch (PasswordInvalidException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(this, "Senha inválida. Consulte o administrador!");
            }
        }
    }


    //GEN-LAST:event_btnCadastrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    //private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtDataDeNascimento;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNomeCompleto;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
