package transportSolutionsPresentacion;

import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transportSolutionsLogica.TipoUsuarioBD;

public class transportSolutionsGestionTipoUsuarioView extends javax.swing.JInternalFrame {

    public transportSolutionsGestionTipoUsuarioView() {
        initComponents();
        txtEliminar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNuevoTipoUsuario = new javax.swing.JButton();
        btnEliminarTipoUsuario = new javax.swing.JButton();
        btnEditarTipoUsuario = new javax.swing.JButton();
        panelMantenimiento = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        reporteTipoUsuario = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        btnMostrarTipoUsuario = new javax.swing.JButton();
        txtEliminar = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("GESTION TIPO DE USUARIO");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_tipo_usuario.png"))); // NOI18N

        btnNuevoTipoUsuario.setBackground(new java.awt.Color(204, 204, 255));
        btnNuevoTipoUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNuevoTipoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nuevo_tipo_usuario.png"))); // NOI18N
        btnNuevoTipoUsuario.setText("Nuevo Tipo Usuario");
        btnNuevoTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoTipoUsuarioActionPerformed(evt);
            }
        });

        btnEliminarTipoUsuario.setBackground(new java.awt.Color(204, 204, 255));
        btnEliminarTipoUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminarTipoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eliminar_tipo_usuario.png"))); // NOI18N
        btnEliminarTipoUsuario.setText("Eliminar Tipo Usuario");
        btnEliminarTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTipoUsuarioActionPerformed(evt);
            }
        });

        btnEditarTipoUsuario.setBackground(new java.awt.Color(204, 204, 255));
        btnEditarTipoUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditarTipoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modificar_tipo_usuario.png"))); // NOI18N
        btnEditarTipoUsuario.setText("Editar Tipo Usuario");
        btnEditarTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarTipoUsuarioActionPerformed(evt);
            }
        });

        reporteTipoUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DESCRIPCION"
            }
        ));
        reporteTipoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reporteTipoUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(reporteTipoUsuario);

        panelMantenimiento.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelMantenimientoLayout = new javax.swing.GroupLayout(panelMantenimiento);
        panelMantenimiento.setLayout(panelMantenimientoLayout);
        panelMantenimientoLayout.setHorizontalGroup(
            panelMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMantenimientoLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        btnMostrarTipoUsuario.setBackground(new java.awt.Color(204, 204, 255));
        btnMostrarTipoUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMostrarTipoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mostrar_tipo_usuario.png"))); // NOI18N
        btnMostrarTipoUsuario.setText("Mostrar Tipo Usuario");
        btnMostrarTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTipoUsuarioActionPerformed(evt);
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
                    .addComponent(btnMostrarTipoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditarTipoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarTipoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEliminar)
                    .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevoTipoUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(btnNuevoTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminarTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditarTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMostrarTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoTipoUsuarioActionPerformed
        // TODO add your handling code here:

        transportSolutionsNuevoTipoUsuario tu = new transportSolutionsNuevoTipoUsuario();
        panelMantenimiento.add(tu);
        Dimension desktopSize = panelMantenimiento.getSize();
        Dimension FrameSize = tu.getSize();
        tu.setLocation((desktopSize.width - FrameSize.width) / 4, (desktopSize.height - FrameSize.height) / 4);
        tu.setVisible(true);
    }//GEN-LAST:event_btnNuevoTipoUsuarioActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnMostrarTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTipoUsuarioActionPerformed

        TipoUsuarioBD tubd = new TipoUsuarioBD();

        DefaultTableModel tabla_temporal;
        tabla_temporal = tubd.reportarTipoUsuario();

        if (tabla_temporal.getRowCount() > 0) {
            reporteTipoUsuario.setModel(tabla_temporal);
        }
    }//GEN-LAST:event_btnMostrarTipoUsuarioActionPerformed

    private void btnEliminarTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTipoUsuarioActionPerformed

        if (txtEliminar.getText().length() > 0) {

            int id = Integer.parseInt(txtEliminar.getText());
            TipoUsuarioBD tubd = new TipoUsuarioBD();
            tubd.eliminarTipoUsuario(id);

            DefaultTableModel tabla_temporal;
            tabla_temporal = tubd.reportarTipoUsuario();
            reporteTipoUsuario.setModel(tabla_temporal);

            JOptionPane op = new JOptionPane("Tipo usuario eliminado");
            op.setMessageType(JOptionPane.INFORMATION_MESSAGE);
            txtEliminar.setText("");
        } else {
            JOptionPane op = new JOptionPane("Debe selecionar un Tipo de usuario");
            op.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarTipoUsuarioActionPerformed

    private void reporteTipoUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reporteTipoUsuarioMouseClicked

        int filaSeleccionada = reporteTipoUsuario.getSelectedRow();
        
        txtEliminar.setText(reporteTipoUsuario.getValueAt(filaSeleccionada, 0).toString());
    }//GEN-LAST:event_reporteTipoUsuarioMouseClicked

    private void btnEditarTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarTipoUsuarioActionPerformed

        transportSolutionsModificarTipoUsuario mt = new transportSolutionsModificarTipoUsuario();
        panelMantenimiento.add(mt);
        Dimension desktopSize = panelMantenimiento.getSize();
        Dimension FrameSize = mt.getSize();
        mt.setLocation((desktopSize.width - FrameSize.width) / 4, (desktopSize.height - FrameSize.height) / 4);
        mt.setVisible(true);
    }//GEN-LAST:event_btnEditarTipoUsuarioActionPerformed

    private void txtEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEliminarActionPerformed

    private void txtEliminarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEliminarKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEliminarKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnEditarTipoUsuario;
    public javax.swing.JButton btnEliminarTipoUsuario;
    public javax.swing.JButton btnMostrarTipoUsuario;
    public javax.swing.JButton btnNuevoTipoUsuario;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JDesktopPane panelMantenimiento;
    public static javax.swing.JTable reporteTipoUsuario;
    private javax.swing.JTextField txtEliminar;
    // End of variables declaration//GEN-END:variables
}
