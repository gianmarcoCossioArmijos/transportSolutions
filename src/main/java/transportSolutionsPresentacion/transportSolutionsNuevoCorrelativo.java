package transportSolutionsPresentacion;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import transportSolutionsLogica.CorrelativoBoletaBD;
import transportSolutionsLogica.CorrelativoFacturaBD;
import transportSolutionsModelo.CorrelativoBoleta;
import transportSolutionsModelo.CorrelativoFactura;

public class transportSolutionsNuevoCorrelativo extends javax.swing.JInternalFrame {

    public transportSolutionsNuevoCorrelativo() {
        initComponents();
    }

    public void limpiar() {

        txtSerie.setText("");
        txtCodigo.setText("");
        cmbTipoDocumento.setSelectedIndex(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtSerie = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cmbTipoDocumento = new javax.swing.JComboBox<>();
        btnBorrar = new javax.swing.JButton();
        txtCodigo = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("NUEVO CORRELATIVO");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/nuevo_correlativo.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Serie");

        txtSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSerieActionPerformed(evt);
            }
        });
        txtSerie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSerieKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSerieKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Codigo");

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

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Tipo Documento");

        cmbTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "BOLETA", "FACTURA" }));
        cmbTipoDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbTipoDocumentoKeyPressed(evt);
            }
        });

        btnBorrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clean.png"))); // NOI18N
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                            .addComponent(txtSerie)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmbTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed

        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        if (txtSerie.getText().length() > 0) {
            if (txtCodigo.getText().length() > 0) {
                if (!"SELECCIONAR".equals(cmbTipoDocumento.getSelectedItem().toString())) {
                    if (cmbTipoDocumento.getSelectedItem().toString().equals("BOLETA")) {

                        CorrelativoBoletaBD cbbd = new CorrelativoBoletaBD();
                        CorrelativoBoleta cb = new CorrelativoBoleta();
                        cb.setSerie(txtSerie.getText());
                        cb.setCodigo(txtCodigo.getText());

                        cbbd.registrarCorrelativoB(cb);
                        limpiar();

                    } else if (cmbTipoDocumento.getSelectedItem().toString().equals("FACTURA")) {

                        CorrelativoFacturaBD cfbd = new CorrelativoFacturaBD();
                        CorrelativoFactura cf = new CorrelativoFactura();
                        cf.setSerie(txtSerie.getText());
                        cf.setCodigo(txtCodigo.getText());

                        cfbd.registrarCorrelativoF(cf);
                        limpiar();

                    }
                } else {
                    JOptionPane op = new JOptionPane("Debe seleccionar tipo de documento");
                    op.setMessageType(JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane op = new JOptionPane("Debe ingresar codigo");
                op.setMessageType(JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane op = new JOptionPane("Debe ingresar serie");
            op.setMessageType(JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed

        limpiar();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void txtSerieKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSerieKeyPressed
        // TODO add your handling code here:

        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            txtCodigo.requestFocus();
        }

    }//GEN-LAST:event_txtSerieKeyPressed

    private void cmbTipoDocumentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbTipoDocumentoKeyPressed
        // TODO add your handling code here:

        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            btnRegistrar.requestFocus();
            btnRegistrar.doClick();
        }

    }//GEN-LAST:event_cmbTipoDocumentoKeyPressed

    private void txtCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyPressed
        // TODO add your handling code here:

        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            cmbTipoDocumento.requestFocus();
        }

    }//GEN-LAST:event_txtCodigoKeyPressed

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void txtSerieKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSerieKeyTyped

        char caracter = evt.getKeyChar();
        if (Character.isLetter(caracter) && caracter != KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_txtSerieKeyTyped

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped

        char caracter = evt.getKeyChar();
        if (Character.isLetter(caracter) && caracter != KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void txtSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSerieActionPerformed

    }//GEN-LAST:event_txtSerieActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBorrar;
    public javax.swing.JButton btnCerrar;
    public javax.swing.JButton btnRegistrar;
    public javax.swing.JComboBox<String> cmbTipoDocumento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JTextField txtCodigo;
    public javax.swing.JTextField txtSerie;
    // End of variables declaration//GEN-END:variables

}
