package EasyGym;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import EasyGym.UsuarioManager;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author Marcus
 */
public class TelaPrincipal extends javax.swing.JPanel {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtLoginName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnCadaastrese = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "EasyGym", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 18), new java.awt.Color(0, 204, 0)))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Login"));

        txtLoginName.setToolTipText("username");
        txtLoginName.setBorder(javax.swing.BorderFactory.createTitledBorder("Username"));

        txtPassword.setToolTipText("Password");
        txtPassword.setBorder(javax.swing.BorderFactory.createTitledBorder("Password"));

        btnLogin.setText("LOGIN");
        btnLogin.setToolTipText("");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnCadaastrese.setText("Cadastre-se");
        btnCadaastrese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadaastreseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCadaastrese, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPassword)
                    .addComponent(txtLoginName))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(txtLoginName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogin)
                .addGap(29, 29, 29)
                .addComponent(btnCadaastrese)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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


    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
                                    
    // Obter o nome de usuário e a senha digitados
    String username = txtLoginName.getText();
    String password = new String(txtPassword.getPassword());

    // Validar o nome de usuário e a senha
    if (username.length() < 8) {
        JOptionPane.showMessageDialog(this, "Nome de usuário deve ter pelo menos 8 caracteres.");
    } else if (password.length() < 8) {
        JOptionPane.showMessageDialog(this, "Senha deve ter pelo menos 8 caracteres.");
    } else if (!isValidUsername(username)) {
        JOptionPane.showMessageDialog(this, "Nome de usuário inválido. Use apenas letras.");
    } else if (!isValidPassword(password)) {
        JOptionPane.showMessageDialog(this, "Senha inválida. Use apenas letras.");
    } else {
        // Aqui você pode prosseguir com o processo de autenticação
        // Vamos verificar se o usuário existe e se a senha está correta
        
        UsuarioManager usuarioManager = new UsuarioManager();
        usuarioManager.carregarUsuarios();
        
        Usuario usuario = usuarioManager.buscarUsuario(username);
        
        if (usuario == null) {
            JOptionPane.showMessageDialog(this, "Usuário não existe.");
        } else if (!usuario.getPassword().equals(password)) {
            JOptionPane.showMessageDialog(this, "Senha incorreta.");
        } else {
            // Login bem-sucedido
            JOptionPane.showMessageDialog(this, "Login bem-sucedido!");
        }
    
}

}  

// Função para validar o nome de usuário (apenas letras, no máximo 8 caracteres)
private boolean isValidUsername(String username) {
    return username.matches("^[a-zA-Z]{1,8}$");
}

// Função para validar a senha (apenas letras)
private boolean isValidPassword(String password) {
    return password.matches("^[a-zA-Z]+$");
       
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnCadaastreseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadaastreseActionPerformed
        // TODO add your handling code here:
        // Criar uma instância da tela de cadastro
    TelaCadastro telaCadastro = new TelaCadastro();

    // Criar um JFrame para exibir a tela de cadastro
    JFrame frameCadastro = new JFrame("Cadastro");
    frameCadastro.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Fechar apenas a janela de cadastro
    frameCadastro.getContentPane().add(telaCadastro);
    frameCadastro.pack();
    frameCadastro.setLocationRelativeTo(null); // Centralizar na tela
    frameCadastro.setVisible(true);
        
    }//GEN-LAST:event_btnCadaastreseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadaastrese;
    private javax.swing.JButton btnLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtLoginName;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
