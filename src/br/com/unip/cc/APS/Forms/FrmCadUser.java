package br.com.unip.cc.APS.Forms;

import br.com.unip.cc.APS.DAO.UsersDAO;
import br.com.unip.cc.APS.Models.Users;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


public class FrmCadUser extends javax.swing.JFrame{
    Users user = new Users();
    UsersDAO userDAO = new UsersDAO();

    FrmCadUser fcp = this;
    
    char d;
    
    public FrmCadUser(){
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    private void initComponents(){
        CorDeFundo = new javax.swing.JPanel();
        btncad = new javax.swing.JButton();
        lblnome = new javax.swing.JLabel();
        lblemail = new javax.swing.JLabel();
        lbluser = new javax.swing.JLabel();
        lblsenha = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        txtnm = new javax.swing.JTextField();
        txtsenha = new javax.swing.JPasswordField();
        txtuser = new javax.swing.JTextField();
        linha1 = new javax.swing.JSeparator();
        cbms = new javax.swing.JCheckBox();
        btnlimp = new javax.swing.JButton();
        logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ChaTietê - Cadastrar Usuário");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        CorDeFundo.setBackground(new java.awt.Color(204, 204, 255));

        btncad.setFont(new java.awt.Font("Iskoola Pota", 2, 18)); // NOI18N
        btncad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/unip/cc/APSREDES/Icons/AddUser.png"))); // NOI18N
        btncad.setText("Cadastrar");
        btncad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncadActionPerformed(evt);
            }
        });

        lblnome.setFont(new java.awt.Font("Iskoola Pota", 2, 18)); // NOI18N
        lblnome.setForeground(new java.awt.Color(102, 102, 102));
        lblnome.setText("Nome: ");

        lblemail.setFont(new java.awt.Font("Iskoola Pota", 2, 18)); // NOI18N
        lblemail.setForeground(new java.awt.Color(102, 102, 102));
        lblemail.setText("Email: ");

        lbluser.setFont(new java.awt.Font("Iskoola Pota", 2, 18)); // NOI18N
        lbluser.setForeground(new java.awt.Color(102, 102, 102));
        lbluser.setText("Usuário: ");

        lblsenha.setFont(new java.awt.Font("Iskoola Pota", 2, 18)); // NOI18N
        lblsenha.setForeground(new java.awt.Color(102, 102, 102));
        lblsenha.setText("Senha: ");

        txtemail.setFont(new java.awt.Font("Iskoola Pota", 2, 18)); // NOI18N
        txtemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtemailKeyPressed(evt);
            }
        });

        txtnm.setFont(new java.awt.Font("Iskoola Pota", 2, 18)); // NOI18N
        txtnm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnmKeyPressed(evt);
            }
        });

        txtsenha.setFont(new java.awt.Font("Iskoola Pota", 2, 18)); // NOI18N
        txtsenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsenhaKeyPressed(evt);
            }
        });

        txtuser.setFont(new java.awt.Font("Iskoola Pota", 2, 18)); // NOI18N
        txtuser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtuserKeyPressed(evt);
            }
        });

        cbms.setFont(new java.awt.Font("Iskoola Pota", 2, 14)); // NOI18N
        cbms.setText("Mostrar Senha ");
        cbms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmsActionPerformed(evt);
            }
        });

        btnlimp.setFont(new java.awt.Font("Iskoola Pota", 2, 18)); // NOI18N
        btnlimp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/unip/cc/APSREDES/Icons/Fechar.png"))); // NOI18N
        btnlimp.setText("Limpar");
        btnlimp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpActionPerformed(evt);
            }
        });

        logo.setFont(new java.awt.Font("Iskoola Pota", 3, 14)); // NOI18N
        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/unip/cc/APSREDES/Icons/LogoChat.png"))); // NOI18N

        javax.swing.GroupLayout CorDeFundoLayout = new javax.swing.GroupLayout(CorDeFundo);
        CorDeFundo.setLayout(CorDeFundoLayout);
        CorDeFundoLayout.setHorizontalGroup(
            CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CorDeFundoLayout.createSequentialGroup()
                .addGroup(CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CorDeFundoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(CorDeFundoLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblemail)
                                    .addComponent(lblnome))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtemail)
                                    .addComponent(txtnm)))
                            .addGroup(CorDeFundoLayout.createSequentialGroup()
                                .addGroup(CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbluser)
                                    .addComponent(lblsenha))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtsenha)
                                    .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbms, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnlimp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btncad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(linha1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(CorDeFundoLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(logo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CorDeFundoLayout.setVerticalGroup(
            CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CorDeFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(linha1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblemail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CorDeFundoLayout.createSequentialGroup()
                        .addGroup(CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbluser))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblsenha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbms))
                    .addGroup(CorDeFundoLayout.createSequentialGroup()
                        .addComponent(btncad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnlimp)))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CorDeFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CorDeFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void EmailIgual(){
        txtemail.selectAll();
        txtemail.requestFocus();
    }
    
    public void UsuarioIgual(){
        txtuser.selectAll();
        txtuser.requestFocus();
    }
    
    public void LimparTudo(){
        txtnm.setText("");
        txtemail.setText("");
        txtuser.setText("");
        txtsenha.setText("");
        txtnm.requestFocus();
    }
    
    private void btncadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncadActionPerformed
        if ("".equals(txtnm.getText()) || "".equals(txtemail.getText()) || "".equals(txtuser.getText()) || "".equals(txtsenha.getText())) {
            JOptionPane.showMessageDialog(null, "Todos os campos precisam ser preenchidos para o cadastro!");
        }else{

            user.setNome(txtnm.getText());
            user.setEmail(txtemail.getText());
            user.setUser(txtuser.getText());
            user.setSenha(txtsenha.getText());

            userDAO.VerificarEmailIgual(user, this, fcp);
        }
    }//GEN-LAST:event_btncadActionPerformed

    private void cbmsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmsActionPerformed
        char c = 0;
        if (cbms.isSelected()) {
            txtsenha.setEchoChar(c);
        }else{
            txtsenha.setEchoChar(d);
        }
    }//GEN-LAST:event_cbmsActionPerformed

    private void btnlimpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpActionPerformed
        LimparTudo();
    }//GEN-LAST:event_btnlimpActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        d = txtsenha.getEchoChar();
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        LimparTudo();
    }//GEN-LAST:event_formWindowClosed

    private void txtnmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnmKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                btncadActionPerformed(null); 
        }
    }//GEN-LAST:event_txtnmKeyPressed

    private void txtemailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                btncadActionPerformed(null); 
        }
    }//GEN-LAST:event_txtemailKeyPressed

    private void txtuserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtuserKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                btncadActionPerformed(null); 
        }
    }//GEN-LAST:event_txtuserKeyPressed

    private void txtsenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsenhaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                btncadActionPerformed(null); 
        }
    }//GEN-LAST:event_txtsenhaKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmCadUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCadUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CorDeFundo;
    private javax.swing.JButton btncad;
    private javax.swing.JButton btnlimp;
    private javax.swing.JCheckBox cbms;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblnome;
    private javax.swing.JLabel lblsenha;
    private javax.swing.JLabel lbluser;
    private javax.swing.JSeparator linha1;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtnm;
    private javax.swing.JPasswordField txtsenha;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
