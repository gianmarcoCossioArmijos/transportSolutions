package transportSolutionsPresentacion;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transportSolutionsLogica.CajaBD;
import transportSolutionsLogica.EstadoCajaBD;
import transportSolutionsLogica.TurnoBD;
import transportSolutionsLogica.UsuarioBD;
import transportSolutionsModelo.Caja;
import transportSolutionsModelo.EstadoCaja;
import transportSolutionsModelo.Turno;
import transportSolutionsReporte.Reporte;

public class transportSolutionsSesionCajaView extends javax.swing.JInternalFrame {

    public int caja;
    public int id;
    public String estado;
    public double monto;
    public String fecha;
    public String turno;
    public static int idSesion;
    public static int idCaja;
    public static int idTurno;
    public static double monto_apertura;
    List<Caja> lista_caja;
    List<Turno> lista_turno;
    Reporte rtv;

    public transportSolutionsSesionCajaView() {
        initComponents();
        cargarCaja();
        cargarTurno();
        obtenerFecha();
    }

    private void obtenerFecha() {

        Calendar calendario = Calendar.getInstance();
        int dia = calendario.get(Calendar.DAY_OF_MONTH);
        int mes = calendario.get(Calendar.MONTH) + 1;
        int anio = calendario.get(Calendar.YEAR);
        String f = anio + "-" + mes + "-" + dia;
        fecha = f;
    }

    private void cargarCaja() {

        try {
            cmbCaja.removeAllItems();
            CajaBD cbd = new CajaBD();
            DefaultTableModel tabla_temporal;
            tabla_temporal = cbd.reportarCaja();
            lista_caja = new ArrayList<>();
            for (int i = 0; i < tabla_temporal.getRowCount(); i++) {

                String descripcion = String.valueOf(tabla_temporal.getValueAt(i, 1).toString());
                lista_caja.add(new Caja(descripcion));
                cmbCaja.addItem(descripcion);
            }
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Problemas al cargar caja");
            op.setMessageType(JOptionPane.WARNING_MESSAGE);
        }
    }

    private void cargarTurno() {

        try {
            cmbTurno.removeAllItems();
            TurnoBD tbd = new TurnoBD();
            DefaultTableModel tabla_temporal;
            tabla_temporal = tbd.reportarTurno();
            lista_turno = new ArrayList<>();
            for (int i = 0; i < tabla_temporal.getRowCount(); i++) {

                String descripcion = String.valueOf(tabla_temporal.getValueAt(i, 1).toString());
                lista_turno.add(new Turno(descripcion));
                cmbTurno.addItem(descripcion);
            }
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Problemas al cargar caja");
            op.setMessageType(JOptionPane.WARNING_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAperturar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        panelMantenimiento = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        reporteCierreCaja = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        cmbCaja = new javax.swing.JComboBox<>();
        btnMostrarSesiones = new javax.swing.JButton();
        btnUsarSesion = new javax.swing.JButton();
        txtMonto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cmbTurno = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("SESION CAJA");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/cierre_caja.png"))); // NOI18N

        btnAperturar.setBackground(new java.awt.Color(204, 204, 255));
        btnAperturar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAperturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aperturar_caja.png"))); // NOI18N
        btnAperturar.setText("Aperturar");
        btnAperturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAperturarActionPerformed(evt);
            }
        });

