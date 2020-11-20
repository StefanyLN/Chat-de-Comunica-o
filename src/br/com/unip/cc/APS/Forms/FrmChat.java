package br.com.unip.cc.APS.Forms;

import br.com.unip.cc.APS.Chat.ChatMessage;
import br.com.unip.cc.APS.Chat.ChatMessage.Action;
import br.com.unip.cc.APS.Chat.ClienteService;
import br.com.unip.cc.APS.DAO.UsersDAO;
import br.com.unip.cc.APS.Models.Users;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

public class FrmChat extends javax.swing.JFrame{
    private Socket socket;
    private ChatMessage message;
    private ClienteService service;
    
    Users user = new Users();
    UsersDAO userDAO = new UsersDAO();
    
    FrmChat fc = this;
    
    FrmSobre fs = new FrmSobre();
    FrmConsUser fprofile = new FrmConsUser();
    
    public int id;
    
    public FrmChat(){
        initComponents();
    }
    @SuppressWarnings("unchecked")
    private void initComponents(){
        jPanel1 = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        btnConnectar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaReceive = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaSend = new javax.swing.JTextArea();
        btnEnviar = new javax.swing.JButton();
        cboxenter = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listOnlines = new javax.swing.JList();
        Menu = new javax.swing.JMenuBar();
        menuProfile = new javax.swing.JMenu();
        Sep = new javax.swing.JMenu();
        menuCV = new javax.swing.JMenu();
        Sep2 = new javax.swing.JMenu();
        MenuSob = new javax.swing.JMenu();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ChaTime - Chat");
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {

            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }

            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtName.setEditable(false);
        
        btnConnectar.setText("Ficar OnLine");
        btnConnectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConnectarActionPerformed(evt);
            }
        });
        btnSair.setText("Ficar OffLine");
        btnSair.setEnabled(false);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        
        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtAreaReceive.setEditable(false);
        txtAreaReceive.setColumns(20);
        txtAreaReceive.setRows(5);
        txtAreaReceive.setEnabled(false);
        jScrollPane1.setViewportView(txtAreaReceive);

        txtAreaSend.setColumns(20);
        txtAreaSend.setRows(5);
        txtAreaSend.setText("Digite sua mensagem...");
        txtAreaSend.setEnabled(false);
        txtAreaSend.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAreaSendFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAreaSendFocusLost(evt);
            }
        });
        txtAreaSend.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAreaSendKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(txtAreaSend);

        btnEnviar.setText("Enviar");
        btnEnviar.setEnabled(false);
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        cboxenter.setText("Enviar com ENTER");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(cboxenter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEnviar)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEnviar)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(cboxenter)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConnectar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConnectar)
                    .addComponent(btnSair))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuários OnLine"));

        jScrollPane3.setViewportView(listOnlines);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );

        Menu.setBackground(new java.awt.Color(153, 153, 255));
        Menu.setFont(new java.awt.Font("Iskoola Pota", 2, 18)); // NOI18N

        menuProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/unip/cc/APSREDES/Icons/Perfil.png"))); // NOI18N
        menuProfile.setText("Perfil");
        menuProfile.setFont(new java.awt.Font("Iskoola Pota", 3, 18)); // NOI18N
        menuProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuProfileMouseClicked(evt);
            }
        });
        Menu.add(menuProfile);

        Sep.setText("|");
        Sep.setContentAreaFilled(false);
        Sep.setEnabled(false);
        Sep.setFocusable(false);
        Sep.setRequestFocusEnabled(false);
        Sep.setRolloverEnabled(false);
        Sep.setVerifyInputWhenFocusTarget(false);
        Menu.add(Sep);

        menuCV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/unip/cc/APSREDES/Icons/CorreioVoz.png"))); // NOI18N
        menuCV.setText("Correio de Voz");
        menuCV.setFont(new java.awt.Font("Iskoola Pota", 3, 18)); // NOI18N
        menuCV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuCVMouseClicked(evt);
            }
        });
        Menu.add(menuCV);

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private class ListenerSocket implements Runnable {

        private ObjectInputStream input;

        public ListenerSocket(Socket socket) {
            try {
                this.input = new ObjectInputStream(socket.getInputStream());
            } catch (IOException ex) {
                Logger.getLogger(FrmChat.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        @Override
        public void run() {
            ChatMessage message = null;
            try {
                while ((message = (ChatMessage) input.readObject()) != null) {
                    ChatMessage.Action action = message.getAction();

                    if (action.equals(ChatMessage.Action.CONNECT)) {
                        connected(message);
                    } else if (action.equals(ChatMessage.Action.DISCONNECT)) {
                        disconnected();
                        socket.close();
                    } else if (action.equals(ChatMessage.Action.SEND_ONE)) {
                        receive(message);
                    } else if (action.equals(ChatMessage.Action.USERS_ONLINE)) {
                        refreshOnlines(message);
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(FrmChat.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(FrmChat.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void connected(ChatMessage message) {
        if (message.getText().equals("NO")) {
            this.txtName.setText(user.getNome());
            JOptionPane.showMessageDialog(this, "Não foi possível se conectar com esse nome!\nTente novamente com um novo nome!");
            menuProfile.setEnabled(true);
            menuCV.setEnabled(true);
            return;
        }

        this.message = message;
        this.btnConnectar.setEnabled(false);
        this.txtName.setEditable(false);

        this.btnSair.setEnabled(true);
        this.txtAreaSend.setEnabled(true);
        this.txtAreaReceive.setEnabled(true);
        this.btnEnviar.setEnabled(true);

        JOptionPane.showMessageDialog(this, user.getNome()+", Você entrou no Chat!\nStatus: OnLine!");
    }

    private void disconnected() {

        this.btnConnectar.setEnabled(true);

        this.btnSair.setEnabled(false);
        this.txtAreaSend.setEnabled(false);
        this.txtAreaReceive.setEnabled(false);
        this.btnEnviar.setEnabled(false);
        
        this.txtAreaReceive.setText("");
        this.txtAreaSend.setText("Digite sua mensagem...");

        JOptionPane.showMessageDialog(this, user.getNome()+", Você saiu do Chat!\nStatus: OffLine!");
        listOnlines.removeAll();
    }

    private void receive(ChatMessage message) {
        this.txtAreaReceive.append(message.getName() + " disse: " + message.getText() + "\n");
        Toolkit.getDefaultToolkit().beep();
    }

    private void refreshOnlines(ChatMessage message) {
              
        Set<String> names = message.getSetOnlines();
        
        names.remove(message.getName());
        
        String[] array = (String[]) names.toArray(new String[names.size()]);
        
        this.listOnlines.setListData(array);
        this.listOnlines.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.listOnlines.setLayoutOrientation(JList.VERTICAL);
    }
        
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        fprofile.id = this.id;
        
        userDAO.Login(user, this);
        txtName.setText(user.getNome());
        btnConnectarActionPerformed(null);
    }//GEN-LAST:event_formWindowOpened

    private void MenuSobMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuSobMouseClicked
        fs.show();
    }//GEN-LAST:event_MenuSobMouseClicked

    private void btnConnectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConnectarActionPerformed
        String name = this.txtName.getText();

        if (!name.isEmpty()) {
            this.message = new ChatMessage();
            this.message.setAction(Action.CONNECT);
            this.message.setName(name);

            this.service = new ClienteService();
            this.socket = this.service.connect();

            new Thread(new ListenerSocket(this.socket)).start();

            this.service.send(message);
            menuProfile.setEnabled(false);
            menuCV.setEnabled(false);
        }
    }//GEN-LAST:event_btnConnectarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        ChatMessage message = new ChatMessage();
        message.setName(this.message.getName());
        message.setAction(Action.DISCONNECT);
        this.service.send(message);
        disconnected();
        menuProfile.setEnabled(true);
        menuCV.setEnabled(true);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        String text = this.txtAreaSend.getText();
        String name = this.message.getName();

        this.message = new ChatMessage();

        if (this.listOnlines.getSelectedIndex() > -1) {
            this.message.setNameReserved((String) this.listOnlines.getSelectedValue());
            this.message.setAction(Action.SEND_ONE);
            this.listOnlines.clearSelection();
        } else {
            this.message.setAction(Action.SEND_ALL);
        }

        if (!text.isEmpty()) {
            this.message.setName(name);
            this.message.setText(text);

            this.txtAreaReceive.append("Você disse: " + text + "\n");

            this.service.send(this.message);
        }
        
        if (cboxenter.isSelected()) {
        this.txtAreaSend.setText("");
            }else{
        this.txtAreaSend.setText("Digite sua mensagem...");
        }        
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void txtAreaSendFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAreaSendFocusGained
        if (txtAreaSend.getText().contains("Digite sua mensagem...")) {
            this.txtAreaSend.setText("");
        }
    }//GEN-LAST:event_txtAreaSendFocusGained

    private void txtAreaSendKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAreaSendKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if (cboxenter.isSelected()) {
                btnEnviarActionPerformed(null);                
            }
        }
    }//GEN-LAST:event_txtAreaSendKeyReleased

    private void menuProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuProfileMouseClicked
        fprofile.show();
    }//GEN-LAST:event_menuProfileMouseClicked

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        userDAO.Login(user, this);
        txtName.setText(user.getNome());
    }//GEN-LAST:event_formWindowGainedFocus

    private void txtAreaSendFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAreaSendFocusLost
        if (txtAreaSend.getText().isEmpty()) {
            this.txtAreaSend.setText("Digite sua mensagem...");
        }
    }//GEN-LAST:event_txtAreaSendFocusLost

    private void menuCVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCVMouseClicked
        
    }//GEN-LAST:event_menuCVMouseClicked

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
            java.util.logging.Logger.getLogger(FrmChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmChat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenu MenuSob;
    private javax.swing.JMenu Sep;
    private javax.swing.JMenu Sep2;
    private javax.swing.JButton btnConnectar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnSair;
    private javax.swing.JCheckBox cboxenter;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList listOnlines;
    private javax.swing.JMenu menuCV;
    private javax.swing.JMenu menuProfile;
    private javax.swing.JTextArea txtAreaReceive;
    private javax.swing.JTextArea txtAreaSend;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
