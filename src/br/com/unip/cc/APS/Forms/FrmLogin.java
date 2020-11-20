package br.com.unip.cc.APS.Forms;

import br.com.unip.cc.APS.DAO.UsersDAO;
import br.com.unip.cc.APS.Models.Users;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class FrmLogin extends javax.swing.JFrame{
    
    Users user = new Users();
    UsersDAO userDAO = new UsersDAO();
    
    FrmMenuAdmin fmadm = new FrmMenuAdmin();
    FrmChat fc = new FrmChat();
    
    FrmCadUser fcu = new FrmCadUser();
    
    FrmSobre fs = new FrmSobre();
    
    char d;
    String usuario, passw;
    
    public FrmLogin(){
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    private void initComponents() {

        CorDeFundo = new javax.swing.JPanel();
        btnsob = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        linha1 = new javax.swing.JSeparator();
        lbluser = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        lblsenha = new javax.swing.JLabel();
        txtsenha = new javax.swing.JPasswordField();
        cbms = new javax.swing.JCheckBox();
        btnlogin = new javax.swing.JButton();
        lblcad = new javax.swing.JLabel();
        lblforgot = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ChaTime - Login");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        
        CorDeFundo.setBackground(new java.awt.Color(204, 204, 255));
        CorDeFundo.setForeground(new java.awt.Color(153, 204, 255));
        CorDeFundo.setFont(new java.awt.Font("Engravers MT", 0, 25)); // NOI18N

        btnsob.setFont(new java.awt.Font("Iskoola Pota", 2, 18)); // NOI18N
        btnsob.setText("?");
        btnsob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsobActionPerformed(evt);
            }
        });

        logo.setFont(new java.awt.Font("Iskoola Pota", 3, 14)); // NOI18N
        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/unip/cc/APSREDES/Icons/LogoChat.png"))); // NOI18N

        lbluser.setFont(new java.awt.Font("Iskoola Pota", 2, 18)); // NOI18N
        lbluser.setForeground(new java.awt.Color(102, 102, 102));
        lbluser.setText("Usuário: ");

        txtuser.setFont(new java.awt.Font("Iskoola Pota", 2, 18)); // NOI18N
        txtuser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtuserKeyPressed(evt);
            }
        });

        lblsenha.setFont(new java.awt.Font("Iskoola Pota", 2, 18)); // NOI18N
        lblsenha.setForeground(new java.awt.Color(102, 102, 102));
        lblsenha.setText("Senha: ");

        txtsenha.setFont(new java.awt.Font("Iskoola Pota", 2, 18)); // NOI18N
        txtsenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsenhaKeyPressed(evt);
            }
        });

        cbms.setFont(new java.awt.Font("Iskoola Pota", 2, 14)); // NOI18N
        cbms.setText("Mostrar Senha ");
        cbms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmsActionPerformed(evt);
            }
        });

        btnlogin.setFont(new java.awt.Font("Iskoola Pota", 2, 18)); // NOI18N
        btnlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/unip/cc/APSREDES/Icons/Chat.png"))); // NOI18N
        btnlogin.setText("Entrar");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });

        lblcad.setFont(new java.awt.Font("Iskoola Pota", 2, 12)); // NOI18N
        lblcad.setForeground(new java.awt.Color(102, 102, 102));
        lblcad.setText("Cadastre-se");
        lblcad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblcad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcadMouseClicked(evt);
            }
        });

        lblforgot.setFont(new java.awt.Font("Iskoola Pota", 2, 12)); // NOI18N
        lblforgot.setForeground(new java.awt.Color(102, 102, 102));
        lblforgot.setText("Esqueceu sua senha?");
        lblforgot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblforgot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblforgotMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout CorDeFundoLayout = new javax.swing.GroupLayout(CorDeFundo);
        CorDeFundo.setLayout(CorDeFundoLayout);
        CorDeFundoLayout.setHorizontalGroup(
            CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CorDeFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CorDeFundoLayout.createSequentialGroup()
                        .addGroup(CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbluser)
                            .addComponent(lblsenha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CorDeFundoLayout.createSequentialGroup()
                                .addComponent(cbms)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnlogin))
                            .addComponent(txtuser)
                            .addComponent(txtsenha)))
                    .addGroup(CorDeFundoLayout.createSequentialGroup()
                        .addComponent(lblcad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblforgot))
                    .addGroup(CorDeFundoLayout.createSequentialGroup()
                        .addGroup(CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(linha1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(CorDeFundoLayout.createSequentialGroup()
                                .addComponent(logo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnsob)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        CorDeFundoLayout.setVerticalGroup(
            CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CorDeFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsob))
                .addGap(13, 13, 13)
                .addComponent(linha1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbluser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblsenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbms)
                    .addComponent(btnlogin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblcad)
                    .addComponent(lblforgot))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        usuario = txtuser.getText();
        passw = txtsenha.getText();
        
            if (usuario.equals("admin") && passw.equals("admin123")){
                JOptionPane.showMessageDialog(null, "Bem-Vindo(a) ao Sistema de Configuração do Chat, Administrador(a)!");                
                this.dispose();
                fcu.dispose();
                fs.dispose();                
                fmadm.show();
            }             
        
            else if (txtuser.getText() != "" && txtsenha.getText() != "") {                
                user.setUser(txtuser.getText());
                user.setSenha(txtsenha.getText());
                userDAO.Logar(user, this, fs, fcu, fc);
            }
                   
            else{                
                JOptionPane.showMessageDialog(null, "Usuário e/ou Senha Inválidos!");                
            }
            
        txtuser.selectAll();
        txtuser.requestFocus();
        txtsenha.setText("");
    }//GEN-LAST:event_btnloginActionPerformed

    private void btnsobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsobActionPerformed
        fs.show();
    }//GEN-LAST:event_btnsobActionPerformed

    private void lblcadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcadMouseClicked
        fcu.show();
    }//GEN-LAST:event_lblcadMouseClicked

    private void cbmsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmsActionPerformed
        char c = 0;
        if (cbms.isSelected()) {
            txtsenha.setEchoChar(c);
        }else{
            txtsenha.setEchoChar(d);
        }
    }//GEN-LAST:event_cbmsActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        d = txtsenha.getEchoChar();
    }//GEN-LAST:event_formWindowOpened

    private void lblforgotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblforgotMouseClicked
        JOptionPane.showMessageDialog(rootPane, "Caso não tenha efetuado o cadastro,\nou tenha esquecido seu nome de Usuário e/ou Senha,\nconverse com o administrador do sistema na sua filial\nou mande-nos um email: chatiete@help.com\ne ficaremos felizes em ajudá-lo(a)!");
    }//GEN-LAST:event_lblforgotMouseClicked

    private void txtuserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtuserKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                btnloginActionPerformed(null); 
        }
    }//GEN-LAST:event_txtuserKeyPressed

    private void txtsenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsenhaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                btnloginActionPerformed(null); 
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
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CorDeFundo;
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnsob;
    private javax.swing.JCheckBox cbms;
    private javax.swing.JLabel lblcad;
    private javax.swing.JLabel lblforgot;
    private javax.swing.JLabel lblsenha;
    private javax.swing.JLabel lbluser;
    private javax.swing.JSeparator linha1;
    private javax.swing.JLabel logo;
    private javax.swing.JPasswordField txtsenha;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
