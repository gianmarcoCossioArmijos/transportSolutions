package transportSolutionsPresentacion;

import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transportSolutionsLogica.ChoferBD;
import transportSolutionsLogica.EstadoChoferBD;
import transportSolutionsLogica.EstadoVehiculoBD;
import transportSolutionsLogica.FleteEncomiendaBD;
import transportSolutionsLogica.VehiculoBD;
import transportSolutionsModelo.EstadoChofer;
import transportSolutionsModelo.EstadoVehiculo;
import transportSolutionsModelo.FleteEncomienda;
import transportSolutionsReporte.Reporte;

public class transportSolutionFleteEncomiendaView extends javax.swing.JInternalFrame {

    int filaSeleccionada = 0;
    Reporte rtv;

    public transportSolutionFleteEncomiendaView() {
        initComponents();
        obtenerFecha();
        txtModificar.setEnabled(false);
        txtFechaActual.setEnabled(false);
    }

    void limpiar() {

        txtOrigen.setText("");
        txtDestino.setText("");
        txtModificar.setText("");
        txtDniChofer.setText("");
        txtPlacaVehiculo.setText("");
    }

    public void limpiarTablaCarga() {

        DefaultTableModel temp = (DefaultTableModel) reporteFleteEncomienda.getModel();
        int filas = reporteFleteEncomienda.getRowCount();

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

    private void obtenerFecha() {

        Calendar calendario = Calendar.getInstance();
        int dia = calendario.get(Calendar.DAY_OF_MONTH);
        int mes = calendario.get(Calendar.MONTH) + 1;
        int anio = calendario.get(Calendar.YEAR);
        String fecha = anio + "-" + mes + "-" + dia;
        txtFechaActual.setText(fecha);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAsignarFleteEncomienda = new javax.swing.JButton();
        panelMantenimiento = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        reporteAsignarVehiculoChofer = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        reporteFleteEncomienda = new javax.swing.JTable();
        cmbVehiculoChofer = new javax.swing.JComboBox<>();
        btnBuscarVehiculoChofer = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnModificarFleteEncomienda = new javax.swing.JButton();
        txtModificar = new javax.swing.JTextField();
        txtOrigen = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtDestino = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbEstadoFleteCarga = new javax.swing.JComboBox<>();
        btnBuscarEstadoFleteEncomienda = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        dcFechaSalida = new com.toedter.calendar.JDateChooser();
        btnLiberarFleteEncomienda = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtFechaActual = new javax.swing.JTextField();
        txtPlacaVehiculo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDniChofer = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("FLETE ENCOMIENDA");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/asignar_flete_encomienda.png"))); // NOI18N

        btnAsignarFleteEncomienda.setBackground(new java.awt.Color(204, 204, 255));
        btnAsignarFleteEncomienda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAsignarFleteEncomienda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asignar_fleteEncomienda.png"))); // NOI18N
        btnAsignarFleteEncomienda.setText("Asignar Flete Encomienda");
        btnAsignarFleteEncomienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarFleteEncomiendaActionPerformed(evt);
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

        reporteFleteEncomienda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ORIGEN", "DESTINO", "FECHA SALIDA", "ESTADO", "PLACA", "DNI CHOFER", "CHOFER"
            }
        ));
        reporteFleteEncomienda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reporteFleteEncomiendaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(reporteFleteEncomienda);

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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 805, Short.MAX_VALUE)
            .addGroup(panelMantenimientoLayout.createSequentialGroup()
                .addComponent(cmbVehiculoChofer, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarVehiculoChofer, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane2)
        );
        panelMantenimientoLayout.setVerticalGroup(
            panelMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMantenimientoLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbVehiculoChofer)
                    .addComponent(btnBuscarVehiculoChofer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        btnModificarFleteEncomienda.setBackground(new java.awt.Color(204, 204, 255));
        btnModificarFleteEncomienda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnModificarFleteEncomienda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modificar_flete_encomienda.png"))); // NOI18N
        btnModificarFleteEncomienda.setText("Modificar Flete Encomienda");
        btnModificarFleteEncomienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarFleteEncomiendaActionPerformed(evt);
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

        txtOrigen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtOrigenKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Origen");

        txtDestino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDestinoKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Destino");

        cmbEstadoFleteCarga.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "ASIGNADO", "PENDIENTE" }));

        btnBuscarEstadoFleteEncomienda.setBackground(new java.awt.Color(204, 255, 0));
        btnBuscarEstadoFleteEncomienda.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarEstadoFleteEncomienda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buscar.png"))); // NOI18N
        btnBuscarEstadoFleteEncomienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEstadoFleteEncomiendaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Fecha Salida");

        dcFechaSalida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dcFechaSalidaKeyPressed(evt);
            }
        });

        btnLiberarFleteEncomienda.setBackground(new java.awt.Color(204, 204, 255));
        btnLiberarFleteEncomienda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLiberarFleteEncomienda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/liberar_flete_encomienda.png"))); // NOI18N
        btnLiberarFleteEncomienda.setText("Liberar Flete Encomienda");
        btnLiberarFleteEncomienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLiberarFleteEncomiendaActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 255, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/download.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtPlacaVehiculo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPlacaVehiculoKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Placa Vehiculo");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("DNI Chofer");

        txtDniChofer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniChoferKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPlacaVehiculo)
                            .addComponent(dcFechaSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDestino)
                            .addComponent(txtOrigen)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtDniChofer)
                            .addComponent(btnLiberarFleteEncomienda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnModificarFleteEncomienda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAsignarFleteEncomienda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtModificar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbEstadoFleteCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarEstadoFleteEncomienda, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtFechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cmbEstadoFleteCarga)
                                .addComponent(btnBuscarEstadoFleteEncomienda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtFechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelMantenimiento)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAsignarFleteEncomienda, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dcFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPlacaVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDniChofer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnModificarFleteEncomienda, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLiberarFleteEncomienda, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalir)
                        .addGap(15, 15, 15))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAsignarFleteEncomiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarFleteEncomiendaActionPerformed

        if (txtOrigen.getText().length() > 0) {
            if (txtDestino.getText().length() > 0) {
                if (dcFechaSalida.getDate().toString().length() > 0) {

                    FleteEncomienda fe = new FleteEncomienda();
                    FleteEncomiendaBD febd = new FleteEncomiendaBD();

                    fe.setEstado("ASIGNADO");
                    fe.setDestino(txtDestino.getText());
                    fe.setOrigen(txtOrigen.getText());

                    int dia = dcFechaSalida.getCalendar().get(Calendar.DAY_OF_MONTH);
                    int mes = dcFechaSalida.getCalendar().get(Calendar.MONTH) + 1;
                    int año = dcFechaSalida.getCalendar().get(Calendar.YEAR);
                    String fecha = año + "-" + mes + "-" + dia;
                    fe.setFechaSalida(fecha);

                    ChoferBD cbd = new ChoferBD();
                    String idChofer = cbd.buscarIdChofer(txtDniChofer.getText().toUpperCase());
                    fe.setIdChofer(Integer.parseInt(idChofer));

                    VehiculoBD vbd = new VehiculoBD();
                    String idVehiculo = vbd.buscarIdVehiculo(txtPlacaVehiculo.getText().toUpperCase());
                    fe.setIdVehiculo(Integer.parseInt(idVehiculo));
                    febd.registrarFleteEncomienda(fe);

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

                    limpiarTablaCarga();
                    limpiar();
                } else {
                    JOptionPane op = new JOptionPane("Debe seleccionar fecha de salida");
                    op.setMessageType(JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane op = new JOptionPane("Debe ingresar el destino");
                op.setMessageType(JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane op = new JOptionPane("Debe ingresar el origen");
            op.setMessageType(JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAsignarFleteEncomiendaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnModificarFleteEncomiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarFleteEncomiendaActionPerformed

        if (txtOrigen.getText().length() > 0) {
            if (txtDestino.getText().length() > 0) {
                if (dcFechaSalida.getDate().toString().length() > 0) {
                    if (txtModificar.getText().length() > 0) {

                        FleteEncomienda fe = new FleteEncomienda();
                        FleteEncomiendaBD febd = new FleteEncomiendaBD();
                        int idFlete = (Integer.parseInt(txtModificar.getText()));
                        DefaultTableModel modelo = (DefaultTableModel) reporteFleteEncomienda.getModel();

                        if (modelo.getValueAt(filaSeleccionada, 4).toString().equals("ASIGNADO")) {

                            if (txtOrigen.getText().length() > 0) {
                                fe.setOrigen(txtOrigen.getText());
                            } else {
                                fe.setOrigen(modelo.getValueAt(filaSeleccionada, 1).toString());
                            }

                            if (txtDestino.getText().length() > 0) {
                                fe.setDestino(txtDestino.getText());
                            } else {
                                fe.setDestino(modelo.getValueAt(filaSeleccionada, 2).toString());
                            }

                            if (dcFechaSalida.getDate().toString().length() > 0) {

                                int dia = dcFechaSalida.getCalendar().get(Calendar.DAY_OF_MONTH);
                                int mes = dcFechaSalida.getCalendar().get(Calendar.MONTH) + 1;
                                int año = dcFechaSalida.getCalendar().get(Calendar.YEAR);
                                String fecha = año + "-" + mes + "-" + dia;
                                fe.setFechaSalida(fecha);
                            } else {
                                fe.setFechaSalida(modelo.getValueAt(filaSeleccionada, 3).toString());
                            }

                            fe.setEstado(modelo.getValueAt(filaSeleccionada, 4).toString());
                            ChoferBD cbd = new ChoferBD();
                            VehiculoBD vbd = new VehiculoBD();

                            if (txtDniChofer.getText().length() > 0) {
                                String idChofer = cbd.buscarIdChofer(txtDestino.getText());
                                fe.setIdChofer(Integer.parseInt(idChofer));
                            } else {
                                String idChofer = cbd.buscarIdChofer(modelo.getValueAt(filaSeleccionada, 6).toString());
                                fe.setIdChofer(Integer.parseInt(idChofer));
                            }

                            if (txtPlacaVehiculo.getText().length() > 0) {
                                String idVehiculo = vbd.buscarIdVehiculo(txtDestino.getText());
                                fe.setIdVehiculo(Integer.parseInt(idVehiculo));
                            } else {
                                String idVehiculo = vbd.buscarIdVehiculo(modelo.getValueAt(filaSeleccionada, 5).toString());
                                fe.setIdVehiculo(Integer.parseInt(idVehiculo));
                            }

                            febd.modificarFleteEncomienda(fe, idFlete);
                            limpiarTablaCarga();
                            limpiar();
                        } else {
                            JOptionPane op = new JOptionPane("No se puede modificar un flete liberado");
                            op.setMessageType(JOptionPane.WARNING_MESSAGE);
                        }
                    } else {
                        JOptionPane op = new JOptionPane("Debe seleccionar un flete de carga para modificar");
                        op.setMessageType(JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    JOptionPane op = new JOptionPane("Debe seleccionar fecha de salida");
                    op.setMessageType(JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane op = new JOptionPane("Debe ingresar el destino");
                op.setMessageType(JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane op = new JOptionPane("Debe ingresar el origen");
            op.setMessageType(JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnModificarFleteEncomiendaActionPerformed

    private void txtModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModificarActionPerformed

    private void txtModificarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModificarKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModificarKeyReleased

    private void btnBuscarEstadoFleteEncomiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEstadoFleteEncomiendaActionPerformed

        if (cmbEstadoFleteCarga.getSelectedItem().toString().length() > 0) {

            if (cmbEstadoFleteCarga.getSelectedItem().toString().equals("LIBERADO")) {

                FleteEncomiendaBD febd = new FleteEncomiendaBD();
                DefaultTableModel tabla_temporal;
                tabla_temporal = febd.reportarFleteEncomiendaLiberado();

                if (tabla_temporal.getRowCount() > 0) {

                    reporteFleteEncomienda.setModel(tabla_temporal);
                    espaciadoTablaFlete();
                    limpiar();
                } else {

                    limpiarTablaCarga();
                    limpiar();
                }
            } else if (cmbEstadoFleteCarga.getSelectedItem().toString().equals("ASIGNADO")) {

                FleteEncomiendaBD febd = new FleteEncomiendaBD();
                DefaultTableModel tabla_temporal;
                tabla_temporal = febd.reportarFleteEncomiendaAsignado();

                if (tabla_temporal.getRowCount() > 0) {

                    reporteFleteEncomienda.setModel(tabla_temporal);
                    espaciadoTablaFlete();
                    limpiar();
                } else {

                    limpiarTablaCarga();
                    limpiar();
                }
            }
        } else {
            JOptionPane op = new JOptionPane("Debe seleccionar estado de flete");
            op.setMessageType(JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnBuscarEstadoFleteEncomiendaActionPerformed

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

    private void reporteFleteEncomiendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reporteFleteEncomiendaMouseClicked

        filaSeleccionada = reporteFleteEncomienda.getSelectedRow();
        txtModificar.setText(reporteFleteEncomienda.getValueAt(filaSeleccionada, 0).toString());
    }//GEN-LAST:event_reporteFleteEncomiendaMouseClicked

    private void reporteAsignarVehiculoChoferMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reporteAsignarVehiculoChoferMouseClicked

    }//GEN-LAST:event_reporteAsignarVehiculoChoferMouseClicked

    private void btnLiberarFleteEncomiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLiberarFleteEncomiendaActionPerformed

        if (txtModificar.getText().length() > 0) {

            FleteEncomienda fe = new FleteEncomienda();
            FleteEncomiendaBD febd = new FleteEncomiendaBD();
            int idFlete = (Integer.parseInt(txtModificar.getText()));
            DefaultTableModel modelo = (DefaultTableModel) reporteFleteEncomienda.getModel();

            if (modelo.getValueAt(filaSeleccionada, 4).toString().equals("ASIGNADO")) {

                fe.setOrigen(modelo.getValueAt(filaSeleccionada, 1).toString());
                fe.setDestino(modelo.getValueAt(filaSeleccionada, 2).toString());
                fe.setFechaSalida(modelo.getValueAt(filaSeleccionada, 3).toString());
                fe.setFechaArribo(txtFechaActual.getText());
                fe.setEstado("LIBERADO");

                ChoferBD cbd = new ChoferBD();
                String idChofer = cbd.buscarIdChofer(modelo.getValueAt(filaSeleccionada, 6).toString());
                fe.setIdChofer(Integer.parseInt(idChofer));

                VehiculoBD vbd = new VehiculoBD();
                String idVehiculo = vbd.buscarIdVehiculo(modelo.getValueAt(filaSeleccionada, 5).toString());
                fe.setIdVehiculo(Integer.parseInt(idVehiculo));
                febd.liberarFleteEncomienda(fe, idFlete);

                EstadoVehiculoBD evbd = new EstadoVehiculoBD();
                EstadoVehiculo ev = new EstadoVehiculo();
                int idv = Integer.parseInt(idVehiculo);
                String idEstadoVehiculo = evbd.buscareIdEstadoVehiculo(idv);
                int idev = Integer.parseInt(idEstadoVehiculo);
                ev.setEstado("PENDIENTE");
                ev.setIdVehiculo(idv);
                evbd.modificarEstadoVehiculo(ev, idev);

                EstadoChoferBD ecbd = new EstadoChoferBD();
                EstadoChofer ec = new EstadoChofer();
                int idc = Integer.parseInt(idChofer);
                String idEstadoChofer = ecbd.buscareIdEstadoChofer(idc);
                int idec = Integer.parseInt(idEstadoChofer);
                ec.setEstado("PENDIENTE");
                ec.setIdChofer(idc);
                ecbd.modificarEstadoChofer(ec, idec);

                limpiarTablaCarga();
                limpiar();
            } else {
                JOptionPane op = new JOptionPane("No se puede liberar un flete liberado");
                op.setMessageType(JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane op = new JOptionPane("Debe seleccionar un flete de carga para liberar");
            op.setMessageType(JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnLiberarFleteEncomiendaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            rtv = new Reporte();
            rtv.exportarExcel(reporteFleteEncomienda);
        } catch (IOException e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtOrigenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOrigenKeyPressed

        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            txtDestino.requestFocus();
        }
    }//GEN-LAST:event_txtOrigenKeyPressed

    private void txtDestinoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDestinoKeyPressed

        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            dcFechaSalida.requestFocus();
        }
    }//GEN-LAST:event_txtDestinoKeyPressed

    private void dcFechaSalidaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dcFechaSalidaKeyPressed

        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            txtPlacaVehiculo.requestFocus();
        }
    }//GEN-LAST:event_dcFechaSalidaKeyPressed

    private void txtPlacaVehiculoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlacaVehiculoKeyPressed

        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            txtDniChofer.requestFocus();
        }
    }//GEN-LAST:event_txtPlacaVehiculoKeyPressed

    private void txtDniChoferKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniChoferKeyTyped

        char caracter = evt.getKeyChar();
        if (Character.isLetter(caracter) && caracter != KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDniChoferKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAsignarFleteEncomienda;
    private javax.swing.JButton btnBuscarEstadoFleteEncomienda;
    private javax.swing.JButton btnBuscarVehiculoChofer;
    public javax.swing.JButton btnLiberarFleteEncomienda;
    public javax.swing.JButton btnModificarFleteEncomienda;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbEstadoFleteCarga;
    private javax.swing.JComboBox<String> cmbVehiculoChofer;
    private com.toedter.calendar.JDateChooser dcFechaSalida;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JDesktopPane panelMantenimiento;
    public static javax.swing.JTable reporteAsignarVehiculoChofer;
    public static javax.swing.JTable reporteFleteEncomienda;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtDniChofer;
    private javax.swing.JTextField txtFechaActual;
    private javax.swing.JTextField txtModificar;
    private javax.swing.JTextField txtOrigen;
    private javax.swing.JTextField txtPlacaVehiculo;
    // End of variables declaration//GEN-END:variables
}
