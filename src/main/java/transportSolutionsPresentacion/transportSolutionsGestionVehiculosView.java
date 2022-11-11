package transportSolutionsPresentacion;

import java.awt.Dimension;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transportSolutionsLogica.VehiculoBD;
import static transportSolutionsPresentacion.transportSolutionsReporteClienteRuc.reporteVenta;
import transportSolutionsReporte.Reporte;

public class transportSolutionsGestionVehiculosView extends javax.swing.JInternalFrame {

    Reporte rtv;

    public transportSolutionsGestionVehiculosView() {
        initComponents();
        txtEliminar.setEnabled(false);
    }

    void espaciadoTabla() {
        reporteVehiculos.getColumnModel().getColumn(0).setPreferredWidth(20);
        reporteVehiculos.getColumnModel().getColumn(1).setPreferredWidth(130);
        reporteVehiculos.getColumnModel().getColumn(2).setPreferredWidth(130);
        reporteVehiculos.getColumnModel().getColumn(3).setPreferredWidth(120);
        reporteVehiculos.getColumnModel().getColumn(3).setPreferredWidth(80);
        reporteVehiculos.getColumnModel().getColumn(7).setPreferredWidth(100);
        reporteVehiculos.getColumnModel().getColumn(8).setPreferredWidth(160);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNuevoVehiculo = new javax.swing.JButton();
        btnEliminarVehiculo = new javax.swing.JButton();
        btnEditarVehiculo = new javax.swing.JButton();
        panelMantenimiento = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        reporteVehiculos = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        btnMostrarVehiculo = new javax.swing.JButton();
        txtBuscarVehiculo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtEliminar = new javax.swing.JTextField();
        btnDescargar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("GESTION VEHICULOS");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_vehiculos.png"))); // NOI18N

        btnNuevoVehiculo.setBackground(new java.awt.Color(204, 204, 255));
        btnNuevoVehiculo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNuevoVehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nuevo_vehiculo.png"))); // NOI18N
        btnNuevoVehiculo.setText("Nuevo Vehiculo");
        btnNuevoVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoVehiculoActionPerformed(evt);
            }
        });

        btnEliminarVehiculo.setBackground(new java.awt.Color(204, 204, 255));
        btnEliminarVehiculo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminarVehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eliminar_vechiculo.png"))); // NOI18N
        btnEliminarVehiculo.setText("Eliminar Vehiculo");
        btnEliminarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVehiculoActionPerformed(evt);
            }
        });

        btnEditarVehiculo.setBackground(new java.awt.Color(204, 204, 255));
        btnEditarVehiculo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditarVehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modificar_vehiculo.png"))); // NOI18N
        btnEditarVehiculo.setText("Editar Vehiculo");
        btnEditarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarVehiculoActionPerformed(evt);
            }
        });

        reporteVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "MARCA", "MODELO", "TIPO", "SERIE MOTOR", "PLACA", "AÑO", "ESTADO PROPIETARIO", "PROPIETARIO"
            }
        ));
        reporteVehiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reporteVehiculosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(reporteVehiculos);

        panelMantenimiento.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelMantenimientoLayout = new javax.swing.GroupLayout(panelMantenimiento);
        panelMantenimiento.setLayout(panelMantenimientoLayout);
        panelMantenimientoLayout.setHorizontalGroup(
            panelMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE)
        );
        panelMantenimientoLayout.setVerticalGroup(
            panelMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
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

        btnMostrarVehiculo.setBackground(new java.awt.Color(204, 204, 255));
        btnMostrarVehiculo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMostrarVehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mostrar_vehiculos.png"))); // NOI18N
        btnMostrarVehiculo.setText("Mostrar Vehiculos");
        btnMostrarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarVehiculoActionPerformed(evt);
            }
        });

        txtBuscarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarVehiculoActionPerformed(evt);
            }
        });
        txtBuscarVehiculo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarVehiculoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarVehiculoKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Buscar Vehiculo");

        txtEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEliminarActionPerformed(evt);
            }
        });
        txtEliminar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEliminarKeyReleased(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(btnMostrarVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditarVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBuscarVehiculo)
                    .addComponent(txtEliminar)
                    .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevoVehiculo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDescargar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelMantenimiento)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMantenimiento)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(btnNuevoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMostrarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDescargar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoVehiculoActionPerformed

        transportSolutionsNuevoVehiculo nv = new transportSolutionsNuevoVehiculo();
        panelMantenimiento.add(nv);
        Dimension desktopSize = panelMantenimiento.getSize();
        Dimension FrameSize = nv.getSize();
        nv.setLocation((desktopSize.width - FrameSize.width) / 4, (desktopSize.height - FrameSize.height) / 4);
        nv.setVisible(true);
    }//GEN-LAST:event_btnNuevoVehiculoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnMostrarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarVehiculoActionPerformed

        VehiculoBD vbd = new VehiculoBD();

        DefaultTableModel tabla_temporal;
        tabla_temporal = vbd.reportarVehiculo();

        if (tabla_temporal.getRowCount() > 0) {
            reporteVehiculos.setModel(tabla_temporal);
            espaciadoTabla();
        }
    }//GEN-LAST:event_btnMostrarVehiculoActionPerformed

    private void btnEliminarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVehiculoActionPerformed

        if (txtEliminar.getText().length() > 0) {

            int id = Integer.parseInt(txtEliminar.getText());
            VehiculoBD vbd = new VehiculoBD();
            vbd.eliminarVehiculo(id);

            DefaultTableModel tabla_temporal;
            tabla_temporal = vbd.reportarVehiculo();

            if (tabla_temporal.getRowCount() > 0) {
                reporteVehiculos.setModel(tabla_temporal);
                espaciadoTabla();
            }

            JOptionPane op = new JOptionPane("Vehiculo eliminado");
            op.setMessageType(JOptionPane.INFORMATION_MESSAGE);
            txtEliminar.setText("");
        } else {
            JOptionPane op = new JOptionPane("Debe selecionar un vehiculo");
            op.setMessageType(JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarVehiculoActionPerformed

    private void txtBuscarVehiculoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarVehiculoKeyReleased

    }//GEN-LAST:event_txtBuscarVehiculoKeyReleased

    private void reporteVehiculosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reporteVehiculosMouseClicked

        int filaSeleccionada = reporteVehiculos.getSelectedRow();

        txtEliminar.setText(reporteVehiculos.getValueAt(filaSeleccionada, 0).toString());
    }//GEN-LAST:event_reporteVehiculosMouseClicked

    private void btnEditarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarVehiculoActionPerformed

        transportSolutionsModificarVehiculo mv = new transportSolutionsModificarVehiculo();
        panelMantenimiento.add(mv);
        Dimension desktopSize = panelMantenimiento.getSize();
        Dimension FrameSize = mv.getSize();
        mv.setLocation((desktopSize.width - FrameSize.width) / 4, (desktopSize.height - FrameSize.height) / 4);
        mv.setVisible(true);
    }//GEN-LAST:event_btnEditarVehiculoActionPerformed

    private void txtBuscarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarVehiculoActionPerformed

        if (txtBuscarVehiculo.getText().length() > 0) {

            VehiculoBD vbd = new VehiculoBD();

            String buscar = txtBuscarVehiculo.getText().toUpperCase();
            DefaultTableModel tabla_temporal;
            tabla_temporal = vbd.buscarVehiculo(buscar);

            if (tabla_temporal.getRowCount() > 0) {
                reporteVehiculos.setModel(tabla_temporal);
                espaciadoTabla();
            }
        } else {
            JOptionPane op = new JOptionPane("Debe ingresar placa");
            op.setMessageType(JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtBuscarVehiculoActionPerformed

    private void txtEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEliminarActionPerformed

    private void txtEliminarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEliminarKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEliminarKeyReleased

    private void txtBuscarVehiculoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarVehiculoKeyTyped

    }//GEN-LAST:event_txtBuscarVehiculoKeyTyped

    private void btnDescargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescargarActionPerformed

        try {
            rtv = new Reporte();
            rtv.exportarExcel(reporteVehiculos);
        } catch (IOException e) {
        }
    }//GEN-LAST:event_btnDescargarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDescargar;
    public javax.swing.JButton btnEditarVehiculo;
    public javax.swing.JButton btnEliminarVehiculo;
    public javax.swing.JButton btnMostrarVehiculo;
    public javax.swing.JButton btnNuevoVehiculo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JDesktopPane panelMantenimiento;
    public static javax.swing.JTable reporteVehiculos;
    private javax.swing.JTextField txtBuscarVehiculo;
    private javax.swing.JTextField txtEliminar;
    // End of variables declaration//GEN-END:variables
}
