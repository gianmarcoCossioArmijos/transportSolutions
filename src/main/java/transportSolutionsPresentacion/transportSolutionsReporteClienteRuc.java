package transportSolutionsPresentacion;

import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transportSolutionsLogica.ClienteRucBD;
import transportSolutionsLogica.DetalleFacturaBD;
import transportSolutionsLogica.FacturaBD;
import transportSolutionsReporte.Reporte;

public class transportSolutionsReporteClienteRuc extends javax.swing.JInternalFrame {

    Reporte rtv;

    public transportSolutionsReporteClienteRuc() {
        initComponents();
    }

    void espaciadoTabla() {

        reporteVenta.getColumnModel().getColumn(5).setPreferredWidth(170);
        reporteVenta.getColumnModel().getColumn(6).setPreferredWidth(170);
    }

    private void limpiarVenta() {

        DefaultTableModel temp = (DefaultTableModel) reporteVenta.getModel();
        int filas = reporteVenta.getRowCount();

        for (int i = 0; filas > i; i++) {
            temp.removeRow(0);
        }
    }

    private void limpiarDetalleVenta() {

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
        jLabel1 = new javax.swing.JLabel();
        txtBuscarRuc = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        reporteDetalleVenta = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        reporteVenta = new javax.swing.JTable();
        btnImprimir = new javax.swing.JButton();
        btnImprimir1 = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("REPORTE DE VENTAS POR CLIENTE RUC");
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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Buscar Cliente");

        txtBuscarRuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarRucActionPerformed(evt);
            }
        });

        reporteDetalleVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ORIGEN", "DESTINO", "TIPO CARGA", "DESCRIPCION", "PRECIO"
            }
        ));
        reporteDetalleVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reporteDetalleVentaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(reporteDetalleVenta);

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

        btnImprimir1.setBackground(new java.awt.Color(153, 153, 255));
        btnImprimir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/download.png"))); // NOI18N
        btnImprimir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimir1ActionPerformed(evt);
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(txtBuscarRuc, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(btnImprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnImprimir1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelMantenimiento)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelMantenimiento)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscarRuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)
                        .addGap(25, 25, 25)
                        .addComponent(btnImprimir)
                        .addGap(26, 26, 26)
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

    private void reporteDetalleVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reporteDetalleVentaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_reporteDetalleVentaMouseClicked

    private void txtBuscarRucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarRucActionPerformed

    }//GEN-LAST:event_txtBuscarRucActionPerformed

    private void reporteVentaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reporteVentaMousePressed

        int fila_seleccionada = reporteVenta.getSelectedRow();
        DefaultTableModel tabla_temporal = (DefaultTableModel) reporteVenta.getModel();
        int idventa = Integer.parseInt(tabla_temporal.getValueAt(fila_seleccionada, 0).toString());

        DetalleFacturaBD dfbd = new DetalleFacturaBD();
        DefaultTableModel tabla = dfbd.buscarDetalleFactura(idventa);

        if (tabla.getRowCount() > 0) {

            reporteDetalleVenta.setModel(tabla);

        } else {
            limpiarDetalleVenta();
        }
    }//GEN-LAST:event_reporteVentaMousePressed

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

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        if (txtBuscarRuc.getText().length() > 0) {

            ClienteRucBD crbd = new ClienteRucBD();
            String ruc = txtBuscarRuc.getText();
            int id = Integer.parseInt(crbd.reportarClienteRuc(ruc));

            FacturaBD fbd = new FacturaBD();
            DefaultTableModel tabla_temporal;
            tabla_temporal = fbd.buscarFacturaCliente(id);

            if (tabla_temporal.getRowCount() > 0) {

                reporteVenta.setModel(tabla_temporal);
                espaciadoTabla();

            } else {
                limpiarVenta();
            }
        } else {
            JOptionPane op = new JOptionPane("Debe ingresar ruc");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnImprimir1;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JDesktopPane panelMantenimiento;
    public static javax.swing.JTable reporteDetalleVenta;
    public static javax.swing.JTable reporteVenta;
    private javax.swing.JTextField txtBuscarRuc;
    // End of variables declaration//GEN-END:variables
}
