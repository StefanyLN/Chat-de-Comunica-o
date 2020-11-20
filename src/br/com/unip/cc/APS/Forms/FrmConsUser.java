package br.com.unip.cc.APS.Forms;

import br.com.unip.cc.APS.DAO.UsersDAO;
import br.com.unip.cc.APS.Models.Users;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


public class FrmConsUser extends javax.swing.JFrame {
    
    Users user = new Users();
    UsersDAO userDAO = new UsersDAO();
    
    FrmConsUser fcu = this;

    public int id;
    char d;
    
    public FrmConsUser() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CorDeFundo = new javax.swing.JPanel();
        btnconf = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();
        lblbv = new javax.swing.JLabel();
        btnsair = new javax.swing.JButton();
        btnalt = new javax.swing.JButton();
        cbms = new javax.swing.JCheckBox();
        txtsenha = new javax.swing.JPasswordField();
        lblsenha = new javax.swing.JLabel();
        lbluser = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        lblemail = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        txtnm = new javax.swing.JTextField();
        lblnome = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ChatTietê - Perfil");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        CorDeFundo.setBackground(new java.awt.Color(204, 204, 255));

        btnconf.setFont(new java.awt.Font("Iskoola Pota", 2, 18)); // NOI18N
        btnconf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/unip/cc/APSREDES/Icons/Done.png"))); // NOI18N
        btnconf.setText("Confirmar Alterações");
        btnconf.setEnabled(false);
        btnconf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconfActionPerformed(evt);
            }
        });

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/unip/cc/APSREDES/Icons/LogoChat.png"))); // NOI18N

        lblbv.setFont(new java.awt.Font("Iskoola Pota", 2, 18)); // NOI18N
        lblbv.setText("Seja Bem Vindo(a), Usuário(a)! ");

        btnsair.setFont(new java.awt.Font("Iskoola Pota", 2, 18)); // NOI18N
        btnsair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/unip/cc/APSREDES/Icons/Exit.png"))); // NOI18N
        btnsair.setText("Sair");
        btnsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsairActionPerformed(evt);
            }
        });

        btnalt.setFont(new java.awt.Font("Iskoola Pota", 2, 18)); // NOI18N
        btnalt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/unip/cc/APSREDES/Icons/Atualizar.png"))); // NOI18N
        btnalt.setText("Alterar");
        btnalt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaltActionPerformed(evt);
            }
        });

        cbms.setFont(new java.awt.Font("Iskoola Pota", 2, 14)); // NOI18N
        cbms.setText("Mostrar Senha ");
        cbms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmsActionPerformed(evt);
            }
        });

        txtsenha.setEditable(false);
        txtsenha.setFont(new java.awt.Font("Iskoola Pota", 2, 18)); // NOI18N
        txtsenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsenhaKeyPressed(evt);
            }
        });

        lblsenha.setFont(new java.awt.Font("Iskoola Pota", 2, 18)); // NOI18N
        lblsenha.setForeground(new java.awt.Color(102, 102, 102));
        lblsenha.setText("Senha: ");

        lbluser.setFont(new java.awt.Font("Iskoola Pota", 2, 18)); // NOI18N
        lbluser.setForeground(new java.awt.Color(102, 102, 102));
        lbluser.setText("Usuário: ");

        txtuser.setEditable(false);
        txtuser.setFont(new java.awt.Font("Iskoola Pota", 2, 18)); // NOI18N
        txtuser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtuserKeyPressed(evt);
            }
        });

        lblemail.setFont(new java.awt.Font("Iskoola Pota", 2, 18)); // NOI18N
        lblemail.setForeground(new java.awt.Color(102, 102, 102));
        lblemail.setText("Email: ");

        txtemail.setEditable(false);
        txtemail.setFont(new java.awt.Font("Iskoola Pota", 2, 18)); // NOI18N
        txtemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtemailKeyPressed(evt);
            }
        });

        txtnm.setEditable(false);
        txtnm.setFont(new java.awt.Font("Iskoola Pota", 2, 18)); // NOI18N
        txtnm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnmKeyPressed(evt);
            }
        });

        lblnome.setFont(new java.awt.Font("Iskoola Pota", 2, 18)); // NOI18N
        lblnome.setForeground(new java.awt.Color(102, 102, 102));
        lblnome.setText("Nome: ");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout CorDeFundoLayout = new javax.swing.GroupLayout(CorDeFundo);
        CorDeFundo.setLayout(CorDeFundoLayout);
        CorDeFundoLayout.setHorizontalGroup(
            CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CorDeFundoLayout.createSequentialGroup()
                .addComponent(Logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CorDeFundoLayout.createSequentialGroup()
                        .addGroup(CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnalt)
                            .addComponent(btnconf))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(CorDeFundoLayout.createSequentialGroup()
                                    .addGap(11, 11, 11)
                                    .addComponent(lblsenha)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CorDeFundoLayout.createSequentialGroup()
                                    .addComponent(lbluser)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(cbms, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CorDeFundoLayout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(CorDeFundoLayout.createSequentialGroup()
                        .addGroup(CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblemail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblnome, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnm)
                            .addComponent(txtemail)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CorDeFundoLayout.createSequentialGroup()
                        .addComponent(lblbv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnsair)))
                .addContainerGap())
        );
        CorDeFundoLayout.setVerticalGroup(
            CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CorDeFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblbv)
                    .addComponent(btnsair))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnome)
                    .addComponent(txtnm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblemail)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CorDeFundoLayout.createSequentialGroup()
                        .addComponent(btnalt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnconf))
                    .addGroup(CorDeFundoLayout.createSequentialGroup()
                        .addGroup(CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbluser))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblsenha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbms)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1)
            .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
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

    public void LimparTudo(){
        txtnm.setEditable(false);
        txtuser.setEditable(false);
        txtemail.setEditable(false);
        txtsenha.setEditable(false);
        btnalt.setEnabled(true);
        btnsair.setEnabled(true);
        btnconf.setEnabled(false);
                
        txtnm.setText(null);
        txtuser.setText(null);
        txtemail.setText(null);
        txtsenha.setText(null);
        
        user.setId_User(0);
        user.setNome(null);
        user.setEmail(null);
        user.setUser(null);
        user.setSenha(null);
    }
        
    public void AtualizarPerfil(){
        txtnm.setText(user.getNome());
        txtemail.setText(user.getEmail());
        txtuser.setText(user.getUser());
        txtsenha.setText(user.getSenha());
    }
    
    public void Pesq(){
    user.setId_User(id);
    userDAO.Pesquisar(user);
    AtualizarPerfil();
    lblbv.setText("Seja Bem Vindo(a), "+user.getUser()+"! ");
    }
    
    public void EmailIgual(){
        txtemail.selectAll();
        txtemail.requestFocus();
    }
    
    public void UsuarioIgual(){
        txtuser.selectAll();
        txtuser.requestFocus();
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        d = txtsenha.getEchoChar();
        userDAO.Login(user, this);
        AtualizarPerfil();
        lblbv.setText("Seja Bem Vindo(a), "+user.getUser()+"! ");
    }//GEN-LAST:event_formWindowOpened

    private void btnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnsairActionPerformed

    private void btnconfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconfActionPerformed
        if ("".equals(txtnm.getText()) || "".equals(txtemail.getText()) || "".equals(txtuser.getText()) || "".equals(txtsenha.getText())) {
            JOptionPane.showMessageDialog(null, "Todos os campos precisam ser preenchidos para a alteração do cadastro!");
        }else{

            user.setNome(txtnm.getText());
            user.setUser(txtuser.getText());
            user.setEmail(txtemail.getText());
            user.setSenha(txtsenha.getText());

            userDAO.VerificarEmailIgual3(user, this, fcu);
        }
    }//GEN-LAST:event_btnconfActionPerformed

    private void btnaltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaltActionPerformed
        int resposta=JOptionPane.showConfirmDialog(null, "Deseja Mesmo Alterar as Informações desse Cadastro?");

        if (resposta==0) {
            txtnm.setEditable(true);
            txtuser.setEditable(true);
            txtemail.setEditable(true);
            txtsenha.setEditable(true);
            btnalt.setEnabled(false);
            btnsair.setEnabled(false);
            btnconf.setEnabled(true);
        }

        if (resposta==1) {
            txtnm.setEditable(false);
            txtuser.setEditable(false);
            txtemail.setEditable(false);
            txtsenha.setEditable(false);
            btnconf.setEnabled(false);
        }
    }//GEN-LAST:event_btnaltActionPerformed

    private void cbmsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmsActionPerformed
        char c = 0;
        if (cbms.isSelected()) {
            txtsenha.setEchoChar(c);
        }else{
            txtsenha.setEchoChar(d);
        }
    }//GEN-LAST:event_cbmsActionPerformed

    private void txtnmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnmKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if (btnconf.isEnabled()) {
                btnconfActionPerformed(null);
            }                 
        }
    }//GEN-LAST:event_txtnmKeyPressed

    private void txtemailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if (btnconf.isEnabled()) {
                btnconfActionPerformed(null);
            }  
        }
    }//GEN-LAST:event_txtemailKeyPressed

    private void txtuserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtuserKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           if (btnconf.isEnabled()) {
                btnconfActionPerformed(null);
            }   
        }
    }//GEN-LAST:event_txtuserKeyPressed

    private void txtsenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsenhaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if (btnconf.isEnabled()) {
                btnconfActionPerformed(null);
            }  
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
            java.util.logging.Logger.getLogger(FrmConsUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmConsUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmConsUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmConsUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmConsUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CorDeFundo;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton btnalt;
    private javax.swing.JButton btnconf;
    private javax.swing.JButton btnsair;
    private javax.swing.JCheckBox cbms;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblbv;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblnome;
    private javax.swing.JLabel lblsenha;
    private javax.swing.JLabel lbluser;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtnm;
    private javax.swing.JPasswordField txtsenha;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
