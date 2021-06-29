package presentacion;

import com.sun.awt.AWTUtilities;
import entidades.usuario;
import java.awt.Color;
import java.awt.Shape;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.RoundRectangle2D;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import logicaNegocio.ConexionBaseDatos;
import logicaNegocio.TextPrompt;
import logicaNegocio.login;

public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        
        TextPrompt jtUserID = new TextPrompt("Ingrese su ID", jtLoginSetUserId);
        TextPrompt jtUserPassword = new TextPrompt("Ingrese su Contraseña", jtLoginSetPassword);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1Login = new javax.swing.JPanel();
        jlCrearUsuario9 = new javax.swing.JLabel();
        jlLogo = new javax.swing.JLabel();
        jPanel2Login = new javax.swing.JPanel();
        jlLogin = new javax.swing.JLabel();
        jtLoginSetUserId = new javax.swing.JTextField();
        jlBotonNext = new javax.swing.JLabel();
        jtLoginSetPassword = new javax.swing.JPasswordField();
        jlUser = new javax.swing.JLabel();
        jlLoginBotonAgregarUsuario = new javax.swing.JLabel();
        jseparadorLogin = new javax.swing.JSeparator();
        jllock1 = new javax.swing.JLabel();
        jlLoginBotonMinimize = new javax.swing.JLabel();
        jlExit2 = new javax.swing.JLabel();
        jseparadorLogin1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jlCrearUsuario1 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1Login.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1Login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlCrearUsuario9.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jlCrearUsuario9.setForeground(new java.awt.Color(102, 102, 102));
        jlCrearUsuario9.setText("Exit");
        jPanel1Login.add(jlCrearUsuario9, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 30, -1, -1));

        jlLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N
        jPanel1Login.add(jlLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        getContentPane().add(jPanel1Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 370));

        jPanel2Login.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2Login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlLogin.setBackground(new java.awt.Color(51, 51, 51));
        jlLogin.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jlLogin.setForeground(new java.awt.Color(135, 211, 124));
        jlLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlLogin.setText("Bienvenido");
        jPanel2Login.add(jlLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        jtLoginSetUserId.setBackground(new java.awt.Color(0, 0, 0));
        jtLoginSetUserId.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jtLoginSetUserId.setForeground(new java.awt.Color(102, 102, 102));
        jtLoginSetUserId.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtLoginSetUserId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtLoginSetUserIdMouseClicked(evt);
            }
        });
        jPanel2Login.add(jtLoginSetUserId, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 220, 30));

        jlBotonNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons_next.png"))); // NOI18N
        jlBotonNext.setToolTipText("");
        jlBotonNext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlBotonNext.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jlBotonNextMouseMoved(evt);
            }
        });
        jlBotonNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlBotonNextMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlBotonNextMouseExited(evt);
            }
        });
        jPanel2Login.add(jlBotonNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 60, 60));

        jtLoginSetPassword.setBackground(new java.awt.Color(0, 0, 0));
        jtLoginSetPassword.setForeground(new java.awt.Color(102, 102, 102));
        jtLoginSetPassword.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtLoginSetPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtLoginSetPasswordMouseClicked(evt);
            }
        });
        jPanel2Login.add(jtLoginSetPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 220, 30));

        jlUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon_user.png"))); // NOI18N
        jPanel2Login.add(jlUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jlLoginBotonAgregarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon_addUser.png"))); // NOI18N
        jlLoginBotonAgregarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlLoginBotonAgregarUsuario.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jlLoginBotonAgregarUsuarioMouseMoved(evt);
            }
        });
        jlLoginBotonAgregarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlLoginBotonAgregarUsuarioMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlLoginBotonAgregarUsuarioMouseExited(evt);
            }
        });
        jPanel2Login.add(jlLoginBotonAgregarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, -1, -1));

        jseparadorLogin.setBackground(new java.awt.Color(102, 102, 102));
        jseparadorLogin.setForeground(new java.awt.Color(51, 51, 51));
        jseparadorLogin.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2Login.add(jseparadorLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 3, 10, 20));

        jllock1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon_lock.png"))); // NOI18N
        jPanel2Login.add(jllock1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jlLoginBotonMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-minus-30.png"))); // NOI18N
        jlLoginBotonMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlLoginBotonMinimize.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jlLoginBotonMinimizeMouseMoved(evt);
            }
        });
        jlLoginBotonMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlLoginBotonMinimizeMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlLoginBotonMinimizeMouseExited(evt);
            }
        });
        jPanel2Login.add(jlLoginBotonMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 0, -1, -1));

        jlExit2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon_exit.png"))); // NOI18N
        jlExit2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlExit2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jlExit2MouseMoved(evt);
            }
        });
        jlExit2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlExit2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlExit2MouseExited(evt);
            }
        });
        jPanel2Login.add(jlExit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 0, -1, -1));

        jseparadorLogin1.setBackground(new java.awt.Color(102, 102, 102));
        jseparadorLogin1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel2Login.add(jseparadorLogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 270, 10));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Exit");
        jPanel2Login.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Min");
        jPanel2Login.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 30, -1, -1));

        jLabel5.setText("jLabel5");
        jPanel2Login.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-239, 0, 300, -1));

        jlCrearUsuario1.setForeground(new java.awt.Color(102, 102, 102));
        jlCrearUsuario1.setText("Crear Usuario");
        jPanel2Login.add(jlCrearUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 340, -1, -1));

        getContentPane().add(jPanel2Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 320, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jlLoginBotonAgregarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlLoginBotonAgregarUsuarioMouseClicked
        RegistroUsuario r1 = new RegistroUsuario();

        r1.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jlLoginBotonAgregarUsuarioMouseClicked

    private void jlLoginBotonMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlLoginBotonMinimizeMouseClicked
        this.setState(Login.ICONIFIED);

    }//GEN-LAST:event_jlLoginBotonMinimizeMouseClicked

    private void jlExit2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlExit2MouseClicked
        int respuesta;
        respuesta = JOptionPane.showConfirmDialog(null, "Desea cerrar el programa?");

        if (respuesta == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jlExit2MouseClicked

    private String nombreUsr;
    private String tipoUsr;

    //Metodo para recibir desde login los siguientes parametros para distintos usos, esta en todos los frames
    public void recibeDatos(usuario usr) {
        nombreUsr = usr.getNombreCompletoUsuario();
        tipoUsr = usr.getPerfilUsuario();
    }
    Icon m = new ImageIcon(getClass().getResource("/imagenes/logo_black_100.png"));

    //metodo para verificar la existencia del usuario ingresado
    private void jlBotonNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlBotonNextMouseClicked

        String nombreUsuario = "";
        String identificacionUsuario = "";
        String passUser = "";
        String correoUsr = "";

        if (jtLoginSetUserId.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Por Favor Ingrese el Usuario", "La Venta Musical", JOptionPane.INFORMATION_MESSAGE, m);
        } else {
            if (jtLoginSetPassword.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Por Favor Ingrese el Password", "La Venta Musical", JOptionPane.INFORMATION_MESSAGE, m);
            } else {
                login l1 = new login();

                usuario usr = new usuario();

                usuario usrDevuelto;

                ArrayList<usuario> tipoUsuario;

                usr.setIdentificacionUsuario(jtLoginSetUserId.getText());
                usr.setContrasenaUsuario(jtLoginSetPassword.getText());

                tipoUsuario = l1.tipoUsuario();

                usrDevuelto = l1.login(usr);

                String tipoDeUsuario = "";

                for (int i = 0; i < tipoUsuario.size(); i++) {

                    if (tipoUsuario.get(i).getIdentificacionUsuario().equals(usrDevuelto.getIdentificacionUsuario())) {

                        tipoDeUsuario = tipoUsuario.get(i).getPerfilUsuario();
                        nombreUsuario = tipoUsuario.get(i).getNombreCompletoUsuario();
                        identificacionUsuario = tipoUsuario.get(i).getIdentificacionUsuario();
                        correoUsr = tipoUsuario.get(i).getCorreoElectronicoUsuario();
                        passUser = tipoUsuario.get(i).getContrasenaUsuario();
                    }
                }

                if (!usrDevuelto.getIdentificacionUsuario().equals(identificacionUsuario)) {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "La Venta Musical", JOptionPane.INFORMATION_MESSAGE, m);
                } else {
                    if (!usrDevuelto.getContrasenaUsuario().equals(passUser)) {
                        JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "La Venta Musical", JOptionPane.INFORMATION_MESSAGE, m);
                    } else {
                        if (tipoDeUsuario.equals("Usuario")) {
                            ventas v1 = new ventas();
                            v1.recibeDatos(nombreUsuario, identificacionUsuario, tipoDeUsuario, correoUsr);
                            menuOpcionesUser menuUser = new menuOpcionesUser();
                            menuUser.recibeDatos(nombreUsuario, identificacionUsuario, tipoDeUsuario, correoUsr);
                            menuUser.setVisible(true);
                            this.setVisible(false);

                        } else {
                            ventas v1 = new ventas();
                            v1.recibeDatos(nombreUsuario, identificacionUsuario, tipoDeUsuario, correoUsr);
                            menuOpcionesAdmin menuAdmin = new menuOpcionesAdmin();
                            menuAdmin.recibeDatos(nombreUsuario, identificacionUsuario, tipoDeUsuario, correoUsr);
                            menuAdmin.setVisible(true);
                            this.setVisible(false);

                        }
                    }

                }

            }
        }

    }//GEN-LAST:event_jlBotonNextMouseClicked


    private void jlBotonNextMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlBotonNextMouseMoved
        jlBotonNext.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(135, 211, 124)));
    }//GEN-LAST:event_jlBotonNextMouseMoved

    private void jlBotonNextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlBotonNextMouseExited
        jlBotonNext.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
    }//GEN-LAST:event_jlBotonNextMouseExited

    private void jlLoginBotonAgregarUsuarioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlLoginBotonAgregarUsuarioMouseMoved
        jlLoginBotonAgregarUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(135, 211, 124)));
    }//GEN-LAST:event_jlLoginBotonAgregarUsuarioMouseMoved

    private void jlLoginBotonAgregarUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlLoginBotonAgregarUsuarioMouseExited
        jlLoginBotonAgregarUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
    }//GEN-LAST:event_jlLoginBotonAgregarUsuarioMouseExited

    private void jlExit2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlExit2MouseMoved
        jlExit2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(135, 211, 124)));
    }//GEN-LAST:event_jlExit2MouseMoved

    private void jlExit2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlExit2MouseExited
        jlExit2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
    }//GEN-LAST:event_jlExit2MouseExited

    private void jlLoginBotonMinimizeMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlLoginBotonMinimizeMouseMoved
        jlLoginBotonMinimize.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(135, 211, 124)));
    }//GEN-LAST:event_jlLoginBotonMinimizeMouseMoved

    private void jlLoginBotonMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlLoginBotonMinimizeMouseExited
        jlLoginBotonMinimize.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
    }//GEN-LAST:event_jlLoginBotonMinimizeMouseExited

    private void jtLoginSetUserIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtLoginSetUserIdMouseClicked
        jtLoginSetUserId.setText("");

    }//GEN-LAST:event_jtLoginSetUserIdMouseClicked

    private void jtLoginSetPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtLoginSetPasswordMouseClicked
        jtLoginSetPassword.setText("");
    }//GEN-LAST:event_jtLoginSetPasswordMouseClicked

    /* private void eventosDelTeclado() {

        KeyListener eventoTeclado = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                boolean hit = true;
            }

            @Override
            public void keyPressed(KeyEvent ke) {

            }

            @Override
            public void keyReleased(KeyEvent ke) {

            }
        };

        jtLoginSetUserId.addKeyListener(eventoTeclado);

    }*/
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1Login;
    private javax.swing.JPanel jPanel2Login;
    private javax.swing.JLabel jlBotonNext;
    private javax.swing.JLabel jlCrearUsuario1;
    private javax.swing.JLabel jlCrearUsuario9;
    private javax.swing.JLabel jlExit2;
    private javax.swing.JLabel jlLogin;
    private javax.swing.JLabel jlLoginBotonAgregarUsuario;
    private javax.swing.JLabel jlLoginBotonMinimize;
    private javax.swing.JLabel jlLogo;
    private javax.swing.JLabel jlUser;
    private javax.swing.JLabel jllock1;
    private javax.swing.JSeparator jseparadorLogin;
    private javax.swing.JSeparator jseparadorLogin1;
    private javax.swing.JPasswordField jtLoginSetPassword;
    private javax.swing.JTextField jtLoginSetUserId;
    // End of variables declaration//GEN-END:variables
}