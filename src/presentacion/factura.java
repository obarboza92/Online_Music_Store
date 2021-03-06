/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import entidades.venta;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author obarboza
 */
public class factura extends javax.swing.JFrame {

    /**
     * Creates new form factura
     */
    public factura() {
        initComponents();
        setLocationRelativeTo(null);
    }

    ArrayList listaCanciones;
    String numFactura;
    String nombreUsr;
    String idUsr;
    String fecha;
    String subTotal;
    String total;
    String correo;

    public factura(String nombreUsuario, String numeroFactura, String usrId, String subtotal, String totalCompra, ArrayList canciones, String fechaCompra, String correoCliente) {
        initComponents();
        setLocationRelativeTo(null);
        nombreUsr = nombreUsuario;
        listaCanciones = canciones;
        numFactura = numeroFactura;
        idUsr = usrId;
        subTotal = subtotal;
        total = totalCompra;
        fecha = fechaCompra;
        correo = correoCliente;
        llenadoTabla();

    }

    public void llenadoTabla() {
        
        jlFacturaGetNumeroFactura.setText(numFactura);
        jlFacturaGetDia.setText(fecha);
        jlFacturaGetNombreUsuario.setText(nombreUsr);
        jlFacturaGetIdUsuario.setText(idUsr);
        jlFacturaGetCorreo.setText(correo);
        jlFacturaGetSubTotal.setText(subTotal + " Colones");
        jlFacturaGetTotal.setText(total + " Colones");
        
        ArrayList<venta> listaVentas;

        listaVentas = listaCanciones;

        if (listaVentas != null) {

            DefaultTableModel modelo = new DefaultTableModel();

            String[] nombresColumnas = {"Codigo Cancion", "Nombre Cancion", "Precio Cancion"};

            modelo.setColumnIdentifiers(nombresColumnas);

            Object[] columna = new Object[modelo.getColumnCount()];

            for (int i = 0; i < listaVentas.size(); i++) {

                columna[0] = listaVentas.get(i).getCodigoCancionFactura();
                columna[1] = listaVentas.get(i).getNombreCancionFactura();
                columna[2] = listaVentas.get(i).getPrecionCancionFactura();

                modelo.addRow(columna);
            }

            jtDetalleCompra.setModel(modelo);

        }
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlVentasExit1 = new javax.swing.JLabel();
        jlCrearUsuario10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jlLogin = new javax.swing.JLabel();
        jseparadorLogin4 = new javax.swing.JSeparator();
        jlLogin1 = new javax.swing.JLabel();
        jlLogin2 = new javax.swing.JLabel();
        jlLogin3 = new javax.swing.JLabel();
        jlLogin5 = new javax.swing.JLabel();
        jlLogin7 = new javax.swing.JLabel();
        jlVentasExit = new javax.swing.JLabel();
        jlFacturaGetCorreo = new javax.swing.JLabel();
        jlFacturaGetDia = new javax.swing.JLabel();
        jseparadorLogin5 = new javax.swing.JSeparator();
        jlLogin10 = new javax.swing.JLabel();
        jlFacturaGetNombreUsuario = new javax.swing.JLabel();
        jlFacturaGetIdUsuario = new javax.swing.JLabel();
        jseparadorLogin6 = new javax.swing.JSeparator();
        jlLogin6 = new javax.swing.JLabel();
        jlFacturaGetNumeroFactura = new javax.swing.JLabel();
        jseparadorLogin7 = new javax.swing.JSeparator();
        jlLogin11 = new javax.swing.JLabel();
        jlLogin12 = new javax.swing.JLabel();
        jlLogin13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDetalleCompra = new javax.swing.JTable();
        jlLogin4 = new javax.swing.JLabel();
        jlLogin8 = new javax.swing.JLabel();
        jlFacturaGetTotal = new javax.swing.JLabel();
        jlFacturaGetSubTotal = new javax.swing.JLabel();
        jseparadorLogin3 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();

        jlVentasExit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon_exit.png"))); // NOI18N
        jlVentasExit1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlVentasExit1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jlVentasExit1MouseMoved(evt);
            }
        });
        jlVentasExit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlVentasExit1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlVentasExit1MouseExited(evt);
            }
        });

        jlCrearUsuario10.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jlCrearUsuario10.setForeground(new java.awt.Color(102, 102, 102));
        jlCrearUsuario10.setText("Exit");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo_110.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 110, 100));

        jlLogin.setBackground(new java.awt.Color(51, 51, 51));
        jlLogin.setForeground(new java.awt.Color(135, 211, 124));
        jlLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlLogin.setText("Dia: ");
        jPanel1.add(jlLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, 20));

        jseparadorLogin4.setBackground(new java.awt.Color(102, 102, 102));
        jseparadorLogin4.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jseparadorLogin4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 145, 330, 10));

        jlLogin1.setBackground(new java.awt.Color(51, 51, 51));
        jlLogin1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jlLogin1.setForeground(new java.awt.Color(135, 211, 124));
        jlLogin1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlLogin1.setText("Factura");
        jPanel1.add(jlLogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 10, -1, 30));

        jlLogin2.setBackground(new java.awt.Color(51, 51, 51));
        jlLogin2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlLogin2.setForeground(new java.awt.Color(135, 211, 124));
        jlLogin2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlLogin2.setText("Factura Para:");
        jPanel1.add(jlLogin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 20));

        jlLogin3.setBackground(new java.awt.Color(51, 51, 51));
        jlLogin3.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jlLogin3.setForeground(new java.awt.Color(102, 102, 102));
        jlLogin3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlLogin3.setText("Correo: laventamusical@gmail.com");
        jPanel1.add(jlLogin3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, -1, 20));

        jlLogin5.setBackground(new java.awt.Color(51, 51, 51));
        jlLogin5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlLogin5.setForeground(new java.awt.Color(135, 211, 124));
        jlLogin5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlLogin5.setText("Factura De:");
        jPanel1.add(jlLogin5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, -1, 20));

        jlLogin7.setBackground(new java.awt.Color(51, 51, 51));
        jlLogin7.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jlLogin7.setForeground(new java.awt.Color(102, 102, 102));
        jlLogin7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlLogin7.setText("Telefono: 2234-1515");
        jPanel1.add(jlLogin7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, -1, 20));

        jlVentasExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon_exit.png"))); // NOI18N
        jlVentasExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlVentasExit.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jlVentasExitMouseMoved(evt);
            }
        });
        jlVentasExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlVentasExitMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlVentasExitMouseExited(evt);
            }
        });
        jPanel1.add(jlVentasExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, -1, 30));

        jlFacturaGetCorreo.setBackground(new java.awt.Color(51, 51, 51));
        jlFacturaGetCorreo.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jlFacturaGetCorreo.setForeground(new java.awt.Color(102, 102, 102));
        jlFacturaGetCorreo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlFacturaGetCorreo.setText("Correo Electronico");
        jPanel1.add(jlFacturaGetCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, 20));

        jlFacturaGetDia.setBackground(new java.awt.Color(0, 0, 0));
        jlFacturaGetDia.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jlFacturaGetDia.setForeground(new java.awt.Color(102, 102, 102));
        jlFacturaGetDia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlFacturaGetDia.setText("dia");
        jPanel1.add(jlFacturaGetDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, -1, 20));

        jseparadorLogin5.setBackground(new java.awt.Color(102, 102, 102));
        jseparadorLogin5.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jseparadorLogin5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 230, 10));

        jlLogin10.setBackground(new java.awt.Color(51, 51, 51));
        jlLogin10.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jlLogin10.setForeground(new java.awt.Color(102, 102, 102));
        jlLogin10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlLogin10.setText("Correo Electronico: ");
        jPanel1.add(jlLogin10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, 20));

        jlFacturaGetNombreUsuario.setBackground(new java.awt.Color(51, 51, 51));
        jlFacturaGetNombreUsuario.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jlFacturaGetNombreUsuario.setForeground(new java.awt.Color(102, 102, 102));
        jlFacturaGetNombreUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlFacturaGetNombreUsuario.setText("Nombre Usuario");
        jPanel1.add(jlFacturaGetNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, 20));

        jlFacturaGetIdUsuario.setBackground(new java.awt.Color(51, 51, 51));
        jlFacturaGetIdUsuario.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jlFacturaGetIdUsuario.setForeground(new java.awt.Color(102, 102, 102));
        jlFacturaGetIdUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlFacturaGetIdUsuario.setText("ID usuario");
        jPanel1.add(jlFacturaGetIdUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, 20));

        jseparadorLogin6.setBackground(new java.awt.Color(102, 102, 102));
        jseparadorLogin6.setForeground(new java.awt.Color(51, 51, 51));
        jseparadorLogin6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jseparadorLogin6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 10, 200));

        jlLogin6.setBackground(new java.awt.Color(51, 51, 51));
        jlLogin6.setForeground(new java.awt.Color(135, 211, 124));
        jlLogin6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlLogin6.setText("Factura Numero:");
        jPanel1.add(jlLogin6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, 20));

        jlFacturaGetNumeroFactura.setBackground(new java.awt.Color(0, 0, 0));
        jlFacturaGetNumeroFactura.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jlFacturaGetNumeroFactura.setForeground(new java.awt.Color(102, 102, 102));
        jlFacturaGetNumeroFactura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlFacturaGetNumeroFactura.setText("numero");
        jPanel1.add(jlFacturaGetNumeroFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, -1, 20));

        jseparadorLogin7.setBackground(new java.awt.Color(102, 102, 102));
        jseparadorLogin7.setForeground(new java.awt.Color(51, 51, 51));
        jseparadorLogin7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jseparadorLogin7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 10, 150));

        jlLogin11.setBackground(new java.awt.Color(51, 51, 51));
        jlLogin11.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jlLogin11.setForeground(new java.awt.Color(102, 102, 102));
        jlLogin11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlLogin11.setText("La Venta Musical S.A");
        jPanel1.add(jlLogin11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, -1, 20));

        jlLogin12.setBackground(new java.awt.Color(51, 51, 51));
        jlLogin12.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jlLogin12.setForeground(new java.awt.Color(102, 102, 102));
        jlLogin12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlLogin12.setText("Nombre:");
        jPanel1.add(jlLogin12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 20));

        jlLogin13.setBackground(new java.awt.Color(51, 51, 51));
        jlLogin13.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jlLogin13.setForeground(new java.awt.Color(102, 102, 102));
        jlLogin13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlLogin13.setText("Identificacion: ");
        jPanel1.add(jlLogin13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 230));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtDetalleCompra.setBackground(new java.awt.Color(0, 0, 0));
        jtDetalleCompra.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jtDetalleCompra.setForeground(new java.awt.Color(135, 211, 124));
        jtDetalleCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtDetalleCompra.setToolTipText("");
        jtDetalleCompra.setGridColor(new java.awt.Color(102, 102, 102));
        jtDetalleCompra.setSelectionBackground(new java.awt.Color(135, 211, 124));
        jtDetalleCompra.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jtDetalleCompra);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 460, 420));

        jlLogin4.setBackground(new java.awt.Color(51, 51, 51));
        jlLogin4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlLogin4.setForeground(new java.awt.Color(135, 211, 124));
        jlLogin4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlLogin4.setText("Total:");
        jPanel2.add(jlLogin4, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 490, -1, 20));

        jlLogin8.setBackground(new java.awt.Color(51, 51, 51));
        jlLogin8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlLogin8.setForeground(new java.awt.Color(135, 211, 124));
        jlLogin8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlLogin8.setText("SubTotal:");
        jPanel2.add(jlLogin8, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 460, -1, 20));

        jlFacturaGetTotal.setBackground(new java.awt.Color(0, 0, 0));
        jlFacturaGetTotal.setForeground(new java.awt.Color(102, 102, 102));
        jlFacturaGetTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlFacturaGetTotal.setText("Total");
        jPanel2.add(jlFacturaGetTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 490, -1, 20));

        jlFacturaGetSubTotal.setBackground(new java.awt.Color(0, 0, 0));
        jlFacturaGetSubTotal.setForeground(new java.awt.Color(102, 102, 102));
        jlFacturaGetSubTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlFacturaGetSubTotal.setText("SubTotal");
        jPanel2.add(jlFacturaGetSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 460, -1, 20));

        jseparadorLogin3.setBackground(new java.awt.Color(102, 102, 102));
        jseparadorLogin3.setForeground(new java.awt.Color(51, 51, 51));
        jseparadorLogin3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jseparadorLogin3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, 10, 60));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, 240, 80));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 500, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlVentasExitMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlVentasExitMouseMoved
        jlVentasExit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(135, 211, 124)));
    }//GEN-LAST:event_jlVentasExitMouseMoved

    private void jlVentasExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlVentasExitMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_jlVentasExitMouseClicked

    private void jlVentasExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlVentasExitMouseExited
        jlVentasExit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
    }//GEN-LAST:event_jlVentasExitMouseExited

    private void jlVentasExit1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlVentasExit1MouseMoved
        jlVentasExit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(135, 211, 124)));
    }//GEN-LAST:event_jlVentasExit1MouseMoved

    private void jlVentasExit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlVentasExit1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jlVentasExit1MouseClicked

    private void jlVentasExit1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlVentasExit1MouseExited
        jlVentasExit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
    }//GEN-LAST:event_jlVentasExit1MouseExited

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
            java.util.logging.Logger.getLogger(factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new factura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlCrearUsuario10;
    private javax.swing.JLabel jlFacturaGetCorreo;
    private javax.swing.JLabel jlFacturaGetDia;
    private javax.swing.JLabel jlFacturaGetIdUsuario;
    private javax.swing.JLabel jlFacturaGetNombreUsuario;
    private javax.swing.JLabel jlFacturaGetNumeroFactura;
    private javax.swing.JLabel jlFacturaGetSubTotal;
    private javax.swing.JLabel jlFacturaGetTotal;
    private javax.swing.JLabel jlLogin;
    private javax.swing.JLabel jlLogin1;
    private javax.swing.JLabel jlLogin10;
    private javax.swing.JLabel jlLogin11;
    private javax.swing.JLabel jlLogin12;
    private javax.swing.JLabel jlLogin13;
    private javax.swing.JLabel jlLogin2;
    private javax.swing.JLabel jlLogin3;
    private javax.swing.JLabel jlLogin4;
    private javax.swing.JLabel jlLogin5;
    private javax.swing.JLabel jlLogin6;
    private javax.swing.JLabel jlLogin7;
    private javax.swing.JLabel jlLogin8;
    private javax.swing.JLabel jlVentasExit;
    private javax.swing.JLabel jlVentasExit1;
    private javax.swing.JSeparator jseparadorLogin3;
    private javax.swing.JSeparator jseparadorLogin4;
    private javax.swing.JSeparator jseparadorLogin5;
    private javax.swing.JSeparator jseparadorLogin6;
    private javax.swing.JSeparator jseparadorLogin7;
    private javax.swing.JTable jtDetalleCompra;
    // End of variables declaration//GEN-END:variables
}
