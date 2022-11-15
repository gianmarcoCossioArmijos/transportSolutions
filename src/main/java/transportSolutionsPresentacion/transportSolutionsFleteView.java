package transportSolutionsPresentacion;

import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transportSolutionsLogica.ChoferBD;
import transportSolutionsLogica.EstadoChoferBD;
import transportSolutionsLogica.EstadoVehiculoBD;
import transportSolutionsLogica.FleteBD;
import transportSolutionsLogica.VehiculoBD;
import transportSolutionsModelo.EstadoChofer;
import transportSolutionsModelo.EstadoVehiculo;
import transportSolutionsModelo.Flete;
import transportSolutionsReporte.Reporte;

public class transportSolutionsFleteView extends javax.swing.JInternalFrame {

    int filaSeleccionada = 0;
    Reporte rtv;

    public transportSolutionsFleteView() {
        initComponents();
        txtModificar.setEnabled(false);
    }

    void limpiar() {

        txtDniChofer.setText("");
        txtPlacaVehiculo.setText("");
        txtModificar.setText("");
    }

    public void limpiarTablaFlete() {

        DefaultTableModel temp = (DefaultTableModel) reporteAsignarFlete.getModel();
        int filas = reporteAsignarFlete.getRowCount();

        for (int i = 0; filas > i; i++) {
            temp.removeRow(0);
        }
    }

    public void limpiarTablaVehiculoChofer() {

        DefaultTableModel temp = (DefaultTableModel) reporteAsignarVehiculoChofer.getModel();
        int filas = reporteAsignarVehiculoChofer.getRowCount();

        for (int i = 0; filas > i; i++) {
            temp.removeRow(0);
        }
    }

    void espaciadoTablaFlete() {
        reporteAsignarVehiculoChofer.getColumnModel().getColumn(0).setPreferredWidth(20);
        reporteAsignarVehiculoChofer.getColumnModel().getColumn(5).setPreferredWidth(150);
    }

