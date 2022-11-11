package transportSolutionsPresentacion;

import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transportSolutionsLogica.AreaTrabajoBD;

public class transportSolutionsGestionAreaTrabajoView extends javax.swing.JInternalFrame {

    public transportSolutionsGestionAreaTrabajoView() {
        initComponents();
        txtEliminar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNuevaAreaTrabajo = new javax.swing.JButton();
        btnEliminarAreaTrabajo = new javax.swing.JButton();
        btnEditarAreaTrabajo = new javax.swing.JButton();
        panelMantenimiento = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        reporteAreaTrabajo = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        btnMostrarAreaTrabajo = new javax.swing.JButton();
        txtEliminar = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("GESTION AREA DE TRABAJO");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_area_trabajo.png"))); // NOI18N

        btnNuevaAreaTrabajo.setBackground(new java.awt.Color(204, 204, 255));
        btnNuevaAreaTrabajo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNuevaAreaTrabajo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nueva_area_trabajo.png"))); // NOI18N
        btnNuevaAreaTrabajo.setText("Nueva Area Trabajo");
        btnNuevaAreaTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaAreaTrabajoActionPerformed(evt);
            }
        });

        btnEliminarAreaTrabajo.setBackground(new java.awt.Color(204, 204, 255));
        btnEliminarAreaTrabajo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminarAreaTrabajo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eliminar_area_trabajo.png"))); // NOI18N
        btnEliminarAreaTrabajo.setText("Eliminar Area Trabajo");
        btnEliminarAreaTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAreaTrabajoActionPerformed(evt);
            }
        });

        btnEditarAreaTrabajo.setBackground(new java.awt.Color(204, 204, 255));
        btnEditarAreaTrabajo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditarAreaTrabajo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modificar_area_trabajo.png"))); // NOI18N
        btnEditarAreaTrabajo.setText("Editar Area Trabajo");
        btnEditarAreaTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarAreaTrabajoActionPerformed(evt);
            }
        });

        reporteAreaTrabajo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DESCRIPCION"
            }
        ));
        reporteAreaTrabajo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reporteAreaTrabajoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(reporteAreaTrabajo);

        panelMantenimiento.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelMantenimientoLayout = new javax.swing.GroupLayout(panelMantenimiento);
        panelMantenimiento.setLayout(panelMantenimientoLayout);
        panelMantenimientoLayout.setHorizontalGroup(
            panelMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMantenimientoLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelMantenimientoLayout.setVerticalGroup(
            panelMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
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

        btnMostrarAreaTrabajo.setBackground(new java.awt.Color(204, 204, 255));
        btnMostrarAreaTrabajo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMostrarAreaTrabajo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mostrar_area_trabajo.png"))); // NOI18N
        btnMostrarAreaTrabajo.setText("Mostrar Area Trabajo");
        btnMostrarAreaTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarAreaTrabajoActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMostrarAreaTrabajo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditarAreaTrabajo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarAreaTrabajo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEliminar)
                    .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevaAreaTrabajo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(btnNuevaAreaTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminarAreaTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditarAreaTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMostrarAreaTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevaAreaTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaAreaTrabajoActionPerformed
        // TODO add your handling code here:

        transportSolutionsNuevoAreaTrabajo at = new transportSolutionsNuevoAreaTrabajo();
        panelMantenimiento.add(at);
        Dimension desktopSize = panelMantenimiento.getSize();
        Dimension FrameSize = at.getSize();
        at.setLocation((desktopSize.width - FrameSize.width) / 4, (desktopSize.height - FrameSize.height) / 4);
        at.setVisible(true);
    }//GEN-LAST:event_btnNuevaAreaTrabajoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnMostrarAreaTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarAreaTrabajoActionPerformed

        AreaTrabajoBD atbd = new AreaTrabajoBD();
        DefaultTableModel tabla_temporal;
        tabla_temporal = atbd.reportarAreaTrabajo();

        if (tabla_temporal.getRowCount() > 0) {
            reporteAreaTrabajo.setModel(tabla_temporal);
        }
    }//GEN-LAST:event_btnMostrarAreaTrabajoActionPerformed

    private void btnEliminarAreaTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAreaTrabajoActionPerformed

        if (txtEliminar.getText().length() > 0) {

            int id = Integer.parseInt(txtEliminar.getText());
            AreaTrabajoBD atbd = new AreaTrabajoBD();
            atbd.eliminarAreaTrabajo(id);

            DefaultTableModel tabla_temporal;
            tabla_temporal = atbd.reportarAreaTrabajo();
            reporteAreaTrabajo.setModel(tabla_temporal);

            JOptionPane op = new JOptionPane("Area de trabajo eliminada");
            op.setMessageType(JOptionPane.INFORMATION_MESSAGE);
            txtEliminar.setText("");
        } else {
            JOptionPane op = new JOptionPane("Debe selecionar una Area de trabajo");
            op.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarAreaTrabajoActionPerformed

    private void reporteAreaTrabajoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reporteAreaTrabajoMouseClicked

        int filaSeleccionada = reporteAreaTrabajo.getSelectedRow();

        txtEliminar.setText(reporteAreaTrabajo.getValueAt(filaSeleccionada, 0).toString());
    }//GEN-LAST:event_reporteAreaTrabajoMouseClicked

    private void btnEditarAreaTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarAreaTrabajoActionPerformed

        transportSolutionsModificarAreaTrabajo ma = new transportSolutionsModificarAreaTrabajo();
        panelMantenimiento.add(ma);
        Dimension desktopSize = panelMantenimiento.getSize();
        Dimension FrameSize = ma.getSize();
        ma.setLocation((desktopSize.width - FrameSize.width) / 4, (desktopSize.height - FrameSize.height) / 4);
        ma.setVisible(true);
    }//GEN-LAST:event_btnEditarAreaTrabajoActionPerformed

    private void txtEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEliminarActionPerformed

    private void txtEliminarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEliminarKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEliminarKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnEditarAreaTrabajo;
    public javax.swing.JButton btnEliminarAreaTrabajo;
    public javax.swing.JButton btnMostrarAreaTrabajo;
    public javax.swing.JButton btnNuevaAreaTrabajo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JDesktopPane panelMantenimiento;
    public static javax.swing.JTable reporteAreaTrabajo;
    private javax.swing.JTextField txtEliminar;
    // End of variables declaration//GEN-END:variables
}
