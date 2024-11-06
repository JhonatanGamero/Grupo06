
package GUI;

import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class CrearCuentaNueva extends javax.swing.JFrame {

    int xMouse, yMouse;
    
    public CrearCuentaNueva() {
        initComponents();
        agregarListeners();
    }
    
    private void agregarListeners() {
        // Listener para el campo de usuario
        userTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (userTxt.getText().equals("Ingrese su nombre de usuario")) {
                    userTxt.setText("");
                    userTxt.setForeground(new java.awt.Color(0, 0, 0));
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (userTxt.getText().isEmpty()) {
                    userTxt.setText("Ingrese su nombre de usuario");
                    userTxt.setForeground(new java.awt.Color(153, 153, 153));
                }
            }
        });

        // Listener para el campo de contraseña
        passTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (String.valueOf(passTxt.getPassword()).equals("**")) {
                    passTxt.setText("");
                    passTxt.setForeground(new java.awt.Color(0, 0, 0));
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (String.valueOf(passTxt.getPassword()).isEmpty()) {
                    passTxt.setText("**");
                    passTxt.setForeground(new java.awt.Color(204, 204, 204));
                }
            }
        });

        // Listener para el campo de código
        codigoTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (codigoTxt.getText().equals("Ingrese su código de usuario")) {
                    codigoTxt.setText("");
                    codigoTxt.setForeground(new java.awt.Color(0, 0, 0));
                }
            }
            
            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (codigoTxt.getText().isEmpty()) {
                    codigoTxt.setText("Ingrese su código de usuario");
                    codigoTxt.setForeground(new java.awt.Color(153, 153, 153));
                }
            }
        });
        
        //Listener para el campo de nombre
        nombreTxt.addFocusListener(new java.awt.event.FocusAdapter(){
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (nombreTxt.getText().equals("Ingrese su nombre")){
                    nombreTxt.setText("");
                    nombreTxt.setForeground(new java.awt.Color(0, 0, 0));
                }
            }
            
            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (nombreTxt.getText().isEmpty()) {
                    nombreTxt.setText("Ingrese su nombre");
                    nombreTxt.setForeground(new java.awt.Color(153, 153, 153));
                }
            }
        });
        
        //Listener para el campo de género
        generoTxt.addFocusListener(new java.awt.event.FocusAdapter(){
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (generoTxt.getText().equals("Ingrese su género")){
                    generoTxt.setText("");
                    generoTxt.setForeground(new java.awt.Color(0, 0, 0));
                }
            }
            
            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (generoTxt.getText().isEmpty()) {
                    generoTxt.setText("Ingrese su género");
                    generoTxt.setForeground(new java.awt.Color(153, 153, 153));
                }
            }
        });
        
        //Listener para el campo de correo electrónico
        correoTxt.addFocusListener(new java.awt.event.FocusAdapter(){
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (correoTxt.getText().equals("Ingrese su correo electrónico")){
                    correoTxt.setText("");
                    correoTxt.setForeground(new java.awt.Color(0, 0, 0));
                }
            }
            
            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (correoTxt.getText().isEmpty()) {
                    correoTxt.setText("Ingrese su correo electrónico");
                    correoTxt.setForeground(new java.awt.Color(153, 153, 153));
                }
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        Contraseña = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        Usuario = new javax.swing.JLabel();
        userTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        passTxt = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JPanel();
        loginBtnTxt = new javax.swing.JLabel();
        ExitBtn = new javax.swing.JPanel();
        Exittxt = new javax.swing.JLabel();
        Rol = new javax.swing.JLabel();
        btnOrganizador = new javax.swing.JRadioButton();
        btnParticipante = new javax.swing.JRadioButton();
        codigoTxt = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        appname = new javax.swing.JLabel();
        Decoracion2 = new javax.swing.JLabel();
        Decoracion = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Codigo = new javax.swing.JLabel();
        correo = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        genero = new javax.swing.JLabel();
        correoTxt = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        nombreTxt = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        generoTxt = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setBackground(new java.awt.Color(0, 0, 0));
        Titulo.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 0, 0));
        Titulo.setText("CREA UNA CUENTA");
        jPanel3.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        Contraseña.setBackground(new java.awt.Color(0, 0, 0));
        Contraseña.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        Contraseña.setForeground(new java.awt.Color(0, 0, 0));
        Contraseña.setText("CONTRASEÑA ");
        jPanel3.add(Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, -1, -1));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 500, 430, 10));

        Usuario.setBackground(new java.awt.Color(0, 0, 0));
        Usuario.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        Usuario.setForeground(new java.awt.Color(0, 0, 0));
        Usuario.setText("USUARIO ");
        jPanel3.add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, -1, -1));

        userTxt.setBackground(new java.awt.Color(255, 255, 255));
        userTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        userTxt.setForeground(new java.awt.Color(153, 153, 153));
        userTxt.setText("Ingrese su nombre de usuario");
        userTxt.setBorder(null);
        userTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userTxtMousePressed(evt);
            }
        });
        jPanel3.add(userTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 360, 20));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 430, 10));

        passTxt.setBackground(new java.awt.Color(255, 255, 255));
        passTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passTxt.setForeground(new java.awt.Color(204, 204, 204));
        passTxt.setText("********");
        passTxt.setBorder(null);
        passTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passTxtMousePressed(evt);
            }
        });
        passTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passTxtActionPerformed(evt);
            }
        });
        jPanel3.add(passTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 480, 360, 20));

        loginBtn.setBackground(new java.awt.Color(58, 126, 145));
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginBtnMouseExited(evt);
            }
        });

        loginBtnTxt.setBackground(new java.awt.Color(240, 240, 240));
        loginBtnTxt.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        loginBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        loginBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginBtnTxt.setText("Registrarte");
        loginBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtnTxt.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                loginBtnTxtAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        loginBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout loginBtnLayout = new javax.swing.GroupLayout(loginBtn);
        loginBtn.setLayout(loginBtnLayout);
        loginBtnLayout.setHorizontalGroup(
            loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginBtnLayout.createSequentialGroup()
                .addComponent(loginBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        loginBtnLayout.setVerticalGroup(
            loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(loginBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 650, 140, 50));

        ExitBtn.setBackground(new java.awt.Color(255, 255, 255));

        Exittxt.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        Exittxt.setForeground(new java.awt.Color(0, 0, 0));
        Exittxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Exittxt.setText("X");
        Exittxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exittxt.setPreferredSize(new java.awt.Dimension(40, 40));
        Exittxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExittxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExittxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExittxtMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ExittxtMousePressed(evt);
            }
        });

        javax.swing.GroupLayout ExitBtnLayout = new javax.swing.GroupLayout(ExitBtn);
        ExitBtn.setLayout(ExitBtnLayout);
        ExitBtnLayout.setHorizontalGroup(
            ExitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ExitBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Exittxt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ExitBtnLayout.setVerticalGroup(
            ExitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Exittxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.add(ExitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(913, 0, 60, 40));

        Rol.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        Rol.setForeground(new java.awt.Color(0, 0, 0));
        Rol.setText("ROL");
        jPanel3.add(Rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, -1, -1));

        buttonGroup1.add(btnOrganizador);
        btnOrganizador.setText("Organizador");
        btnOrganizador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrganizadorActionPerformed(evt);
            }
        });
        jPanel3.add(btnOrganizador, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 580, -1, -1));

        buttonGroup1.add(btnParticipante);
        btnParticipante.setText("Participante");
        jPanel3.add(btnParticipante, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 580, -1, -1));

        codigoTxt.setBackground(new java.awt.Color(255, 255, 255));
        codigoTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        codigoTxt.setForeground(new java.awt.Color(153, 153, 153));
        codigoTxt.setText("Ingrese su código de usuario");
        codigoTxt.setBorder(null);
        codigoTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                codigoTxtMousePressed(evt);
            }
        });
        jPanel3.add(codigoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 360, 20));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, 430, 10));

        jLabel1.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Es rápido y fácil. ");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        appname.setFont(new java.awt.Font("Roboto Black", 3, 36)); // NOI18N
        appname.setForeground(new java.awt.Color(0, 0, 0));
        appname.setText("Nexus Eventos");
        jPanel3.add(appname, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, -1, -1));

        Decoracion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/decoracion2.png"))); // NOI18N
        jPanel3.add(Decoracion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, 100));

        Decoracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/decoracion.png"))); // NOI18N
        jPanel3.add(Decoracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 130, 100));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/triangulorecto.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel4MouseDragged(evt);
            }
        });
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/triangulorecto2.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 650, -1, -1));

        Codigo.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        Codigo.setForeground(new java.awt.Color(0, 0, 0));
        Codigo.setText("CÓDIGO");
        jPanel3.add(Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, -1, -1));

        correo.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        correo.setForeground(new java.awt.Color(0, 0, 0));
        correo.setText("CORREO ELECTRÓNICO");
        jPanel3.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));

        Nombre.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        Nombre.setForeground(new java.awt.Color(0, 0, 0));
        Nombre.setText("NOMBRE");
        jPanel3.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        genero.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        genero.setForeground(new java.awt.Color(0, 0, 0));
        genero.setText("GÉNERO");
        jPanel3.add(genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, -1, -1));

        correoTxt.setBackground(new java.awt.Color(255, 255, 255));
        correoTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        correoTxt.setForeground(new java.awt.Color(153, 153, 153));
        correoTxt.setText("Ingrese su correo electrónico");
        correoTxt.setBorder(null);
        correoTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                correoTxtMousePressed(evt);
            }
        });
        jPanel3.add(correoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 360, 20));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 430, 10));

        nombreTxt.setBackground(new java.awt.Color(255, 255, 255));
        nombreTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        nombreTxt.setForeground(new java.awt.Color(153, 153, 153));
        nombreTxt.setText("Ingrese su nombre");
        nombreTxt.setBorder(null);
        nombreTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nombreTxtMousePressed(evt);
            }
        });
        jPanel3.add(nombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 360, 20));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 430, 10));

        generoTxt.setBackground(new java.awt.Color(255, 255, 255));
        generoTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        generoTxt.setForeground(new java.awt.Color(153, 153, 153));
        generoTxt.setText("Ingrese su género");
        generoTxt.setBorder(null);
        generoTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                generoTxtMousePressed(evt);
            }
        });
        jPanel3.add(generoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 360, 20));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 430, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 971, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 743, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passTxtActionPerformed

    private void ExittxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExittxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExittxtMouseClicked

    private void ExittxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExittxtMousePressed
        // TODO add your handling code her
    }//GEN-LAST:event_ExittxtMousePressed

    private void ExittxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExittxtMouseEntered
        ExitBtn.setBackground(Color.red);
        Exittxt.setForeground(Color.white);
    }//GEN-LAST:event_ExittxtMouseEntered

    private void ExittxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExittxtMouseExited
        ExitBtn.setBackground(Color.white);
        Exittxt.setForeground(Color.black);
    }//GEN-LAST:event_ExittxtMouseExited

    private void loginBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTxtMouseEntered
            loginBtn.setBackground(new Color(126, 187, 204));
    }//GEN-LAST:event_loginBtnTxtMouseEntered

    private void loginBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTxtMouseExited
            loginBtn.setBackground(new Color(58,126,145));
    }//GEN-LAST:event_loginBtnTxtMouseExited

    private void loginBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseEntered
    //
    }//GEN-LAST:event_loginBtnMouseEntered

    private void loginBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseExited
    //
    }//GEN-LAST:event_loginBtnMouseExited

    private void userTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTxtMousePressed
        if(nombreTxt.getText().isEmpty()){
           nombreTxt.setText("Ingrese su nombre");
           nombreTxt.setForeground(Color.gray);
        }
        if(generoTxt.getText().isEmpty()){
           generoTxt.setText("Ingrese su género");
           generoTxt.setForeground(Color.gray);
        }
        if(correoTxt.getText().isEmpty()){
           correoTxt.setText("Ingrese su correo electrónico");
           correoTxt.setForeground(Color.gray);
        }
        if (codigoTxt.getText() .isEmpty()){  
            codigoTxt.setText("Ingrese su código de usuario");
            codigoTxt.setForeground(Color.gray);
        }
        if (userTxt.getText() .equals("Ingrese su nombre de usuario")){  
            userTxt.setText("");
            userTxt.setForeground(Color.black);
        }
        if (String.valueOf(passTxt.getPassword()) .isEmpty()){  
            passTxt.setText("********");
            passTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_userTxtMousePressed

    private void passTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passTxtMousePressed
        if(nombreTxt.getText().isEmpty()){
           nombreTxt.setText("Ingrese su nombre");
           nombreTxt.setForeground(Color.gray);
        }
        if(generoTxt.getText().isEmpty()){
           generoTxt.setText("Ingrese su género");
           generoTxt.setForeground(Color.gray);
        }
        if(correoTxt.getText().isEmpty()){
           correoTxt.setText("Ingrese su correo electrónico");
           correoTxt.setForeground(Color.gray);
        }
        if (codigoTxt.getText() .isEmpty()){  
            codigoTxt.setText("Ingrese su código de usuario");
            codigoTxt.setForeground(Color.gray);
        }
        if (userTxt.getText() .isEmpty()){  
            userTxt.setText("Ingrese su nombre de usuario");
            userTxt.setForeground(Color.gray);
        } 
        if (String.valueOf(passTxt.getPassword()) .equals("********")){
            passTxt.setText("");
            passTxt.setForeground(Color.black);
        } 
    }//GEN-LAST:event_passTxtMousePressed

    private void loginBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTxtMouseClicked
            // Validación del código
            if (codigoTxt.getText().length() == 0) {
                JOptionPane.showMessageDialog(this, "Ingresar su código");
                return;
            }

            String codigo = codigoTxt.getText();
            Pattern validarCodigo = Pattern.compile("^[0-9]{8}$");
            Matcher validandoCodigo = validarCodigo.matcher(codigo);
            if (!validandoCodigo.matches()) {
                JOptionPane.showMessageDialog(this, "El código solo puede tener números y un máximo de 8 dígitos");
                return;
            }

            // Validación del usuario
            if (userTxt.getText().length() == 0) {
                JOptionPane.showMessageDialog(this, "Ingresar su usuario");
                return;
            }

            String nombre = userTxt.getText();
            Pattern validarNombre = Pattern.compile("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+$");
            Matcher nombreValida = validarNombre.matcher(nombre);
            if (!nombreValida.matches()) {
                JOptionPane.showMessageDialog(this, "El nombre solo puede contener letras");
                return;
            }

            // Validación de la contraseña
            if (passTxt.getPassword().length==0) {
                JOptionPane.showMessageDialog(this, "Ingresar su contraseña");
                return;
            } 
            
            // Si todas las validaciones son correctas, se abre la página y se cierra la ventana actual
            Pagina pagina = new Pagina();
            pagina.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_loginBtnTxtMouseClicked

    private void btnOrganizadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrganizadorActionPerformed
        // 
    }//GEN-LAST:event_btnOrganizadorActionPerformed

    private void codigoTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_codigoTxtMousePressed
        if(nombreTxt.getText().isEmpty()){
           nombreTxt.setText("Ingrese su nombre");
           nombreTxt.setForeground(Color.gray);
        }
        if(generoTxt.getText().isEmpty()){
           generoTxt.setText("Ingrese su género");
           generoTxt.setForeground(Color.gray);
        }
        if(correoTxt.getText().isEmpty()){
           correoTxt.setText("Ingrese su correo electrónico");
           correoTxt.setForeground(Color.gray);
        }
        if (codigoTxt.getText() .equals("Ingrese su código de usuario")){  
            codigoTxt.setText("");
            codigoTxt.setForeground(Color.black);
        }
        if (userTxt.getText() .isEmpty()){  
            userTxt.setText("Ingrese su nombre de usuario");
            userTxt.setForeground(Color.gray);
        }
        if (String.valueOf(passTxt.getPassword()) .isEmpty()){  
            passTxt.setText("********");
            passTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_codigoTxtMousePressed

    private void loginBtnTxtAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_loginBtnTxtAncestorAdded
     
    }//GEN-LAST:event_loginBtnTxtAncestorAdded

    private void loginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_loginBtnMouseClicked

    private void jPanel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel4MouseDragged

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel4MousePressed

    private void correoTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_correoTxtMousePressed
        if(nombreTxt.getText().isEmpty()){
           nombreTxt.setText("Ingrese su nombre");
           nombreTxt.setForeground(Color.gray);
        }
        if(generoTxt.getText().isEmpty()){
           generoTxt.setText("Ingrese su género");
           generoTxt.setForeground(Color.gray);
        }
        if(correoTxt.getText().isEmpty()){
           correoTxt.setText("Ingrese su correo electrónico");
           correoTxt.setForeground(Color.black);
        }
        if (codigoTxt.getText() .isEmpty()){  
            codigoTxt.setText("Ingrese su código de usuario");
            codigoTxt.setForeground(Color.gray);
        }
        if (userTxt.getText() .equals("Ingrese su nombre de usuario")){  
            userTxt.setText("");
            userTxt.setForeground(Color.gray);
        }
        if (String.valueOf(passTxt.getPassword()) .isEmpty()){  
            passTxt.setText("********");
            passTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_correoTxtMousePressed

    private void nombreTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreTxtMousePressed
        if(nombreTxt.getText().isEmpty()){
           nombreTxt.setText("Ingrese su nombre");
           nombreTxt.setForeground(Color.black);
        }
        if(generoTxt.getText().isEmpty()){
           generoTxt.setText("Ingrese su género");
           generoTxt.setForeground(Color.gray);
        }
        if(correoTxt.getText().isEmpty()){
           correoTxt.setText("Ingrese su correo electrónico");
           correoTxt.setForeground(Color.gray);
        }
        if (codigoTxt.getText() .isEmpty()){  
            codigoTxt.setText("Ingrese su código de usuario");
            codigoTxt.setForeground(Color.gray);
        }
        if (userTxt.getText() .equals("Ingrese su nombre de usuario")){  
            userTxt.setText("");
            userTxt.setForeground(Color.gray);
        }
        if (String.valueOf(passTxt.getPassword()) .isEmpty()){  
            passTxt.setText("********");
            passTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_nombreTxtMousePressed

    private void generoTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generoTxtMousePressed
        if(nombreTxt.getText().isEmpty()){
           nombreTxt.setText("Ingrese su nombre");
           nombreTxt.setForeground(Color.gray);
        }
        if(generoTxt.getText().isEmpty()){
           generoTxt.setText("Ingrese su género");
           generoTxt.setForeground(Color.black);
        }
        if(correoTxt.getText().isEmpty()){
           correoTxt.setText("Ingrese su correo electrónico");
           correoTxt.setForeground(Color.gray);
        }
        if (codigoTxt.getText() .isEmpty()){  
            codigoTxt.setText("Ingrese su código de usuario");
            codigoTxt.setForeground(Color.gray);
        }
        if (userTxt.getText() .equals("Ingrese su nombre de usuario")){  
            userTxt.setText("");
            userTxt.setForeground(Color.gray);
        }
        if (String.valueOf(passTxt.getPassword()) .isEmpty()){  
            passTxt.setText("********");
            passTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_generoTxtMousePressed

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
            java.util.logging.Logger.getLogger(CrearCuentaNueva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearCuentaNueva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearCuentaNueva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearCuentaNueva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearCuentaNueva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Codigo;
    private javax.swing.JLabel Contraseña;
    private javax.swing.JLabel Decoracion;
    private javax.swing.JLabel Decoracion2;
    private javax.swing.JPanel ExitBtn;
    private javax.swing.JLabel Exittxt;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Rol;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Usuario;
    private javax.swing.JLabel appname;
    private javax.swing.JRadioButton btnOrganizador;
    private javax.swing.JRadioButton btnParticipante;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField codigoTxt;
    private javax.swing.JLabel correo;
    private javax.swing.JTextField correoTxt;
    private javax.swing.JLabel genero;
    private javax.swing.JTextField generoTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JPanel loginBtn;
    private javax.swing.JLabel loginBtnTxt;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JPasswordField passTxt;
    private javax.swing.JTextField userTxt;
    // End of variables declaration//GEN-END:variables
}
