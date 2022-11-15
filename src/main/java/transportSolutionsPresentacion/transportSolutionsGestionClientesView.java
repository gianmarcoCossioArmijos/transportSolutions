package transportSolutionsPresentacion;

import java.awt.Dimension;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transportSolutionsLogica.ClienteNaturalBD;
import transportSolutionsLogica.ClienteRucBD;
import transportSolutionsReporte.Reporte;

public class transportSolutionsGestionClientesView extends javax.swing.JInternalFrame {

    Reporte rtv;

    public transportSolutionsGestionClientesView() {
        initComponents();
        txtEliminar.setEnabled(false);
    }

    public void espaciadoClienteNaturtal() {
        reporteClientes.getColumnModel().getColumn(0).setPreferredWidth(5);
        reporteClientes.getColumnModel().getColumn(1).setPreferredWidth(200);
        reporteClientes.getColumnModel().getColumn(3).setPreferredWidth(200);
    }

    public void espaciadoClienteRuc() {
        reporteClientes.getColumnModel().getColumn(0).setPreferredWidth(5);
        reporteClientes.getColumnModel().getColumn(1).setPreferredWidth(200);
        reporteClientes.getColumnModel().getColumn(3).setPreferredWidth(100);
        reporteClientes.getColumnModel().getColumn(4).setPreferredWidth(200);
    }

