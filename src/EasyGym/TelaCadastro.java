package EasyGym;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class TelaCadastro extends javax.swing.JPanel {

    private UsuarioManager usuarioManager;

    public TelaCadastro() {
        initComponents();

        usuarioManager = new UsuarioManager();
        usuarioManager.carregarUsuarios();

        ButtonGroup checkBoxGroup = new ButtonGroup();
        checkBoxGroup.add(jCheckBox1);
        checkBoxGroup.add(jCheckBox2);
        checkBoxGroup.add(jCheckBox3);
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
        jCheckBox3 = new javax.swing.JCheckBox();
        btnCadastrar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro"));

        txtUser.setToolTipText("No mínimo 8 letras no máximo 12");
        txtUser.setBorder(javax.swing.BorderFactory.createTitledBorder("User Name"));
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserKeyTyped(evt);
            }
        });

        txtPass.setToolTipText("No mínimo 8 letras, máximo 20");
        txtPass.setBorder(javax.swing.BorderFactory.createTitledBorder("Senha"));
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPassKeyTyped(evt);
            }
        });

        txtNomeCompleto.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome Completo"));

        txtDataDeNascimento.setBorder(javax.swing.BorderFactory.createTitledBorder("Data de Nascimento"));

        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Aluno");

        jCheckBox2.setText("Professor");

        jCheckBox3.setText("Administrador");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
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
                                        .addComponent(jCheckBox2)
                                        .addGap(39, 39, 39)
                                        .addComponent(jCheckBox3))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(229, 229, 229)
                                        .addComponent(btnCadastrar)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtEndereco, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtDataDeNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(txtNomeCompleto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox3))
                        .addGap(30, 30, 30)
                        .addComponent(btnCadastrar)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
    String username = txtUser.getText();
    String password = new String(txtPass.getPassword());
    String nomeCompleto = txtNomeCompleto.getText();
    String dataNascimento = txtDataDeNascimento.getText();
    String telefone = jTextField1.getText();
    String endereco = txtEndereco.getText();

    boolean aluno = jCheckBox1.isSelected();
    boolean professor = jCheckBox2.isSelected();
    boolean administrador = jCheckBox3.isSelected();

    if (username.isEmpty() || password.isEmpty() || nomeCompleto.isEmpty()
            || telefone.isEmpty() || endereco.isEmpty() || (!aluno && !professor && !administrador)) {
        JOptionPane.showMessageDialog(this, "Preencha todos os campos e selecione uma opção.");
    } else if (username.length() < 8 || !isValidUsername(username)) {
        JOptionPane.showMessageDialog(this, "Nome de usuário inválido. Use apenas letras e no mínimo 8 caracteres.");
    } else if (password.length() < 8 || !isValidPassword(password)) {
        JOptionPane.showMessageDialog(this, "A senha deve ter entre 8 e 20 caracteres, ao menos uma Maiúscula e uma miníscula, e ao menos 2 dela devem ser números.");
    } else {
        if (aluno) {
            JOptionPane.showMessageDialog(this, "Cadastro bem-sucedido!");
            // Fecha a janela de cadastro
            SwingUtilities.getWindowAncestor(this).dispose();
        } else if (professor || administrador) {
            // Exige senha de administração
            String adminPassword = JOptionPane.showInputDialog(this, "Digite a senha de administração:");

            if ((professor && adminPassword.equals("adm2023")) || (administrador && adminPassword.equals("adm2023adm"))) {
                JOptionPane.showMessageDialog(this, "Cadastro bem-sucedido!");
                // Fecha a janela de cadastro
                SwingUtilities.getWindowAncestor(this).dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Senha inválida. Consulte o administrador!");
            }
        }
    }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyTyped
        // LIMITA O USERNAME A 12 caracteres
        if (txtUser.getText().length() >= 12) {
            evt.consume(); // Ignora a tecla digitada
            JOptionPane.showMessageDialog(this, "Máximo de caracteres atingido, 12.");

        }

    }//GEN-LAST:event_txtUserKeyTyped

    private void txtPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyTyped
        // Limita a senha a ter no máximo 20 caracteres
        if (txtPass.getText().length() >= 20) {
            evt.consume(); // Ignora a tecla digitada
            JOptionPane.showMessageDialog(this, "Máximo de caracteres atingido, 20.");
        }
    }//GEN-LAST:event_txtPassKeyTyped

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
    private javax.swing.JButton btnCadastrar;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtDataDeNascimento;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNomeCompleto;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
