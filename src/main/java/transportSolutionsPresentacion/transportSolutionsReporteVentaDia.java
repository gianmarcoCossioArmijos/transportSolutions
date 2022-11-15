package transportSolutionsPresentacion;

import java.io.IOException;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transportSolutionsLogica.BoletaBD;
import transportSolutionsLogica.DetalleBoletaBD;
import transportSolutionsLogica.DetalleFacturaBD;
import transportSolutionsLogica.FacturaBD;
import transportSolutionsReporte.Reporte;

public class transportSolutionsReporteVentaDia extends javax.swing.JInternalFrame {

    Reporte rtv;

    public transportSolutionsReporteVentaDia() {
        initComponents();
    }

    private void espaciadoTabla() {

        reporteVenta.getColumnModel().getColumn(0).setPreferredWidth(20);
        reporteVenta.getColumnModel().getColumn(5).setPreferredWidth(50);
        reporteVenta.getColumnModel().getColumn(6).setPreferredWidth(150);
        reporteVenta.getColumnModel().getColumn(7).setPreferredWidth(150);
    }

    public void limpiarVenta() {

        DefaultTableModel temp = (DefaultTableModel) reporteVenta.getModel();
        int filas = reporteVenta.getRowCount();

        for (int i = 0; filas > i; i++) {
            temp.removeRow(0);
        }
    }

    public void limpiarDetalleVenta() {

        DefaultTableModel temporal = (DefaultTableModel) reporteDetalleVenta.getModel();
        int fila = reporteDetalleVenta.getRowCount();

        for (int i = 0; fila > i; i++) {
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
        btnImprimir = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        dcFecha = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        reporteDetalleVenta = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnCargar1 = new javax.swing.JButton();
        cmbTipoDocumento = new javax.swing.JComboBox<>();
        btnImprimir1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("REPORTE DE VENTAS POR DIA");
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
                "ID", "TOTAL", "FECHA", "CORRELATIVO", "ESTADO", "CLIENTE", "VENDEDOR"
            }
        ));
        reporteVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reporteVentaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reporteVentaMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                reporteVentaMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(reporteVenta);

        btnImprimir.setBackground(new java.awt.Color(204, 255, 0));
        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/download.png"))); // NOI18N
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(204, 255, 0));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buscar.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        reporteDetalleVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "TOTAL", "FECHA", "CORRELATIVO", "ESTADO", "CLIENTE", "VENDEDOR"
            }
        ));
        reporteDetalleVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reporteDetalleVentaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(reporteDetalleVenta);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Fecha");

        btnCargar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clean.png"))); // NOI18N
        btnCargar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargar1ActionPerformed(evt);
            }
        });

        cmbTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "BOLETA", "FACTURA" }));

        btnImprimir1.setBackground(new java.awt.Color(153, 153, 255));
        btnImprimir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/download.png"))); // NOI18N
        btnImprimir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnImprimir, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(dcFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCargar1, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(btnImprimir1, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
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
                        .addComponent(dcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(cmbTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnBuscar)
                        .addGap(32, 32, 32)
                        .addComponent(btnCargar1)
                        .addGap(34, 34, 34)
                        .addComponent(btnImprimir)
                        .addGap(34, 34, 34)
                        .addComponent(btnImprimir1)
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

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        if (dcFecha.getDate().toString().length() > 0) {

            int dia = dcFecha.getCalendar().get(Calendar.DAY_OF_MONTH);
            int mes = dcFecha.getCalendar().get(Calendar.MONTH) + 1;
            int anio = dcFecha.getCalendar().get(Calendar.YEAR);
            String fecha = anio + "-" + mes + "-" + dia;

            if (!"SELECCIONAR".equals(cmbTipoDocumento.getSelectedItem().toString())) {
                if (cmbTipoDocumento.getSelectedItem().toString().equals("BOLETA")) {

                    DefaultTableModel tabla_temporal;
                    BoletaBD bbd = new BoletaBD();
                    tabla_temporal = bbd.reportarBoletaDia(fecha);

                    if (tabla_temporal.getRowCount() > 0) {

                        reporteVenta.setModel(tabla_temporal);
                        espaciadoTabla();

                    } else {
                        limpiarVenta();
                    }

                } else if (cmbTipoDocumento.getSelectedItem().toString().equals("FACTURA")) {

                    DefaultTableModel tabla_temporal;
                    FacturaBD fbd = new FacturaBD();
                    tabla_temporal = fbd.reportarFacturaDia(fecha);

                    if (tabla_temporal.getRowCount() > 0) {

                        reporteVenta.setModel(tabla_temporal);
                        espaciadoTabla();

                    } else {
                        limpiarVenta();
                    }
                }
            } else {
                JOptionPane op = new JOptionPane("Debe seleccionar una tipo de documento");
                op.setMessageType(JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane op = new JOptionPane("Debe seleccionar fecha");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void reporteDetalleVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reporteDetalleVentaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_reporteDetalleVentaMouseClicked

    private void btnCargar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargar1ActionPerformed

        limpiarVenta();
        limpiarDetalleVenta();
    }//GEN-LAST:event_btnCargar1ActionPerformed

    private void reporteVentaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reporteVentaMousePressed

        BoletaBD bbd = new BoletaBD();
        DefaultTableModel tabla_temporal = (DefaultTableModel) reporteVenta.getModel();
        int fila_seleccionada = reporteVenta.getSelectedRow();
        String id = tabla_temporal.getValueAt(fila_seleccionada, 0).toString();
        String verificar = bbd.buscarBoleta(Integer.parseInt(id));

        if (verificar != null) {

            int idventa = Integer.parseInt(id);
            DetalleBoletaBD dbbd = new DetalleBoletaBD();
            DefaultTableModel tabla;
            tabla = dbbd.buscarDetalleBoleta(idventa);

            if (tabla_temporal.getRowCount() > 0) {

                reporteDetalleVenta.setModel(tabla);

            } else {
                limpiarDetalleVenta();
            }
        } else if (verificar == null) {

            int idventa = Integer.parseInt(id);
            DetalleFacturaBD dfbd = new DetalleFacturaBD();
            DefaultTableModel tabla;
            tabla = dfbd.buscarDetalleFactura(idventa);

            if (tabla_temporal.getRowCount() > 0) {

                reporteDetalleVenta.setModel(tabla);

            } else {
                limpiarDetalleVenta();
            }
        }
    }//GEN-LAST:event_reporteVentaMousePressed

    private void reporteVentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reporteVentaMouseEntered

    }//GEN-LAST:event_reporteVentaMouseEntered

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed

        try {
            rtv = new Reporte();
            rtv.exportarExcel(reporteVenta);
        } catch (IOException e) {
            JOptionPane op = new JOptionPane("Error al exportar excel");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnImprimir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimir1ActionPerformed

        try {
            rtv = new Reporte();
            rtv.exportarExcel(reporteDetalleVenta);
        } catch (IOException e) {
            JOptionPane op = new JOptionPane("Error al exportar excel");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnImprimir1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCargar1;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnImprimir1;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbTipoDocumento;
    private com.toedter.calendar.JDateChooser dcFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JDesktopPane panelMantenimiento;
    public static javax.swing.JTable reporteDetalleVenta;
    public static javax.swing.JTable reporteVenta;
    // End of variables declaration//GEN-END:variables
}
