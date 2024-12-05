
package GUI;

import ArrayList.UsuariosList;
import Clases.Usuarios;
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class CrearCuentaNueva extends javax.swing.JFrame {
    int xMouse, yMouse;
    UsuariosList V_nuevousuario = new UsuariosList();
    
    public CrearCuentaNueva() {
        initComponents();
        agregarListeners();
        validarCampos();
        validacion();
    }
    
    private boolean validacion(){
        if (V_nombreTxt.getText().trim().isEmpty()) { JOptionPane.showMessageDialog(this, "El nombre no puede estar vacío."); return false; } if (!V_userTxt.getText().matches("^[a-zA-Z0-9_]{5,}$")) { JOptionPane.showMessageDialog(this, "El usuario debe tener al menos 5 caracteres alfanuméricos."); return false; } String password = new String(V_passTxt.getPassword()); if (password.isEmpty() || password.length() < 8) { JOptionPane.showMessageDialog(this, "La contraseña debe tener al menos 8 caracteres."); return false; } return true;
    }
    
    private boolean validarCampos(){
        if (V_nombreTxt.getText().trim().isEmpty()) { 
            JOptionPane.showMessageDialog(this, "El nombre es obligatorio."); return false; 
        } 
        if (!V_generoTxt.getText().matches("^(Masculino|Femenino|Otro)$")) { 
            JOptionPane.showMessageDialog(this, "El género debe ser Masculino, Femenino u Otro."); return false; 
        } if (!V_correoTxt.getText().matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) { 
            JOptionPane.showMessageDialog(this, "Correo inválido."); return false; 
        } if (!V_codigoTxt.getText().matches("^\\d{8}$")) { 
            JOptionPane.showMessageDialog(this, "El código debe ser un número de 8 dígitos."); return false; 
        } if (V_passTxt.getPassword().length < 8) { 
            JOptionPane.showMessageDialog(this, "La contraseña debe tener al menos 8 caracteres."); return false; 
        } return true;
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
                V_passTxt.setEchoChar('\u2022'); // Establece un carácter de enmascaramiento
                V_passTxt.setForeground(new java.awt.Color(0, 0, 0));
            }
        }

        @Override
        public void focusLost(java.awt.event.FocusEvent evt) {
            if (String.valueOf(V_passTxt.getPassword()).isEmpty()) {
                V_passTxt.setText("**");
                V_passTxt.setEchoChar((char) 0); // Remueve el carácter de enmascaramiento cuando está vacío
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
    
        // Listener para el campo de nombre
        V_nombreTxt.addFocusListener(new java.awt.event.FocusAdapter() {
        @Override
        public void focusGained(java.awt.event.FocusEvent evt) {
            if (V_nombreTxt.getText().equals("Ingrese su nombre")) {
                V_nombreTxt.setText("");
                V_nombreTxt.setForeground(new java.awt.Color(0, 0, 0));
            }
        }
        
        @Override
        public void focusLost(java.awt.event.FocusEvent evt) {
            if (V_nombreTxt.getText().isEmpty()) {
                V_nombreTxt.setText("Ingrese su nombre");
                V_nombreTxt.setForeground(new java.awt.Color(153, 153, 153));
            }
        }
    });
    
        // Listener para el campo de género
        V_generoTxt.addFocusListener(new java.awt.event.FocusAdapter() {
        @Override
        public void focusGained(java.awt.event.FocusEvent evt) {
            if (V_generoTxt.getText().equals("Ingrese su género")) {
                V_generoTxt.setText("");
                V_generoTxt.setForeground(new java.awt.Color(0, 0, 0));
            }
        }
        
        @Override
        public void focusLost(java.awt.event.FocusEvent evt) {
            if (V_generoTxt.getText().isEmpty()) {
                V_generoTxt.setText("Ingrese su género");
                V_generoTxt.setForeground(new java.awt.Color(153, 153, 153));
            }
        }
    });
    
        // Listener para el campo de correo electrónico
        V_correoTxt.addFocusListener(new java.awt.event.FocusAdapter() {
        @Override
        public void focusGained(java.awt.event.FocusEvent evt) {
            if (V_correoTxt.getText().equals("Ingrese su correo electrónico")) {
                V_correoTxt.setText("");
                V_correoTxt.setForeground(new java.awt.Color(0, 0, 0));
            }
        }
        
        @Override
        public void focusLost(java.awt.event.FocusEvent evt) {
            if (V_correoTxt.getText().isEmpty()) {
                V_correoTxt.setText("Ingrese su correo electrónico");
                V_correoTxt.setForeground(new java.awt.Color(153, 153, 153));
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
        V_Contraseña = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        V_Usuario = new javax.swing.JLabel();
        V_userTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        V_passTxt = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JPanel();
        V_loginBtn = new javax.swing.JLabel();
        ExitBtn = new javax.swing.JPanel();
        Exittxt = new javax.swing.JLabel();
        V_Rol = new javax.swing.JLabel();
        V_btnOrganizador = new javax.swing.JRadioButton();
        V_btnParticipante = new javax.swing.JRadioButton();
        V_codigoTxt = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        appname = new javax.swing.JLabel();
        Decoracion2 = new javax.swing.JLabel();
        Decoracion = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        V_Codigo = new javax.swing.JLabel();
        V_Correo = new javax.swing.JLabel();
        V_Nombre = new javax.swing.JLabel();
        V_Genero = new javax.swing.JLabel();
        V_correoTxt = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        V_nombreTxt = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        V_generoTxt = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        V_GuardarDatosBtn = new javax.swing.JButton();

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

        V_Contraseña.setBackground(new java.awt.Color(0, 0, 0));
        V_Contraseña.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        V_Contraseña.setForeground(new java.awt.Color(0, 0, 0));
        V_Contraseña.setText("CONTRASEÑA ");
        jPanel3.add(V_Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, -1, -1));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 500, 430, 10));

        V_Usuario.setBackground(new java.awt.Color(0, 0, 0));
        V_Usuario.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        V_Usuario.setForeground(new java.awt.Color(0, 0, 0));
        V_Usuario.setText("USUARIO ");
        jPanel3.add(V_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, -1, -1));

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
        jPanel3.add(V_userTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 360, 20));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 430, 10));

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
        jPanel3.add(V_passTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 480, 360, 20));

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
        V_loginBtn.setText("Registrarte");
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
            .addGroup(loginBtnLayout.createSequentialGroup()
                .addComponent(V_loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        loginBtnLayout.setVerticalGroup(
            loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(V_loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        V_Rol.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        V_Rol.setForeground(new java.awt.Color(0, 0, 0));
        V_Rol.setText("ROL");
        jPanel3.add(V_Rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, -1, -1));

        buttonGroup1.add(V_btnOrganizador);
        V_btnOrganizador.setText("Organizador");
        V_btnOrganizador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                V_btnOrganizadorActionPerformed(evt);
            }
        });
        jPanel3.add(V_btnOrganizador, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 580, -1, -1));

        buttonGroup1.add(V_btnParticipante);
        V_btnParticipante.setText("Participante");
        jPanel3.add(V_btnParticipante, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 580, -1, -1));

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
        jPanel3.add(V_codigoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 360, 20));
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

        V_Codigo.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        V_Codigo.setForeground(new java.awt.Color(0, 0, 0));
        V_Codigo.setText("CÓDIGO");
        jPanel3.add(V_Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, -1, -1));

        V_Correo.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        V_Correo.setForeground(new java.awt.Color(0, 0, 0));
        V_Correo.setText("CORREO ELECTRÓNICO");
        jPanel3.add(V_Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));

        V_Nombre.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        V_Nombre.setForeground(new java.awt.Color(0, 0, 0));
        V_Nombre.setText("NOMBRE");
        jPanel3.add(V_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        V_Genero.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        V_Genero.setForeground(new java.awt.Color(0, 0, 0));
        V_Genero.setText("GÉNERO");
        jPanel3.add(V_Genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, -1, -1));

        V_correoTxt.setBackground(new java.awt.Color(255, 255, 255));
        V_correoTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        V_correoTxt.setForeground(new java.awt.Color(153, 153, 153));
        V_correoTxt.setText("Ingrese su correo electrónico");
        V_correoTxt.setBorder(null);
        V_correoTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                V_correoTxtMousePressed(evt);
            }
        });
        jPanel3.add(V_correoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 360, 20));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 430, 10));

        V_nombreTxt.setBackground(new java.awt.Color(255, 255, 255));
        V_nombreTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        V_nombreTxt.setForeground(new java.awt.Color(153, 153, 153));
        V_nombreTxt.setText("Ingrese su nombre");
        V_nombreTxt.setBorder(null);
        V_nombreTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                V_nombreTxtMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                V_nombreTxtMousePressed(evt);
            }
        });
        jPanel3.add(V_nombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 360, 20));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 430, 10));

        V_generoTxt.setBackground(new java.awt.Color(255, 255, 255));
        V_generoTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        V_generoTxt.setForeground(new java.awt.Color(153, 153, 153));
        V_generoTxt.setText("Ingrese su género");
        V_generoTxt.setBorder(null);
        V_generoTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                V_generoTxtMousePressed(evt);
            }
        });
        jPanel3.add(V_generoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 360, 20));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 430, 10));

        V_GuardarDatosBtn.setText("GUARDAR DATOS");
        V_GuardarDatosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                V_GuardarDatosBtnActionPerformed(evt);
            }
        });
        jPanel3.add(V_GuardarDatosBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 650, 180, 50));

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
  
        if(V_nombreTxt.getText().isEmpty()){
           V_nombreTxt.setText("Ingrese su nombre");
           V_nombreTxt.setForeground(Color.gray);
           
        }
        if(V_generoTxt.getText().isEmpty()){
           V_generoTxt.setText("Ingrese su género");
           V_generoTxt.setForeground(Color.gray);
           
        }
        if(V_correoTxt.getText().isEmpty()){
           V_correoTxt.setText("Ingrese su correo electrónico");
           V_correoTxt.setForeground(Color.gray);
         
        }
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

        if(V_nombreTxt.getText().isEmpty()){
           V_nombreTxt.setText("Ingrese su nombre");
           V_nombreTxt.setForeground(Color.gray);
        }
        if(V_generoTxt.getText().isEmpty()){
           V_generoTxt.setText("Ingrese su género");
           V_generoTxt.setForeground(Color.gray);
        }
        if(V_correoTxt.getText().isEmpty()){
           V_correoTxt.setText("Ingrese su correo electrónico");
           V_correoTxt.setForeground(Color.gray);
        }
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

            
            /*
            
            // Si todas las validaciones son correctas, se abre la página y se cierra la ventana actual
            Pagina pagina = new Pagina();
            pagina.setVisible(true);
            this.dispose();
        */
    }//GEN-LAST:event_V_loginBtnMouseClicked

    private void V_btnOrganizadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_V_btnOrganizadorActionPerformed
        // 
    }//GEN-LAST:event_V_btnOrganizadorActionPerformed

    private void V_codigoTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_V_codigoTxtMousePressed
        if(V_nombreTxt.getText().isEmpty()){
           V_nombreTxt.setText("Ingrese su nombre");
           V_nombreTxt.setForeground(Color.gray);
        }
        if(V_generoTxt.getText().isEmpty()){
           V_generoTxt.setText("Ingrese su género");
           V_generoTxt.setForeground(Color.gray);
        }
        if(V_correoTxt.getText().isEmpty()){
           V_correoTxt.setText("Ingrese su correo electrónico");
           V_correoTxt.setForeground(Color.gray);
        }
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
     //
    }//GEN-LAST:event_V_loginBtnAncestorAdded

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

    private void V_correoTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_V_correoTxtMousePressed
        if(V_nombreTxt.getText().isEmpty()){
           V_nombreTxt.setText("Ingrese su nombre");
           V_nombreTxt.setForeground(Color.gray);
        }
        if(V_generoTxt.getText().isEmpty()){
           V_generoTxt.setText("Ingrese su género");
           V_generoTxt.setForeground(Color.gray);
        }
        if(V_correoTxt.getText().isEmpty()){
           V_correoTxt.setText("Ingrese su correo electrónico");
           V_correoTxt.setForeground(Color.black);
        }
        if (V_codigoTxt.getText() .isEmpty()){  
            V_codigoTxt.setText("Ingrese su código de usuario");
            V_codigoTxt.setForeground(Color.gray);
        }
        if (V_userTxt.getText() .equals("Ingrese su nombre de usuario")){  
            V_userTxt.setText("");
            V_userTxt.setForeground(Color.gray);
        }
        if (String.valueOf(V_passTxt.getPassword()) .isEmpty()){  
            V_passTxt.setText("********");
            V_passTxt.setForeground(Color.gray);
        }
        
    }//GEN-LAST:event_V_correoTxtMousePressed

    private void V_nombreTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_V_nombreTxtMousePressed
        if(V_nombreTxt.getText().isEmpty()){
           V_nombreTxt.setText("Ingrese su nombre");
           V_nombreTxt.setForeground(Color.black);
        }
        if(V_generoTxt.getText().isEmpty()){
           V_generoTxt.setText("Ingrese su género");
           V_generoTxt.setForeground(Color.gray);
        }
        if(V_correoTxt.getText().isEmpty()){
           V_correoTxt.setText("Ingrese su correo electrónico");
           V_correoTxt.setForeground(Color.gray);
        }
        if (V_codigoTxt.getText() .isEmpty()){  
            V_codigoTxt.setText("Ingrese su código de usuario");
            V_codigoTxt.setForeground(Color.gray);
        }
        if (V_userTxt.getText() .equals("Ingrese su nombre de usuario")){  
            V_userTxt.setText("");
            V_userTxt.setForeground(Color.gray);
        }
        if (String.valueOf(V_passTxt.getPassword()) .isEmpty()){  
            V_passTxt.setText("********");
            V_passTxt.setForeground(Color.gray);
        }

    }//GEN-LAST:event_V_nombreTxtMousePressed

    private void V_generoTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_V_generoTxtMousePressed
        if(V_nombreTxt.getText().isEmpty()){
           V_nombreTxt.setText("Ingrese su nombre");
           V_nombreTxt.setForeground(Color.gray);
        }
        if(V_generoTxt.getText().isEmpty()){
           V_generoTxt.setText("Ingrese su género");
           V_generoTxt.setForeground(Color.black);
        }
        if(V_correoTxt.getText().isEmpty()){
           V_correoTxt.setText("Ingrese su correo electrónico");
           V_correoTxt.setForeground(Color.gray);
        }
        if (V_codigoTxt.getText() .isEmpty()){  
            V_codigoTxt.setText("Ingrese su código de usuario");
            V_codigoTxt.setForeground(Color.gray);
        }
        if (V_userTxt.getText() .equals("Ingrese su nombre de usuario")){  
            V_userTxt.setText("");
            V_userTxt.setForeground(Color.gray);
        }
        if (String.valueOf(V_passTxt.getPassword()) .isEmpty()){  
            V_passTxt.setText("********");
            V_passTxt.setForeground(Color.gray);
        }

    }//GEN-LAST:event_V_generoTxtMousePressed

    private void V_GuardarDatosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_V_GuardarDatosBtnActionPerformed
            if(!validacion()) return;
        
        if (!validarCampos()) { 
                return; // Detener si la validación falla 
            } try { 
                Usuarios nusuario = new Usuarios();
                nusuario.setNombre(V_nombreTxt.getText().trim());
                nusuario.setGenero(V_generoTxt.getText().trim()); 
                nusuario.setEmail(V_correoTxt.getText().trim()); 
                nusuario.setCodigoUsuario(Integer.parseInt(V_codigoTxt.getText().trim())); 
                nusuario.setNombreUsuario(V_userTxt.getText().trim()); 
                nusuario.setContrasena(new String(V_passTxt.getPassword())); 
                if (V_btnOrganizador.isSelected()) { 
                    nusuario.setRol("Organizador"); 
                } else if (V_btnParticipante.isSelected()) { 
                    nusuario.setRol("Participante"); 
                } else { 
                    JOptionPane.showMessageDialog(this, "Debe seleccionar un rol."); 
                   return;
                } 
                V_nuevousuario.agregar(nusuario); 
                JOptionPane.showMessageDialog(null, "Registro exitoso"); 
                this.dispose(); 
                
            // Si todas las validaciones son correctas, se abre la página y se cierra la ventana actual
            Pagina pagina = new Pagina();
            pagina.setVisible(true);
            this.dispose();
            } catch (Exception e)  {
                    JOptionPane.showMessageDialog(this, "Error al guardar: " + e.getMessage()); 
            }
            
            
    }//GEN-LAST:event_V_GuardarDatosBtnActionPerformed

    private void V_nombreTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_V_nombreTxtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_V_nombreTxtMouseClicked

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
            java.util.logging.Logger.getLogger(RegistroUsuarios_Nexus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuarios_Nexus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuarios_Nexus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuarios_Nexus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearCuentaNueva().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Decoracion;
    private javax.swing.JLabel Decoracion2;
    private javax.swing.JPanel ExitBtn;
    private javax.swing.JLabel Exittxt;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel V_Codigo;
    private javax.swing.JLabel V_Contraseña;
    private javax.swing.JLabel V_Correo;
    private javax.swing.JLabel V_Genero;
    private javax.swing.JButton V_GuardarDatosBtn;
    private javax.swing.JLabel V_Nombre;
    private javax.swing.JLabel V_Rol;
    private javax.swing.JLabel V_Usuario;
    private javax.swing.JRadioButton V_btnOrganizador;
    private javax.swing.JRadioButton V_btnParticipante;
    private javax.swing.JTextField V_codigoTxt;
    private javax.swing.JTextField V_correoTxt;
    private javax.swing.JTextField V_generoTxt;
    private javax.swing.JLabel V_loginBtn;
    private javax.swing.JTextField V_nombreTxt;
    private javax.swing.JPasswordField V_passTxt;
    private javax.swing.JTextField V_userTxt;
    private javax.swing.JLabel appname;
    private javax.swing.ButtonGroup buttonGroup1;
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
    // End of variables declaration//GEN-END:variables
}
