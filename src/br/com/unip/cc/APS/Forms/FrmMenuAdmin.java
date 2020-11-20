package br.com.unip.cc.APS.Forms;

public class FrmMenuAdmin extends javax.swing.JFrame{
    FrmCadUser fcu = new FrmCadUser();
    FrmConsUserAdmin fcua = new FrmConsUserAdmin();
    FrmSobre fs = new FrmSobre();
    
    public FrmMenuAdmin(){
        initCompoments();
    }
    
    @SuppressWarnings("unchecked")
    private void initCompoments(){
        CorDeFundo = new javax.swing.JPanel();
        lblbv = new javax.swing.JLabel();
        btnsair = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        MenuCad = new javax.swing.JMenu();
        CadUser = new javax.swing.JMenuItem();
        Sep = new javax.swing.JMenu();
        MenuCons = new javax.swing.JMenu();
        ConsUser = new javax.swing.JMenuItem();
        Sep2 = new javax.swing.JMenu();
        MenuSob = new javax.swing.JMenu();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ChaTime - Menu Administrador");
        setResizable(false);
        
        CorDeFundo.setBackground(new java.awt.Color(50,205,50));
        lblbv.setFont(new java.awt.Font("Iskoola Pota", 2, 18)); // NOI18N
        lblbv.setText("Seja Bem Vindo(a), Administrador(a)! ");

        btnsair.setFont(new java.awt.Font("Iskoola Pota", 2, 18)); // NOI18N
        btnsair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/unip/cc/APSREDES/Icons/Exit.png"))); // NOI18N
        btnsair.setText("Sair");
        btnsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsairActionPerformed(evt);
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
                .addContainerGap()
                .addGroup(CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CorDeFundoLayout.createSequentialGroup()
                        .addGap(0, 23, Short.MAX_VALUE)
                        .addGroup(CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnsair, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CorDeFundoLayout.createSequentialGroup()
                                .addComponent(lblbv)
                                .addGap(21, 21, 21)))))
                .addContainerGap())
        );
        CorDeFundoLayout.setVerticalGroup(
            CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CorDeFundoLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblbv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnsair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Menu.setBackground(new java.awt.Color(153, 153, 255));
        Menu.setFont(new java.awt.Font("Iskoola Pota", 2, 18)); // NOI18N

        MenuCad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/unip/cc/APSREDES/Icons/Add.png"))); // NOI18N
        MenuCad.setText("Cadastrar ");
        MenuCad.setFont(new java.awt.Font("Iskoola Pota", 3, 18)); // NOI18N

        CadUser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        CadUser.setFont(new java.awt.Font("Iskoola Pota", 2, 14)); // NOI18N
        CadUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/unip/cc/APSREDES/Icons/AddUser.png"))); // NOI18N
        CadUser.setText("Usuário");
        CadUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadUserActionPerformed(evt);
            }
        });
        MenuCad.add(CadUser);

        Menu.add(MenuCad);

        Sep.setText("|");
        Sep.setContentAreaFilled(false);
        Sep.setEnabled(false);
        Sep.setFocusable(false);
        Sep.setRequestFocusEnabled(false);
        Sep.setRolloverEnabled(false);
        Sep.setVerifyInputWhenFocusTarget(false);
        Menu.add(Sep);

        MenuCons.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/unip/cc/APSREDES/Icons/Buscar.png"))); // NOI18N
        MenuCons.setText("Consultar ");
        MenuCons.setFont(new java.awt.Font("Iskoola Pota", 3, 18)); // NOI18N

        ConsUser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        ConsUser.setFont(new java.awt.Font("Iskoola Pota", 2, 14)); // NOI18N
        ConsUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/unip/cc/APSREDES/Icons/User.png"))); // NOI18N
        ConsUser.setText("Usuário");
        ConsUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsUserActionPerformed(evt);
            }
        });
        MenuCons.add(ConsUser);

        Menu.add(MenuCons);

        Sep2.setText("|");
        Sep2.setContentAreaFilled(false);
        Sep2.setEnabled(false);
        Sep2.setFocusable(false);
        Sep2.setRequestFocusEnabled(false);
        Sep2.setRolloverEnabled(false);
        Sep2.setVerifyInputWhenFocusTarget(false);
        Menu.add(Sep2);

        MenuSob.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/unip/cc/APSREDES/Icons/Chat.png"))); // NOI18N
        MenuSob.setText("Sobre ");
        MenuSob.setFont(new java.awt.Font("Iskoola Pota", 3, 18)); // NOI18N
        MenuSob.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuSobMouseClicked(evt);
            }
        });
        Menu.add(MenuSob);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CorDeFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CorDeFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CadUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadUserActionPerformed
        fcu.show();
    }//GEN-LAST:event_CadUserActionPerformed

    private void ConsUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsUserActionPerformed
        fcua.show();
    }//GEN-LAST:event_ConsUserActionPerformed

    private void MenuSobMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuSobMouseClicked
        fs.show();
    }//GEN-LAST:event_MenuSobMouseClicked

    private void btnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsairActionPerformed
        fcu.dispose();

        fcua.dispose();

        fs.dispose();

        this.dispose();
        new FrmLogin().show();
    }//GEN-LAST:event_btnsairActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CadUser;
    private javax.swing.JMenuItem ConsUser;
    private javax.swing.JPanel CorDeFundo;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenu MenuCad;
    private javax.swing.JMenu MenuCons;
    private javax.swing.JMenu MenuSob;
    private javax.swing.JMenu Sep;
    private javax.swing.JMenu Sep2;
    private javax.swing.JButton btnsair;
    private javax.swing.JLabel lblbv;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