        btnCerrar.setBackground(new java.awt.Color(204, 204, 255));
        btnCerrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cerrar_caja.png"))); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        reporteCierreCaja.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FECHA", "CAJA", "TURNO", "USUARIO", "MONTO APERTURA", "MONTO CIERRE", "TOTAL"
            }
        ));
        reporteCierreCaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reporteCierreCajaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                reporteCierreCajaMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(reporteCierreCaja);

        panelMantenimiento.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelMantenimientoLayout = new javax.swing.GroupLayout(panelMantenimiento);
        panelMantenimiento.setLayout(panelMantenimientoLayout);
        panelMantenimientoLayout.setHorizontalGroup(
            panelMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 879, Short.MAX_VALUE)
        );
        panelMantenimientoLayout.setVerticalGroup(
            panelMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
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

        cmbCaja.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR" }));

        btnMostrarSesiones.setBackground(new java.awt.Color(204, 204, 255));
        btnMostrarSesiones.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMostrarSesiones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mostrar_sesion_caja.png"))); // NOI18N
        btnMostrarSesiones.setText("Mostrar sesiones");
        btnMostrarSesiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarSesionesActionPerformed(evt);
            }
        });

        btnUsarSesion.setBackground(new java.awt.Color(204, 204, 255));
        btnUsarSesion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUsarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cierre_caja.png"))); // NOI18N
        btnUsarSesion.setText("Usar Sesion");
        btnUsarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsarSesionActionPerformed(evt);
            }
        });

        txtMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Monto Caja Chica");

        cmbTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "DIA", "TARDE" }));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Caja");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Turno");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(141, 141, 141))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAperturar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMostrarSesiones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUsarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMonto)
                            .addComponent(cmbCaja, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbTurno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(panelMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(btnAperturar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMostrarSesiones, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUsarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAperturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAperturarActionPerformed

        if (!"SELECCIONAR".equals(cmbCaja.getSelectedItem().toString())) {
            if (!"SELECCIONAR".equals(cmbTurno.getSelectedItem().toString())) {
                if (!"SELECCIONAR".equals(txtMonto.getText())) {

                    EstadoCajaBD ecbd = new EstadoCajaBD();
                    EstadoCaja ec = new EstadoCaja();

                    ec.setEstado("APERTURADO");
                    ec.setFecha(fecha);
                    double monto = Double.parseDouble(txtMonto.getText());
                    ec.setMontoApertura(monto);

                    UsuarioBD ubd = new UsuarioBD();
                    String dni = ubd.buscarUsuarioDni(transportSolutionsLogin.dni_publico);
                    ec.setIdUsuario(Integer.parseInt(dni));

                    CajaBD cbd = new CajaBD();
                    String id_caja = cbd.buscarIdCaja(cmbCaja.getSelectedItem().toString());
                    ec.setIdCaja(Integer.parseInt(id_caja));

                    TurnoBD tbd = new TurnoBD();
                    String id_turno = tbd.buscarIdTurno(cmbTurno.getSelectedItem().toString());
                    ec.setIdTurno(Integer.parseInt(id_turno));

                    int idAperutra = ecbd.registrarAperturaCaja(ec);
                    monto_apertura = monto;
                    idCaja = Integer.parseInt(id_caja);
                    idTurno = Integer.parseInt(id_turno);
                    idSesion = idAperutra;

                } else {
                    JOptionPane op = new JOptionPane("Debe ingresar el monto de caja chica para aperturar");
                    op.setMessageType(JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane op = new JOptionPane("Debe seleccionar un turno para aperturar");
                op.setMessageType(JOptionPane.ERROR_MESSAGE);
            }
            JOptionPane op = new JOptionPane("Debe seleccionar una caja para aperturar");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAperturarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed

        if (txtMonto.getText().length() > 0) {
            if (idCaja > 0) {
                if (idTurno > 0) {

                    EstadoCaja ec = new EstadoCaja();
                    EstadoCajaBD ecbd = new EstadoCajaBD();

                    ec.setEstado("CERRADO");
                    ec.setFecha(fecha);
                    ec.setIdCaja(idCaja);
                    ec.setIdTurno(idTurno);
                    ec.setMontoApertura(monto_apertura);
                    double monto_cierre = Double.parseDouble(txtMonto.getText());
                    ec.setMontoCierre(monto_cierre);

                    UsuarioBD ubd = new UsuarioBD();
                    String idUsuario = ubd.buscarUsuarioDni(transportSolutionsLogin.dni_publico);
                    ec.setIdUsuario(Integer.parseInt(idUsuario));

                    ecbd.registrarCierreCaja(ec, idSesion);

//                    DefaultTableModel tabla_temporal = (DefaultTableModel) reporteCierreCaja.getModel();
//                    tabla_temporal = ecbd.reportarCierreCaja(idCaja, fecha, monto_apertura, monto_cierre);
//                    reporteCierreCaja.setModel(tabla_temporal);
//
//                    try {
//                        rtv = new Reporte();
//                        rtv.exportarExcel(reporteCierreCaja);
//                    } catch (IOException e) {
//                        JOptionPane op = new JOptionPane("Error al exportar excel");
//                        op.setMessageType(JOptionPane.ERROR_MESSAGE);
//                    }
                } else {
                    JOptionPane op = new JOptionPane("Es necesario ID de turno");
                    op.setMessageType(JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane op = new JOptionPane("Es necesario ID de caja");
                op.setMessageType(JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane op = new JOptionPane("Debe ingresar el monto de caja chica para cerrar");
            op.setMessageType(JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void reporteCierreCajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reporteCierreCajaMouseClicked
        
        DefaultTableModel ventas_tabla = (DefaultTableModel) reporteCierreCaja.getModel();
        int filaSeleccionada = reporteCierreCaja.getSelectedRow();
        id = Integer.parseInt(ventas_tabla.getValueAt(filaSeleccionada, 0).toString());
        fecha = ventas_tabla.getValueAt(filaSeleccionada, 1).toString();
        estado = ventas_tabla.getValueAt(filaSeleccionada, 2).toString();
        monto = Double.parseDouble(ventas_tabla.getValueAt(filaSeleccionada, 3).toString());
        caja = Integer.parseInt(ventas_tabla.getValueAt(filaSeleccionada, 5).toString());
        turno = ventas_tabla.getValueAt(filaSeleccionada, 7).toString();
    }//GEN-LAST:event_reporteCierreCajaMouseClicked

    private void btnMostrarSesionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarSesionesActionPerformed

        EstadoCajaBD ecbd = new EstadoCajaBD();
        DefaultTableModel tabla_temporal = (DefaultTableModel) reporteCierreCaja.getModel();
        tabla_temporal = ecbd.reportarSesionCaja(fecha);
        reporteCierreCaja.setModel(tabla_temporal);
    }//GEN-LAST:event_btnMostrarSesionesActionPerformed

    private void btnUsarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsarSesionActionPerformed

        Calendar calendario = Calendar.getInstance();
        int dia = calendario.get(Calendar.DAY_OF_MONTH);
        int mes = calendario.get(Calendar.MONTH) + 1;
        int anio = calendario.get(Calendar.YEAR);
        String f = anio + "-" + mes + "-" + dia;
        String fecha_temporal = f;

        if (id > 0) {
            if (fecha.equals(fecha_temporal)) {
                if (estado.equals("APERTURADO")) {

                    CajaBD cbd = new CajaBD();
                    DefaultTableModel tabla_temporal;
                    tabla_temporal = cbd.buscarCaja(caja);

                    if (tabla_temporal.getRowCount() > 0) {

                        idSesion = id;
                        monto_apertura = monto;
                        idCaja = caja;

                        TurnoBD t = new TurnoBD();
                        String idt = t.buscarIdTurno(turno);
                        idTurno = Integer.parseInt(idt);

                        JOptionPane op = new JOptionPane("Caja lista");
                        op.setMessageType(JOptionPane.WARNING_MESSAGE);
                    } else {
                        JOptionPane op = new JOptionPane("Sesion no encontrada");
                        op.setMessageType(JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    JOptionPane op = new JOptionPane("Debe seleccionar una sesion aperturada");
                    op.setMessageType(JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane op = new JOptionPane("Debe seleccionar una sesion con fecha actual");
                op.setMessageType(JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane op = new JOptionPane("Debe seleccionar una sesion de caja");
            op.setMessageType(JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnUsarSesionActionPerformed

    private void txtMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoActionPerformed

    private void reporteCierreCajaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reporteCierreCajaMousePressed

    }//GEN-LAST:event_reporteCierreCajaMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAperturar;
    public javax.swing.JButton btnCerrar;
    public javax.swing.JButton btnMostrarSesiones;
    private javax.swing.JButton btnSalir;
    public javax.swing.JButton btnUsarSesion;
    private javax.swing.JComboBox<String> cmbCaja;
    private javax.swing.JComboBox<String> cmbTurno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JDesktopPane panelMantenimiento;
    public static javax.swing.JTable reporteCierreCaja;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables
}
