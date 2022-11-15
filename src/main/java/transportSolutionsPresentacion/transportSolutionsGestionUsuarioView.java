package transportSolutionsPresentacion;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transportSolutionsLogica.UsuarioBD;
import transportSolutionsModelo.Usuario;
import transportSolutionsReporte.Reporte;

public class transportSolutionsGestionUsuarioView extends javax.swing.JInternalFrame {

    Reporte rtv;

    public transportSolutionsGestionUsuarioView() {
        initComponents();
        txtEliminar.setEnabled(false);
    }

    void espaciadoTabla() {
        reporteUsuarios.getColumnModel().getColumn(0).setPreferredWidth(5);
        reporteUsuarios.getColumnModel().getColumn(4).setPreferredWidth(10);
        reporteUsuarios.getColumnModel().getColumn(2).setPreferredWidth(200);
        reporteUsuarios.getColumnModel().getColumn(3).setPreferredWidth(200);
    }

    public void limpiarTabla() {

        DefaultTableModel temp = (DefaultTableModel) reporteUsuarios.getModel();
        int filas = reporteUsuarios.getRowCount();

        for (int i = 0; filas > i; i++) {
            temp.removeRow(0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNuevoUsuario = new javax.swing.JButton();
        btnEliminarUsuario = new javax.swing.JButton();
        btnEditarUsuario = new javax.swing.JButton();
        panelMantenimiento = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        reporteUsuarios = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        btnMostrarUsuarios = new javax.swing.JButton();
        txtBuscarUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtEliminar = new javax.swing.JTextField();
        btnDescargar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("GESTION USUARIOS");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_usuario.png"))); // NOI18N

        btnNuevoUsuario.setBackground(new java.awt.Color(204, 204, 255));
        btnNuevoUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNuevoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nuevo_usuario_1.png"))); // NOI18N
        btnNuevoUsuario.setText("Nuevo Usuario");
        btnNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoUsuarioActionPerformed(evt);
            }
        });

