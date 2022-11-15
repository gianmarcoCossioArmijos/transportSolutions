package transportSolutionsPresentacion;

import java.io.IOException;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transportSolutionsLogica.EstadoCajaBD;
import transportSolutionsReporte.Reporte;

public class transportSolutionsReporteSesionCaja extends javax.swing.JInternalFrame {

    Reporte rtv;
    public int id;
    public String estado;

    public transportSolutionsReporteSesionCaja() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMantenimiento = new javax.swing.JDesktopPane();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        reporteSesionCaja = new javax.swing.JTable();
        btnImprimir = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        dcFecha = new com.toedter.calendar.JDateChooser();
        btnImprimirCajaCerrada = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        reporteCierreCaja = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("REPORTE DE SESION DE CAJA");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/cierre_caja.png"))); // NOI18N

        javax.swing.GroupLayout panelMantenimientoLayout = new javax.swing.GroupLayout(panelMantenimiento);
        panelMantenimiento.setLayout(panelMantenimientoLayout);
        panelMantenimientoLayout.setHorizontalGroup(
            panelMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelMantenimientoLayout.setVerticalGroup(
            panelMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
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

        reporteSesionCaja.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "SERIE", "CODIGO", "TIPO"
            }
        ));
        reporteSesionCaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reporteSesionCajaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                reporteSesionCajaMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(reporteSesionCaja);

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

        btnImprimirCajaCerrada.setBackground(new java.awt.Color(204, 204, 255));
        btnImprimirCajaCerrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/download.png"))); // NOI18N
        btnImprimirCajaCerrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirCajaCerradaActionPerformed(evt);
            }
        });

        reporteCierreCaja.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "SERIE", "CODIGO", "TIPO"
            }
        ));
        reporteCierreCaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reporteCierreCajaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(reporteCierreCaja);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnImprimir, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(dcFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnImprimirCajaCerrada, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelMantenimiento)
                        .addGap(249, 249, 249))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(dcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnBuscar)
                        .addGap(37, 37, 37)
                        .addComponent(btnImprimir)
                        .addGap(37, 37, 37)
                        .addComponent(btnImprimirCajaCerrada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir)))
                .addGap(15, 15, 15))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void reporteSesionCajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reporteSesionCajaMouseClicked

    }//GEN-LAST:event_reporteSesionCajaMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        if (dcFecha.getCalendar().toString().length() > 0) {

            int dia = dcFecha.getCalendar().get(Calendar.DAY_OF_MONTH);
            int mes = dcFecha.getCalendar().get(Calendar.MONTH) + 1;
            int anio = dcFecha.getCalendar().get(Calendar.YEAR);
            String fecha = anio + "-" + mes + "-" + dia;

            EstadoCajaBD ecbd = new EstadoCajaBD();
            DefaultTableModel tabla_temporal;
            tabla_temporal = ecbd.reportarCajaEstado(fecha);
            reporteSesionCaja.setModel(tabla_temporal);

        } else {
            JOptionPane op = new JOptionPane("Debe seleccionar fecha");
            op.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed

        try {
            rtv = new Reporte();
            rtv.exportarExcel(reporteSesionCaja);
        } catch (IOException e) {
            JOptionPane op = new JOptionPane("Error al exportar excel");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnImprimirCajaCerradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirCajaCerradaActionPerformed
        
        try {
            rtv = new Reporte();
            rtv.exportarExcel(reporteCierreCaja);
        } catch (IOException e) {
            JOptionPane op = new JOptionPane("Error al exportar excel");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnImprimirCajaCerradaActionPerformed

    private void reporteCierreCajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reporteCierreCajaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_reporteCierreCajaMouseClicked

    private void reporteSesionCajaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reporteSesionCajaMousePressed

        DefaultTableModel tabla_temporal = (DefaultTableModel) reporteSesionCaja.getModel();
        int fila = reporteSesionCaja.getSelectedRow();
        id = Integer.parseInt(tabla_temporal.getValueAt(fila, 0).toString());
        estado = tabla_temporal.getValueAt(fila, 2).toString();
        
        if (id > 0) {
            if (estado.equals("CERRADO")) {

                EstadoCajaBD ecbd = new EstadoCajaBD();
                DefaultTableModel modelo = (DefaultTableModel) reporteCierreCaja.getModel();
                tabla_temporal = ecbd.reportarCierreCaja(id);
                reporteCierreCaja.setModel(tabla_temporal);

                reporteCierreCaja.getColumnModel().getColumn(4).setPreferredWidth(200);
            } else {
                JOptionPane op = new JOptionPane("Debe seleccionar una sesion cerrada");
                op.setMessageType(JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane op = new JOptionPane("Debe seleccionar una de sesion");
            op.setMessageType(JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_reporteSesionCajaMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnImprimirCajaCerrada;
    private javax.swing.JButton btnSalir;
    private com.toedter.calendar.JDateChooser dcFecha;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JDesktopPane panelMantenimiento;
    public static javax.swing.JTable reporteCierreCaja;
    public static javax.swing.JTable reporteSesionCaja;
    // End of variables declaration//GEN-END:variables
}
