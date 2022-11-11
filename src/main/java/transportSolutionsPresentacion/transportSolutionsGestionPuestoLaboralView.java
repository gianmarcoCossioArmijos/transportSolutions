package transportSolutionsPresentacion;

import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transportSolutionsLogica.PuestoLaboralBD;

public class transportSolutionsGestionPuestoLaboralView extends javax.swing.JInternalFrame {

    public transportSolutionsGestionPuestoLaboralView() {
        initComponents();
        txtEliminar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNuevaPuestoLaboral = new javax.swing.JButton();
        btnEliminarPuestoLaboral = new javax.swing.JButton();
        btnEditarPuestoLaboral = new javax.swing.JButton();
        panelMantenimiento = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        reportePuestoLaboral = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        btnMostrarPuestoLaboral = new javax.swing.JButton();
        txtEliminar = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("GESTION PUESTO DE LABORAL");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_puesto_trabajo.png"))); // NOI18N

        btnNuevaPuestoLaboral.setBackground(new java.awt.Color(204, 204, 255));
        btnNuevaPuestoLaboral.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNuevaPuestoLaboral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nuevo_puesto_trabajo.png"))); // NOI18N
        btnNuevaPuestoLaboral.setText("Nuevo Puesto Laboral");
        btnNuevaPuestoLaboral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaPuestoLaboralActionPerformed(evt);
            }
        });

        btnEliminarPuestoLaboral.setBackground(new java.awt.Color(204, 204, 255));
        btnEliminarPuestoLaboral.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminarPuestoLaboral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eliminar_puesto_trabajo.png"))); // NOI18N
        btnEliminarPuestoLaboral.setText("Eliminar Puesto Laboral");
        btnEliminarPuestoLaboral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPuestoLaboralActionPerformed(evt);
            }
        });

        btnEditarPuestoLaboral.setBackground(new java.awt.Color(204, 204, 255));
        btnEditarPuestoLaboral.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditarPuestoLaboral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modificar_puesto_trabajo.png"))); // NOI18N
        btnEditarPuestoLaboral.setText("Editar Puesto Laboral");
        btnEditarPuestoLaboral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPuestoLaboralActionPerformed(evt);
            }
        });

        reportePuestoLaboral.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DESCRIPCION"
            }
        ));
        reportePuestoLaboral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportePuestoLaboralMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(reportePuestoLaboral);

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

        btnMostrarPuestoLaboral.setBackground(new java.awt.Color(204, 204, 255));
        btnMostrarPuestoLaboral.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMostrarPuestoLaboral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mostrar_puesto_trabajo.png"))); // NOI18N
        btnMostrarPuestoLaboral.setText("Mostrar Puesto Laboral");
        btnMostrarPuestoLaboral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarPuestoLaboralActionPerformed(evt);
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
                    .addComponent(btnMostrarPuestoLaboral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditarPuestoLaboral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarPuestoLaboral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEliminar)
                    .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevaPuestoLaboral, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(btnNuevaPuestoLaboral, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminarPuestoLaboral, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditarPuestoLaboral, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMostrarPuestoLaboral, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevaPuestoLaboralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaPuestoLaboralActionPerformed
        // TODO add your handling code here:

        transportSolutionsNuevoPuestoLaboral pt = new transportSolutionsNuevoPuestoLaboral();
        panelMantenimiento.add(pt);
        Dimension desktopSize = panelMantenimiento.getSize();
        Dimension FrameSize = pt.getSize();
        pt.setLocation((desktopSize.width - FrameSize.width) / 4, (desktopSize.height - FrameSize.height) / 4);
        pt.setVisible(true);
    }//GEN-LAST:event_btnNuevaPuestoLaboralActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnMostrarPuestoLaboralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarPuestoLaboralActionPerformed

        PuestoLaboralBD plbd = new PuestoLaboralBD();
        DefaultTableModel tabla_temporal;
        tabla_temporal = plbd.reportarPuestoTrabajo();

        if (tabla_temporal.getRowCount() > 0) {
            reportePuestoLaboral.setModel(tabla_temporal);
        }
    }//GEN-LAST:event_btnMostrarPuestoLaboralActionPerformed

    private void btnEliminarPuestoLaboralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPuestoLaboralActionPerformed

        if (txtEliminar.getText().length() > 0) {

            int id = Integer.parseInt(txtEliminar.getText());
            PuestoLaboralBD plbd = new PuestoLaboralBD();
            plbd.eliminarPuestoTrabajo(id);

            DefaultTableModel tabla_temporal;
            tabla_temporal = plbd.reportarPuestoTrabajo();
            reportePuestoLaboral.setModel(tabla_temporal);

            JOptionPane op = new JOptionPane("Puesto laboral eliminado");
            op.setMessageType(JOptionPane.INFORMATION_MESSAGE);
            txtEliminar.setText("");
        } else {
            JOptionPane op = new JOptionPane("Debe selecionar un puesto laboral");
            op.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarPuestoLaboralActionPerformed

    private void reportePuestoLaboralMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportePuestoLaboralMouseClicked

        int filaSeleccionada = reportePuestoLaboral.getSelectedRow();

        txtEliminar.setText(reportePuestoLaboral.getValueAt(filaSeleccionada, 0).toString());
    }//GEN-LAST:event_reportePuestoLaboralMouseClicked

    private void btnEditarPuestoLaboralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPuestoLaboralActionPerformed

        transportSolutionsModificarPuestoLaboral mp = new transportSolutionsModificarPuestoLaboral();
        panelMantenimiento.add(mp);
        Dimension desktopSize = panelMantenimiento.getSize();
        Dimension FrameSize = mp.getSize();
        mp.setLocation((desktopSize.width - FrameSize.width) / 4, (desktopSize.height - FrameSize.height) / 4);
        mp.setVisible(true);
    }//GEN-LAST:event_btnEditarPuestoLaboralActionPerformed

    private void txtEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEliminarActionPerformed

    private void txtEliminarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEliminarKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEliminarKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnEditarPuestoLaboral;
    public javax.swing.JButton btnEliminarPuestoLaboral;
    public javax.swing.JButton btnMostrarPuestoLaboral;
    public javax.swing.JButton btnNuevaPuestoLaboral;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JDesktopPane panelMantenimiento;
    public static javax.swing.JTable reportePuestoLaboral;
    private javax.swing.JTextField txtEliminar;
    // End of variables declaration//GEN-END:variables
}
