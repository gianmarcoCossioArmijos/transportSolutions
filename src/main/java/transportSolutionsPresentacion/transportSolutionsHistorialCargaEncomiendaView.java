package transportSolutionsPresentacion;

import java.io.IOException;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transportSolutionsLogica.CargaBD;
import transportSolutionsLogica.RecepcionBD;
import transportSolutionsReporte.Reporte;

public class transportSolutionsHistorialCargaEncomiendaView extends javax.swing.JInternalFrame {

    int filaSeleccionada = 0;
    Reporte rtv;

    public transportSolutionsHistorialCargaEncomiendaView() {
        initComponents();
    }

    public void limpiarTabla() {

        DefaultTableModel temp = (DefaultTableModel) reporteCargaEncomienda.getModel();
        int filas = reporteCargaEncomienda.getRowCount();

        for (int i = 0; filas > i; i++) {
            temp.removeRow(0);
        }
    }

    void espaciadoTabla() {
        reporteCargaEncomienda.getColumnModel().getColumn(0).setPreferredWidth(20);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMantenimiento = new javax.swing.JDesktopPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        reporteCargaEncomienda = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        cmbCargaEncomienda = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        btnDescargar = new javax.swing.JButton();
        dcFecha = new com.toedter.calendar.JDateChooser();
        cmbEstado = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setTitle("HISTORIAL CARGA Y ENCOMIENDA");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/recepcion_encomiendas.png"))); // NOI18N

        reporteCargaEncomienda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "FECHA VENTA", "ORIGEN", "DESTINO", "DOCUMENTO", "CLIENTE", "DESCRIPCION", "ESTADO", "CORRELATIVO"
            }
        ));
        reporteCargaEncomienda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reporteCargaEncomiendaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(reporteCargaEncomienda);

        panelMantenimiento.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelMantenimientoLayout = new javax.swing.GroupLayout(panelMantenimiento);
        panelMantenimiento.setLayout(panelMantenimientoLayout);
        panelMantenimientoLayout.setHorizontalGroup(
            panelMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 839, Short.MAX_VALUE)
        );
        panelMantenimientoLayout.setVerticalGroup(
            panelMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMantenimientoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        cmbCargaEncomienda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "CARGA", "ENCOMIENDA" }));

        btnBuscar.setBackground(new java.awt.Color(204, 255, 0));
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buscar.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnDescargar.setBackground(new java.awt.Color(204, 255, 0));
        btnDescargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/download.png"))); // NOI18N
        btnDescargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescargarActionPerformed(evt);
            }
        });

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "PENDIENTE", "RECEPCIONADO" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDescargar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dcFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbCargaEncomienda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbEstado, 0, 155, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addComponent(panelMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbCargaEncomienda, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDescargar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        if (cmbCargaEncomienda.getSelectedItem().toString().length() > 0) {
            if (cmbEstado.getSelectedItem().toString().length() > 0) {
                if (dcFecha.getCalendar().toString().length() > 0) {

                    if (cmbCargaEncomienda.getSelectedItem().toString().equals("CARGA")) {

                        CargaBD cbd = new CargaBD();
                        DefaultTableModel tabla_temporal = (DefaultTableModel) reporteCargaEncomienda.getModel();

                        int dia = dcFecha.getCalendar().get(Calendar.DAY_OF_MONTH);
                        int mes = dcFecha.getCalendar().get(Calendar.MONTH) + 1;
                        int año = dcFecha.getCalendar().get(Calendar.YEAR);
                        String fecha = año + "-" + mes + "-" + dia;
                        String estado = cmbCargaEncomienda.getSelectedItem().toString();

                        tabla_temporal = cbd.reportarCargaFechaEstado(fecha, estado);

                        if (tabla_temporal.getRowCount() > 0) {

                            reporteCargaEncomienda.setModel(tabla_temporal);
                            espaciadoTabla();
                        } else {

                            limpiarTabla();
                        }
                    } else if (cmbCargaEncomienda.getSelectedItem().toString().equals("ENCOMIENDA")) {

                        RecepcionBD rbd = new RecepcionBD();
                        DefaultTableModel tabla_temporal = (DefaultTableModel) reporteCargaEncomienda.getModel();

                        int dia = dcFecha.getCalendar().get(Calendar.DAY_OF_MONTH);
                        int mes = dcFecha.getCalendar().get(Calendar.MONTH) + 1;
                        int año = dcFecha.getCalendar().get(Calendar.YEAR);
                        String fecha = año + "-" + mes + "-" + dia;
                        String estado = cmbCargaEncomienda.getSelectedItem().toString();

                        tabla_temporal = rbd.reportarRecepcionFechaEstado(fecha, estado);

                        if (tabla_temporal.getRowCount() > 0) {

                            reporteCargaEncomienda.setModel(tabla_temporal);
                            espaciadoTabla();
                        } else {

                            limpiarTabla();
                        }
                    }

                } else {
                    JOptionPane op = new JOptionPane("Debe seleccionar fecha");
                    op.setMessageType(JOptionPane.WARNING_MESSAGE);
                }

            } else {
                JOptionPane op = new JOptionPane("Debe seleccionar estado");
                op.setMessageType(JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane op = new JOptionPane("Debe seleccionar carga o encomienda");
            op.setMessageType(JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void reporteCargaEncomiendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reporteCargaEncomiendaMouseClicked

    }//GEN-LAST:event_reporteCargaEncomiendaMouseClicked

    private void btnDescargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescargarActionPerformed

        try {
            rtv = new Reporte();
            rtv.exportarExcel(reporteCargaEncomienda);
        } catch (IOException e) {
        }
    }//GEN-LAST:event_btnDescargarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnDescargar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbCargaEncomienda;
    private javax.swing.JComboBox<String> cmbEstado;
    private com.toedter.calendar.JDateChooser dcFecha;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JDesktopPane panelMantenimiento;
    public static javax.swing.JTable reporteCargaEncomienda;
    // End of variables declaration//GEN-END:variables
}
