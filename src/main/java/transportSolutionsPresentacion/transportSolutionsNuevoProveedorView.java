package transportSolutionsPresentacion;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transportSolutionsLogica.ProveedorBD;
import transportSolutionsModelo.Proveedor;

public class transportSolutionsNuevoProveedorView extends javax.swing.JInternalFrame {

    public transportSolutionsNuevoProveedorView() {
        initComponents();
    }

    void limpiar() {
        txtRuc.setText("");
        txtRazonSocial.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtCorreo.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtRuc = new javax.swing.JTextField();
        txtRazonSocial = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        btnBorrar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        txtDireccion = new javax.swing.JTextField();

        setTitle("NUEVO PROVEEDOR");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/nuevo_proveedor.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("RUC");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Razon Social");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Direccion");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Telefono");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Correo");

        txtRuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRucActionPerformed(evt);
            }
        });
        txtRuc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRucKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRucKeyTyped(evt);
            }
        });

        txtRazonSocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRazonSocialActionPerformed(evt);
            }
        });
        txtRazonSocial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRazonSocialKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRazonSocialKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRazonSocialKeyTyped(evt);
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

        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCorreoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoKeyTyped(evt);
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

        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDireccionKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtRuc, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                    .addComponent(txtRazonSocial)
                    .addComponent(txtDireccion))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtRuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
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

        if (txtRazonSocial.getText().length() > 0) {
            if (txtRuc.getText().length() > 0) {
                if (txtDireccion.getText().length() > 0) {
                    if (txtTelefono.getText().length() > 0) {
                        if (txtCorreo.getText().length() > 0) {

                            Proveedor p = new Proveedor();
                            ProveedorBD pbd = new ProveedorBD();
                            
                            p.setRuc(txtRuc.getText());
                            p.setRazonSocial(txtRazonSocial.getText().toUpperCase());
                            p.setDireccion(txtDireccion.getText().toUpperCase());
                            p.setTelefono(txtTelefono.getText());
                            p.setCorreo(txtCorreo.getText());
                            pbd.registrarProveedor(p);

                            JOptionPane op = new JOptionPane("Proveedor registrado");
                            op.setMessageType(JOptionPane.INFORMATION_MESSAGE);
                            limpiar();
                        } else {
                            JOptionPane op = new JOptionPane("Debe ingresar correo");
                            op.setMessageType(JOptionPane.WARNING_MESSAGE);
                        }
                    } else {
                        JOptionPane op = new JOptionPane("Debe ingresar telefono");
                        op.setMessageType(JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    JOptionPane op = new JOptionPane("Debe ingresar direccion");
                    op.setMessageType(JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane op = new JOptionPane("Debe ingresar ruc");
                op.setMessageType(JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane op = new JOptionPane("Debe ingresar razon social");
            op.setMessageType(JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtRazonSocialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRazonSocialKeyTyped

    }//GEN-LAST:event_txtRazonSocialKeyTyped

    private void txtRazonSocialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRazonSocialKeyReleased

    }//GEN-LAST:event_txtRazonSocialKeyReleased

    private void txtRazonSocialKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRazonSocialKeyPressed

        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            txtDireccion.requestFocus();
        }
    }//GEN-LAST:event_txtRazonSocialKeyPressed

    private void txtRucKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRucKeyPressed
        // TODO add your handling code here:

        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            txtRazonSocial.requestFocus();
        }

    }//GEN-LAST:event_txtRucKeyPressed

    private void txtTelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyPressed
        // TODO add your handling code here:

        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            txtCorreo.requestFocus();
        }

    }//GEN-LAST:event_txtTelefonoKeyPressed

    private void txtCorreoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyPressed
        // TODO add your handling code here:

        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            btnRegistrar.requestFocus();
            btnRegistrar.doClick();
        }

    }//GEN-LAST:event_txtCorreoKeyPressed

    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyTyped

    }//GEN-LAST:event_txtCorreoKeyTyped

    private void txtRazonSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRazonSocialActionPerformed

    }//GEN-LAST:event_txtRazonSocialActionPerformed

    private void txtRucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRucActionPerformed

        if (txtRuc.getText().length() > 0) {

            ProveedorBD pbd = new ProveedorBD();

            String ruc = txtRuc.getText();
            DefaultTableModel tabla_temporal;
            tabla_temporal = pbd.buscarProveedor(ruc);

            if (tabla_temporal.getRowCount() > 0) {

                txtRazonSocial.setText(tabla_temporal.getValueAt(0, 1).toString());
                txtDireccion.setText(tabla_temporal.getValueAt(0, 3).toString());
                txtTelefono.setText(tabla_temporal.getValueAt(0, 4).toString());
                txtCorreo.setText(tabla_temporal.getValueAt(0, 5).toString());

                JOptionPane op = new JOptionPane("El proveedor ya se encuentra registrado");
                op.setMessageType(JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane op = new JOptionPane("Debe ingresar ruc");
            op.setMessageType(JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtRucActionPerformed

    private void txtDireccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyPressed
        
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            txtTelefono.requestFocus();
        }
    }//GEN-LAST:event_txtDireccionKeyPressed

    private void txtRucKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRucKeyTyped
        
        char caracter = evt.getKeyChar();

        if (Character.isLetter(caracter) && caracter != KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_txtRucKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        
        char caracter = evt.getKeyChar();

        if (Character.isLetter(caracter) && caracter != KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtRazonSocial;
    private javax.swing.JTextField txtRuc;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