    public void limpiarTabla() {

        DefaultTableModel temp = (DefaultTableModel) reporteClientes.getModel();
        int filas = reporteClientes.getRowCount();

        for (int i = 0; filas > i; i++) {
            temp.removeRow(0);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEliminarClientes = new javax.swing.JButton();
        btnEditarClienteRuc = new javax.swing.JButton();
        panelGestionClientes = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        reporteClientes = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnMostrarClientesRUC = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnMostrarClientes = new javax.swing.JButton();
        txtEliminar = new javax.swing.JTextField();
        btnEditarCliente = new javax.swing.JButton();
        btnDescargar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtBuscarRuc = new javax.swing.JTextField();
        txtBuscarDni = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("GESTION CLIENTES");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_clientes.png"))); // NOI18N

        btnEliminarClientes.setBackground(new java.awt.Color(204, 204, 255));
        btnEliminarClientes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eliminar_usuario.png"))); // NOI18N
        btnEliminarClientes.setText("Eliminar Cliente");
        btnEliminarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClientesActionPerformed(evt);
            }
        });

        btnEditarClienteRuc.setBackground(new java.awt.Color(204, 204, 255));
        btnEditarClienteRuc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditarClienteRuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/editar_usuario.png"))); // NOI18N
        btnEditarClienteRuc.setText("Editar Cliente RUC");
        btnEditarClienteRuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarClienteRucActionPerformed(evt);
            }
        });

        reporteClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", "", ""
            }
        ));
        reporteClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reporteClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(reporteClientes);

        panelGestionClientes.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelGestionClientesLayout = new javax.swing.GroupLayout(panelGestionClientes);
        panelGestionClientes.setLayout(panelGestionClientesLayout);
        panelGestionClientesLayout.setHorizontalGroup(
            panelGestionClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
        );
        panelGestionClientesLayout.setVerticalGroup(
            panelGestionClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cross_2.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnMostrarClientesRUC.setBackground(new java.awt.Color(204, 204, 255));
        btnMostrarClientesRUC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMostrarClientesRUC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mostrar_usuarios.png"))); // NOI18N
        btnMostrarClientesRUC.setText("Mostrar Clientes RUC");
        btnMostrarClientesRUC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarClientesRUCActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Buscar cliente RUC");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Buscar cliente DNI");

        btnMostrarClientes.setBackground(new java.awt.Color(204, 204, 255));
        btnMostrarClientes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMostrarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mostrar_usuarios.png"))); // NOI18N
        btnMostrarClientes.setText("Mostrar Clientes");
        btnMostrarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarClientesActionPerformed(evt);
            }
        });

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

        btnEditarCliente.setBackground(new java.awt.Color(204, 204, 255));
        btnEditarCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/editar_usuario.png"))); // NOI18N
        btnEditarCliente.setText("Editar Cliente");
        btnEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarClienteActionPerformed(evt);
            }
        });

        btnDescargar.setBackground(new java.awt.Color(204, 255, 0));
        btnDescargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/download.png"))); // NOI18N
        btnDescargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescargarActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtBuscarRuc, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminarClientes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMostrarClientes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMostrarClientesRUC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditarClienteRuc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditarCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDescargar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEliminar)
                    .addComponent(txtBuscarDni))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(panelGestionClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelGestionClientes)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEliminarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditarClienteRuc, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMostrarClientesRUC, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMostrarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscarRuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscarDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDescargar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnMostrarClientesRUCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarClientesRUCActionPerformed

        ClienteRucBD crbd = new ClienteRucBD();
        DefaultTableModel tabla_temporal;
        tabla_temporal = crbd.reportarClienteRuc();
        reporteClientes.setModel(tabla_temporal);
        espaciadoClienteRuc();
        txtBuscarRuc.setText("");
    }//GEN-LAST:event_btnMostrarClientesRUCActionPerformed

    private void reporteClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reporteClientesMouseClicked

        int filaSeleccionada = reporteClientes.getSelectedRow();

        txtEliminar.setText(reporteClientes.getValueAt(filaSeleccionada, 2).toString());
    }//GEN-LAST:event_reporteClientesMouseClicked

    private void btnEliminarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClientesActionPerformed

        if (txtEliminar.getText().length() > 0) {
            if (txtEliminar.getText().length() > 8) {

                String ruc = txtEliminar.getText();
                ClienteRucBD crbd = new ClienteRucBD();
                String dato = crbd.obtenerIdClienteRuc(ruc);

                if (dato.length() > 0) {

                    crbd.eliminarClienteRuc(Integer.parseInt(dato));
                    JOptionPane op = new JOptionPane("Cliente eliminado");
                    op.setMessageType(JOptionPane.INFORMATION_MESSAGE);
                    txtEliminar.setText("");
                    limpiarTabla();
                    
                } else {
                    txtEliminar.setText("");
                    limpiarTabla();
                }
            } else if (txtEliminar.getText().length() == 8) {

                String dni = txtEliminar.getText();
                ClienteNaturalBD cnbd = new ClienteNaturalBD();
                String dat = cnbd.obtenerIdClienteNatural(dni);

                if (dat.length() > 0) {

                    cnbd.eliminarClienteNatural(Integer.parseInt(dat));
                    JOptionPane op = new JOptionPane("Cliente eliminado");
                    op.setMessageType(JOptionPane.INFORMATION_MESSAGE);
                    txtEliminar.setText("");
                    limpiarTabla();

                } else {
                    txtEliminar.setText("");
                    limpiarTabla();
                }
            } else {
                JOptionPane op = new JOptionPane("Debe ingresar un DNI o RUC valido");
                op.setMessageType(JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane op = new JOptionPane("Debe ingresar un DNI o RUC");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarClientesActionPerformed

    private void btnMostrarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarClientesActionPerformed

        ClienteNaturalBD cnbd = new ClienteNaturalBD();
        DefaultTableModel tabla_temporal;
        tabla_temporal = cnbd.reportarClienteNatural();
        reporteClientes.setModel(tabla_temporal);
        espaciadoClienteNaturtal();
        txtBuscarDni.setText("");
    }//GEN-LAST:event_btnMostrarClientesActionPerformed

    private void btnEditarClienteRucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClienteRucActionPerformed
        transportSolutionsModificarClienteRUCView mcr = new transportSolutionsModificarClienteRUCView();
        panelGestionClientes.add(mcr);
        Dimension desktopSize = panelGestionClientes.getSize();
        Dimension FrameSize = mcr.getSize();
        mcr.setLocation((desktopSize.width - FrameSize.width) / 4, (desktopSize.height - FrameSize.height) / 4);
        mcr.setVisible(true);
    }//GEN-LAST:event_btnEditarClienteRucActionPerformed

    private void txtEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEliminarActionPerformed

    private void txtEliminarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEliminarKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEliminarKeyReleased

    private void btnEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClienteActionPerformed

        transportSolutionsModificarClienteView mc = new transportSolutionsModificarClienteView();
        panelGestionClientes.add(mc);
        Dimension desktopSize = panelGestionClientes.getSize();
        Dimension FrameSize = mc.getSize();
        mc.setLocation((desktopSize.width - FrameSize.width) / 4, (desktopSize.height - FrameSize.height) / 4);
        mc.setVisible(true);
    }//GEN-LAST:event_btnEditarClienteActionPerformed

    private void btnDescargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescargarActionPerformed

        try {
            rtv = new Reporte();
            rtv.exportarExcel(reporteClientes);
        } catch (IOException e) {
        }
    }//GEN-LAST:event_btnDescargarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        if (txtBuscarDni.getText().length() > 0 || txtBuscarRuc.getText().length() > 0) {

            if (txtBuscarDni.getText().length() > 0) {

                String dni = txtBuscarDni.getText();
                ClienteNaturalBD cnbd = new ClienteNaturalBD();

                DefaultTableModel tabla_temporal;
                tabla_temporal = cnbd.buscarClienteNatural(dni);

                if (tabla_temporal.getRowCount() > 0) {
                    reporteClientes.setModel(tabla_temporal);
                    espaciadoClienteNaturtal();
                    txtBuscarDni.setText("");
                } else {
                    limpiarTabla();
                }
            } else if (txtBuscarRuc.getText().length() > 0) {

                String ruc = txtBuscarRuc.getText();
                ClienteRucBD crbd = new ClienteRucBD();

                DefaultTableModel tabla_temporal;
                tabla_temporal = crbd.buscarClienteRuc(ruc);

                if (tabla_temporal.getRowCount() > 0) {
                    reporteClientes.setModel(tabla_temporal);
                    espaciadoClienteRuc();
                    txtBuscarRuc.setText("");
                } else {
                    limpiarTabla();
                }
            }
        } else {
            JOptionPane op = new JOptionPane("Debe ingresar DNI o RUC para buscar cliente");
            op.setMessageType(JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnDescargar;
    private javax.swing.JButton btnEditarCliente;
    private javax.swing.JButton btnEditarClienteRuc;
    private javax.swing.JButton btnEliminarClientes;
    private javax.swing.JButton btnMostrarClientes;
    private javax.swing.JButton btnMostrarClientesRUC;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JDesktopPane panelGestionClientes;
    private javax.swing.JTable reporteClientes;
    private javax.swing.JTextField txtBuscarDni;
    private javax.swing.JTextField txtBuscarRuc;
    private javax.swing.JTextField txtEliminar;
    // End of variables declaration//GEN-END:variables
}
