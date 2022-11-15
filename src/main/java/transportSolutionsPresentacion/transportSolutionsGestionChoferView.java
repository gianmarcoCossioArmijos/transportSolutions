package transportSolutionsPresentacion;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transportSolutionsLogica.ChoferBD;
import transportSolutionsReporte.Reporte;

public class transportSolutionsGestionChoferView extends javax.swing.JInternalFrame {
    
    Reporte rtv;

    public transportSolutionsGestionChoferView() {
        initComponents();
        txtEliminar.setEnabled(false);
    }

    void espaciadoTabla() {
        reporteChoferes.getColumnModel().getColumn(0).setPreferredWidth(25);
        reporteChoferes.getColumnModel().getColumn(1).setPreferredWidth(80);
        reporteChoferes.getColumnModel().getColumn(3).setPreferredWidth(80);
        reporteChoferes.getColumnModel().getColumn(2).setPreferredWidth(200);
        reporteChoferes.getColumnModel().getColumn(4).setPreferredWidth(200);
    }

    public void limpiarTabla() {

        DefaultTableModel temp = (DefaultTableModel) reporteChoferes.getModel();
        int filas = reporteChoferes.getRowCount();

        for (int i = 0; filas > i; i++) {
            temp.removeRow(0);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNuevoEmpleado = new javax.swing.JButton();
        btnEliminarChofer = new javax.swing.JButton();
        btnEditarChofer = new javax.swing.JButton();
        panelMantenimiento = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        reporteChoferes = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        btnMostrarChofer = new javax.swing.JButton();
        txtBuscarChofer = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtEliminar = new javax.swing.JTextField();
        btnDescargar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("GESTION CHOFER");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_chofer.png"))); // NOI18N

        btnNuevoEmpleado.setBackground(new java.awt.Color(204, 204, 255));
        btnNuevoEmpleado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNuevoEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nuevo_chofer.png"))); // NOI18N
        btnNuevoEmpleado.setText("Nuevo Chofer");
        btnNuevoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoEmpleadoActionPerformed(evt);
            }
        });

        btnEliminarChofer.setBackground(new java.awt.Color(204, 204, 255));
        btnEliminarChofer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminarChofer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eliminar_chofer.png"))); // NOI18N
        btnEliminarChofer.setText("Eliminar Chofer");
        btnEliminarChofer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarChoferActionPerformed(evt);
            }
        });

        btnEditarChofer.setBackground(new java.awt.Color(204, 204, 255));
        btnEditarChofer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditarChofer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modificar_chofer.png"))); // NOI18N
        btnEditarChofer.setText("Editar Chofer");
        btnEditarChofer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarChoferActionPerformed(evt);
            }
        });

        reporteChoferes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DNI", "NOMBRES", "TELEFONO", "CORREO", "TIPO LICENCIA", "LICENCIA"
            }
        ));
        reporteChoferes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reporteChoferesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(reporteChoferes);

        panelMantenimiento.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelMantenimientoLayout = new javax.swing.GroupLayout(panelMantenimiento);
        panelMantenimiento.setLayout(panelMantenimientoLayout);
        panelMantenimientoLayout.setHorizontalGroup(
            panelMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMantenimientoLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        panelMantenimientoLayout.setVerticalGroup(
            panelMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
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

        btnMostrarChofer.setBackground(new java.awt.Color(204, 204, 255));
        btnMostrarChofer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMostrarChofer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mostrar_choferes.png"))); // NOI18N
        btnMostrarChofer.setText("Mostrar Choferes");
        btnMostrarChofer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarChoferActionPerformed(evt);
            }
        });

        txtBuscarChofer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarChoferActionPerformed(evt);
            }
        });
        txtBuscarChofer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarChoferKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarChoferKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Buscar Chofer");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMostrarChofer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditarChofer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBuscarChofer)
                    .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDescargar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarChofer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEliminar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(btnNuevoEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMantenimiento)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(btnNuevoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminarChofer, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditarChofer, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMostrarChofer, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscarChofer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDescargar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoEmpleadoActionPerformed
        // TODO add your handling code here:

        transportSolutionsNuevoChoferView nc = new transportSolutionsNuevoChoferView();
        panelMantenimiento.add(nc);
        Dimension desktopSize = panelMantenimiento.getSize();
        Dimension FrameSize = nc.getSize();
        nc.setLocation((desktopSize.width - FrameSize.width) / 4, (desktopSize.height - FrameSize.height) / 4);
        nc.setVisible(true);
    }//GEN-LAST:event_btnNuevoEmpleadoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnMostrarChoferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarChoferActionPerformed

         ChoferBD cbd = new ChoferBD();

        DefaultTableModel tabla_temporal;
        tabla_temporal = cbd.reportarChofer();

        if (tabla_temporal.getRowCount() > 0) {
            reporteChoferes.setModel(tabla_temporal);
            espaciadoTabla();
        }
    }//GEN-LAST:event_btnMostrarChoferActionPerformed

    private void btnEliminarChoferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarChoferActionPerformed

        if (txtEliminar.getText().length() > 0) {

            int id = Integer.parseInt(txtEliminar.getText());
            ChoferBD cbd = new ChoferBD();
            cbd.eliminarChofer(id);

            DefaultTableModel tabla_temporal;
            tabla_temporal = cbd.reportarChofer();
            reporteChoferes.setModel(tabla_temporal);
            espaciadoTabla();

            JOptionPane op = new JOptionPane("Chofer eliminado");
            op.setMessageType(JOptionPane.INFORMATION_MESSAGE);
            txtEliminar.setText("");
        } else {
            JOptionPane op = new JOptionPane("Debe selecionar un Chofer");
            op.setMessageType(JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarChoferActionPerformed

    private void txtBuscarChoferKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarChoferKeyReleased

    }//GEN-LAST:event_txtBuscarChoferKeyReleased

    private void reporteChoferesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reporteChoferesMouseClicked

        int filaSeleccionada = reporteChoferes.getSelectedRow();
        
        txtEliminar.setText(reporteChoferes.getValueAt(filaSeleccionada, 0).toString());
    }//GEN-LAST:event_reporteChoferesMouseClicked

    private void btnEditarChoferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarChoferActionPerformed

        transportSolutionsModificarChoferView mc = new transportSolutionsModificarChoferView();
        panelMantenimiento.add(mc);
        Dimension desktopSize = panelMantenimiento.getSize();
        Dimension FrameSize = mc.getSize();
        mc.setLocation((desktopSize.width - FrameSize.width) / 4, (desktopSize.height - FrameSize.height) / 4);
        mc.setVisible(true);
    }//GEN-LAST:event_btnEditarChoferActionPerformed

    private void txtBuscarChoferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarChoferActionPerformed

    }//GEN-LAST:event_txtBuscarChoferActionPerformed

    private void txtEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEliminarActionPerformed

    private void txtEliminarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEliminarKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEliminarKeyReleased

    private void txtBuscarChoferKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarChoferKeyTyped

        char caracter = evt.getKeyChar();

        if (Character.isLetter(caracter) && caracter != KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_txtBuscarChoferKeyTyped

    private void btnDescargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescargarActionPerformed
        
        try {
            rtv = new Reporte();
            rtv.exportarExcel(reporteChoferes);
        } catch (IOException e) {
        }
    }//GEN-LAST:event_btnDescargarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        if (txtBuscarChofer.getText().length() > 0) {

            ChoferBD cbd = new ChoferBD();

            String dni = txtBuscarChofer.getText();
            DefaultTableModel tabla_temporal;
            tabla_temporal = cbd.buscarChofer(dni);

            if (tabla_temporal.getRowCount() > 0) {
                reporteChoferes.setModel(tabla_temporal);
                espaciadoTabla();
            } else {
                limpiarTabla();
            }
        } else {
            JOptionPane op = new JOptionPane("Debe ingresar dni");
            op.setMessageType(JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnDescargar;
    public javax.swing.JButton btnEditarChofer;
    public javax.swing.JButton btnEliminarChofer;
    public javax.swing.JButton btnMostrarChofer;
    public javax.swing.JButton btnNuevoEmpleado;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JDesktopPane panelMantenimiento;
    public static javax.swing.JTable reporteChoferes;
    private javax.swing.JTextField txtBuscarChofer;
    private javax.swing.JTextField txtEliminar;
    // End of variables declaration//GEN-END:variables
}
