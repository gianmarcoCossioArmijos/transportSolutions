package transportSolutionsPresentacion;

import java.awt.Dimension;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transportSolutionsLogica.InventarioBD;
import transportSolutionsReporte.Reporte;

public class transportSolutionsGestionInventarioView extends javax.swing.JInternalFrame {

    Reporte rtv;

    public transportSolutionsGestionInventarioView() {
        initComponents();
        txtEliminar.setEnabled(false);
    }

    void espaciadoTabla() {
        reporteInventario.getColumnModel().getColumn(0).setPreferredWidth(10);
        reporteInventario.getColumnModel().getColumn(5).setPreferredWidth(20);
        reporteInventario.getColumnModel().getColumn(5).setPreferredWidth(30);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNuevoInventario = new javax.swing.JButton();
        btnEliminarInventario = new javax.swing.JButton();
        btnEditarInventario = new javax.swing.JButton();
        panelMantenimiento = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        reporteInventario = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        btnMostrarInventario = new javax.swing.JButton();
        txtBuscarInventario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtEliminar = new javax.swing.JTextField();
        btnDescargar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("GESTION INVENTARIO");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/reportes.png"))); // NOI18N

        btnNuevoInventario.setBackground(new java.awt.Color(204, 204, 255));
        btnNuevoInventario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNuevoInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nuevo_inventario.png"))); // NOI18N
        btnNuevoInventario.setText("Nuevo Inventario");
        btnNuevoInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoInventarioActionPerformed(evt);
            }
        });

        btnEliminarInventario.setBackground(new java.awt.Color(204, 204, 255));
        btnEliminarInventario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminarInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eliminar_inventario.png"))); // NOI18N
        btnEliminarInventario.setText("Eliminar Inventario");
        btnEliminarInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarInventarioActionPerformed(evt);
            }
        });

        btnEditarInventario.setBackground(new java.awt.Color(204, 204, 255));
        btnEditarInventario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditarInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modificar_inventario.png"))); // NOI18N
        btnEditarInventario.setText("Editar Inventario");
        btnEditarInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarInventarioActionPerformed(evt);
            }
        });

        reporteInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CODIGO BARRAS", "DESCRIPCION", "MARCA", "CATEGORIA", "PRECIO", "FECHA COMPRA", "PROVEEDOR", "COMPROBANTE"
            }
        ));
        reporteInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reporteInventarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(reporteInventario);

        panelMantenimiento.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelMantenimientoLayout = new javax.swing.GroupLayout(panelMantenimiento);
        panelMantenimiento.setLayout(panelMantenimientoLayout);
        panelMantenimientoLayout.setHorizontalGroup(
            panelMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 813, Short.MAX_VALUE)
        );
        panelMantenimientoLayout.setVerticalGroup(
            panelMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
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

        btnMostrarInventario.setBackground(new java.awt.Color(204, 204, 255));
        btnMostrarInventario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMostrarInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mostrar_inventario.png"))); // NOI18N
        btnMostrarInventario.setText("Mostrar Inventario");
        btnMostrarInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarInventarioActionPerformed(evt);
            }
        });

        txtBuscarInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarInventarioActionPerformed(evt);
            }
        });
        txtBuscarInventario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarInventarioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarInventarioKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Buscar Inventario");

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
                    .addComponent(btnMostrarInventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditarInventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarInventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEliminar)
                    .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevoInventario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDescargar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtBuscarInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelMantenimiento))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(btnNuevoInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminarInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditarInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMostrarInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDescargar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtBuscarInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoInventarioActionPerformed

        transportSolutionsNuevoInventario ni = new transportSolutionsNuevoInventario();
        panelMantenimiento.add(ni);
        Dimension desktopSize = panelMantenimiento.getSize();
        Dimension FrameSize = ni.getSize();
        ni.setLocation((desktopSize.width - FrameSize.width) / 4, (desktopSize.height - FrameSize.height) / 4);
        ni.setVisible(true);
    }//GEN-LAST:event_btnNuevoInventarioActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnMostrarInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarInventarioActionPerformed

        InventarioBD vbd = new InventarioBD();

        DefaultTableModel tabla_temporal;
        tabla_temporal = vbd.reportarInventario();

        if (tabla_temporal.getRowCount() > 0) {
            reporteInventario.setModel(tabla_temporal);
            espaciadoTabla();
        }
    }//GEN-LAST:event_btnMostrarInventarioActionPerformed

    private void btnEliminarInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarInventarioActionPerformed

        if (txtEliminar.getText().length() > 0) {

            int id = Integer.parseInt(txtEliminar.getText());
            InventarioBD vbd = new InventarioBD();
            vbd.eliminarInventario(id);

            DefaultTableModel tabla_temporal;
            tabla_temporal = vbd.reportarInventario();
            reporteInventario.setModel(tabla_temporal);
            espaciadoTabla();

            JOptionPane op = new JOptionPane("Eliminado del inventario");
            op.setMessageType(JOptionPane.INFORMATION_MESSAGE);
            txtEliminar.setText("");
        } else {
            JOptionPane op = new JOptionPane("Debe selecionar un elemento del inventario");
            op.setMessageType(JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarInventarioActionPerformed

    private void txtBuscarInventarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarInventarioKeyReleased
        
        InventarioBD vbd = new InventarioBD();

        String buscar = txtBuscarInventario.getText().toUpperCase();
        DefaultTableModel tabla_temporal;
        tabla_temporal = vbd.buscarInventarioDescripcion(buscar);

        if (tabla_temporal.getRowCount() > 0) {
            reporteInventario.setModel(tabla_temporal);
            espaciadoTabla();
        }
    }//GEN-LAST:event_txtBuscarInventarioKeyReleased

    private void reporteInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reporteInventarioMouseClicked

        int filaSeleccionada = reporteInventario.getSelectedRow();

        txtEliminar.setText(reporteInventario.getValueAt(filaSeleccionada, 0).toString());
    }//GEN-LAST:event_reporteInventarioMouseClicked

    private void btnEditarInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarInventarioActionPerformed

        transportSolutionsModificarInventario mi = new transportSolutionsModificarInventario();
        panelMantenimiento.add(mi);
        Dimension desktopSize = panelMantenimiento.getSize();
        Dimension FrameSize = mi.getSize();
        mi.setLocation((desktopSize.width - FrameSize.width) / 4, (desktopSize.height - FrameSize.height) / 4);
        mi.setVisible(true);
    }//GEN-LAST:event_btnEditarInventarioActionPerformed

    private void txtBuscarInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarInventarioActionPerformed

    }//GEN-LAST:event_txtBuscarInventarioActionPerformed

    private void txtEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEliminarActionPerformed

    private void txtEliminarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEliminarKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEliminarKeyReleased

    private void txtBuscarInventarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarInventarioKeyTyped

    }//GEN-LAST:event_txtBuscarInventarioKeyTyped

    private void btnDescargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescargarActionPerformed

        try {
            rtv = new Reporte();
            rtv.exportarExcel(reporteInventario);
        } catch (IOException e) {
        }
    }//GEN-LAST:event_btnDescargarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDescargar;
    public javax.swing.JButton btnEditarInventario;
    public javax.swing.JButton btnEliminarInventario;
    public javax.swing.JButton btnMostrarInventario;
    public javax.swing.JButton btnNuevoInventario;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JDesktopPane panelMantenimiento;
    public static javax.swing.JTable reporteInventario;
    private javax.swing.JTextField txtBuscarInventario;
    private javax.swing.JTextField txtEliminar;
    // End of variables declaration//GEN-END:variables
}
