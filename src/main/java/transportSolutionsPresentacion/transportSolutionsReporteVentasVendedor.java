package transportSolutionsPresentacion;

import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transportSolutionsLogica.BoletaBD;
import transportSolutionsLogica.DetalleBoletaBD;
import transportSolutionsLogica.DetalleFacturaBD;
import transportSolutionsLogica.FacturaBD;
import transportSolutionsLogica.UsuarioBD;
import transportSolutionsReporte.Reporte;

public class transportSolutionsReporteVentasVendedor extends javax.swing.JInternalFrame {
    
    Reporte rtv;

    public transportSolutionsReporteVentasVendedor() {
        initComponents();
        espaciadoTabla();
    }

    private void espaciadoTabla() {

        reporteVenta.getColumnModel().getColumn(0).setPreferredWidth(20);
        reporteVenta.getColumnModel().getColumn(1).setPreferredWidth(170);
        reporteVenta.getColumnModel().getColumn(3).setPreferredWidth(170);
    }

    private void limpiar() {

        DefaultTableModel temp = (DefaultTableModel) reporteVenta.getModel();
        int filas = reporteVenta.getRowCount();

        for (int i = 0; filas > i; i++) {
            temp.removeRow(0);
        }

        DefaultTableModel temporal = (DefaultTableModel) reporteDetalleVenta.getModel();
        int fila = reporteDetalleVenta.getRowCount();

        for (int i = 0; filas > i; i++) {
            temporal.removeRow(0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMantenimiento = new javax.swing.JDesktopPane();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        reporteVenta = new javax.swing.JTable();
        btnImprimirVenta = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        reporteDetalleVenta = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtVendedor = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnCargar = new javax.swing.JButton();
        cmbTipoDocumento = new javax.swing.JComboBox<>();
        btnImprimirDetalle = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("REPORTE DE VENTAS POR VENDEDOR");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_ventas.png"))); // NOI18N

        javax.swing.GroupLayout panelMantenimientoLayout = new javax.swing.GroupLayout(panelMantenimiento);
        panelMantenimiento.setLayout(panelMantenimientoLayout);
        panelMantenimientoLayout.setHorizontalGroup(
            panelMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelMantenimientoLayout.setVerticalGroup(
            panelMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 233, Short.MAX_VALUE)
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

        reporteVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "TOTAL", "FECHA", "CORRELATIVO", "ESTADO", "CLIENTE", "VENDEDOR", "CAJA"
            }
        ));
        reporteVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reporteVentaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                reporteVentaMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(reporteVenta);

        btnImprimirVenta.setBackground(new java.awt.Color(204, 255, 0));
        btnImprimirVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/download.png"))); // NOI18N
        btnImprimirVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirVentaActionPerformed(evt);
            }
        });

        reporteDetalleVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "TOTAL", "FECHA", "CORRLATIVO", "ESTADO", "CLIENTE", "VENDEOR"
            }
        ));
        reporteDetalleVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reporteDetalleVentaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(reporteDetalleVenta);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Vendedor");

        btnBuscar.setBackground(new java.awt.Color(204, 255, 0));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buscar.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnCargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clean.png"))); // NOI18N
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        cmbTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "BOLETA", "FACTURA" }));

        btnImprimirDetalle.setBackground(new java.awt.Color(153, 153, 255));
        btnImprimirDetalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/download.png"))); // NOI18N
        btnImprimirDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirDetalleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(txtVendedor)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnImprimirVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(btnCargar, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(btnImprimirDetalle, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cmbTipoDocumento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelMantenimiento))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelMantenimiento)
                        .addGap(249, 249, 249))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(cmbTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnBuscar)
                        .addGap(32, 32, 32)
                        .addComponent(btnCargar)
                        .addGap(34, 34, 34)
                        .addComponent(btnImprimirVenta)
                        .addGap(34, 34, 34)
                        .addComponent(btnImprimirDetalle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir)))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void reporteVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reporteVentaMouseClicked

    }//GEN-LAST:event_reporteVentaMouseClicked

    private void reporteDetalleVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reporteDetalleVentaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_reporteDetalleVentaMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        UsuarioBD ubd = new UsuarioBD();
        String id = ubd.buscarUsuarioDni(txtVendedor.getText());

        if (id.length() > 0) {

            if (cmbTipoDocumento.getSelectedItem().toString().equals("BOLETA")) {

                DefaultTableModel tabla_temporal;
                BoletaBD bbd = new BoletaBD();
                tabla_temporal = bbd.reportarBoletaVendedor(Integer.parseInt(id));
                reporteVenta.setModel(tabla_temporal);
                espaciadoTabla();

            } else {

                DefaultTableModel tabla_temporal;
                FacturaBD fbd = new FacturaBD();
                tabla_temporal = fbd.reportarFacturaVendedor(Integer.parseInt(id));
                reporteVenta.setModel(tabla_temporal);
                espaciadoTabla();
            }

        } else {
            JOptionPane op = new JOptionPane("Debe ingresar dni del vendedor");
            op.setMessageType(JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed

        limpiar();
    }//GEN-LAST:event_btnCargarActionPerformed

    private void reporteVentaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reporteVentaMousePressed
        
        BoletaBD bbd = new BoletaBD();
        DefaultTableModel tabla_temporal = (DefaultTableModel) reporteVenta.getModel();
        int fila_seleccionada = reporteVenta.getSelectedRow();
        String id = tabla_temporal.getValueAt(fila_seleccionada, 0).toString();
        String verificar =  bbd.buscarBoleta(Integer.parseInt(id));
        
        if (verificar != null) {

            int idventa = Integer.parseInt(id);
            DetalleBoletaBD dbbd = new DetalleBoletaBD();
            DefaultTableModel tabla = dbbd.buscarDetalleBoleta(idventa);

            reporteDetalleVenta.setModel(tabla);
        } else if (verificar == null) {
            
            int idventa = Integer.parseInt(id);
            DetalleFacturaBD dfbd = new DetalleFacturaBD();
            DefaultTableModel tabla = dfbd.buscarDetalleFactura(idventa);

            reporteDetalleVenta.setModel(tabla);
        }
    }//GEN-LAST:event_reporteVentaMousePressed

    private void btnImprimirVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirVentaActionPerformed
        
        try {
            rtv = new Reporte();
            rtv.exportarExcel(reporteVenta);
        } catch (IOException e) {
        }
    }//GEN-LAST:event_btnImprimirVentaActionPerformed

    private void btnImprimirDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirDetalleActionPerformed
        
        try {
            rtv = new Reporte();
            rtv.exportarExcel(reporteDetalleVenta);
        } catch (IOException e) {
        }
    }//GEN-LAST:event_btnImprimirDetalleActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnImprimirDetalle;
    private javax.swing.JButton btnImprimirVenta;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbTipoDocumento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JDesktopPane panelMantenimiento;
    public static javax.swing.JTable reporteDetalleVenta;
    public static javax.swing.JTable reporteVenta;
    private javax.swing.JTextField txtVendedor;
    // End of variables declaration//GEN-END:variables
}
