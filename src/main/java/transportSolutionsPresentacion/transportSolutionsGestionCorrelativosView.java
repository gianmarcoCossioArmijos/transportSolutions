package transportSolutionsPresentacion;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transportSolutionsLogica.CorrelativoBoletaBD;
import transportSolutionsLogica.CorrelativoFacturaBD;

public class transportSolutionsGestionCorrelativosView extends javax.swing.JInternalFrame {

    public transportSolutionsGestionCorrelativosView() {
        initComponents();
        txtEliminar.setEnabled(false);
    }

    void espaciadoTabla() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNuevoCorrelativo = new javax.swing.JButton();
        btnEliminarCorrelativo = new javax.swing.JButton();
        panelMantenimiento = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        reporteCorrelativos = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        btnMostrarCorrelativos = new javax.swing.JButton();
        txtBuscarCorrelativo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtEliminar = new javax.swing.JTextField();
        cmbTipoDocumento = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setTitle("GESTION CORRELATIVOS");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/corretativo.png"))); // NOI18N

        btnNuevoCorrelativo.setBackground(new java.awt.Color(204, 204, 255));
        btnNuevoCorrelativo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNuevoCorrelativo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nuevo_correlativo.png"))); // NOI18N
        btnNuevoCorrelativo.setText("Nuevo Correlativo");
        btnNuevoCorrelativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoCorrelativoActionPerformed(evt);
            }
        });

        btnEliminarCorrelativo.setBackground(new java.awt.Color(204, 204, 255));
        btnEliminarCorrelativo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminarCorrelativo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eliminar_correlativo.png"))); // NOI18N
        btnEliminarCorrelativo.setText("Eliminar Correlativo");
        btnEliminarCorrelativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCorrelativoActionPerformed(evt);
            }
        });

        reporteCorrelativos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "SERIE", "CODIGO", "TIPO"
            }
        ));
        reporteCorrelativos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reporteCorrelativosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(reporteCorrelativos);

        panelMantenimiento.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelMantenimientoLayout = new javax.swing.GroupLayout(panelMantenimiento);
        panelMantenimiento.setLayout(panelMantenimientoLayout);
        panelMantenimientoLayout.setHorizontalGroup(
            panelMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelMantenimientoLayout.setVerticalGroup(
            panelMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
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

        btnMostrarCorrelativos.setBackground(new java.awt.Color(204, 204, 255));
        btnMostrarCorrelativos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMostrarCorrelativos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mostrar_correlativos.png"))); // NOI18N
        btnMostrarCorrelativos.setText("Mostrar Correlativos");
        btnMostrarCorrelativos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarCorrelativosActionPerformed(evt);
            }
        });

        txtBuscarCorrelativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarCorrelativoActionPerformed(evt);
            }
        });
        txtBuscarCorrelativo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarCorrelativoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarCorrelativoKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Buscar Correlativo");

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

        cmbTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "BOLETA", "FACTURA" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(btnMostrarCorrelativos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarCorrelativo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBuscarCorrelativo)
                    .addComponent(txtEliminar)
                    .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevoCorrelativo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbTipoDocumento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMantenimiento)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(btnNuevoCorrelativo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminarCorrelativo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMostrarCorrelativos, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscarCorrelativo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoCorrelativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoCorrelativoActionPerformed
        // TODO add your handling code here:

        transportSolutionsNuevoCorrelativo nc = new transportSolutionsNuevoCorrelativo();
        panelMantenimiento.add(nc);
        Dimension desktopSize = panelMantenimiento.getSize();
        Dimension FrameSize = nc.getSize();
        nc.setLocation((desktopSize.width - FrameSize.width) / 4, (desktopSize.height - FrameSize.height) / 4);
        nc.setVisible(true);
    }//GEN-LAST:event_btnNuevoCorrelativoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnMostrarCorrelativosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarCorrelativosActionPerformed

        if (cmbTipoDocumento.getSelectedItem().toString().equals("BOLETA")) {
            
            CorrelativoBoletaBD cbbd = new CorrelativoBoletaBD();
            DefaultTableModel tabla_temporal_boleta;
            tabla_temporal_boleta = cbbd.reportarCorrelativoB();
            
            if (tabla_temporal_boleta.getRowCount() > 0) {
                reporteCorrelativos.setModel(tabla_temporal_boleta);
                espaciadoTabla();
            }
        } else if (cmbTipoDocumento.getSelectedItem().toString().equals("FACTURA")) {
            
            CorrelativoFacturaBD cfbd = new CorrelativoFacturaBD();
            DefaultTableModel tabla_temporal_factura;
            tabla_temporal_factura = cfbd.reportarCorrelativoF();
            
            if (tabla_temporal_factura.getRowCount() > 0) {
                reporteCorrelativos.setModel(tabla_temporal_factura);
                espaciadoTabla();
            }
        } else {
            JOptionPane op = new JOptionPane("Debe seleccionar tipo de documento");
            op.setMessageType(JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnMostrarCorrelativosActionPerformed

    private void btnEliminarCorrelativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCorrelativoActionPerformed

        if (txtEliminar.getText().length() > 0) {

            DefaultTableModel modelo;
            CorrelativoBoletaBD cbbd = new CorrelativoBoletaBD();
            int idBoleta = Integer.parseInt(txtEliminar.getText());
            modelo = cbbd.buscarCorrelativoB(idBoleta);

            if (modelo.getRowCount() > 0) {

                DefaultTableModel tabla_temporal_boleta;
                cbbd.eliminarCorrelativoB(idBoleta);
                txtEliminar.setText("");
                tabla_temporal_boleta = cbbd.reportarCorrelativoB();
                reporteCorrelativos.setModel(tabla_temporal_boleta);

                JOptionPane op = new JOptionPane("Correlativo eliminado");
                op.setMessageType(JOptionPane.WARNING_MESSAGE);

            } else {

                DefaultTableModel model;
                CorrelativoFacturaBD cfbd = new CorrelativoFacturaBD();
                int idFactura = Integer.parseInt(txtEliminar.getText());
                model = cfbd.buscarCorrelativoF(idFactura);

                if (model.getRowCount() > 0) {

                    DefaultTableModel tabla_temporal_factura;
                    cbbd.eliminarCorrelativoB(idFactura);
                    txtEliminar.setText("");
                    tabla_temporal_factura = cfbd.reportarCorrelativoF();
                    reporteCorrelativos.setModel(tabla_temporal_factura);

                    JOptionPane op = new JOptionPane("Correlativo eliminado");
                    op.setMessageType(JOptionPane.WARNING_MESSAGE);

                }
            }
        } else {
            JOptionPane op = new JOptionPane("Debe ingresar id");
            op.setMessageType(JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarCorrelativoActionPerformed

    private void txtBuscarCorrelativoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarCorrelativoKeyReleased

    }//GEN-LAST:event_txtBuscarCorrelativoKeyReleased

    private void reporteCorrelativosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reporteCorrelativosMouseClicked

        int filaSeleccionada = reporteCorrelativos.getSelectedRow();

        txtEliminar.setText(reporteCorrelativos.getValueAt(filaSeleccionada, 0).toString());
    }//GEN-LAST:event_reporteCorrelativosMouseClicked

    private void txtBuscarCorrelativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarCorrelativoActionPerformed
        if (txtBuscarCorrelativo.getText().length() > 0) {
            if (cmbTipoDocumento.getSelectedItem().toString().equals("BOLETA")) {

                DefaultTableModel modelo;
                int idBoleta = Integer.parseInt(txtBuscarCorrelativo.getText());
                CorrelativoBoletaBD cbbd = new CorrelativoBoletaBD();
                modelo = cbbd.buscarCorrelativoB(idBoleta);
                reporteCorrelativos.setModel(modelo);
                txtBuscarCorrelativo.setText("");
                cmbTipoDocumento.setSelectedIndex(0);

            } else if (cmbTipoDocumento.getSelectedItem().toString().equals("FACTURA")) {

                DefaultTableModel model;
                int idFactura = Integer.parseInt(txtBuscarCorrelativo.getText());
                CorrelativoFacturaBD cfbd = new CorrelativoFacturaBD();
                model = cfbd.buscarCorrelativoF(idFactura);
                reporteCorrelativos.setModel(model);
                txtBuscarCorrelativo.setText("");
                cmbTipoDocumento.setSelectedIndex(0);
            } else {
                JOptionPane op = new JOptionPane("Debe seleccionar tipo de documento");
                op.setMessageType(JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane op = new JOptionPane("Debe ingresar id");
            op.setMessageType(JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtBuscarCorrelativoActionPerformed

    private void txtEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEliminarActionPerformed

    private void txtEliminarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEliminarKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEliminarKeyReleased

    private void txtBuscarCorrelativoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarCorrelativoKeyTyped

        char caracter = evt.getKeyChar();

        if (Character.isLetter(caracter) && caracter != KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_txtBuscarCorrelativoKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnEliminarCorrelativo;
    public javax.swing.JButton btnMostrarCorrelativos;
    public javax.swing.JButton btnNuevoCorrelativo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbTipoDocumento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JDesktopPane panelMantenimiento;
    public static javax.swing.JTable reporteCorrelativos;
    private javax.swing.JTextField txtBuscarCorrelativo;
    private javax.swing.JTextField txtEliminar;
    // End of variables declaration//GEN-END:variables
}
