
package GUI;

import java.awt.Color;

public class RegistrosdeUsuarios extends javax.swing.JFrame {

    int xMouse, yMouse;
    
    public RegistrosdeUsuarios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        Local = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        Contraseña = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        Usuario = new javax.swing.JLabel();
        userTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        passTxt = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JPanel();
        loginBtnTxt = new javax.swing.JLabel();
        Decoracion = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        ExitBtn = new javax.swing.JPanel();
        Exittxt = new javax.swing.JLabel();
        Rol = new javax.swing.JLabel();
        btnOrganizador = new javax.swing.JRadioButton();
        btnParticipante = new javax.swing.JRadioButton();
        codigo = new javax.swing.JLabel();
        codigoTxt = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.jpg"))); // NOI18N
        jPanel3.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, -1, -1));

        Local.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/local.jpg"))); // NOI18N
        jPanel3.add(Local, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, -1, 640));

        Titulo.setBackground(new java.awt.Color(0, 0, 0));
        Titulo.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 0, 0));
        Titulo.setText("INICIAR SESIÓN");
        jPanel3.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        Contraseña.setBackground(new java.awt.Color(0, 0, 0));
        Contraseña.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        Contraseña.setForeground(new java.awt.Color(0, 0, 0));
        Contraseña.setText("CONTRASEÑA ");
        jPanel3.add(Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, -1, -1));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 430, 10));

        Usuario.setBackground(new java.awt.Color(0, 0, 0));
        Usuario.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        Usuario.setForeground(new java.awt.Color(0, 0, 0));
        Usuario.setText("USUARIO ");
        jPanel3.add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

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
        jPanel3.add(userTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 430, 20));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 430, 10));

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
        jPanel3.add(passTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 430, 20));

        loginBtn.setBackground(new java.awt.Color(58, 126, 145));
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
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
        loginBtnTxt.setText("Entrar");
        loginBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(loginBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        loginBtnLayout.setVerticalGroup(
            loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(loginBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 640, 140, 50));

        Decoracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/circulos.png"))); // NOI18N
        jPanel3.add(Decoracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 110, 70));

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
            .addGap(0, 760, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 40));

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
        jPanel3.add(Rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, -1, -1));

        buttonGroup1.add(btnOrganizador);
        btnOrganizador.setText("Organizador");
        btnOrganizador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrganizadorActionPerformed(evt);
            }
        });
        jPanel3.add(btnOrganizador, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, -1, -1));

        buttonGroup1.add(btnParticipante);
        btnParticipante.setText("Participante");
        jPanel3.add(btnParticipante, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 570, -1, -1));

        codigo.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        codigo.setForeground(new java.awt.Color(0, 0, 0));
        codigo.setText("CÓDIGO");
        jPanel3.add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

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
        jPanel3.add(codigoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 430, 20));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 430, 10));

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

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel4MousePressed

    private void jPanel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel4MouseDragged

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
        //VER QUE HACER DESPUES DE INICIAR SESION
        javax.swing.JOptionPane.showMessageDialog(this,"Intento de login con los datos:\nUsuario: "+userTxt.getText()+"\nContraseña: "+String.valueOf(passTxt.getPassword()), "LOGIN",javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_loginBtnTxtMouseClicked

    private void btnOrganizadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrganizadorActionPerformed
        // 
    }//GEN-LAST:event_btnOrganizadorActionPerformed

    private void codigoTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_codigoTxtMousePressed
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
            java.util.logging.Logger.getLogger(RegistrosdeUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrosdeUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrosdeUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrosdeUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrosdeUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Contraseña;
    private javax.swing.JLabel Decoracion;
    private javax.swing.JPanel ExitBtn;
    private javax.swing.JLabel Exittxt;
    private javax.swing.JLabel Local;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Rol;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Usuario;
    private javax.swing.JRadioButton btnOrganizador;
    private javax.swing.JRadioButton btnParticipante;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel codigo;
    private javax.swing.JTextField codigoTxt;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel loginBtn;
    private javax.swing.JLabel loginBtnTxt;
    private javax.swing.JPasswordField passTxt;
    private javax.swing.JTextField userTxt;
    // End of variables declaration//GEN-END:variables
}