        btnEliminarUsuario.setBackground(new java.awt.Color(204, 204, 255));
        btnEliminarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eliminar_usuario_1.png"))); // NOI18N
        btnEliminarUsuario.setText("Eliminar Usuario");
        btnEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUsuarioActionPerformed(evt);
            }
        });

        btnEditarUsuario.setBackground(new java.awt.Color(204, 204, 255));
        btnEditarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modificar_usuario.png"))); // NOI18N
        btnEditarUsuario.setText("Editar Usuario");
        btnEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarUsuarioActionPerformed(evt);
            }
        });

        reporteUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DNI", "NOMBRES", "CORREO", "TIPO"
            }
        ));
        reporteUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reporteUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(reporteUsuarios);

        panelMantenimiento.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelMantenimientoLayout = new javax.swing.GroupLayout(panelMantenimiento);
        panelMantenimiento.setLayout(panelMantenimientoLayout);
        panelMantenimientoLayout.setHorizontalGroup(
            panelMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMantenimientoLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelMantenimientoLayout.setVerticalGroup(
            panelMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
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

        btnMostrarUsuarios.setBackground(new java.awt.Color(204, 204, 255));
        btnMostrarUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMostrarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mostrar_usuarios_1.png"))); // NOI18N
        btnMostrarUsuarios.setText("Mostrar Usuarios");
        btnMostrarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarUsuariosActionPerformed(evt);
            }
        });

        txtBuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarUsuarioActionPerformed(evt);
            }
        });
        txtBuscarUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarUsuarioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarUsuarioKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Buscar Usuario");

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

        jButton1.setBackground(new java.awt.Color(204, 255, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buscar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(btnMostrarUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBuscarUsuario)
                    .addComponent(txtEliminar)
                    .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevoUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDescargar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelMantenimiento)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelMantenimiento)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMostrarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDescargar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir)
                        .addGap(15, 15, 15))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoUsuarioActionPerformed

        transportSolutionsNuevoUsuario nu = new transportSolutionsNuevoUsuario();
        panelMantenimiento.add(nu);
        Dimension desktopSize = panelMantenimiento.getSize();
        Dimension FrameSize = nu.getSize();
        nu.setLocation((desktopSize.width - FrameSize.width) / 4, (desktopSize.height - FrameSize.height) / 4);
        nu.setVisible(true);
    }//GEN-LAST:event_btnNuevoUsuarioActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnMostrarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarUsuariosActionPerformed

        UsuarioBD ubd = new UsuarioBD();

        DefaultTableModel tabla_temporal;
        tabla_temporal = ubd.reportarUsuario();

        if (tabla_temporal.getRowCount() > 0) {
            reporteUsuarios.setModel(tabla_temporal);
            espaciadoTabla();
        }
    }//GEN-LAST:event_btnMostrarUsuariosActionPerformed

    private void btnEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUsuarioActionPerformed

        if (txtEliminar.getText().length() > 0) {

            int dni = Integer.parseInt(txtEliminar.getText());
            UsuarioBD ubd = new UsuarioBD();
            ubd.eliminarUsuario(dni);
            JOptionPane op = new JOptionPane("Usuario eliminado");
            op.setMessageType(JOptionPane.INFORMATION_MESSAGE);
            txtEliminar.setText("");

            DefaultTableModel tabla_temporal;
            tabla_temporal = ubd.reportarUsuario();

            reporteUsuarios.setModel(tabla_temporal);
            espaciadoTabla();
        } else {
            JOptionPane op = new JOptionPane("DEbe selecionar un usuario");
            op.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarUsuarioActionPerformed

    private void txtBuscarUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarUsuarioKeyReleased

    }//GEN-LAST:event_txtBuscarUsuarioKeyReleased

    private void reporteUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reporteUsuariosMouseClicked

        int filaSeleccionada = reporteUsuarios.getSelectedRow();

        txtEliminar.setText(reporteUsuarios.getValueAt(filaSeleccionada, 1).toString());
    }//GEN-LAST:event_reporteUsuariosMouseClicked

    private void btnEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarUsuarioActionPerformed

        transportSolutionsModificarUsuario mu = new transportSolutionsModificarUsuario();
        panelMantenimiento.add(mu);
        Dimension desktopSize = panelMantenimiento.getSize();
        Dimension FrameSize = mu.getSize();
        mu.setLocation((desktopSize.width - FrameSize.width) / 4, (desktopSize.height - FrameSize.height) / 4);
        mu.setVisible(true);
    }//GEN-LAST:event_btnEditarUsuarioActionPerformed

    private void txtBuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarUsuarioActionPerformed

    }//GEN-LAST:event_txtBuscarUsuarioActionPerformed

    private void txtEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEliminarActionPerformed

    private void txtEliminarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEliminarKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEliminarKeyReleased

    private void txtBuscarUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarUsuarioKeyTyped

        char caracter = evt.getKeyChar();

        if (Character.isLetter(caracter) && caracter != KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_txtBuscarUsuarioKeyTyped

    private void btnDescargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescargarActionPerformed

        try {
            rtv = new Reporte();
            rtv.exportarExcel(reporteUsuarios);
        } catch (IOException e) {
        }
    }//GEN-LAST:event_btnDescargarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (txtBuscarUsuario.getText().length() > 0) {

            Usuario u = new Usuario();
            UsuarioBD ubd = new UsuarioBD();

            String buscar = txtBuscarUsuario.getText();
            int dni = Integer.parseInt(buscar);
            DefaultTableModel tabla_temporal;
            tabla_temporal = ubd.buscarUsuario(dni);

            if (tabla_temporal.getRowCount() > 0) {

                reporteUsuarios.setModel(tabla_temporal);
                espaciadoTabla();
                txtBuscarUsuario.setText("");
            } else {
                limpiarTabla();
            }
        } else {
            JOptionPane op = new JOptionPane("Debe ingresar dni");
            op.setMessageType(JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDescargar;
    public javax.swing.JButton btnEditarUsuario;
    public javax.swing.JButton btnEliminarUsuario;
    public javax.swing.JButton btnMostrarUsuarios;
    public javax.swing.JButton btnNuevoUsuario;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JDesktopPane panelMantenimiento;
    public static javax.swing.JTable reporteUsuarios;
    private javax.swing.JTextField txtBuscarUsuario;
    private javax.swing.JTextField txtEliminar;
    // End of variables declaration//GEN-END:variables
}
