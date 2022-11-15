package transportSolutionsPresentacion;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transportSolutionsLogica.ChoferBD;
import transportSolutionsLogica.EstadoChoferBD;
import transportSolutionsModelo.Chofer;
import transportSolutionsModelo.EstadoChofer;

public class transportSolutionsNuevoChoferView extends javax.swing.JInternalFrame {

    public transportSolutionsNuevoChoferView() {
        initComponents();
    }

    void limpiar() {
        txtDni.setText("");
        txtNombres.setText("");
        txtCorreo.setText("");
        txtTelefono.setText("");
        txtTipoLicencia.setText("");
        txtLicencia.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtTipoLicencia = new javax.swing.JTextField();
        btnBorrar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        txtCorreo = new javax.swing.JTextField();
        txtLicencia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setTitle("NUEVO CHOFER");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/nuevo_chofer.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("DNI");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Nombres");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Correo");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Telefono");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Tipo Licencia");

        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDniKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });

        txtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresActionPerformed(evt);
            }
        });
        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombresKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombresKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresKeyTyped(evt);
            }
        });

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        txtTipoLicencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTipoLicenciaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTipoLicenciaKeyTyped(evt);
            }
        });

        btnBorrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clean.png"))); // NOI18N
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
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

        btnCerrar.setBackground(new java.awt.Color(255, 0, 0));
        btnCerrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cross_2.png"))); // NOI18N
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCorreoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoKeyTyped(evt);
            }
        });

        txtLicencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLicenciaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLicenciaKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Licencia");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtDni, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                    .addComponent(txtNombres)
                    .addComponent(txtCorreo)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTipoLicencia, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtLicencia, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTipoLicencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLicencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed

        limpiar();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed

        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        if (txtDni.getText().length() > 0) {
            if (txtNombres.getText().length() > 0) {
                if (txtCorreo.getText().length() > 0) {
                    if (txtTelefono.getText().length() > 0) {
                        if (txtTipoLicencia.getText().length() > 0) {
                            if (txtLicencia.getText().length() > 0) {

                                Chofer c = new Chofer();
                                ChoferBD cbd = new ChoferBD();

                                c.setDni(txtDni.getText());
                                c.setNombres(txtNombres.getText().toUpperCase());
                                c.setCorreo(txtCorreo.getText().toUpperCase());
                                c.setTelefono(txtTelefono.getText());
                                c.setTipoLicencia(txtTipoLicencia.getText().toUpperCase());
                                c.setLicencia(txtLicencia.getText());
                                int idChofer = cbd.registrarChofer(c);
                                
                                EstadoChofer ec = new EstadoChofer();
                                EstadoChoferBD ecbd = new EstadoChoferBD();
                                ec.setEstado("PENDIENTE");
                                ec.setIdChofer(idChofer);
                                ecbd.registrarEstadoChofer(ec);

                                JOptionPane op = new JOptionPane("Chofer registrado");
                                op.setMessageType(JOptionPane.INFORMATION_MESSAGE);
                                limpiar();
                            } else {
                                JOptionPane op = new JOptionPane("Debe ingresar licencia");
                                op.setMessageType(JOptionPane.WARNING_MESSAGE);
                            }
                        } else {
                            JOptionPane op = new JOptionPane("Debe ingresar tipo licencia");
                            op.setMessageType(JOptionPane.WARNING_MESSAGE);
                        }
                    } else {
                        JOptionPane op = new JOptionPane("Debe ingresar telefono");
                        op.setMessageType(JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    JOptionPane op = new JOptionPane("Debe ingresar correo");
                    op.setMessageType(JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane op = new JOptionPane("Debe ingresar nombres");
                op.setMessageType(JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane op = new JOptionPane("Debe ingresar razon dni");
            op.setMessageType(JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyTyped

    }//GEN-LAST:event_txtNombresKeyTyped

    private void txtNombresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyReleased

    }//GEN-LAST:event_txtNombresKeyReleased

    private void txtNombresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyPressed

        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            txtCorreo.requestFocus();
        }
    }//GEN-LAST:event_txtNombresKeyPressed

    private void txtDniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyPressed
        // TODO add your handling code here:

        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            txtNombres.requestFocus();
        }

    }//GEN-LAST:event_txtDniKeyPressed

    private void txtTelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyPressed
        // TODO add your handling code here:

        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            txtTipoLicencia.requestFocus();
        }

    }//GEN-LAST:event_txtTelefonoKeyPressed

    private void txtTipoLicenciaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoLicenciaKeyPressed
        
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            txtLicencia.requestFocus();
        }
    }//GEN-LAST:event_txtTipoLicenciaKeyPressed

    private void txtTipoLicenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoLicenciaKeyTyped

    }//GEN-LAST:event_txtTipoLicenciaKeyTyped

    private void txtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresActionPerformed

    }//GEN-LAST:event_txtNombresActionPerformed

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed

        if (txtDni.getText().length() > 0) {

            ChoferBD pbd = new ChoferBD();

            String dni = txtDni.getText();
            DefaultTableModel tabla_temporal;
            tabla_temporal = pbd.buscarChofer(dni);

            if (tabla_temporal.getRowCount() > 0) {

                txtDni.setText(tabla_temporal.getValueAt(0, 1).toString());
                txtNombres.setText(tabla_temporal.getValueAt(0, 2).toString());
                txtTelefono.setText(tabla_temporal.getValueAt(0, 3).toString());
                txtCorreo.setText(tabla_temporal.getValueAt(0, 4).toString());
                txtTipoLicencia.setText(tabla_temporal.getValueAt(0, 5).toString());
                txtLicencia.setText(tabla_temporal.getValueAt(0, 6).toString());

                JOptionPane op = new JOptionPane("El proveedor ya se encuentra registrado");
                op.setMessageType(JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane op = new JOptionPane("Debe ingresar ruc");
            op.setMessageType(JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtDniActionPerformed

    private void txtCorreoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyPressed

        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            txtTelefono.requestFocus();
        }
    }//GEN-LAST:event_txtCorreoKeyPressed

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped

        char caracter = evt.getKeyChar();

        if (Character.isLetter(caracter) && caracter != KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDniKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped

        char caracter = evt.getKeyChar();

        if (Character.isLetter(caracter) && caracter != KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtLicenciaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLicenciaKeyPressed
        
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            btnRegistrar.requestFocus();
            btnRegistrar.doClick();
        }
    }//GEN-LAST:event_txtLicenciaKeyPressed

    private void txtLicenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLicenciaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLicenciaKeyTyped

    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtLicencia;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTipoLicencia;
    // End of variables declaration//GEN-END:variables
}
