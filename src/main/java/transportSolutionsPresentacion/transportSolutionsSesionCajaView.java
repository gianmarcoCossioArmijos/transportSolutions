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

    public int id;
    public int idSesion;
    public String estado;
    public double monto;
    public String fecha;
    public String turno;
    public static int idAperturaCaja;
    public static int idCaja;
    public static int idTurno;
    public double monto_apertura;
    public double monto_cierre;
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

    private void formatoTablaApertura() {

        reporteCierreCaja.getColumnModel().getColumn(0).setPreferredWidth(20);
        reporteCierreCaja.getColumnModel().getColumn(1).setPreferredWidth(120);
        reporteCierreCaja.getColumnModel().getColumn(3).setPreferredWidth(20);
        reporteCierreCaja.getColumnModel().getColumn(6).setPreferredWidth(300);
    }

    private void formatoTablaCierre() {

        reporteCierreCaja.getColumnModel().getColumn(6).setPreferredWidth(200);
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
                "FECHA", "CAJA", "TURNO", "USUARIO", "CAJA CHICA APERTURA", "CAJA CHICA CIERRE", "TOTAL"
            }
        ));
        reporteCierreCaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reporteCierreCajaMouseClicked(evt);
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAperturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAperturarActionPerformed

        if (cmbCaja.getSelectedItem().toString().length() > 0) {
            if (cmbTurno.getSelectedItem().toString().length() > 0) {
                if (txtMonto.getText().length() > 0) {

                    EstadoCajaBD ecbd = new EstadoCajaBD();
                    EstadoCaja ec = new EstadoCaja();

                    ec.setEstado("APERTURADO");
                    double monto = Double.parseDouble(txtMonto.getText());
                    ec.setMontoCajaChica(monto);

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
                    idAperturaCaja = idAperutra;

                    DefaultTableModel tabla_temporal;
                    tabla_temporal = ecbd.reportarAperturaCaja(fecha, idAperutra);
                    reporteCierreCaja.setModel(tabla_temporal);

                    formatoTablaApertura();

                    try {
                        rtv = new Reporte();
                        rtv.exportarExcel(reporteCierreCaja);
                    } catch (IOException e) {
                    }
                } else {
                    JOptionPane op = new JOptionPane("Debe ingresar el monto de caja chica para aperturar");
                    op.setMessageType(JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane op = new JOptionPane("Debe seleccionar un turno para aperturar");
                op.setMessageType(JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane op = new JOptionPane("Debe seleccionar una caja para aperturar");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAperturarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed

        if (txtMonto.getText().length() > 0) {

            EstadoCaja ec = new EstadoCaja();
            EstadoCajaBD ecbd = new EstadoCajaBD();

            ec.setEstado("CERRADO");
            ec.setIdCaja(idCaja);
            ec.setIdTurno(idTurno);

            UsuarioBD ubd = new UsuarioBD();
            String idUsuario = ubd.buscarUsuarioDni(transportSolutionsLogin.dni_publico);
            ec.setIdUsuario(Integer.parseInt(idUsuario));

            monto_cierre = Double.parseDouble(txtMonto.getText());
            ec.setMontoCajaChica(monto_cierre);
            ecbd.registrarCierreCaja(ec);

            DefaultTableModel tabla_temporal;
            tabla_temporal = ecbd.reportarCierreCaja(fecha, monto_apertura, monto_cierre, idCaja);
            reporteCierreCaja.setModel(tabla_temporal);

            try {
                rtv = new Reporte();
                rtv.exportarExcel(reporteCierreCaja);
            } catch (IOException e) {
            }
        } else {
            JOptionPane op = new JOptionPane("Debe ingresar el monto de caja chica para cerrar");
            op.setMessageType(JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void reporteCierreCajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reporteCierreCajaMouseClicked

        int filaSeleccionada = reporteCierreCaja.getSelectedRow();
        idSesion = Integer.parseInt(reporteCierreCaja.getValueAt(filaSeleccionada, 0).toString());
        estado = reporteCierreCaja.getValueAt(filaSeleccionada, 1).toString();
        monto = Double.parseDouble(reporteCierreCaja.getValueAt(filaSeleccionada, 2).toString());
        id = Integer.parseInt(reporteCierreCaja.getValueAt(filaSeleccionada, 3).toString());
        turno = reporteCierreCaja.getValueAt(filaSeleccionada, 5).toString();
    }//GEN-LAST:event_reporteCierreCajaMouseClicked

    private void btnMostrarSesionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarSesionesActionPerformed

        EstadoCajaBD ecbd = new EstadoCajaBD();
        DefaultTableModel tabla_temporal;
        tabla_temporal = ecbd.reportarSesionCaja();
        reporteCierreCaja.setModel(tabla_temporal);
        formatoTablaApertura();
    }//GEN-LAST:event_btnMostrarSesionesActionPerformed

    private void btnUsarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsarSesionActionPerformed

        if (id > 0) {
            if (estado.equals("APERTURADO")) {

                CajaBD cbd = new CajaBD();
                DefaultTableModel tabla_temporal;
                tabla_temporal = cbd.buscarCaja(id);

                if (tabla_temporal.getRowCount() > 0) {

                    idCaja = id;
                    monto_apertura = monto;
                    idAperturaCaja = idSesion;

                    TurnoBD t = new TurnoBD();
                    String idt = t.buscarIdTurno(turno);
                    idTurno = Integer.parseInt(idt);

                    JOptionPane op = new JOptionPane("Caja aperturada");
                    op.setMessageType(JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane op = new JOptionPane("Debe seleccionar una sesion aperturada");
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