    void espaciadoTablaVehiculoChofer() {
        reporteAsignarVehiculoChofer.getColumnModel().getColumn(0).setPreferredWidth(20);
        reporteAsignarVehiculoChofer.getColumnModel().getColumn(1).setPreferredWidth(60);
        reporteAsignarVehiculoChofer.getColumnModel().getColumn(2).setPreferredWidth(60);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAsignarFlete = new javax.swing.JButton();
        panelMantenimiento = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        reporteAsignarVehiculoChofer = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        reporteAsignarFlete = new javax.swing.JTable();
        cmbVehiculoChofer = new javax.swing.JComboBox<>();
        btnBuscarVehiculoChofer = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnLiberarFlete = new javax.swing.JButton();
        txtModificar = new javax.swing.JTextField();
        txtDniChofer = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtPlacaVehiculo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbEstadoFlete = new javax.swing.JComboBox<>();
        btnBuscarEstadoFlete = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("FLETE");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/asignar_flete.png"))); // NOI18N

        btnAsignarFlete.setBackground(new java.awt.Color(204, 204, 255));
        btnAsignarFlete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAsignarFlete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asignarFlete.png"))); // NOI18N
        btnAsignarFlete.setText("Asignar Flete");
        btnAsignarFlete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarFleteActionPerformed(evt);
            }
        });

        reporteAsignarVehiculoChofer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "-", "-", "-", "-", "-"
            }
        ));
        reporteAsignarVehiculoChofer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reporteAsignarVehiculoChoferMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(reporteAsignarVehiculoChofer);

        reporteAsignarFlete.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "FECHA VENTA", "ORIGEN", "DESTINO", "DOCUMENTO", "CLIENTE", "DESCRIPCION", "ESTADO", "CORRELATIVO"
            }
        ));
        reporteAsignarFlete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reporteAsignarFleteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(reporteAsignarFlete);

        cmbVehiculoChofer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "VEHICULO", "CHOFER" }));

        btnBuscarVehiculoChofer.setBackground(new java.awt.Color(204, 255, 0));
        btnBuscarVehiculoChofer.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarVehiculoChofer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buscar.png"))); // NOI18N
        btnBuscarVehiculoChofer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVehiculoChoferActionPerformed(evt);
            }
        });

        panelMantenimiento.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelMantenimiento.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelMantenimiento.setLayer(cmbVehiculoChofer, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelMantenimiento.setLayer(btnBuscarVehiculoChofer, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelMantenimientoLayout = new javax.swing.GroupLayout(panelMantenimiento);
        panelMantenimiento.setLayout(panelMantenimientoLayout);
        panelMantenimientoLayout.setHorizontalGroup(
            panelMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 839, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 839, Short.MAX_VALUE)
            .addGroup(panelMantenimientoLayout.createSequentialGroup()
                .addComponent(cmbVehiculoChofer, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarVehiculoChofer, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelMantenimientoLayout.setVerticalGroup(
            panelMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMantenimientoLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbVehiculoChofer)
                    .addComponent(btnBuscarVehiculoChofer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
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

        btnLiberarFlete.setBackground(new java.awt.Color(204, 204, 255));
        btnLiberarFlete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLiberarFlete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/liberar_flete.png"))); // NOI18N
        btnLiberarFlete.setText("Liberar Flete");
        btnLiberarFlete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLiberarFleteActionPerformed(evt);
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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("DNI Chofer");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Placa Vehiculo");

        cmbEstadoFlete.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "ASIGNADO", "PENDIENTE", "LIBERADO" }));

        btnBuscarEstadoFlete.setBackground(new java.awt.Color(204, 255, 0));
        btnBuscarEstadoFlete.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarEstadoFlete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buscar.png"))); // NOI18N
        btnBuscarEstadoFlete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEstadoFleteActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnLiberarFlete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDniChofer, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPlacaVehiculo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtModificar, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAsignarFlete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                        .addGap(12, 12, 12)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbEstadoFlete, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarEstadoFlete, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbEstadoFlete)
                            .addComponent(btnBuscarEstadoFlete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAsignarFlete, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDniChofer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPlacaVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLiberarFlete, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir)
                        .addGap(15, 15, 15))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAsignarFleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarFleteActionPerformed

        if (txtDniChofer.getText().length() > 0) {
            if (txtPlacaVehiculo.getText().length() > 0) {
                if (txtModificar.getText().length() > 0) {

                    Flete f = new Flete();
                    FleteBD fbd = new FleteBD();
                    int idFlete = (Integer.parseInt(txtModificar.getText()));
                    DefaultTableModel modelo = (DefaultTableModel) reporteAsignarFlete.getModel();

                    f.setFechaVenta(modelo.getValueAt(filaSeleccionada, 1).toString());
                    f.setOrigen(modelo.getValueAt(filaSeleccionada, 2).toString());
                    f.setDestino(modelo.getValueAt(filaSeleccionada, 3).toString());
                    f.setDocumentoCliente(modelo.getValueAt(filaSeleccionada, 4).toString());
                    f.setCliente(modelo.getValueAt(filaSeleccionada, 5).toString());
                    f.setDescripcion(modelo.getValueAt(filaSeleccionada, 6).toString());
                    f.setCorrelativo(modelo.getValueAt(filaSeleccionada, 8).toString());
                    f.setEstado("ASIGNADO");

                    ChoferBD cbd = new ChoferBD();
                    String idChofer = cbd.buscarIdChofer(txtDniChofer.getText().toUpperCase());
                    f.setIdChofer(Integer.parseInt(idChofer));

                    VehiculoBD vbd = new VehiculoBD();
                    String idVehiculo = vbd.buscarIdVehiculo(txtPlacaVehiculo.getText().toUpperCase());
                    f.setIdVehiculo(Integer.parseInt(idVehiculo));
                    fbd.modificarFlete(f, idFlete);

                    EstadoVehiculoBD evbd = new EstadoVehiculoBD();
                    EstadoVehiculo ev = new EstadoVehiculo();
                    int idv = Integer.parseInt(idVehiculo);
                    String idEstadoVehiculo = evbd.buscareIdEstadoVehiculo(idv);
                    int idev = Integer.parseInt(idEstadoVehiculo);
                    ev.setEstado("ASIGNADO");
                    ev.setIdVehiculo(idv);
                    evbd.modificarEstadoVehiculo(ev, idev);

                    EstadoChoferBD ecbd = new EstadoChoferBD();
                    EstadoChofer ec = new EstadoChofer();
                    int idc = Integer.parseInt(idChofer);
                    String idEstadoChofer = ecbd.buscareIdEstadoChofer(idc);
                    int idec = Integer.parseInt(idEstadoChofer);
                    ec.setEstado("ASIGNADO");
                    ec.setIdChofer(idc);
                    ecbd.modificarEstadoChofer(ec, idec);

                    limpiarTablaFlete();
                    limpiar();
                } else {
                    JOptionPane op = new JOptionPane("Debe seleccionar flete que desea asignar");
                    op.setMessageType(JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane op = new JOptionPane("Debe ingresar placa del vehiculo que desea asignar");
                op.setMessageType(JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane op = new JOptionPane("Debe ingresar DNI del chofer que desea asignar");
            op.setMessageType(JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAsignarFleteActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnLiberarFleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLiberarFleteActionPerformed

        if (txtDniChofer.getText().length() > 0) {
            if (txtPlacaVehiculo.getText().length() > 0) {
                if (txtModificar.getText().length() > 0) {

                    Flete f = new Flete();
                    FleteBD fbd = new FleteBD();
                    int idFlete = Integer.parseInt(txtModificar.getText());
                    DefaultTableModel modelo = (DefaultTableModel) reporteAsignarFlete.getModel();

                    f.setFechaVenta(modelo.getValueAt(filaSeleccionada, 1).toString());
                    f.setOrigen(modelo.getValueAt(filaSeleccionada, 2).toString());
                    f.setDestino(modelo.getValueAt(filaSeleccionada, 3).toString());
                    f.setDocumentoCliente(modelo.getValueAt(filaSeleccionada, 4).toString());
                    f.setCliente(modelo.getValueAt(filaSeleccionada, 5).toString());
                    f.setDescripcion(modelo.getValueAt(filaSeleccionada, 6).toString());
                    f.setCorrelativo(modelo.getValueAt(filaSeleccionada, 8).toString());
                    f.setEstado("LIBERADO");

                    ChoferBD cbd = new ChoferBD();
                    String idChofer = cbd.buscarIdChofer(modelo.getValueAt(filaSeleccionada, 10).toString());
                    f.setIdChofer(Integer.parseInt(idChofer));

                    VehiculoBD vbd = new VehiculoBD();
                    String idVehiculo = vbd.buscarIdVehiculo(modelo.getValueAt(filaSeleccionada, 9).toString());
                    f.setIdVehiculo(Integer.parseInt(idVehiculo));
                    fbd.modificarFlete(f, idFlete);

                    EstadoVehiculoBD evbd = new EstadoVehiculoBD();
                    EstadoVehiculo ev = new EstadoVehiculo();
                    int idv = Integer.parseInt(idVehiculo);
                    ev.setEstado("PENDIENTE");
                    ev.setIdVehiculo(idv);
                    evbd.modificarEstadoVehiculo(ev, idv);

                    EstadoChoferBD ecbd = new EstadoChoferBD();
                    EstadoChofer ec = new EstadoChofer();
                    int idc = Integer.parseInt(idChofer);
                    ec.setEstado("PENDIENTE");
                    ec.setIdChofer(idc);
                    ecbd.modificarEstadoChofer(ec, idc);

                    limpiarTablaFlete();
                    limpiar();
                } else {
                    JOptionPane op = new JOptionPane("Debe seleccionar flete que desea asignar");
                    op.setMessageType(JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane op = new JOptionPane("Debe ingresar placa del vehiculo que desea asignar");
                op.setMessageType(JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane op = new JOptionPane("Debe ingresar DNI del chofer que desea asignar");
            op.setMessageType(JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnLiberarFleteActionPerformed

    private void txtModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModificarActionPerformed

    private void txtModificarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModificarKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModificarKeyReleased

    private void btnBuscarEstadoFleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEstadoFleteActionPerformed

        if (cmbEstadoFlete.getSelectedItem().toString().length() > 0) {

            if (cmbEstadoFlete.getSelectedItem().toString().equals("PENDIENTE")) {

                FleteBD fbd = new FleteBD();
                DefaultTableModel tabla_temporal;
                tabla_temporal = fbd.reportarFletePendiente();

                if (tabla_temporal.getRowCount() > 0) {

                    reporteAsignarFlete.setModel(tabla_temporal);
                    espaciadoTablaFlete();
                    limpiar();
                } else {

                    limpiarTablaFlete();
                    limpiar();
                }
            } else if (cmbEstadoFlete.getSelectedItem().toString().equals("ASIGNADO")) {

                FleteBD fbd = new FleteBD();
                DefaultTableModel tabla_temporal;
                tabla_temporal = fbd.reportarFleteAsignado();

                if (tabla_temporal.getRowCount() > 0) {

                    reporteAsignarFlete.setModel(tabla_temporal);
                    espaciadoTablaFlete();
                    limpiar();
                } else {

                    limpiarTablaFlete();
                    limpiar();
                }
            } else if (cmbEstadoFlete.getSelectedItem().toString().equals("LIBERADO")) {
                
                FleteBD fbd = new FleteBD();
                DefaultTableModel tabla_temporal;
                tabla_temporal = fbd.reportarFleteLiberado();

                if (tabla_temporal.getRowCount() > 0) {

                    reporteAsignarFlete.setModel(tabla_temporal);
                    espaciadoTablaFlete();
                    limpiar();
                } else {

                    limpiarTablaFlete();
                    limpiar();
                }
            }
        } else {
            JOptionPane op = new JOptionPane("Debe seleccionar estado de flete");
            op.setMessageType(JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnBuscarEstadoFleteActionPerformed

    private void btnBuscarVehiculoChoferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVehiculoChoferActionPerformed

        if (cmbVehiculoChofer.getSelectedItem().toString().length() > 0) {

            if (cmbVehiculoChofer.getSelectedItem().toString().equals("VEHICULO")) {

                EstadoVehiculoBD avbd = new EstadoVehiculoBD();
                DefaultTableModel tabla_temporal_vehiculo;
                tabla_temporal_vehiculo = avbd.reportarEstadoVehiculoPendiente();

                if (tabla_temporal_vehiculo.getRowCount() > 0) {

                    reporteAsignarVehiculoChofer.setModel(tabla_temporal_vehiculo);
                    espaciadoTablaVehiculoChofer();
                } else {
                    limpiarTablaVehiculoChofer();
                }
            } else if (cmbVehiculoChofer.getSelectedItem().toString().equals("CHOFER")) {

                EstadoChoferBD ecbd = new EstadoChoferBD();
                DefaultTableModel tabla_temporal;
                tabla_temporal = ecbd.reportarEstadoChoferPendiente();

                if (tabla_temporal.getRowCount() > 0) {

                    reporteAsignarVehiculoChofer.setModel(tabla_temporal);
                    espaciadoTablaVehiculoChofer();
                } else {
                    limpiarTablaVehiculoChofer();
                }
            }
        } else {
            JOptionPane op = new JOptionPane("Debe seleccionar si desea ver choferes o vehiculos disponibles");
            op.setMessageType(JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarVehiculoChoferActionPerformed

    private void reporteAsignarFleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reporteAsignarFleteMouseClicked

        filaSeleccionada = reporteAsignarFlete.getSelectedRow();
        txtModificar.setText(reporteAsignarFlete.getValueAt(filaSeleccionada, 0).toString());
    }//GEN-LAST:event_reporteAsignarFleteMouseClicked

    private void reporteAsignarVehiculoChoferMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reporteAsignarVehiculoChoferMouseClicked

    }//GEN-LAST:event_reporteAsignarVehiculoChoferMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAsignarFlete;
    private javax.swing.JButton btnBuscarEstadoFlete;
    private javax.swing.JButton btnBuscarVehiculoChofer;
    public javax.swing.JButton btnLiberarFlete;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbEstadoFlete;
    private javax.swing.JComboBox<String> cmbVehiculoChofer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JDesktopPane panelMantenimiento;
    public static javax.swing.JTable reporteAsignarFlete;
    public static javax.swing.JTable reporteAsignarVehiculoChofer;
    private javax.swing.JTextField txtDniChofer;
    private javax.swing.JTextField txtModificar;
    private javax.swing.JTextField txtPlacaVehiculo;
    // End of variables declaration//GEN-END:variables
}
