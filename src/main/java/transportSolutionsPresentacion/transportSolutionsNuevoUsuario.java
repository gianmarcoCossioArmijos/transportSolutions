package transportSolutionsPresentacion;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transportSolutionsLogica.TipoUsuarioBD;
import transportSolutionsLogica.UsuarioBD;
import transportSolutionsModelo.TipoUsuario;
import transportSolutionsModelo.Usuario;

public class transportSolutionsNuevoUsuario extends javax.swing.JInternalFrame {
    
    List<TipoUsuario> lista;

    public transportSolutionsNuevoUsuario() {
        initComponents();
        cargarTipoUsuario();
    }

    public void limpiar() {

        txtDni.setText("");
        txtNombres.setText("");
        txtContraseña.setText("");
        txtConfirmarContraseña.setText("");
        txtCorreo.setText("");
        cmbTipoUsuario.setSelectedIndex(0);
    }
    
    private void cargarTipoUsuario() {

        try {
            cmbTipoUsuario.removeAllItems();
            TipoUsuarioBD tbd = new TipoUsuarioBD();
            DefaultTableModel tabla_temporal;
            tabla_temporal = tbd.reportarTipoUsuario();
            lista = new ArrayList<>();
            for (int i = 0; i < tabla_temporal.getRowCount(); i++) {

                String descripcion = String.valueOf(tabla_temporal.getValueAt(i, 1).toString());
                lista.add(new TipoUsuario(descripcion));
                cmbTipoUsuario.addItem(descripcion);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error al cargar tipo usuario", JOptionPane.ERROR_MESSAGE);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtConfirmarContraseña = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        btnCerrar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cmbTipoUsuario = new javax.swing.JComboBox<>();
        btnBorrar = new javax.swing.JButton();
        txtNombres = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("NUEVO USUARIO");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/nuevo_usuario.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("DNI");

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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Nombres");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Contraseña");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Confirmar contraseña");

        txtConfirmarContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtConfirmarContraseñaKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Correo");

        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCorreoKeyPressed(evt);
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

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Tipo Usuario");

        cmbTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "ADMINISTRATIVO", "VENTAS" }));
        cmbTipoUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbTipoUsuarioKeyPressed(evt);
            }
        });

        btnBorrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clean.png"))); // NOI18N
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombresKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresKeyTyped(evt);
            }
        });

        txtContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContraseñaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCorreo)
                            .addComponent(cmbTipoUsuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtContraseña))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombres, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtConfirmarContraseña, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
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
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtConfirmarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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

        if (txtDni.getText().length() > 0) {
            if (txtNombres.getText().length() > 0) {
                if (txtContraseña.getText().length() > 0) {
                    if (txtConfirmarContraseña.getText().length() > 0) {
                        if (txtCorreo.getText().length() > 0) {
                            if (!"SELECCIONAR".equals(cmbTipoUsuario.getSelectedItem().toString())) {

                                if (txtContraseña.getText().equals(txtConfirmarContraseña.getText())) {

                                    Usuario u = new Usuario();
                                    UsuarioBD ubd = new UsuarioBD();
                                    String t = cmbTipoUsuario.getSelectedItem().toString();
                                    int tipo = Integer.parseInt(ubd.buscarTipoUsuario(t));

                                    u.setDni(txtDni.getText());
                                    u.setNombres(txtNombres.getText().toUpperCase());
                                    u.setContraseña(txtContraseña.getText());
                                    u.setCorreo(txtCorreo.getText().toUpperCase());
                                    u.setIdtipoUsuario(tipo);

                                    ubd.registrarUsuario(u);
                                    JOptionPane op = new JOptionPane("Usuario registrado");
                                    op.setMessageType(JOptionPane.INFORMATION_MESSAGE);
                                    limpiar();
                                }
                            } else {
                                JOptionPane op = new JOptionPane("Debe seleccionar tipo de usuario");
                                op.setMessageType(JOptionPane.WARNING_MESSAGE);
                            }
                        } else {
                            JOptionPane op = new JOptionPane("Debe ingresar correo");
                            op.setMessageType(JOptionPane.WARNING_MESSAGE);
                        }
                    } else {
                        JOptionPane op = new JOptionPane("Debe ingresar confirmacion de contraseña");
                        op.setMessageType(JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    JOptionPane op = new JOptionPane("Debe ingresar contraseña");
                    op.setMessageType(JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane op = new JOptionPane("Debe ingresar nombres");
                op.setMessageType(JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane op = new JOptionPane("Debe ingresar DNI");
            op.setMessageType(JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed

        limpiar();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void txtDniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyPressed
        // TODO add your handling code here:

        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            txtNombres.requestFocus();
        }

    }//GEN-LAST:event_txtDniKeyPressed

    private void cmbTipoUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbTipoUsuarioKeyPressed
        // TODO add your handling code here:

        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            btnRegistrar.requestFocus();
            btnRegistrar.doClick();
        }

    }//GEN-LAST:event_cmbTipoUsuarioKeyPressed

    private void txtNombresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyPressed
        // TODO add your handling code here:

        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            txtContraseña.requestFocus();
        }

    }//GEN-LAST:event_txtNombresKeyPressed

    private void txtContraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseñaKeyPressed
        // TODO add your handling code here:

        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            txtConfirmarContraseña.requestFocus();
        }

    }//GEN-LAST:event_txtContraseñaKeyPressed

    private void txtConfirmarContraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfirmarContraseñaKeyPressed
        // TODO add your handling code here:

        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            txtCorreo.requestFocus();
        }

    }//GEN-LAST:event_txtConfirmarContraseñaKeyPressed

    private void txtCorreoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyPressed
        // TODO add your handling code here:

        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            cmbTipoUsuario.requestFocus();
        }

    }//GEN-LAST:event_txtCorreoKeyPressed

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped

        char caracter = evt.getKeyChar();

        if (Character.isLetter(caracter) && caracter != KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDniKeyTyped

    private void txtNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyTyped

        char caracter = evt.getKeyChar();

        if (!Character.isLetter(caracter) && caracter != KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombresKeyTyped

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed

        if (txtDni.getText().length() > 0) {

            Usuario u = new Usuario();
            UsuarioBD ubd = new UsuarioBD();

            int dni = Integer.parseInt(txtDni.getText());
            DefaultTableModel tabla_temporal;
            tabla_temporal = ubd.buscarUsuario(dni);

            if (tabla_temporal.getRowCount() > 0) {

                txtDni.setText(tabla_temporal.getValueAt(0, 1).toString());
                txtNombres.setText(tabla_temporal.getValueAt(0, 2).toString());
                txtCorreo.setText(tabla_temporal.getValueAt(0, 3).toString());
                cmbTipoUsuario.setSelectedItem(tabla_temporal.getValueAt(0, 4).toString());

                JOptionPane op = new JOptionPane("El usuario ya esta registrado");
                op.setMessageType(JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane op = new JOptionPane("Debe ingresar dni");
            op.setMessageType(JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtDniActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBorrar;
    public javax.swing.JButton btnCerrar;
    public javax.swing.JButton btnRegistrar;
    public javax.swing.JComboBox<String> cmbTipoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JTextField txtConfirmarContraseña;
    public javax.swing.JTextField txtContraseña;
    public javax.swing.JTextField txtCorreo;
    public javax.swing.JTextField txtDni;
    public javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables

}
