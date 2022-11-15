package transportSolutionsPresentacion;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transportSolutionsLogica.BoletaBD;
import transportSolutionsLogica.FacturaBD;

public class transportSolutionsGestionVentasView extends javax.swing.JInternalFrame {

    public transportSolutionsGestionVentasView() {
        initComponents();
        txtAnular.setEnabled(false);
    }

    void espaciadoTabla() {

        reporteVentas.getColumnModel().getColumn(0).setPreferredWidth(20);
        reporteVentas.getColumnModel().getColumn(1).setPreferredWidth(50);
        reporteVentas.getColumnModel().getColumn(2).setPreferredWidth(50);
        reporteVentas.getColumnModel().getColumn(2).setPreferredWidth(90);
        reporteVentas.getColumnModel().getColumn(3).setPreferredWidth(90);
        reporteVentas.getColumnModel().getColumn(5).setPreferredWidth(100);
        reporteVentas.getColumnModel().getColumn(6).setPreferredWidth(150);
        reporteVentas.getColumnModel().getColumn(7).setPreferredWidth(150);
    }

    public void limpiarTabla() {

        DefaultTableModel temp = (DefaultTableModel) reporteVentas.getModel();
        int filas = reporteVentas.getRowCount();

        for (int i = 0; filas > i; i++) {
            temp.removeRow(0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAnularVenta = new javax.swing.JButton();
        panelMantenimiento = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        reporteVentas = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        btnMostrarVentas = new javax.swing.JButton();
        txtBuscarVenta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtAnular = new javax.swing.JTextField();
        cmbEstadoVenta = new javax.swing.JComboBox<>();
        cmbTipoDocumento = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("GESTION VENTAS");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_ventas.png"))); // NOI18N

        btnAnularVenta.setBackground(new java.awt.Color(204, 204, 255));
        btnAnularVenta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAnularVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anular_venta.png"))); // NOI18N
        btnAnularVenta.setText("Anular Venta");
        btnAnularVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnularVentaActionPerformed(evt);
            }
        });

        reporteVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "TOTAL", "FECHA", "CORRELATIVO", "ESTADO", "CLIENTE", "VENDEDOR"
            }
        ));
        reporteVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reporteVentasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(reporteVentas);

        panelMantenimiento.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelMantenimientoLayout = new javax.swing.GroupLayout(panelMantenimiento);
        panelMantenimiento.setLayout(panelMantenimientoLayout);
        panelMantenimientoLayout.setHorizontalGroup(
            panelMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMantenimientoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 883, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelMantenimientoLayout.setVerticalGroup(
            panelMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
        );

        btnSalir.setBackground(new java.awt.Color(255, 0, 0));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cross_2.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnMostrarVentas.setBackground(new java.awt.Color(204, 204, 255));
        btnMostrarVentas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMostrarVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mostrar_ventas.png"))); // NOI18N
        btnMostrarVentas.setText("Mostrar Ventas");
        btnMostrarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarVentasActionPerformed(evt);
            }
        });

        txtBuscarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarVentaActionPerformed(evt);
            }
        });
        txtBuscarVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarVentaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarVentaKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Buscar Venta");

        txtAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnularActionPerformed(evt);
            }
        });
        txtAnular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAnularKeyReleased(evt);
            }
        });

        cmbEstadoVenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "ACTIVO", "ANULADO" }));

        cmbTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "BOLETA", "FACTURA" }));
        cmbTipoDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoDocumentoActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(204, 255, 0));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buscar.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnAnularVenta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cmbTipoDocumento, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cmbEstadoVenta, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtBuscarVenta, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnMostrarVentas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                        .addComponent(txtAnular, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAnularVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAnular, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMostrarVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbEstadoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelMantenimiento)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnMostrarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarVentasActionPerformed

        if (cmbTipoDocumento.getSelectedItem().toString().length() > 0) {
            if (cmbTipoDocumento.getSelectedItem().toString().equals("BOLETA")) {

                if (cmbEstadoVenta.getSelectedItem().toString().length() > 0) {

                    BoletaBD vbd = new BoletaBD();
                    DefaultTableModel tabla_temporal_boleta;
                    tabla_temporal_boleta = vbd.mostrarBoleta(cmbEstadoVenta.getSelectedItem().toString());

                    reporteVentas.setModel(tabla_temporal_boleta);
                    espaciadoTabla();
                } else {
                    JOptionPane op = new JOptionPane("Debe seleccionar estado de boleta");
                    op.setMessageType(JOptionPane.WARNING_MESSAGE);
                }
            } else if (cmbTipoDocumento.getSelectedItem().toString().equals("FACTURA")) {

                if (cmbEstadoVenta.getSelectedItem().toString().length() > 0) {
                    FacturaBD fbd = new FacturaBD();
                    DefaultTableModel tabla_temporal_factura;
                    tabla_temporal_factura = fbd.mostrarFactura(cmbEstadoVenta.getSelectedItem().toString());

                    reporteVentas.setModel(tabla_temporal_factura);
                    espaciadoTabla();
                } else {
                    JOptionPane op = new JOptionPane("Debe seleccionar estado de factura");
                    op.setMessageType(JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane op = new JOptionPane("Debe seleccionar tipo de documento");
                op.setMessageType(JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane op = new JOptionPane("Debe seleccionar tipo de documento");
            op.setMessageType(JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnMostrarVentasActionPerformed

    private void btnAnularVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnularVentaActionPerformed

        if (txtAnular.getText().length() > 0) {

            if (cmbTipoDocumento.getSelectedItem().toString().equals("BOLETA")) {

                BoletaBD vbd = new BoletaBD();
                String id = txtAnular.getText();
                String registroBoleta = vbd.buscarBoleta(Integer.parseInt(id));

                if (registroBoleta != null) {

                    vbd.anularBoleta(Integer.parseInt(id));
                    limpiarTabla();
                    txtAnular.setText("");
                } else {
                    registroBoleta = "null";
                }

            } else if (cmbTipoDocumento.getSelectedItem().toString().equals("FACTURA")) {

                FacturaBD fbd = new FacturaBD();
                String id = txtAnular.getText();
                String registroFactura = fbd.buscarIdFactura(Integer.parseInt(id));

                if (registroFactura != null) {

                    fbd.anularFactura(Integer.parseInt(id));
                    limpiarTabla();
                    txtAnular.setText("");
                } else {
                    registroFactura = "null";
                }
            }
        } else {
            JOptionPane op = new JOptionPane("Debe ingresar un correlativo");
            op.setMessageType(JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAnularVentaActionPerformed

    private void txtBuscarVentaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarVentaKeyReleased

    }//GEN-LAST:event_txtBuscarVentaKeyReleased

    private void reporteVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reporteVentasMouseClicked

        int filaSeleccionada = reporteVentas.getSelectedRow();

        txtAnular.setText(reporteVentas.getValueAt(filaSeleccionada, 0).toString());
    }//GEN-LAST:event_reporteVentasMouseClicked

    private void txtBuscarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarVentaActionPerformed

    }//GEN-LAST:event_txtBuscarVentaActionPerformed

    private void txtAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnularActionPerformed

    private void txtAnularKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnularKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnularKeyReleased

    private void txtBuscarVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarVentaKeyTyped

        char caracter = evt.getKeyChar();

        if (Character.isLetter(caracter) && caracter != KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_txtBuscarVentaKeyTyped

    private void cmbTipoDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTipoDocumentoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        if (cmbTipoDocumento.getSelectedItem().toString().length() > 0) {
            if (cmbTipoDocumento.getSelectedItem().toString().equals("BOLETA")) {

                if (cmbEstadoVenta.getSelectedItem().toString().length() > 0) {

                    BoletaBD vbd = new BoletaBD();
                    DefaultTableModel tabla_temporal_boleta;
                    tabla_temporal_boleta = vbd.buscarBoleta(txtBuscarVenta.getText(), cmbEstadoVenta.getSelectedItem().toString());

                    if (tabla_temporal_boleta.getRowCount() > 0) {
                        reporteVentas.setModel(tabla_temporal_boleta);
                        espaciadoTabla();
                    } else {
                        limpiarTabla();
                    }
                } else {
                    JOptionPane op = new JOptionPane("Debe seleccionar estado de boleta");
                    op.setMessageType(JOptionPane.WARNING_MESSAGE);
                }
            } else if (cmbTipoDocumento.getSelectedItem().toString().equals("FACTURA")) {

                if (cmbEstadoVenta.getSelectedItem().toString().length() > 0) {
                    FacturaBD fbd = new FacturaBD();
                    DefaultTableModel tabla_temporal_factura;
                    tabla_temporal_factura = fbd.buscarFactura(txtBuscarVenta.getText(), cmbEstadoVenta.getSelectedItem().toString());

                    if (tabla_temporal_factura.getRowCount() > 0) {
                        reporteVentas.setModel(tabla_temporal_factura);
                        espaciadoTabla();
                    } else {
                        limpiarTabla();
                    }
                } else {
                    JOptionPane op = new JOptionPane("Debe seleccionar estado de factura");
                    op.setMessageType(JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane op = new JOptionPane("Debe seleccionar tipo de documento");
                op.setMessageType(JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane op = new JOptionPane("Debe seleccionar tipo de documento");
            op.setMessageType(JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAnularVenta;
    private javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnMostrarVentas;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbEstadoVenta;
    private javax.swing.JComboBox<String> cmbTipoDocumento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JDesktopPane panelMantenimiento;
    public static javax.swing.JTable reporteVentas;
    private javax.swing.JTextField txtAnular;
    private javax.swing.JTextField txtBuscarVenta;
    // End of variables declaration//GEN-END:variables
}
