package br.com.unip.cc.APS.Forms;
public class FrmSobre extends javax.swing.JFrame {
    
    public FrmSobre() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CorDeFundo = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        btnvolt = new javax.swing.JButton();
        painelsobre = new javax.swing.JScrollPane();
        sobre = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        CorDeFundo.setBackground(new java.awt.Color(204, 204, 255));
        CorDeFundo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255), 5));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/unip/cc/APSREDES/Icons/LogoChat.png"))); // NOI18N

        btnvolt.setFont(new java.awt.Font("Iskoola Pota", 2, 18)); // NOI18N
        btnvolt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/unip/cc/APSREDES/Icons/Exit.png"))); // NOI18N
        btnvolt.setText("Voltar");
        btnvolt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvoltActionPerformed(evt);
            }
        });

        sobre.setEditable(false);
        sobre.setFont(new java.awt.Font("Iskoola Pota", 2, 14)); // NOI18N
        sobre.setText("O objetivo principal deste software é fazer uma ferramenta de comunicação que tenha como finalidade auxiliar a Secretaria de Estado do Meio Ambiente, que deseja saber quais atividades industriais estão gerando poluição do Rio Tietê desde sua nascente em Salesópolis (SP) até a sua passagem pela região da grande São Paulo, e para que isso aconteça a empresa precisa trocar informações das equipes de inspetores treinados e capacitados que estarão se revezando dentro de cada indústria, controlando os processos e passando as informações de maneira online para a Secretaria.\nPara sanar tal necessidade criamos essa ferramenta que além da possibilidade de comunicação escrita, também terá a funcionalidade de fazer chamadas de vídeo via webcam, para maior controle, o projeto contará com um banco de dados de logins e senhas válidas e suas respectivas funções de manutenção e utilizaremos para isso a comunicação de dados primitivas dos Soquetes de Berkeley.\n\nChaTietê é um software para auxiliar Pontos de tratamento do Rio Tietê, em suas comunicações.\n\n-----\n\nTrabalho de Atividade Prática Spervisionada, apresentado para obtenção total de nota do 5º Semestre no Curso de Ciência da Computação da Universidade Paulista - UNIP.\nOrientador(a): Prof. Arthur Bettaglia.\n\nDedicamos esse trabalho primeiramente à Deus, segundo ao nosso orientador Arthur Bettaglia por ter acreditado no nosso potencial e ter ajudado no desenvolvimento deste trabalho e aos nossos colaboradores por todo o apoio.\nAgradecemos a nossas famílias por ter nos proporcionado uma ótima estrutura educacional e ter nos apoiado nas decisões que já tomamos em nossas vidas.\n\n-----\n\nDanJoRaTay © 2018");
        sobre.setCaretPosition(0);
        sobre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        painelsobre.setViewportView(sobre);

        javax.swing.GroupLayout CorDeFundoLayout = new javax.swing.GroupLayout(CorDeFundo);
        CorDeFundo.setLayout(CorDeFundoLayout);
        
        CorDeFundoLayout.setHorizontalGroup(
            CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CorDeFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnvolt)
                    .addGroup(CorDeFundoLayout.createSequentialGroup()
                        .addComponent(Logo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(painelsobre, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CorDeFundoLayout.setVerticalGroup(
            CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CorDeFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelsobre, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnvolt)
                .addContainerGap())
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

    private void btnvoltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvoltActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnvoltActionPerformed

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
            java.util.logging.Logger.getLogger(FrmSobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSobre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CorDeFundo;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton btnvolt;
    private javax.swing.JScrollPane painelsobre;
    private javax.swing.JTextPane sobre;
    // End of variables declaration//GEN-END:variables
}
