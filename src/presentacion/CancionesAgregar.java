package presentacion;

import accesoDatos.accDat;
import entidades.canciones;
import entidades.generosMusicales;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import logicaNegocio.TextPrompt;
import logicaNegocio.cancionesVarios;
import logicaNegocio.generosMusicalesVarios;

/**
 *
 * @author obarboza
 */
public class CancionesAgregar extends javax.swing.JFrame {

    /**
     * Creates new form CancionesAgregar
     */
    public CancionesAgregar() {
        initComponents();
        setLocationRelativeTo(null);
        TextPrompt jtCodigoCancion = new TextPrompt("Ingrese el Codigo de la Cancion", jtAgregarCancionesSetCodigoCancion);
        TextPrompt jtNombreCancion = new TextPrompt("Ingrese el Nombre de la Cancion", jtAgregarCancionesSetNombreCancion);
        TextPrompt jtPrecioCancion = new TextPrompt("Ingrese el Precio de la Cancion", jtAgregarCancionesSetPrecioCancion);
        TextPrompt jtDescGenero = new TextPrompt("Descripcion del Genero Seleccionado", jtAgregarCancionesGetDescGenero);
        llenarComboGeneroMusical();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp1AgregarCanciones = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jlNombreCompletoUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jseparadorLogin3 = new javax.swing.JSeparator();
        jlNextRegistro = new javax.swing.JLabel();
        jlCrearUsuario3 = new javax.swing.JLabel();
        jseparadorLogin5 = new javax.swing.JSeparator();
        jlCrearUsuario5 = new javax.swing.JLabel();
        jlNextRegistro2 = new javax.swing.JLabel();
        jp2AgregarCanciones = new javax.swing.JPanel();
        jlCancionesAgregarExit = new javax.swing.JLabel();
        jseparadorLogin2 = new javax.swing.JSeparator();
        jlCancionesAgregarLogout = new javax.swing.JLabel();
        jlCancionesAgregarMenu = new javax.swing.JLabel();
        jseparadorLogin4 = new javax.swing.JSeparator();
        jlNombreRegistro = new javax.swing.JLabel();
        jtAgregarCancionesSetCodigoCancion = new javax.swing.JTextField();
        jlGeneroRegistro = new javax.swing.JLabel();
        jtAgregarCancionesGetDescGenero = new javax.swing.JTextField();
        jlAgregarCancionesBotonAgregar = new javax.swing.JLabel();
        jlCrearUsuario4 = new javax.swing.JLabel();
        jlNombreRegistro1 = new javax.swing.JLabel();
        jtAgregarCancionesSetPrecioCancion = new javax.swing.JTextField();
        jlGeneroRegistro1 = new javax.swing.JLabel();
        jlCrearUsuario6 = new javax.swing.JLabel();
        jlCrearUsuario10 = new javax.swing.JLabel();
        jlCrearUsuario9 = new javax.swing.JLabel();
        jcAgregarCancionesgetGeneros = new javax.swing.JComboBox<>();
        jlNombreRegistro2 = new javax.swing.JLabel();
        jtAgregarCancionesSetNombreCancion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jp1AgregarCanciones.setBackground(new java.awt.Color(0, 0, 0));
        jp1AgregarCanciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon_user.png"))); // NOI18N
        jLabel3.setText("jLabel1");
        jp1AgregarCanciones.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, -1));

        jlNombreCompletoUsuario.setForeground(new java.awt.Color(102, 102, 102));
        jlNombreCompletoUsuario.setText("Admin");
        jp1AgregarCanciones.add(jlNombreCompletoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N
        jp1AgregarCanciones.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 200, 240));

        jseparadorLogin3.setBackground(new java.awt.Color(102, 102, 102));
        jseparadorLogin3.setForeground(new java.awt.Color(51, 51, 51));
        jp1AgregarCanciones.add(jseparadorLogin3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 180, 10));

        jlNextRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-music-folder-60.png"))); // NOI18N
        jp1AgregarCanciones.add(jlNextRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 60, 60));

        jlCrearUsuario3.setForeground(new java.awt.Color(102, 102, 102));
        jlCrearUsuario3.setText("Agregar");
        jp1AgregarCanciones.add(jlCrearUsuario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, -1, -1));

        jseparadorLogin5.setBackground(new java.awt.Color(102, 102, 102));
        jseparadorLogin5.setForeground(new java.awt.Color(51, 51, 51));
        jseparadorLogin5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jp1AgregarCanciones.add(jseparadorLogin5, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 376, 10, 50));

        jlCrearUsuario5.setForeground(new java.awt.Color(102, 102, 102));
        jlCrearUsuario5.setText("Canciones");
        jp1AgregarCanciones.add(jlCrearUsuario5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        jlNextRegistro2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon-add-new-60.png"))); // NOI18N
        jp1AgregarCanciones.add(jlNextRegistro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, -1, 60));

        jp2AgregarCanciones.setBackground(new java.awt.Color(51, 51, 51));
        jp2AgregarCanciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlCancionesAgregarExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon_exit.png"))); // NOI18N
        jlCancionesAgregarExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlCancionesAgregarExit.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jlCancionesAgregarExitMouseMoved(evt);
            }
        });
        jlCancionesAgregarExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlCancionesAgregarExitMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlCancionesAgregarExitMouseExited(evt);
            }
        });
        jp2AgregarCanciones.add(jlCancionesAgregarExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, -1, -1));

        jseparadorLogin2.setBackground(new java.awt.Color(102, 102, 102));
        jseparadorLogin2.setForeground(new java.awt.Color(51, 51, 51));
        jseparadorLogin2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jp2AgregarCanciones.add(jseparadorLogin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 4, 10, 24));

        jlCancionesAgregarLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon-login-rounded-30.png"))); // NOI18N
        jlCancionesAgregarLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlCancionesAgregarLogout.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jlCancionesAgregarLogoutMouseMoved(evt);
            }
        });
        jlCancionesAgregarLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlCancionesAgregarLogoutMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlCancionesAgregarLogoutMouseExited(evt);
            }
        });
        jp2AgregarCanciones.add(jlCancionesAgregarLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 30, -1));

        jlCancionesAgregarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon-menu-32.png"))); // NOI18N
        jlCancionesAgregarMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlCancionesAgregarMenu.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jlCancionesAgregarMenuMouseMoved(evt);
            }
        });
        jlCancionesAgregarMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlCancionesAgregarMenuMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlCancionesAgregarMenuMouseExited(evt);
            }
        });
        jp2AgregarCanciones.add(jlCancionesAgregarMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 30, -1));

        jseparadorLogin4.setBackground(new java.awt.Color(102, 102, 102));
        jseparadorLogin4.setForeground(new java.awt.Color(51, 51, 51));
        jseparadorLogin4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jp2AgregarCanciones.add(jseparadorLogin4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 4, 10, 24));

        jlNombreRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon-music-30.png"))); // NOI18N
        jp2AgregarCanciones.add(jlNombreRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jtAgregarCancionesSetCodigoCancion.setBackground(new java.awt.Color(0, 0, 0));
        jtAgregarCancionesSetCodigoCancion.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jtAgregarCancionesSetCodigoCancion.setForeground(new java.awt.Color(102, 102, 102));
        jtAgregarCancionesSetCodigoCancion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jp2AgregarCanciones.add(jtAgregarCancionesSetCodigoCancion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 320, 30));

        jlGeneroRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-text-box-30.png"))); // NOI18N
        jp2AgregarCanciones.add(jlGeneroRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jtAgregarCancionesGetDescGenero.setEditable(false);
        jtAgregarCancionesGetDescGenero.setBackground(new java.awt.Color(0, 0, 0));
        jtAgregarCancionesGetDescGenero.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jtAgregarCancionesGetDescGenero.setForeground(new java.awt.Color(102, 102, 102));
        jtAgregarCancionesGetDescGenero.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jp2AgregarCanciones.add(jtAgregarCancionesGetDescGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 320, 30));

        jlAgregarCancionesBotonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-add-database-90.png"))); // NOI18N
        jlAgregarCancionesBotonAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlAgregarCancionesBotonAgregar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jlAgregarCancionesBotonAgregarMouseMoved(evt);
            }
        });
        jlAgregarCancionesBotonAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlAgregarCancionesBotonAgregarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlAgregarCancionesBotonAgregarMouseExited(evt);
            }
        });
        jp2AgregarCanciones.add(jlAgregarCancionesBotonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, -1, -1));

        jlCrearUsuario4.setForeground(new java.awt.Color(102, 102, 102));
        jlCrearUsuario4.setText("Agregar Cancion");
        jp2AgregarCanciones.add(jlCrearUsuario4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, -1, -1));

        jlNombreRegistro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-qr-code-30.png"))); // NOI18N
        jp2AgregarCanciones.add(jlNombreRegistro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jtAgregarCancionesSetPrecioCancion.setBackground(new java.awt.Color(0, 0, 0));
        jtAgregarCancionesSetPrecioCancion.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jtAgregarCancionesSetPrecioCancion.setForeground(new java.awt.Color(102, 102, 102));
        jtAgregarCancionesSetPrecioCancion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jp2AgregarCanciones.add(jtAgregarCancionesSetPrecioCancion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 320, 30));

        jlGeneroRegistro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-money-bag-30.png"))); // NOI18N
        jp2AgregarCanciones.add(jlGeneroRegistro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        jlCrearUsuario6.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jlCrearUsuario6.setForeground(new java.awt.Color(102, 102, 102));
        jlCrearUsuario6.setText("Menu");
        jp2AgregarCanciones.add(jlCrearUsuario6, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 30, -1, -1));

        jlCrearUsuario10.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jlCrearUsuario10.setForeground(new java.awt.Color(102, 102, 102));
        jlCrearUsuario10.setText("Logout");
        jp2AgregarCanciones.add(jlCrearUsuario10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

        jlCrearUsuario9.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jlCrearUsuario9.setForeground(new java.awt.Color(102, 102, 102));
        jlCrearUsuario9.setText("Exit");
        jp2AgregarCanciones.add(jlCrearUsuario9, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 30, -1, -1));

        jcAgregarCancionesgetGeneros.setBackground(new java.awt.Color(0, 0, 0));
        jcAgregarCancionesgetGeneros.setForeground(new java.awt.Color(102, 102, 102));
        jcAgregarCancionesgetGeneros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el Codigo del Genero" }));
        jcAgregarCancionesgetGeneros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcAgregarCancionesgetGenerosActionPerformed(evt);
            }
        });
        jp2AgregarCanciones.add(jcAgregarCancionesgetGeneros, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 320, 30));

        jlNombreRegistro2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-qr-code-30.png"))); // NOI18N
        jp2AgregarCanciones.add(jlNombreRegistro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jtAgregarCancionesSetNombreCancion.setBackground(new java.awt.Color(0, 0, 0));
        jtAgregarCancionesSetNombreCancion.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jtAgregarCancionesSetNombreCancion.setForeground(new java.awt.Color(102, 102, 102));
        jtAgregarCancionesSetNombreCancion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jp2AgregarCanciones.add(jtAgregarCancionesSetNombreCancion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 320, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jp1AgregarCanciones, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jp2AgregarCanciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jp1AgregarCanciones, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jp2AgregarCanciones, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String nombreUsr;
    String userId;
    String tipoUsr;
    String correoUsr;

    //Metodo para recibir desde login los siguientes parametros para distintos usos, esta en todos los frames
    public void recibeDatos(String usr, String usr2, String tipoUsuario, String correoUsuario) {
        userId = usr2;
        nombreUsr = usr;
        tipoUsr = tipoUsuario;
        correoUsr = correoUsuario;
        jlNombreCompletoUsuario.setText(nombreUsr);
    }
    Icon m = new ImageIcon(getClass().getResource("/imagenes/logo_black_100.png"));
    private void jlCancionesAgregarExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCancionesAgregarExitMouseClicked
        int respuesta;
        respuesta = JOptionPane.showConfirmDialog(null, "Desea cerrar el programa?");

        if (respuesta == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jlCancionesAgregarExitMouseClicked

    private void jlCancionesAgregarExitMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCancionesAgregarExitMouseMoved
        jlCancionesAgregarExit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(135, 211, 124)));
    }//GEN-LAST:event_jlCancionesAgregarExitMouseMoved

    private void jlCancionesAgregarExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCancionesAgregarExitMouseExited
        jlCancionesAgregarExit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
    }//GEN-LAST:event_jlCancionesAgregarExitMouseExited

    private void jlCancionesAgregarLogoutMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCancionesAgregarLogoutMouseMoved
        jlCancionesAgregarLogout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(135, 211, 124)));
    }//GEN-LAST:event_jlCancionesAgregarLogoutMouseMoved

    private void jlCancionesAgregarLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCancionesAgregarLogoutMouseExited
        jlCancionesAgregarLogout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
    }//GEN-LAST:event_jlCancionesAgregarLogoutMouseExited

    private void jlCancionesAgregarMenuMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCancionesAgregarMenuMouseMoved
        jlCancionesAgregarMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(135, 211, 124)));
    }//GEN-LAST:event_jlCancionesAgregarMenuMouseMoved

    private void jlCancionesAgregarMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCancionesAgregarMenuMouseExited
        jlCancionesAgregarMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
    }//GEN-LAST:event_jlCancionesAgregarMenuMouseExited

    private void jlAgregarCancionesBotonAgregarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlAgregarCancionesBotonAgregarMouseMoved
        jlAgregarCancionesBotonAgregar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(135, 211, 124)));
    }//GEN-LAST:event_jlAgregarCancionesBotonAgregarMouseMoved

    private void jlAgregarCancionesBotonAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlAgregarCancionesBotonAgregarMouseExited
        jlAgregarCancionesBotonAgregar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
    }//GEN-LAST:event_jlAgregarCancionesBotonAgregarMouseExited
    
    // metodo encargado de jalar la informacion de los generos musicales en la base de datos y ponerlos en un combobox
    public void llenarComboGeneroMusical() {
        generosMusicalesVarios gmv = new generosMusicalesVarios();

        ArrayList<generosMusicales> generosMusicales;

        generosMusicales = gmv.actualizarGeneroToCombo();

        if (generosMusicales != null) {

            jcAgregarCancionesgetGeneros.removeAllItems();

            jcAgregarCancionesgetGeneros.addItem("Seleccione un Codigo de Genero");

            for (int i = 0; i < generosMusicales.size(); i++) {

                jcAgregarCancionesgetGeneros.addItem(generosMusicales.get(i).getCodigoGenero());
            }

        }
    }
    
    // metodo encargado de llenar el campo de descripcion de genero
    public void llenadoCampoTexto() {
        String descGenero = "";
        cancionesVarios cv1 = new cancionesVarios();

        ArrayList<canciones> canciones;

        canciones = cv1.agregarCancionesToCombo();

        if (jcAgregarCancionesgetGeneros.getSelectedIndex() == 0) {
            jtAgregarCancionesGetDescGenero.setText("");
        }

        for (int i = 0; i < canciones.size(); i++) {
            if (canciones.get(i).getCodigoGeneroCancion().equals(jcAgregarCancionesgetGeneros.getSelectedItem())) {
                descGenero = canciones.get(i).getDescripcionGeneroCancion();
                jtAgregarCancionesGetDescGenero.setText(descGenero);
            }
        }

    }
    
    // metodo para agregar la informacion ingresada, ponerla en un objeto y mandar a la capa de logica de negocios donde finalmente se envia
    // a la capa de acceso a datos para ser enviada a la DB
    private void jlAgregarCancionesBotonAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlAgregarCancionesBotonAgregarMouseClicked

        if (jtAgregarCancionesSetCodigoCancion.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Por Favor Ingrese el Codigo de la Cancion","La Venta Musical",JOptionPane.INFORMATION_MESSAGE,m);
        } else {
            if (jcAgregarCancionesgetGeneros.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Por Favor Seleccione un Genero","La Venta Musical",JOptionPane.INFORMATION_MESSAGE,m);
            } else {
                if (jtAgregarCancionesGetDescGenero.getText().length() == 0) {
                    JOptionPane.showMessageDialog(null, "Por Favor Ingrese el Nombre de la Cancion","La Venta Musical",JOptionPane.INFORMATION_MESSAGE,m);
                } else {
                    if (jtAgregarCancionesSetPrecioCancion.getText().length() == 0) {
                        JOptionPane.showMessageDialog(null, "Por Favor Ingrese el Precio de la Cancion","La Venta Musical",JOptionPane.INFORMATION_MESSAGE,m);
                    } else {
                        ArrayList<canciones> canciones;

                        canciones can1 = new canciones();
                        cancionesVarios canVar = new cancionesVarios();

                        canciones = canVar.actualizarCancionesToCombo();

                        boolean cancionRepetida = false;

                        for (int i = 0; i < canciones.size(); i++) {

                            if (canciones.get(i).getCodigoCancion().equals(jtAgregarCancionesSetCodigoCancion.getText())) {
                                cancionRepetida = true;
                                break;
                            } else {
                                if (canciones.get(i).getNombreCancion().toLowerCase().equals(jtAgregarCancionesSetNombreCancion.getText())) {
                                    cancionRepetida = true;
                                    break;
                                } else {
                                    can1.setCodigoCancion(jtAgregarCancionesSetCodigoCancion.getText());
                                    can1.setNombreCancion(jtAgregarCancionesSetNombreCancion.getText());
                                    can1.setCodigoGeneroCancion(jcAgregarCancionesgetGeneros.getSelectedItem().toString());
                                    can1.setPrecioCancion(Double.valueOf(jtAgregarCancionesSetPrecioCancion.getText()));
                                }
                            }
                        }
                        if (cancionRepetida == true) {
                            JOptionPane.showMessageDialog(null, "Nombre o codigo de cancion repetidos, favor intentar de nuevo","La Venta Musical",JOptionPane.INFORMATION_MESSAGE,m);
                        } else {
                            can1.setCodigoCancion(jtAgregarCancionesSetCodigoCancion.getText());
                            can1.setNombreCancion(jtAgregarCancionesSetNombreCancion.getText());
                            can1.setCodigoGeneroCancion(jcAgregarCancionesgetGeneros.getSelectedItem().toString());
                            can1.setPrecioCancion(Double.valueOf(jtAgregarCancionesSetPrecioCancion.getText()));
                        }

                        if (canVar.ingresarCanciones(can1) == true) {
                            JOptionPane.showMessageDialog(null, "Cancion agregada correctamente","La Venta Musical",JOptionPane.INFORMATION_MESSAGE,m);
                            jtAgregarCancionesSetCodigoCancion.setText("");
                            jtAgregarCancionesSetNombreCancion.setText("");
                            jtAgregarCancionesSetPrecioCancion.setText("");
                            jtAgregarCancionesGetDescGenero.setText("");
                            jcAgregarCancionesgetGeneros.setSelectedItem("Seleccione un Codigo de Genero");
                        } else {
                            JOptionPane.showMessageDialog(null, "Falló al agregar la cancion","La Venta Musical",JOptionPane.INFORMATION_MESSAGE,m);
                            jtAgregarCancionesSetCodigoCancion.setText("");
                            jtAgregarCancionesSetNombreCancion.setText("");
                            jtAgregarCancionesSetPrecioCancion.setText("");
                            jtAgregarCancionesGetDescGenero.setText("");
                            jcAgregarCancionesgetGeneros.setSelectedItem("Seleccione un Codigo de Genero");
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_jlAgregarCancionesBotonAgregarMouseClicked

    private void jlCancionesAgregarLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCancionesAgregarLogoutMouseClicked
        Login l20 = new Login();
        l20.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jlCancionesAgregarLogoutMouseClicked

    private void jlCancionesAgregarMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCancionesAgregarMenuMouseClicked
        cancionesMenu cm2 = new cancionesMenu();
        cm2.setVisible(true);
        cm2.recibeDatos(nombreUsr, userId, tipoUsr, correoUsr);
        this.setVisible(false);
    }//GEN-LAST:event_jlCancionesAgregarMenuMouseClicked

    private void jcAgregarCancionesgetGenerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcAgregarCancionesgetGenerosActionPerformed
        llenadoCampoTexto();
    }//GEN-LAST:event_jcAgregarCancionesgetGenerosActionPerformed

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
            java.util.logging.Logger.getLogger(CancionesAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CancionesAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CancionesAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CancionesAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CancionesAgregar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<String> jcAgregarCancionesgetGeneros;
    private javax.swing.JLabel jlAgregarCancionesBotonAgregar;
    private javax.swing.JLabel jlCancionesAgregarExit;
    private javax.swing.JLabel jlCancionesAgregarLogout;
    private javax.swing.JLabel jlCancionesAgregarMenu;
    private javax.swing.JLabel jlCrearUsuario10;
    private javax.swing.JLabel jlCrearUsuario3;
    private javax.swing.JLabel jlCrearUsuario4;
    private javax.swing.JLabel jlCrearUsuario5;
    private javax.swing.JLabel jlCrearUsuario6;
    private javax.swing.JLabel jlCrearUsuario9;
    private javax.swing.JLabel jlGeneroRegistro;
    private javax.swing.JLabel jlGeneroRegistro1;
    private javax.swing.JLabel jlNextRegistro;
    private javax.swing.JLabel jlNextRegistro2;
    private javax.swing.JLabel jlNombreCompletoUsuario;
    private javax.swing.JLabel jlNombreRegistro;
    private javax.swing.JLabel jlNombreRegistro1;
    private javax.swing.JLabel jlNombreRegistro2;
    private javax.swing.JPanel jp1AgregarCanciones;
    private javax.swing.JPanel jp2AgregarCanciones;
    private javax.swing.JSeparator jseparadorLogin2;
    private javax.swing.JSeparator jseparadorLogin3;
    private javax.swing.JSeparator jseparadorLogin4;
    private javax.swing.JSeparator jseparadorLogin5;
    private javax.swing.JTextField jtAgregarCancionesGetDescGenero;
    private javax.swing.JTextField jtAgregarCancionesSetCodigoCancion;
    private javax.swing.JTextField jtAgregarCancionesSetNombreCancion;
    private javax.swing.JTextField jtAgregarCancionesSetPrecioCancion;
    // End of variables declaration//GEN-END:variables
}
