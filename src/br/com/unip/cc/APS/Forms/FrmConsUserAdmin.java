package br.com.unip.cc.APS.Forms;

import br.com.unip.cc.APS.DAO.UsersDAO;
import br.com.unip.cc.APS.Models.Users;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class FrmConsUserAdmin extends javax.swing.JFrame{
    Users user = new Users();
    UsersDAO userDAO = new UsersDAO();
    FrmConsUserAdmin fcua = this;
    
    InputStream in;
    AudioStream msg;
    
    public int id;
    char d;
    
    public FrmConsUserAdmin(){
        initComponents();
    }
        
        
        
        @SuppressWarnings("unchecked")
        private void initComponents(){
        
            CorDeFundo = new javax.swing.JPanel();
            btnpes = new javax.swing.JButton();
            lblnome = new javax.swing.JLabel();
            lblemail = new javax.swing.JLabel();
            lbluser = new javax.swing.JLabel();
            lblsenha = new javax.swing.JLabel();
            txtemail = new javax.swing.JTextField();
            txtpes = new javax.swing.JTextField();
            txtsenha = new javax.swing.JPasswordField();
            txtuser = new javax.swing.JTextField();
            linha = new javax.swing.JSeparator();
            cbms = new javax.swing.JCheckBox();
            btndel = new javax.swing.JButton();
            btnconf = new javax.swing.JButton();
            btnalt = new javax.swing.JButton();
            linha2 = new javax.swing.JSeparator();
            jScrollPane2 = new javax.swing.JScrollPane();
            tbluser = new javax.swing.JTable();
            txtnm = new javax.swing.JTextField();
            lblnome1 = new javax.swing.JLabel();
            logo = new javax.swing.JLabel();
            linha3 = new javax.swing.JSeparator();
            linha1 = new javax.swing.JSeparator();
            tabCorreioDeVoz = new javax.swing.JTabbedPane();
            jScrollPane3 = new javax.swing.JScrollPane();
            tblEntrada = new javax.swing.JTable();
            jScrollPane4 = new javax.swing.JScrollPane();
            tblEnviadas = new javax.swing.JTable();
            jScrollPane6 = new javax.swing.JScrollPane();
            tblArquivadas = new javax.swing.JTable();
            jScrollPane7 = new javax.swing.JScrollPane();
            tblDeletadas = new javax.swing.JTable();
            btnplay = new javax.swing.JButton();
            btnstop = new javax.swing.JButton();
            btndelcv = new javax.swing.JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ChaTime - Consultar Usuários");
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

        btnpes.setFont(new java.awt.Font("Iskoola Pota", 2, 18)); // NOI18N
        btnpes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/unip/cc/APSREDES/Icons/Buscar.png"))); // NOI18N
        btnpes.setText("Pesquisar");
        btnpes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesActionPerformed(evt);
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

        txtemail.setEditable(false);
        txtemail.setFont(new java.awt.Font("Iskoola Pota", 2, 18)); // NOI18N
        txtemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtemailKeyPressed(evt);
            }
        });

        txtpes.setFont(new java.awt.Font("Iskoola Pota", 2, 18)); // NOI18N
        txtpes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpesKeyPressed(evt);
            }
        });

        txtsenha.setEditable(false);
        txtsenha.setFont(new java.awt.Font("Iskoola Pota", 2, 18)); // NOI18N
        txtsenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsenhaKeyPressed(evt);
            }
        });

        txtuser.setEditable(false);
        txtuser.setFont(new java.awt.Font("Iskoola Pota", 2, 18)); // NOI18N
        txtuser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtuserKeyPressed(evt);
            }
        });

        linha.setOrientation(javax.swing.SwingConstants.VERTICAL);

        cbms.setFont(new java.awt.Font("Iskoola Pota", 2, 14)); // NOI18N
        cbms.setText("Mostrar Senha ");
        cbms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmsActionPerformed(evt);
            }
        });

        btndel.setFont(new java.awt.Font("Iskoola Pota", 2, 18)); // NOI18N
        btndel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/unip/cc/APSREDES/Icons/Fechar.png"))); // NOI18N
        btndel.setText("Deletar");
        btndel.setEnabled(false);
        btndel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelActionPerformed(evt);
            }
        });

        btnconf.setFont(new java.awt.Font("Iskoola Pota", 2, 18)); // NOI18N
        btnconf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/unip/cc/APSREDES/Icons/Done.png"))); // NOI18N
        btnconf.setText("Confirmar Alterações");
        btnconf.setEnabled(false);
        btnconf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconfActionPerformed(evt);
            }
        });

        btnalt.setFont(new java.awt.Font("Iskoola Pota", 2, 18)); // NOI18N
        btnalt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/unip/cc/APSREDES/Icons/Done.png"))); // NOI18N
        btnalt.setText("Alterar");
        btnalt.setEnabled(false);
        btnalt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaltActionPerformed(evt);
            }
        });

        tbluser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Email", "Usuário", "Senha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbluser.getTableHeader().setReorderingAllowed(false);
        tbluser.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tbluserAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tbluser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbluserMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbluser);

        txtnm.setEditable(false);
        txtnm.setFont(new java.awt.Font("Iskoola Pota", 2, 18)); // NOI18N
        txtnm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnmKeyPressed(evt);
            }
        });

        lblnome1.setFont(new java.awt.Font("Iskoola Pota", 2, 18)); // NOI18N
        lblnome1.setForeground(new java.awt.Color(102, 102, 102));
        lblnome1.setText("Nome: ");

        logo.setFont(new java.awt.Font("Iskoola Pota", 3, 14)); // NOI18N
        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/unip/cc/APSREDES/Icons/LogoChat.png"))); // NOI18N

        linha1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        tblEntrada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mensagem", "Remetente", "Estado", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEntrada.getTableHeader().setReorderingAllowed(false);
        tblEntrada.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblEntradaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tblEntrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEntradaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblEntrada);

        tabCorreioDeVoz.addTab("Entrada", jScrollPane3);

        tblEnviadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mensagem", "Destinatário", "Estado", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEnviadas.getTableHeader().setReorderingAllowed(false);
        tblEnviadas.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblEnviadasAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tblEnviadas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEnviadasMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblEnviadas);

        tabCorreioDeVoz.addTab("Enviadas", jScrollPane4);

        tblArquivadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mensagem", "Remetente", "Estado", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblArquivadas.getTableHeader().setReorderingAllowed(false);
        tblArquivadas.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblArquivadasAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tblArquivadas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblArquivadasMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tblArquivadas);

        tabCorreioDeVoz.addTab("Arquivadas", jScrollPane6);

        tblDeletadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mensagem", "Remetente", "Estado", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDeletadas.getTableHeader().setReorderingAllowed(false);
        tblDeletadas.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblDeletadasAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tblDeletadas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                
            }
        });
        jScrollPane7.setViewportView(tblDeletadas);

        tabCorreioDeVoz.addTab("Deletadas", jScrollPane7);

        btnplay.setFont(new java.awt.Font("Iskoola Pota", 2, 18)); // NOI18N
        btnplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/unip/cc/APSREDES/Icons/Play.png"))); // NOI18N
        btnplay.setText("Play");
        btnplay.setEnabled(false);
        btnplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnplayActionPerformed(evt);
            }
        });

        btnstop.setFont(new java.awt.Font("Iskoola Pota", 2, 18)); // NOI18N
        btnstop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/unip/cc/APSREDES/Icons/Parar.png"))); // NOI18N
        btnstop.setText("Parar");
        btnstop.setEnabled(false);
        btnstop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstopActionPerformed(evt);
            }
        });

        btndelcv.setFont(new java.awt.Font("Iskoola Pota", 2, 18)); // NOI18N
        btndelcv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/unip/cc/APSREDES/Icons/Fechar.png"))); // NOI18N
        btndelcv.setText("Deletar");
        btndelcv.setEnabled(false);
        btndelcv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelcvActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CorDeFundoLayout = new javax.swing.GroupLayout(CorDeFundo);
        CorDeFundo.setLayout(CorDeFundoLayout);
        CorDeFundoLayout.setHorizontalGroup(
            CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CorDeFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(logo)
                        .addComponent(linha3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CorDeFundoLayout.createSequentialGroup()
                            .addComponent(lblnome1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtpes, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnpes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(linha, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CorDeFundoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CorDeFundoLayout.createSequentialGroup()
                                .addGroup(CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblsenha)
                                    .addComponent(lbluser))
                                .addGroup(CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CorDeFundoLayout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addComponent(cbms))
                                    .addGroup(CorDeFundoLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtuser)
                                            .addComponent(txtsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnconf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(CorDeFundoLayout.createSequentialGroup()
                                        .addComponent(btnalt, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btndel))))
                            .addGroup(CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CorDeFundoLayout.createSequentialGroup()
                                    .addComponent(lblnome)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtnm))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CorDeFundoLayout.createSequentialGroup()
                                    .addComponent(lblemail)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2)
                        .addComponent(linha2, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(linha1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabCorreioDeVoz, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                    .addGroup(CorDeFundoLayout.createSequentialGroup()
                        .addComponent(btnplay, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnstop)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CorDeFundoLayout.createSequentialGroup()
                    .addContainerGap(1143, Short.MAX_VALUE)
                    .addComponent(btndelcv)
                    .addContainerGap()))
        );
        CorDeFundoLayout.setVerticalGroup(
            CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CorDeFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CorDeFundoLayout.createSequentialGroup()
                        .addComponent(tabCorreioDeVoz, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnplay)
                            .addComponent(btnstop)))
                    .addGroup(CorDeFundoLayout.createSequentialGroup()
                        .addGroup(CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CorDeFundoLayout.createSequentialGroup()
                                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(linha3, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblnome1)
                                    .addComponent(txtpes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnpes, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CorDeFundoLayout.createSequentialGroup()
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
                                            .addComponent(btnalt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btndel))
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
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbms)))
                                .addGap(11, 11, 11)
                                .addComponent(linha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(linha)
            .addComponent(linha1)
            .addGroup(CorDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CorDeFundoLayout.createSequentialGroup()
                    .addContainerGap(308, Short.MAX_VALUE)
                    .addComponent(btndelcv)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CorDeFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CorDeFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void LimparTudo(){
        txtnm.setEditable(false);
        txtuser.setEditable(false);
        txtemail.setEditable(false);
        txtsenha.setEditable(false);
        txtpes.setEditable(true);
        btnalt.setEnabled(false);
        btnplay.setEnabled(false);
        btnstop.setEnabled(false);
        btndelcv.setEnabled(false);
        btndel.setEnabled(false);
        btnconf.setEnabled(false);
        btnpes.setEnabled(true);
        
        tbluser.setEnabled(true);
        tblEntrada.setEnabled(true);
        tblArquivadas.setEnabled(true);
        tblDeletadas.setEnabled(true);
        tblEnviadas.setEnabled(true);
        
        txtnm.setText(null);
        txtuser.setText(null);
        txtemail.setText(null);
        txtsenha.setText(null);
        
        user.setId_User(0);
        user.setNome(null);
        user.setEmail(null);
        user.setUser(null);
        user.setSenha(null);
        
      
        tbluserAncestorAdded(null);
        tblEntradaAncestorAdded(null);
        tblArquivadasAncestorAdded(null);
        tblDeletadasAncestorAdded(null);
        tblEnviadasAncestorAdded(null);
    }
    
    public void PegarIDUser(){
        user.setNome(txtnm.getText());
        userDAO.PesquisarID(user);
        id = user.getId_User();
        user.setId_User(id); 
    }
    
    public void EmailIgual(){
        txtemail.selectAll();
        txtemail.requestFocus();
    }
    
    public void UsuarioIgual(){
        txtuser.selectAll();
        txtuser.requestFocus();
    }
    
    private void btnpesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesActionPerformed
        LimparTudo();

        if (!"".equals(txtpes.getText())) {
            user.setNome(txtpes.getText());
            userDAO.PesquisarNome(user);

            txtnm.setText(user.getNome());
            txtemail.setText(user.getEmail());
            txtuser.setText(user.getUser());
            txtsenha.setText(user.getSenha());
            
            tblEntradaAncestorAdded(null);
            tblArquivadasAncestorAdded(null);
            tblDeletadasAncestorAdded(null);
            tblEnviadasAncestorAdded(null);

            if ("".equals(txtuser.getText())) {
                JOptionPane.showMessageDialog(null, "Usuário Não Encontrado!");
                btnalt.setEnabled(false);
                btndel.setEnabled(false);
            }else{
                btnalt.setEnabled(true);
                btndel.setEnabled(true);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Você precisa digitar o nome de algum Usuário!");
            btnalt.setEnabled(false);
            btndel.setEnabled(false);
        }
    }//GEN-LAST:event_btnpesActionPerformed

    private void cbmsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmsActionPerformed
        char c = 0;
        if (cbms.isSelected()) {
            txtsenha.setEchoChar(c);
        }else{
            txtsenha.setEchoChar(d);
        }
    }//GEN-LAST:event_cbmsActionPerformed

    private void btndelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelActionPerformed
        
        userDAO.RemoverCadastroUsers(user);
        LimparTudo();
    }//GEN-LAST:event_btndelActionPerformed

    private void btnconfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconfActionPerformed
        if ("".equals(txtnm.getText()) || "".equals(txtemail.getText()) || "".equals(txtuser.getText()) || "".equals(txtsenha.getText())) {
            JOptionPane.showMessageDialog(null, "Todos os campos precisam ser preenchidos para a alteração do cadastro!");
        }else{
            PegarIDUser();

            user.setUser(txtuser.getText());
            user.setEmail(txtemail.getText());
            user.setSenha(txtsenha.getText());

            userDAO.VerificarEmailIgual2(user, this, fcua);
        }
    }//GEN-LAST:event_btnconfActionPerformed

    private void btnaltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaltActionPerformed
        int resposta=JOptionPane.showConfirmDialog(null, "Deseja Mesmo Alterar as Informações desse Cadastro?");

        if (resposta==0) {
            txtnm.setEditable(true);
            txtuser.setEditable(true);
            txtemail.setEditable(true);
            txtsenha.setEditable(true);
            txtpes.setEditable(false);
            btnalt.setEnabled(false);
            btndel.setEnabled(false);
            btnpes.setEnabled(false);
            btnconf.setEnabled(true);

            tbluser.setEnabled(false);
        }

        if (resposta==1) {
            txtnm.setEditable(false);
            txtuser.setEditable(false);
            txtemail.setEditable(false);
            txtsenha.setEditable(false);
            txtpes.setEditable(true);
            btnpes.setEnabled(true);
            btnconf.setEnabled(false);
            tbluser.setEnabled(true);
        }
    }//GEN-LAST:event_btnaltActionPerformed

    private void tbluserAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tbluserAncestorAdded
        List<Users> users = userDAO.getListarTodos();
        DefaultTableModel model = (DefaultTableModel) tbluser.getModel();
        model.setNumRows(0);
        for (Users user : users){
            model.addRow(new Object[]{
                user.getNome(),
                user.getEmail(),
                user.getUser(),
                user.getSenha()});
        }
    }//GEN-LAST:event_tbluserAncestorAdded

    private void tbluserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbluserMouseClicked
        if (tbluser.isEnabled()) {
            if (evt.getClickCount() == 1) {

                txtnm.setText(tbluser.getValueAt(tbluser.getSelectedRow(), 0).toString());
                txtemail.setText(tbluser.getValueAt(tbluser.getSelectedRow(), 1).toString());
                txtuser.setText(tbluser.getValueAt(tbluser.getSelectedRow(), 2).toString());
                txtsenha.setText(tbluser.getValueAt(tbluser.getSelectedRow(), 3).toString());
               
                user.setNome(txtnm.getText());
                userDAO.PesquisarNome(user);
                
                tblEntradaAncestorAdded(null);
                tblArquivadasAncestorAdded(null);
                tblDeletadasAncestorAdded(null);
                tblEnviadasAncestorAdded(null);

                if (!"".equals(txtuser.getText())) {
                    btnalt.setEnabled(true);
                    btndel.setEnabled(true);
                }
            }
        }
    }//GEN-LAST:event_tbluserMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        d = txtsenha.getEchoChar();
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        txtpes.setText(null);
        LimparTudo();
    }//GEN-LAST:event_formWindowClosed

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

    private void txtpesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpesKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                btnpesActionPerformed(null); 
        }
    }//GEN-LAST:event_txtpesKeyPressed

    private void tblEntradaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblEntradaAncestorAdded
       
        DefaultTableModel model = (DefaultTableModel) tblEntrada.getModel();
        model.setNumRows(0);
        
    }//GEN-LAST:event_tblEntradaAncestorAdded

    private void tblEntradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEntradaMouseClicked
       
    }//GEN-LAST:event_tblEntradaMouseClicked

    private void tblArquivadasAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblArquivadasAncestorAdded
        
        DefaultTableModel model = (DefaultTableModel) tblArquivadas.getModel();
        model.setNumRows(0);
        
    }//GEN-LAST:event_tblArquivadasAncestorAdded

    private void tblArquivadasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblArquivadasMouseClicked
       
    }//GEN-LAST:event_tblArquivadasMouseClicked

    private void tblDeletadasAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblDeletadasAncestorAdded
       
        DefaultTableModel model = (DefaultTableModel) tblDeletadas.getModel();
        model.setNumRows(0);
        
    }//GEN-LAST:event_tblDeletadasMouseClicked

    private void btnplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnplayActionPerformed
        try {
                
                msg = new AudioStream(in);
                AudioPlayer.player.start(msg);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            btnplay.setEnabled(false);
            btnstop.setEnabled(false);
            btndelcv.setEnabled(false);
        }
    }//GEN-LAST:event_btnplayActionPerformed

    private void btnstopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstopActionPerformed
        AudioPlayer.player.stop(msg);
    }//GEN-LAST:event_btnstopActionPerformed

    private void btndelcvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelcvActionPerformed
    
        
        LimparTudo();
    }//GEN-LAST:event_btndelcvActionPerformed

    private void tblEnviadasAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblEnviadasAncestorAdded
        
        DefaultTableModel model = (DefaultTableModel) tblEnviadas.getModel();
        model.setNumRows(0);
        
    }//GEN-LAST:event_tblEnviadasAncestorAdded

    private void tblEnviadasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEnviadasMouseClicked
        
    }//GEN-LAST:event_tblEnviadasMouseClicked

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
            java.util.logging.Logger.getLogger(FrmConsUserAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmConsUserAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmConsUserAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmConsUserAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmConsUserAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CorDeFundo;
    private javax.swing.JButton btnalt;
    private javax.swing.JButton btnconf;
    private javax.swing.JButton btndel;
    private javax.swing.JButton btndelcv;
    private javax.swing.JButton btnpes;
    private javax.swing.JButton btnplay;
    private javax.swing.JButton btnstop;
    private javax.swing.JCheckBox cbms;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblnome;
    private javax.swing.JLabel lblnome1;
    private javax.swing.JLabel lblsenha;
    private javax.swing.JLabel lbluser;
    private javax.swing.JSeparator linha;
    private javax.swing.JSeparator linha1;
    private javax.swing.JSeparator linha2;
    private javax.swing.JSeparator linha3;
    private javax.swing.JLabel logo;
    private javax.swing.JTabbedPane tabCorreioDeVoz;
    private javax.swing.JTable tblArquivadas;
    private javax.swing.JTable tblDeletadas;
    private javax.swing.JTable tblEntrada;
    private javax.swing.JTable tblEnviadas;
    private javax.swing.JTable tbluser;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtnm;
    private javax.swing.JTextField txtpes;
    private javax.swing.JPasswordField txtsenha;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
