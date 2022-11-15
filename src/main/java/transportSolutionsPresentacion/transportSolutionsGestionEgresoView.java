package transportSolutionsPresentacion;

import java.awt.Dimension;
import java.io.IOException;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transportSolutionsLogica.EgresoBD;
import transportSolutionsReporte.Reporte;

public class transportSolutionsGestionEgresoView extends javax.swing.JInternalFrame {

    Reporte rtv;

    public transportSolutionsGestionEgresoView() {
        initComponents();
    }

    void espaciadoTabla() {
        reporteEgresos.getColumnModel().getColumn(0).setPreferredWidth(2);
    }

    public void limpiarTabla() {

        DefaultTableModel temp = (DefaultTableModel) reporteEgresos.getModel();
        int filas = reporteEgresos.getRowCount();

        for (int i = 0; filas > i; i++) {
            temp.removeRow(0);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNuevoEgreso = new javax.swing.JButton();
        btnEditarProveedor = new javax.swing.JButton();
        panelMantenimiento = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        reporteEgresos = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        btnMostrarProveedor = new javax.swing.JButton();
        btnDescargar = new javax.swing.JButton();
        btnDescargar1 = new javax.swing.JButton();
        dcFecha = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("GESTION EGRESOS");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_egreso.png"))); // NOI18N

        btnNuevoEgreso.setBackground(new java.awt.Color(204, 204, 255));
        btnNuevoEgreso.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNuevoEgreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nuevo_egreso.png"))); // NOI18N
        btnNuevoEgreso.setText("Nuevo Egreso");
        btnNuevoEgreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoEgresoActionPerformed(evt);
            }
        });

        btnEditarProveedor.setBackground(new java.awt.Color(204, 204, 255));
        btnEditarProveedor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modificar_egreso.png"))); // NOI18N
        btnEditarProveedor.setText("Editar Egreso");
        btnEditarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProveedorActionPerformed(evt);
            }
        });

        reporteEgresos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "TIPO", "DESCRIPCION", "MONTO", "FECHA", "RESPONSABLE", "COMPROBANTE"
            }
        ));
        reporteEgresos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reporteEgresosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(reporteEgresos);

        panelMantenimiento.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelMantenimientoLayout = new javax.swing.GroupLayout(panelMantenimiento);
        panelMantenimiento.setLayout(panelMantenimientoLayout);
        panelMantenimientoLayout.setHorizontalGroup(
            panelMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE)
        );
        panelMantenimientoLayout.setVerticalGroup(
            panelMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
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

        btnMostrarProveedor.setBackground(new java.awt.Color(204, 204, 255));
        btnMostrarProveedor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMostrarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mostrar_egreso.png"))); // NOI18N
        btnMostrarProveedor.setText("Mostrar Egresos");
        btnMostrarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarProveedorActionPerformed(evt);
            }
        });

        btnDescargar.setBackground(new java.awt.Color(204, 255, 0));
        btnDescargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/download.png"))); // NOI18N
        btnDescargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescargarActionPerformed(evt);
            }
        });

        btnDescargar1.setBackground(new java.awt.Color(204, 255, 0));
        btnDescargar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buscar.png"))); // NOI18N
        btnDescargar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescargar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnNuevoEgreso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditarProveedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMostrarProveedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dcFecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDescargar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(btnDescargar1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMantenimiento)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(btnNuevoEgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMostrarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDescargar1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDescargar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoEgresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoEgresoActionPerformed
        // TODO add your handling code here:

        transportSolutionsNuevoEgresoView ne = new transportSolutionsNuevoEgresoView();
        panelMantenimiento.add(ne);
        Dimension desktopSize = panelMantenimiento.getSize();
        Dimension FrameSize = ne.getSize();
        ne.setLocation((desktopSize.width - FrameSize.width) / 4, (desktopSize.height - FrameSize.height) / 4);
        ne.setVisible(true);
    }//GEN-LAST:event_btnNuevoEgresoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnMostrarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarProveedorActionPerformed

        EgresoBD ebd = new EgresoBD();

        DefaultTableModel tabla_temporal;
        tabla_temporal = ebd.reportarEgreso();

        if (tabla_temporal.getRowCount() > 0) {
            reporteEgresos.setModel(tabla_temporal);
            espaciadoTabla();
        }
    }//GEN-LAST:event_btnMostrarProveedorActionPerformed

    private void reporteEgresosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reporteEgresosMouseClicked

    }//GEN-LAST:event_reporteEgresosMouseClicked

    private void btnEditarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProveedorActionPerformed

        transportSolutionsModificarEgresoView me = new transportSolutionsModificarEgresoView();
        panelMantenimiento.add(me);
        Dimension desktopSize = panelMantenimiento.getSize();
        Dimension FrameSize = me.getSize();
        me.setLocation((desktopSize.width - FrameSize.width) / 4, (desktopSize.height - FrameSize.height) / 4);
        me.setVisible(true);
    }//GEN-LAST:event_btnEditarProveedorActionPerformed

    private void btnDescargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescargarActionPerformed

        try {
            rtv = new Reporte();
            rtv.exportarExcel(reporteEgresos);
        } catch (IOException e) {
        }
    }//GEN-LAST:event_btnDescargarActionPerformed

    private void btnDescargar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescargar1ActionPerformed

        if (dcFecha.getDate().toString().length() > 0) {

            EgresoBD ebd = new EgresoBD();
            DefaultTableModel tabla_temporal;

            int dia = dcFecha.getCalendar().get(Calendar.DAY_OF_MONTH);
            int mes = dcFecha.getCalendar().get(Calendar.MONTH) + 1;
            int año = dcFecha.getCalendar().get(Calendar.YEAR);
            String fecha = año + "-" + mes + "-" + dia;
            tabla_temporal = ebd.buscarEgresoFecha(fecha);
            
            if (tabla_temporal.getRowCount() > 0) {
                
                reporteEgresos.setModel(tabla_temporal);
                espaciadoTabla();
            } else {
                limpiarTabla();
            }
        } else {
            JOptionPane op = new JOptionPane("Debe ingresar Fecha");
            op.setMessageType(JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDescargar1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDescargar;
    private javax.swing.JButton btnDescargar1;
    public javax.swing.JButton btnEditarProveedor;
    public javax.swing.JButton btnMostrarProveedor;
    public javax.swing.JButton btnNuevoEgreso;
    private javax.swing.JButton btnSalir;
    private com.toedter.calendar.JDateChooser dcFecha;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JDesktopPane panelMantenimiento;
    public static javax.swing.JTable reporteEgresos;
    // End of variables declaration//GEN-END:variables
}
