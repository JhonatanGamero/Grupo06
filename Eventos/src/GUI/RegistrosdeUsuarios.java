
package GUI;

import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class RegistrosdeUsuarios extends javax.swing.JFrame {

    int xMouse, yMouse;
    
    public RegistrosdeUsuarios() {
        initComponents();
        agregarListeners();
    }
    
    private void agregarListeners() {
        // Listener para el campo de usuario
        V_userTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (V_userTxt.getText().equals("Ingrese su nombre de usuario")) {
                    V_userTxt.setText("");
                    V_userTxt.setForeground(new java.awt.Color(0, 0, 0));
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (V_userTxt.getText().isEmpty()) {
                    V_userTxt.setText("Ingrese su nombre de usuario");
                    V_userTxt.setForeground(new java.awt.Color(153, 153, 153));
                }
            }
        });

        // Listener para el campo de contraseña
        V_passTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (String.valueOf(V_passTxt.getPassword()).equals("**")) {
                    V_passTxt.setText("");
                    V_passTxt.setForeground(new java.awt.Color(0, 0, 0));
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (String.valueOf(V_passTxt.getPassword()).isEmpty()) {
                    V_passTxt.setText("**");
                    V_passTxt.setForeground(new java.awt.Color(204, 204, 204));
                }
            }
        });

        // Listener para el campo de código
        V_codigoTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (V_codigoTxt.getText().equals("Ingrese su código de usuario")) {
                    V_codigoTxt.setText("");
                    V_codigoTxt.setForeground(new java.awt.Color(0, 0, 0));
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (V_codigoTxt.getText().isEmpty()) {
                    V_codigoTxt.setText("Ingrese su código de usuario");
                    V_codigoTxt.setForeground(new java.awt.Color(153, 153, 153));
                }
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        V_Logo = new javax.swing.JLabel();
        V_Local = new javax.swing.JLabel();
        V_Titulo = new javax.swing.JLabel();
        V_Contraseña = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        V_Usuario = new javax.swing.JLabel();
        V_userTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        V_passTxt = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JPanel();
        V_loginBtn = new javax.swing.JLabel();
        V_Decoracion = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        ExitBtn = new javax.swing.JPanel();
        Exittxt = new javax.swing.JLabel();
        V_Rol = new javax.swing.JLabel();
        V_btnOrganizador = new javax.swing.JRadioButton();
        V_btnParticipante = new javax.swing.JRadioButton();
        V_codigo = new javax.swing.JLabel();
        V_codigoTxt = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        V_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.jpg"))); // NOI18N
        jPanel3.add(V_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, -1, -1));

        V_Local.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/local.jpg"))); // NOI18N
        jPanel3.add(V_Local, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, -1, 640));

        V_Titulo.setBackground(new java.awt.Color(0, 0, 0));
        V_Titulo.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        V_Titulo.setForeground(new java.awt.Color(0, 0, 0));
        V_Titulo.setText("INICIAR SESIÓN");
        jPanel3.add(V_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        V_Contraseña.setBackground(new java.awt.Color(0, 0, 0));
        V_Contraseña.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        V_Contraseña.setForeground(new java.awt.Color(0, 0, 0));
        V_Contraseña.setText("CONTRASEÑA ");
        jPanel3.add(V_Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, -1, -1));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 430, 10));

        V_Usuario.setBackground(new java.awt.Color(0, 0, 0));
        V_Usuario.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        V_Usuario.setForeground(new java.awt.Color(0, 0, 0));
        V_Usuario.setText("USUARIO ");
        jPanel3.add(V_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        V_userTxt.setBackground(new java.awt.Color(255, 255, 255));
        V_userTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        V_userTxt.setForeground(new java.awt.Color(153, 153, 153));
        V_userTxt.setText("Ingrese su nombre de usuario");
        V_userTxt.setBorder(null);
        V_userTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                V_userTxtMousePressed(evt);
            }
        });
        jPanel3.add(V_userTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 360, 20));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 430, 10));

        V_passTxt.setBackground(new java.awt.Color(255, 255, 255));
        V_passTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        V_passTxt.setForeground(new java.awt.Color(204, 204, 204));
        V_passTxt.setText("********");
        V_passTxt.setBorder(null);
        V_passTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                V_passTxtMousePressed(evt);
            }
        });
        V_passTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                V_passTxtActionPerformed(evt);
            }
        });
        jPanel3.add(V_passTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 360, 20));

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

        V_loginBtn.setBackground(new java.awt.Color(240, 240, 240));
        V_loginBtn.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        V_loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        V_loginBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        V_loginBtn.setText("Entrar");
        V_loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        V_loginBtn.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                V_loginBtnAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        V_loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                V_loginBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                V_loginBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                V_loginBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout loginBtnLayout = new javax.swing.GroupLayout(loginBtn);
        loginBtn.setLayout(loginBtnLayout);
        loginBtnLayout.setHorizontalGroup(
            loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(V_loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        loginBtnLayout.setVerticalGroup(
            loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(V_loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 640, 140, 50));

        V_Decoracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/circulos.png"))); // NOI18N
        jPanel3.add(V_Decoracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 110, 70));

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

        V_Rol.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        V_Rol.setForeground(new java.awt.Color(0, 0, 0));
        V_Rol.setText("ROL");
        jPanel3.add(V_Rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, -1, -1));

        buttonGroup1.add(V_btnOrganizador);
        V_btnOrganizador.setText("Organizador");
        V_btnOrganizador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                V_btnOrganizadorActionPerformed(evt);
            }
        });
        jPanel3.add(V_btnOrganizador, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, -1, -1));

        buttonGroup1.add(V_btnParticipante);
        V_btnParticipante.setText("Participante");
        jPanel3.add(V_btnParticipante, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 570, -1, -1));

        V_codigo.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        V_codigo.setForeground(new java.awt.Color(0, 0, 0));
        V_codigo.setText("CÓDIGO");
        jPanel3.add(V_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        V_codigoTxt.setBackground(new java.awt.Color(255, 255, 255));
        V_codigoTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        V_codigoTxt.setForeground(new java.awt.Color(153, 153, 153));
        V_codigoTxt.setText("Ingrese su código de usuario");
        V_codigoTxt.setBorder(null);
        V_codigoTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                V_codigoTxtMousePressed(evt);
            }
        });
        jPanel3.add(V_codigoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 360, 20));
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

    private void V_passTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_V_passTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_V_passTxtActionPerformed

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

    private void V_loginBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_V_loginBtnMouseEntered
            loginBtn.setBackground(new Color(126, 187, 204));
    }//GEN-LAST:event_V_loginBtnMouseEntered

    private void V_loginBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_V_loginBtnMouseExited
            loginBtn.setBackground(new Color(58,126,145));
    }//GEN-LAST:event_V_loginBtnMouseExited

    private void loginBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseEntered
    //
    }//GEN-LAST:event_loginBtnMouseEntered

    private void loginBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseExited
    //
    }//GEN-LAST:event_loginBtnMouseExited

    private void V_userTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_V_userTxtMousePressed
        if (V_codigoTxt.getText() .isEmpty()){  
            V_codigoTxt.setText("Ingrese su código de usuario");
            V_codigoTxt.setForeground(Color.gray);
        }
        if (V_userTxt.getText() .equals("Ingrese su nombre de usuario")){  
            V_userTxt.setText("");
            V_userTxt.setForeground(Color.black);
        }
        if (String.valueOf(V_passTxt.getPassword()) .isEmpty()){  
            V_passTxt.setText("********");
            V_passTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_V_userTxtMousePressed

    private void V_passTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_V_passTxtMousePressed
       if (V_codigoTxt.getText() .isEmpty()){  
            V_codigoTxt.setText("Ingrese su código de usuario");
            V_codigoTxt.setForeground(Color.gray);
        }
        if (V_userTxt.getText() .isEmpty()){  
            V_userTxt.setText("Ingrese su nombre de usuario");
            V_userTxt.setForeground(Color.gray);
        } 
        if (String.valueOf(V_passTxt.getPassword()) .equals("********")){
            V_passTxt.setText("");
            V_passTxt.setForeground(Color.black);
        } 
    }//GEN-LAST:event_V_passTxtMousePressed

    private void V_loginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_V_loginBtnMouseClicked
            // Validación del código
            if (V_codigoTxt.getText().length() == 0) {
                JOptionPane.showMessageDialog(this, "Ingresar su código");
                return;
            }

            String codigo = V_codigoTxt.getText();
            Pattern validarCodigo = Pattern.compile("^[0-9]{8}$");
            Matcher validandoCodigo = validarCodigo.matcher(codigo);
            if (!validandoCodigo.matches()) {
                JOptionPane.showMessageDialog(this, "El código solo puede tener números y un máximo de 8 dígitos");
                return;
            }

            // Validación del usuario
            if (V_userTxt.getText().length() == 0) {
                JOptionPane.showMessageDialog(this, "Ingresar su usuario");
                return;
            }

            String nombre = V_userTxt.getText();
            Pattern validarNombre = Pattern.compile("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+$");
            Matcher nombreValida = validarNombre.matcher(nombre);
            if (!nombreValida.matches()) {
                JOptionPane.showMessageDialog(this, "El nombre solo puede contener letras");
                return;
            }

            // Validación de la contraseña
            if (V_passTxt.getPassword().length==0) {
                JOptionPane.showMessageDialog(this, "Ingresar su contraseña");
                return;
            } 
            
            // Si todas las validaciones son correctas, se abre la página y se cierra la ventana actual
            Pagina pagina = new Pagina();
            pagina.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_V_loginBtnMouseClicked

    private void V_btnOrganizadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_V_btnOrganizadorActionPerformed
        // 
    }//GEN-LAST:event_V_btnOrganizadorActionPerformed

    private void V_codigoTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_V_codigoTxtMousePressed
        if (V_codigoTxt.getText() .equals("Ingrese su código de usuario")){  
            V_codigoTxt.setText("");
            V_codigoTxt.setForeground(Color.black);
        }
        if (V_userTxt.getText() .isEmpty()){  
            V_userTxt.setText("Ingrese su nombre de usuario");
            V_userTxt.setForeground(Color.gray);
        }
        if (String.valueOf(V_passTxt.getPassword()) .isEmpty()){  
            V_passTxt.setText("********");
            V_passTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_V_codigoTxtMousePressed

    private void V_loginBtnAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_V_loginBtnAncestorAdded
     
    }//GEN-LAST:event_V_loginBtnAncestorAdded

    private void loginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_loginBtnMouseClicked

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
    private javax.swing.JPanel ExitBtn;
    private javax.swing.JLabel Exittxt;
    private javax.swing.JLabel V_Contraseña;
    private javax.swing.JLabel V_Decoracion;
    private javax.swing.JLabel V_Local;
    private javax.swing.JLabel V_Logo;
    private javax.swing.JLabel V_Rol;
    private javax.swing.JLabel V_Titulo;
    private javax.swing.JLabel V_Usuario;
    private javax.swing.JRadioButton V_btnOrganizador;
    private javax.swing.JRadioButton V_btnParticipante;
    private javax.swing.JLabel V_codigo;
    private javax.swing.JTextField V_codigoTxt;
    private javax.swing.JLabel V_loginBtn;
    private javax.swing.JPasswordField V_passTxt;
    private javax.swing.JTextField V_userTxt;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel loginBtn;
    // End of variables declaration//GEN-END:variables
}
