/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import entidades.usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author obarboza
 */
public class menuOpcionesUser extends javax.swing.JFrame {

    /**
     * Creates new form menuOpcionesUser
     */
    public menuOpcionesUser() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp1MenuRegistro = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlNombreCompletoUsuario = new javax.swing.JLabel();
        jp2MenuRegistro = new javax.swing.JPanel();
        jlMenuOpcionesUserExit = new javax.swing.JLabel();
        jlMenuOpcionesUserBotonActualizar = new javax.swing.JLabel();
        jlMenuOpcionesUserBotonVenta = new javax.swing.JLabel();
        jlCrearUsuario1 = new javax.swing.JLabel();
        jseparadorLogin1 = new javax.swing.JSeparator();
        jseparadorLogin2 = new javax.swing.JSeparator();
        jlMenuOpcionesUserLogout = new javax.swing.JLabel();
        jlCrearUsuario2 = new javax.swing.JLabel();
        jlCrearUsuario10 = new javax.swing.JLabel();
        jlCrearUsuario9 = new javax.swing.JLabel();
        jlLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jp1MenuRegistro.setBackground(new java.awt.Color(0, 0, 0));
        jp1MenuRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N
        jp1MenuRegistro.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 200, 240));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon_user.png"))); // NOI18N
        jLabel3.setText("jLabel1");
        jp1MenuRegistro.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, -1));

        jlNombreCompletoUsuario.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jlNombreCompletoUsuario.setForeground(new java.awt.Color(102, 102, 102));
        jlNombreCompletoUsuario.setText("User");
        jp1MenuRegistro.add(jlNombreCompletoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jp2MenuRegistro.setBackground(new java.awt.Color(51, 51, 51));
        jp2MenuRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlMenuOpcionesUserExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon_exit.png"))); // NOI18N
        jlMenuOpcionesUserExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlMenuOpcionesUserExit.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jlMenuOpcionesUserExitMouseMoved(evt);
            }
        });
        jlMenuOpcionesUserExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMenuOpcionesUserExitMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlMenuOpcionesUserExitMouseExited(evt);
            }
        });
        jp2MenuRegistro.add(jlMenuOpcionesUserExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, -1, -1));

        jlMenuOpcionesUserBotonActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon-registration-90.png"))); // NOI18N
        jlMenuOpcionesUserBotonActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlMenuOpcionesUserBotonActualizar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jlMenuOpcionesUserBotonActualizarMouseMoved(evt);
            }
        });
        jlMenuOpcionesUserBotonActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMenuOpcionesUserBotonActualizarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlMenuOpcionesUserBotonActualizarMouseExited(evt);
            }
        });
        jp2MenuRegistro.add(jlMenuOpcionesUserBotonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 100, 90));

        jlMenuOpcionesUserBotonVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon-add-shopping-90.png"))); // NOI18N
        jlMenuOpcionesUserBotonVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlMenuOpcionesUserBotonVenta.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jlMenuOpcionesUserBotonVentaMouseMoved(evt);
            }
        });
        jlMenuOpcionesUserBotonVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMenuOpcionesUserBotonVentaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlMenuOpcionesUserBotonVentaMouseExited(evt);
            }
        });
        jp2MenuRegistro.add(jlMenuOpcionesUserBotonVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 90, 80));

        jlCrearUsuario1.setForeground(new java.awt.Color(102, 102, 102));
        jlCrearUsuario1.setText("Actualizar Datos");
        jp2MenuRegistro.add(jlCrearUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, -1, -1));

        jseparadorLogin1.setBackground(new java.awt.Color(102, 102, 102));
        jseparadorLogin1.setForeground(new java.awt.Color(51, 51, 51));
        jseparadorLogin1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jp2MenuRegistro.add(jseparadorLogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 10, 80));

        jseparadorLogin2.setBackground(new java.awt.Color(102, 102, 102));
        jseparadorLogin2.setForeground(new java.awt.Color(51, 51, 51));
        jseparadorLogin2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jp2MenuRegistro.add(jseparadorLogin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 4, 10, 24));

        jlMenuOpcionesUserLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon-login-rounded-30.png"))); // NOI18N
        jlMenuOpcionesUserLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlMenuOpcionesUserLogout.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jlMenuOpcionesUserLogoutMouseMoved(evt);
            }
        });
        jlMenuOpcionesUserLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMenuOpcionesUserLogoutMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlMenuOpcionesUserLogoutMouseExited(evt);
            }
        });
        jp2MenuRegistro.add(jlMenuOpcionesUserLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 30, -1));

        jlCrearUsuario2.setForeground(new java.awt.Color(102, 102, 102));
        jlCrearUsuario2.setText("Venta de Canciones");
        jp2MenuRegistro.add(jlCrearUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        jlCrearUsuario10.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jlCrearUsuario10.setForeground(new java.awt.Color(102, 102, 102));
        jlCrearUsuario10.setText("Logout");
        jp2MenuRegistro.add(jlCrearUsuario10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

        jlCrearUsuario9.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jlCrearUsuario9.setForeground(new java.awt.Color(102, 102, 102));
        jlCrearUsuario9.setText("Exit");
        jp2MenuRegistro.add(jlCrearUsuario9, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 30, -1, -1));

        jlLogin.setBackground(new java.awt.Color(51, 51, 51));
        jlLogin.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jlLogin.setForeground(new java.awt.Color(135, 211, 124));
        jlLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlLogin.setText("Menu ");
        jp2MenuRegistro.add(jlLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jp1MenuRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jp2MenuRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jp1MenuRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jp2MenuRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String nombreUsr;
    String userId;
    String tipoUsr;
    String correoUsr;

    public void recibeDatos(String usr, String usr2, String tipoUsuario, String correoUsuario) {
        userId = usr2;
        nombreUsr = usr;
        tipoUsr = tipoUsuario;
        correoUsr = correoUsuario;
        jlNombreCompletoUsuario.setText(nombreUsr);
    }

    private void jlMenuOpcionesUserExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMenuOpcionesUserExitMouseClicked
        int respuesta;
        respuesta = JOptionPane.showConfirmDialog(null, "Desea cerrar el programa?");

        if (respuesta == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jlMenuOpcionesUserExitMouseClicked

    private void jlMenuOpcionesUserExitMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMenuOpcionesUserExitMouseMoved
        jlMenuOpcionesUserExit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(135, 211, 124)));
    }//GEN-LAST:event_jlMenuOpcionesUserExitMouseMoved

    private void jlMenuOpcionesUserExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMenuOpcionesUserExitMouseExited
        jlMenuOpcionesUserExit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
    }//GEN-LAST:event_jlMenuOpcionesUserExitMouseExited

    private void jlMenuOpcionesUserLogoutMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMenuOpcionesUserLogoutMouseMoved
        jlMenuOpcionesUserLogout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(135, 211, 124)));
    }//GEN-LAST:event_jlMenuOpcionesUserLogoutMouseMoved

    private void jlMenuOpcionesUserLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMenuOpcionesUserLogoutMouseExited
        jlMenuOpcionesUserLogout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
    }//GEN-LAST:event_jlMenuOpcionesUserLogoutMouseExited

    private void jlMenuOpcionesUserBotonVentaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMenuOpcionesUserBotonVentaMouseMoved
        jlMenuOpcionesUserBotonVenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(135, 211, 124)));
    }//GEN-LAST:event_jlMenuOpcionesUserBotonVentaMouseMoved

    private void jlMenuOpcionesUserBotonVentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMenuOpcionesUserBotonVentaMouseExited
        jlMenuOpcionesUserBotonVenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
    }//GEN-LAST:event_jlMenuOpcionesUserBotonVentaMouseExited

    private void jlMenuOpcionesUserBotonActualizarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMenuOpcionesUserBotonActualizarMouseMoved
        jlMenuOpcionesUserBotonActualizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(135, 211, 124)));
    }//GEN-LAST:event_jlMenuOpcionesUserBotonActualizarMouseMoved

    private void jlMenuOpcionesUserBotonActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMenuOpcionesUserBotonActualizarMouseExited
        jlMenuOpcionesUserBotonActualizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
    }//GEN-LAST:event_jlMenuOpcionesUserBotonActualizarMouseExited

    private void jlMenuOpcionesUserLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMenuOpcionesUserLogoutMouseClicked
        Login l2 = new Login();
        l2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jlMenuOpcionesUserLogoutMouseClicked

    private void jlMenuOpcionesUserBotonVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMenuOpcionesUserBotonVentaMouseClicked
        ventas v5 = new ventas();
        v5.setVisible(true);
        this.setVisible(false);
        v5.recibeDatos(nombreUsr, userId, tipoUsr, correoUsr);
    }//GEN-LAST:event_jlMenuOpcionesUserBotonVentaMouseClicked

    private void jlMenuOpcionesUserBotonActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMenuOpcionesUserBotonActualizarMouseClicked

        ActualizarUsuario1 au3 = new ActualizarUsuario1();
        au3.setVisible(true);
        this.setVisible(false);
        au3.recibeDatos(nombreUsr, userId, tipoUsr, correoUsr);
    }//GEN-LAST:event_jlMenuOpcionesUserBotonActualizarMouseClicked

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
            java.util.logging.Logger.getLogger(menuOpcionesUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuOpcionesUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuOpcionesUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuOpcionesUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuOpcionesUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jlCrearUsuario1;
    private javax.swing.JLabel jlCrearUsuario10;
    private javax.swing.JLabel jlCrearUsuario2;
    private javax.swing.JLabel jlCrearUsuario9;
    private javax.swing.JLabel jlLogin;
    private javax.swing.JLabel jlMenuOpcionesUserBotonActualizar;
    private javax.swing.JLabel jlMenuOpcionesUserBotonVenta;
    private javax.swing.JLabel jlMenuOpcionesUserExit;
    private javax.swing.JLabel jlMenuOpcionesUserLogout;
    private javax.swing.JLabel jlNombreCompletoUsuario;
    private javax.swing.JPanel jp1MenuRegistro;
    private javax.swing.JPanel jp2MenuRegistro;
    private javax.swing.JSeparator jseparadorLogin1;
    private javax.swing.JSeparator jseparadorLogin2;
    // End of variables declaration//GEN-END:variables
}