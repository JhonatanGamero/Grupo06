
package GUI;

import Ventanas.AgendaVen;
import Ventanas.EventoVen;
import Ventanas.NotificacionVen;
import Ventanas.OrganizacionVen;
import Ventanas.PrecioVen;
import Ventanas.PrincipalVen;
import Ventanas.RegistroVen;
import Ventanas.RetroalimentacionVen;
import Ventanas.UbicacionVen;
import Ventanas.UsuarioVen;
import java.awt.BorderLayout;
import java.awt.Color;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.JPanel;


public class Pagina extends javax.swing.JFrame {

    int xMouse, yMouse;
    
    public Pagina() {
        initComponents();
        SetDate();
        InitContent();
    }
     
     private void SetDate(){   
        LocalDate now = LocalDate.now();
        Locale spanishLocale = new Locale ("es","ES");
        V_dateText.setText(now.format(DateTimeFormatter.ofPattern(" 'Hoy es' EEEE dd 'de' MMMM 'de' yyyy", spanishLocale) ));
    }
     
     private void InitContent() { 
        ShowJPanel(new PrincipalVen());
    }
     
     private void ShowJPanel(JPanel p){
        p.setSize(807, 543); 
        p.setLocation(0,0);
         
        content.removeAll();
        content.add(p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        V_mensaje = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        menu = new javax.swing.JPanel();
        V_appname = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        V_btnPrincipal = new javax.swing.JButton();
        V_btnAgenda = new javax.swing.JButton();
        V_btnUsuario = new javax.swing.JButton();
        V_btnOrganizacion = new javax.swing.JButton();
        V_btnUbicacion = new javax.swing.JButton();
        V_btnNotificacion = new javax.swing.JButton();
        V_btnRetroalimentacion = new javax.swing.JButton();
        V_btnRegistro = new javax.swing.JButton();
        V_btnPrecio = new javax.swing.JButton();
        V_btnEvento = new javax.swing.JButton();
        header = new javax.swing.JPanel();
        V_dateText = new javax.swing.JLabel();
        V_navText = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        ExitBtn = new javax.swing.JPanel();
        Exittxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        background.setBackground(new java.awt.Color(255, 255, 255));

        V_mensaje.setFont(new java.awt.Font("Rockwell", 1, 25)); // NOI18N
        V_mensaje.setForeground(new java.awt.Color(0, 0, 0));
        V_mensaje.setText("Reserva tu evento, ¡ya mismo!");

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setAutoscrolls(true);

        menu.setBackground(new java.awt.Color(231, 163, 95));
        menu.setPreferredSize(new java.awt.Dimension(270, 640));

        V_appname.setFont(new java.awt.Font("Roboto Black", 3, 36)); // NOI18N
        V_appname.setForeground(new java.awt.Color(0, 0, 0));
        V_appname.setText("Nexus Eventos");

        V_btnPrincipal.setBackground(new java.awt.Color(231, 163, 95));
        V_btnPrincipal.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        V_btnPrincipal.setForeground(new java.awt.Color(0, 0, 0));
        V_btnPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/casa.png"))); // NOI18N
        V_btnPrincipal.setText("Principal");
        V_btnPrincipal.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        V_btnPrincipal.setBorderPainted(false);
        V_btnPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        V_btnPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        V_btnPrincipal.setIconTextGap(10);
        V_btnPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                V_btnPrincipalActionPerformed(evt);
            }
        });

        V_btnAgenda.setBackground(new java.awt.Color(231, 163, 95));
        V_btnAgenda.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        V_btnAgenda.setForeground(new java.awt.Color(0, 0, 0));
        V_btnAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agenda.png"))); // NOI18N
        V_btnAgenda.setText("Agenda");
        V_btnAgenda.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        V_btnAgenda.setBorderPainted(false);
        V_btnAgenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        V_btnAgenda.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        V_btnAgenda.setIconTextGap(10);
        V_btnAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                V_btnAgendaActionPerformed(evt);
            }
        });

        V_btnUsuario.setBackground(new java.awt.Color(231, 163, 95));
        V_btnUsuario.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        V_btnUsuario.setForeground(new java.awt.Color(0, 0, 0));
        V_btnUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        V_btnUsuario.setText("Usuario");
        V_btnUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        V_btnUsuario.setBorderPainted(false);
        V_btnUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        V_btnUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        V_btnUsuario.setIconTextGap(10);
        V_btnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                V_btnUsuarioActionPerformed(evt);
            }
        });

        V_btnOrganizacion.setBackground(new java.awt.Color(231, 163, 95));
        V_btnOrganizacion.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        V_btnOrganizacion.setForeground(new java.awt.Color(0, 0, 0));
        V_btnOrganizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/organizacion.png"))); // NOI18N
        V_btnOrganizacion.setText("Organización");
        V_btnOrganizacion.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        V_btnOrganizacion.setBorderPainted(false);
        V_btnOrganizacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        V_btnOrganizacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        V_btnOrganizacion.setIconTextGap(10);
        V_btnOrganizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                V_btnOrganizacionActionPerformed(evt);
            }
        });

        V_btnUbicacion.setBackground(new java.awt.Color(231, 163, 95));
        V_btnUbicacion.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        V_btnUbicacion.setForeground(new java.awt.Color(0, 0, 0));
        V_btnUbicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ubicacion.png"))); // NOI18N
        V_btnUbicacion.setText("Ubicación");
        V_btnUbicacion.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        V_btnUbicacion.setBorderPainted(false);
        V_btnUbicacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        V_btnUbicacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        V_btnUbicacion.setIconTextGap(10);
        V_btnUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                V_btnUbicacionActionPerformed(evt);
            }
        });

        V_btnNotificacion.setBackground(new java.awt.Color(231, 163, 95));
        V_btnNotificacion.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        V_btnNotificacion.setForeground(new java.awt.Color(0, 0, 0));
        V_btnNotificacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/notificacion.png"))); // NOI18N
        V_btnNotificacion.setText("Notificación");
        V_btnNotificacion.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        V_btnNotificacion.setBorderPainted(false);
        V_btnNotificacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        V_btnNotificacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        V_btnNotificacion.setIconTextGap(10);
        V_btnNotificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                V_btnNotificacionActionPerformed(evt);
            }
        });

        V_btnRetroalimentacion.setBackground(new java.awt.Color(231, 163, 95));
        V_btnRetroalimentacion.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        V_btnRetroalimentacion.setForeground(new java.awt.Color(0, 0, 0));
        V_btnRetroalimentacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/retroalimentacion.png"))); // NOI18N
        V_btnRetroalimentacion.setText("Retroalimentación");
        V_btnRetroalimentacion.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        V_btnRetroalimentacion.setBorderPainted(false);
        V_btnRetroalimentacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        V_btnRetroalimentacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        V_btnRetroalimentacion.setIconTextGap(10);
        V_btnRetroalimentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                V_btnRetroalimentacionActionPerformed(evt);
            }
        });

        V_btnRegistro.setBackground(new java.awt.Color(231, 163, 95));
        V_btnRegistro.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        V_btnRegistro.setForeground(new java.awt.Color(0, 0, 0));
        V_btnRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registro.png"))); // NOI18N
        V_btnRegistro.setText("Registro");
        V_btnRegistro.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        V_btnRegistro.setBorderPainted(false);
        V_btnRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        V_btnRegistro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        V_btnRegistro.setIconTextGap(10);
        V_btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                V_btnRegistroActionPerformed(evt);
            }
        });

        V_btnPrecio.setBackground(new java.awt.Color(231, 163, 95));
        V_btnPrecio.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        V_btnPrecio.setForeground(new java.awt.Color(0, 0, 0));
        V_btnPrecio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/precio.png"))); // NOI18N
        V_btnPrecio.setText("Precio");
        V_btnPrecio.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        V_btnPrecio.setBorderPainted(false);
        V_btnPrecio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        V_btnPrecio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        V_btnPrecio.setIconTextGap(10);
        V_btnPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                V_btnPrecioActionPerformed(evt);
            }
        });

        V_btnEvento.setBackground(new java.awt.Color(231, 163, 95));
        V_btnEvento.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        V_btnEvento.setForeground(new java.awt.Color(0, 0, 0));
        V_btnEvento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/evento.png"))); // NOI18N
        V_btnEvento.setText("Evento");
        V_btnEvento.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        V_btnEvento.setBorderPainted(false);
        V_btnEvento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        V_btnEvento.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        V_btnEvento.setIconTextGap(10);
        V_btnEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                V_btnEventoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(V_btnPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(V_btnUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(V_btnUbicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(V_btnAgenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(V_btnOrganizacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(V_btnRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(V_btnPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(V_btnNotificacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(V_btnRetroalimentacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(V_appname)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
            .addComponent(V_btnEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(V_appname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(V_btnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(V_btnUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(V_btnEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(V_btnUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(V_btnAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(V_btnOrganizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(V_btnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(V_btnPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(V_btnNotificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(V_btnRetroalimentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        header.setBackground(new java.awt.Color(58, 126, 145));
        header.setMinimumSize(new java.awt.Dimension(270, 100));

        V_dateText.setFont(new java.awt.Font("Roboto Medium", 3, 18)); // NOI18N
        V_dateText.setForeground(new java.awt.Color(204, 204, 204));
        V_dateText.setText("Hoy es {dayname} {day} de {month} de {year}");

        V_navText.setForeground(new java.awt.Color(0, 0, 0));
        V_navText.setText("Organizar/Reservar/Personalizar");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(V_navText)
                    .addComponent(V_dateText))
                .addContainerGap(427, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(V_navText)
                .addGap(33, 33, 33)
                .addComponent(V_dateText)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setPreferredSize(new java.awt.Dimension(807, 543));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 803, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

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
            .addComponent(Exittxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(ExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, 803, Short.MAX_VALUE))
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(V_mensaje)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2)))
                        .addContainerGap())))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 859, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(V_mensaje))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void V_btnUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_V_btnUbicacionActionPerformed
        ShowJPanel(new UbicacionVen());
    }//GEN-LAST:event_V_btnUbicacionActionPerformed

    private void V_btnEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_V_btnEventoActionPerformed
        ShowJPanel(new EventoVen());
    }//GEN-LAST:event_V_btnEventoActionPerformed

    private void V_btnPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_V_btnPrincipalActionPerformed
        ShowJPanel(new PrincipalVen());
    }//GEN-LAST:event_V_btnPrincipalActionPerformed

    private void V_btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_V_btnUsuarioActionPerformed
        ShowJPanel(new UsuarioVen());
    }//GEN-LAST:event_V_btnUsuarioActionPerformed

    private void V_btnAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_V_btnAgendaActionPerformed
        ShowJPanel(new AgendaVen());
    }//GEN-LAST:event_V_btnAgendaActionPerformed

    private void V_btnOrganizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_V_btnOrganizacionActionPerformed
        ShowJPanel(new OrganizacionVen());
    }//GEN-LAST:event_V_btnOrganizacionActionPerformed

    private void V_btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_V_btnRegistroActionPerformed
        ShowJPanel(new RegistroVen());
    }//GEN-LAST:event_V_btnRegistroActionPerformed

    private void V_btnPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_V_btnPrecioActionPerformed
        ShowJPanel(new PrecioVen());
    }//GEN-LAST:event_V_btnPrecioActionPerformed

    private void V_btnNotificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_V_btnNotificacionActionPerformed
        ShowJPanel(new NotificacionVen());
    }//GEN-LAST:event_V_btnNotificacionActionPerformed

    private void V_btnRetroalimentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_V_btnRetroalimentacionActionPerformed
        ShowJPanel(new RetroalimentacionVen());
    }//GEN-LAST:event_V_btnRetroalimentacionActionPerformed

    private void jPanel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel4MouseDragged

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel4MousePressed

    private void ExittxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExittxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExittxtMouseClicked

    private void ExittxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExittxtMouseEntered
        ExitBtn.setBackground(Color.red);
        Exittxt.setForeground(Color.white);
    }//GEN-LAST:event_ExittxtMouseEntered

    private void ExittxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExittxtMouseExited
        ExitBtn.setBackground(Color.white);
        Exittxt.setForeground(Color.black);
    }//GEN-LAST:event_ExittxtMouseExited

    private void ExittxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExittxtMousePressed
        // TODO add your handling code her
    }//GEN-LAST:event_ExittxtMousePressed

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
            java.util.logging.Logger.getLogger(Pagina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pagina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pagina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pagina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pagina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ExitBtn;
    private javax.swing.JLabel Exittxt;
    private javax.swing.JLabel V_appname;
    private javax.swing.JButton V_btnAgenda;
    private javax.swing.JButton V_btnEvento;
    private javax.swing.JButton V_btnNotificacion;
    private javax.swing.JButton V_btnOrganizacion;
    private javax.swing.JButton V_btnPrecio;
    private javax.swing.JButton V_btnPrincipal;
    private javax.swing.JButton V_btnRegistro;
    private javax.swing.JButton V_btnRetroalimentacion;
    private javax.swing.JButton V_btnUbicacion;
    private javax.swing.JButton V_btnUsuario;
    private javax.swing.JLabel V_dateText;
    private javax.swing.JLabel V_mensaje;
    private javax.swing.JLabel V_navText;
    private javax.swing.JPanel background;
    private javax.swing.JPanel content;
    private javax.swing.JPanel header;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel menu;
    // End of variables declaration//GEN-END:variables

}
