package transportSolutionsPresentacion;

import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transportSolutionsLogica.CajaBD;

public class transportSolutionsGestionCajaView extends javax.swing.JInternalFrame {

    public transportSolutionsGestionCajaView() {
        initComponents();
        txtEliminar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNuevaCaja = new javax.swing.JButton();
        btnEliminarCaja = new javax.swing.JButton();
        btnEditarCaja = new javax.swing.JButton();
        panelMantenimiento = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        reporteCaja = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        btnMostrarCaja = new javax.swing.JButton();
        txtEliminar = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("GESTION CAJA");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/cierre_caja.png"))); // NOI18N

        btnNuevaCaja.setBackground(new java.awt.Color(204, 204, 255));
        btnNuevaCaja.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNuevaCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nueva_caja.png"))); // NOI18N
        btnNuevaCaja.setText("Nueva Caja");
        btnNuevaCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaCajaActionPerformed(evt);
            }
        });

        btnEliminarCaja.setBackground(new java.awt.Color(204, 204, 255));
        btnEliminarCaja.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminarCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eliminar_caja.png"))); // NOI18N
        btnEliminarCaja.setText("Eliminar Caja");
        btnEliminarCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCajaActionPerformed(evt);
            }
        });

        btnEditarCaja.setBackground(new java.awt.Color(204, 204, 255));
        btnEditarCaja.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditarCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modificar_caja.png"))); // NOI18N
        btnEditarCaja.setText("Editar Caja");
        btnEditarCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCajaActionPerformed(evt);
            }
        });

        reporteCaja.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DESCRIPCION"
            }
        ));
        reporteCaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reporteCajaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(reporteCaja);

        panelMantenimiento.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelMantenimientoLayout = new javax.swing.GroupLayout(panelMantenimiento);
        panelMantenimiento.setLayout(panelMantenimientoLayout);
        panelMantenimientoLayout.setHorizontalGroup(
            panelMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
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

        btnMostrarCaja.setBackground(new java.awt.Color(204, 204, 255));
        btnMostrarCaja.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMostrarCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mostrar_sesion_caja.png"))); // NOI18N
        btnMostrarCaja.setText("Mostrar Caja");
        btnMostrarCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarCajaActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMostrarCaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditarCaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevaCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarCaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEliminar))
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
                .addComponent(btnNuevaCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminarCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditarCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMostrarCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevaCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaCajaActionPerformed
        // TODO add your handling code here:

        transportSolutionsNuevaCaja c = new transportSolutionsNuevaCaja();
        panelMantenimiento.add(c);
        Dimension desktopSize = panelMantenimiento.getSize();
        Dimension FrameSize = c.getSize();
        c.setLocation((desktopSize.width - FrameSize.width) / 4, (desktopSize.height - FrameSize.height) / 4);
        c.setVisible(true);
    }//GEN-LAST:event_btnNuevaCajaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnMostrarCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarCajaActionPerformed

        CajaBD cbd = new CajaBD();
        DefaultTableModel tabla_temporal;
        tabla_temporal = cbd.reportarCaja();

        if (tabla_temporal.getRowCount() > 0) {
            reporteCaja.setModel(tabla_temporal);
        }
    }//GEN-LAST:event_btnMostrarCajaActionPerformed

    private void btnEliminarCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCajaActionPerformed

        if (txtEliminar.getText().length() > 0) {

            int id = Integer.parseInt(txtEliminar.getText());
            CajaBD cbd = new CajaBD();
            cbd.eliminarCaja(id);

            DefaultTableModel tabla_temporal;
            tabla_temporal = cbd.reportarCaja();
            reporteCaja.setModel(tabla_temporal);

            JOptionPane op = new JOptionPane("Caja eliminada");
            op.setMessageType(JOptionPane.INFORMATION_MESSAGE);
            txtEliminar.setText("");
        } else {
            JOptionPane op = new JOptionPane("Debe selecionar una Caja");
            op.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarCajaActionPerformed

    private void reporteCajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reporteCajaMouseClicked

        int filaSeleccionada = reporteCaja.getSelectedRow();

        txtEliminar.setText(reporteCaja.getValueAt(filaSeleccionada, 0).toString());
    }//GEN-LAST:event_reporteCajaMouseClicked

    private void btnEditarCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCajaActionPerformed

        transportSolutionsModificarCaja mc = new transportSolutionsModificarCaja();
        panelMantenimiento.add(mc);
        Dimension desktopSize = panelMantenimiento.getSize();
        Dimension FrameSize = mc.getSize();
        mc.setLocation((desktopSize.width - FrameSize.width) / 4, (desktopSize.height - FrameSize.height) / 4);
        mc.setVisible(true);
    }//GEN-LAST:event_btnEditarCajaActionPerformed

    private void txtEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEliminarActionPerformed

    private void txtEliminarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEliminarKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEliminarKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnEditarCaja;
    public javax.swing.JButton btnEliminarCaja;
    public javax.swing.JButton btnMostrarCaja;
    public javax.swing.JButton btnNuevaCaja;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JDesktopPane panelMantenimiento;
    public static javax.swing.JTable reporteCaja;
    private javax.swing.JTextField txtEliminar;
    // End of variables declaration//GEN-END:variables
}
