package transportSolutionsPresentacion;

import java.io.IOException;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transportSolutionsLogica.CargaBD;
import transportSolutionsLogica.RecepcionBD;
import transportSolutionsModelo.Carga;
import transportSolutionsModelo.Recepcion;
import transportSolutionsReporte.Reporte;

public class transportSolutionsCargaEncomiendaView extends javax.swing.JInternalFrame {

    int filaSeleccionada = 0;
    Reporte rtv;

    public transportSolutionsCargaEncomiendaView() {
        initComponents();
        txtModificar.setEnabled(false);
    }

    void limpiar() {

        txtModificar.setText("");
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

        btnRecepcionar = new javax.swing.JButton();
        panelMantenimiento = new javax.swing.JDesktopPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        reporteCargaEncomienda = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        txtModificar = new javax.swing.JTextField();
        cmbCargaEncomienda = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        btnDescargar = new javax.swing.JButton();
        dcFecha = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setIconifiable(true);
        setTitle("CARGA Y ENCOMIENDA");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/recepcion_encomiendas.png"))); // NOI18N

        btnRecepcionar.setBackground(new java.awt.Color(204, 204, 255));
        btnRecepcionar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRecepcionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nuevo_vehiculo.png"))); // NOI18N
        btnRecepcionar.setText("Recepcionar");
        btnRecepcionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecepcionarActionPerformed(evt);
            }
        });

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

        txtModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModificarActionPerformed(evt);
            }
        });
        txtModificar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtModificarKeyReleased(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRecepcionar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(btnDescargar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dcFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbCargaEncomienda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtModificar, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(12, 12, 12)
                .addComponent(panelMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(panelMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRecepcionar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbCargaEncomienda, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDescargar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir)
                        .addGap(15, 15, 15))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRecepcionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecepcionarActionPerformed

        if (txtModificar.getText().length() > 0) {

            CargaBD cbd = new CargaBD();
            DefaultTableModel modelo = (DefaultTableModel) reporteCargaEncomienda.getModel();
            int id = Integer.parseInt(txtModificar.getText());
            String buscarCarga = cbd.BuscarIdCarga(id);

            if (buscarCarga.length() > 0) {

                Carga c = new Carga();

                c.setFechaVenta(modelo.getValueAt(filaSeleccionada, 1).toString());
                c.setOrigen(modelo.getValueAt(filaSeleccionada, 2).toString());
                c.setDestino(modelo.getValueAt(filaSeleccionada, 3).toString());
                c.setDniDestinatario(modelo.getValueAt(filaSeleccionada, 4).toString());
                c.setDestinatario(modelo.getValueAt(filaSeleccionada, 5).toString());
                c.setDescripcion(modelo.getValueAt(filaSeleccionada, 6).toString());
                c.setCorrelativo(modelo.getValueAt(filaSeleccionada, 8).toString());
                c.setEstado("RECEPCIONADO");

                cbd.modificarCarga(c, id);
                limpiar();
                limpiarTabla();
            } else {
                
                Recepcion r = new Recepcion();
                RecepcionBD rbd = new RecepcionBD();
                
                r.setFechaVenta(modelo.getValueAt(filaSeleccionada, 1).toString());
                r.setOrigen(modelo.getValueAt(filaSeleccionada, 2).toString());
                r.setDestino(modelo.getValueAt(filaSeleccionada, 3).toString());
                r.setDescripcion(modelo.getValueAt(filaSeleccionada, 4).toString());
                r.setDniDestinatario(modelo.getValueAt(filaSeleccionada, 6).toString());
                r.setDestinatario(modelo.getValueAt(filaSeleccionada, 7).toString());
                r.setCorrelativo(modelo.getValueAt(filaSeleccionada, 8).toString());
                r.setEstado("RECEPCIONADO");
                
                rbd.modificarRecepcion(r, id);
                limpiar();
                limpiarTabla();
            }

        } else {
            JOptionPane op = new JOptionPane("Debe seleccionar carga o encomienda que desea recepcionar");
            op.setMessageType(JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnRecepcionarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModificarActionPerformed

    private void txtModificarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModificarKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModificarKeyReleased

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        if (cmbCargaEncomienda.getSelectedItem().toString().equals("CARGA")) {

            CargaBD cbd = new CargaBD();
            DefaultTableModel tabla_temporal;

            int dia = dcFecha.getCalendar().get(Calendar.DAY_OF_MONTH);
            int mes = dcFecha.getCalendar().get(Calendar.MONTH) + 1;
            int año = dcFecha.getCalendar().get(Calendar.YEAR);
            String fecha = año + "-" + mes + "-" + dia;

            tabla_temporal = cbd.reportarCargaFecha(fecha);

            if (tabla_temporal.getRowCount() > 0) {

                reporteCargaEncomienda.setModel(tabla_temporal);
                espaciadoTabla();
                limpiar();
            } else {

                limpiarTabla();
                limpiar();
            }
        } else if (cmbCargaEncomienda.getSelectedItem().toString().equals("ENCOMIENDA")) {

            RecepcionBD rbd = new RecepcionBD();
            DefaultTableModel tabla_temporal;

            int dia = dcFecha.getCalendar().get(Calendar.DAY_OF_MONTH);
            int mes = dcFecha.getCalendar().get(Calendar.MONTH) + 1;
            int año = dcFecha.getCalendar().get(Calendar.YEAR);
            String fecha = año + "-" + mes + "-" + dia;

            tabla_temporal = rbd.reportarRecepcionFecha(fecha);

            if (tabla_temporal.getRowCount() > 0) {

                reporteCargaEncomienda.setModel(tabla_temporal);
                espaciadoTabla();
                limpiar();
            } else {

                espaciadoTabla();
                limpiar();
            }
        } else {
            JOptionPane op = new JOptionPane("Debe seleccionar estado de flete");
            op.setMessageType(JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void reporteCargaEncomiendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reporteCargaEncomiendaMouseClicked

        filaSeleccionada = reporteCargaEncomienda.getSelectedRow();
        txtModificar.setText(reporteCargaEncomienda.getValueAt(filaSeleccionada, 0).toString());
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
    public javax.swing.JButton btnRecepcionar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbCargaEncomienda;
    private com.toedter.calendar.JDateChooser dcFecha;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JDesktopPane panelMantenimiento;
    public static javax.swing.JTable reporteCargaEncomienda;
    private javax.swing.JTextField txtModificar;
    // End of variables declaration//GEN-END:variables
}
