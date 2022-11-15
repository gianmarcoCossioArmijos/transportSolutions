package transportSolutionsPresentacion;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transportSolutionsLogica.AreaTrabajoBD;
import transportSolutionsLogica.PuestoLaboralBD;
import transportSolutionsModelo.AreaTrabajo;
import transportSolutionsModelo.PuestoLaboral;

public class transportSolutionsNuevoPuestoLaboral extends javax.swing.JInternalFrame {

    List<AreaTrabajo> lista_area;

    public transportSolutionsNuevoPuestoLaboral() {
        initComponents();
        cargarAreaTrabajo();
    }

    public void limpiar() {

        txtDescripcion.setText("");
    }

    private void cargarAreaTrabajo() {

        try {
            cmbAreaTrabajo.removeAllItems();
            AreaTrabajoBD abd = new AreaTrabajoBD();
            DefaultTableModel tabla_temporal;
            tabla_temporal = abd.reportarAreaTrabajo();
            lista_area = new ArrayList<>();
            for (int i = 0; i < tabla_temporal.getRowCount(); i++) {

                String descripcion = String.valueOf(tabla_temporal.getValueAt(i, 1).toString());
                lista_area.add(new AreaTrabajo(descripcion));
                cmbAreaTrabajo.addItem(descripcion);
            }
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al cargar area de trabajo");
            op.setMessageType(JOptionPane.WARNING_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        btnCerrar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cmbAreaTrabajo = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setTitle("NUEVA PUESTO LABORAL");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/nuevo_puesto_trabajo.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Descripcion");

        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyTyped(evt);
            }
        });

        btnCerrar.setBackground(new java.awt.Color(255, 0, 0));
        btnCerrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cross_2.png"))); // NOI18N
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnRegistrar.setBackground(new java.awt.Color(204, 255, 0));
        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/check.png"))); // NOI18N
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnBorrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clean.png"))); // NOI18N
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Area");

        cmbAreaTrabajo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR" }));
        cmbAreaTrabajo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbAreaTrabajoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtDescripcion)
                    .addComponent(cmbAreaTrabajo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbAreaTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed

        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        if (txtDescripcion.getText().length() > 0) {
            if ("SELECCIONAR".equals(cmbAreaTrabajo.getSelectedItem().toString())) {

                PuestoLaboral pl = new PuestoLaboral();
                PuestoLaboralBD plbd = new PuestoLaboralBD();
                pl.setDescripcion(txtDescripcion.getText().toUpperCase());

                AreaTrabajoBD atbd = new AreaTrabajoBD();
                String id = atbd.buscarAreaTrabajo(cmbAreaTrabajo.getSelectedItem().toString());
                pl.setIdAereaTrabajo(Integer.parseInt(id));
                plbd.registrarPuestoTrabajo(pl);

                limpiar();
            } else {
                JOptionPane op = new JOptionPane("Debe seleccionar area trabajo");
                op.setMessageType(JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane op = new JOptionPane("Debe ingresar descripcion");
            op.setMessageType(JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed

        limpiar();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void txtDescripcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyPressed

        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            cmbAreaTrabajo.requestFocus();
        }
    }//GEN-LAST:event_txtDescripcionKeyPressed

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void txtDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyTyped

    }//GEN-LAST:event_txtDescripcionKeyTyped

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed

    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void cmbAreaTrabajoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbAreaTrabajoKeyPressed
        
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            btnRegistrar.requestFocus();
            btnRegistrar.doClick();
        }
    }//GEN-LAST:event_cmbAreaTrabajoKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBorrar;
    public javax.swing.JButton btnCerrar;
    public javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cmbAreaTrabajo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JTextField txtDescripcion;
    // End of variables declaration//GEN-END:variables

}
