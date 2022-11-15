package transportSolutionsPresentacion;

import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import transportSolutionsModelo.ClienteNatural;
import javax.swing.table.DefaultTableModel;
import transportSolutionsLogica.ClienteNaturalBD;

public class transportSolutionsModificarClienteView extends javax.swing.JInternalFrame {

    public transportSolutionsModificarClienteView() {
        initComponents();
        txtDni.requestFocus();
        deshabilitar();
    }

    void limpiar() {
        txtNombres.setText("");
        txtDni.setText("");
        txtCorreo.setText("");
        txtTelefono.setText("");
        dcFechaNacimiento.setCalendar(null);
    }

    public void deshabilitar() {

        txtNombres.setEnabled(false);
        txtCorreo.setEnabled(false);
        txtTelefono.setEnabled(false);
        dcFechaNacimiento.setEnabled(false);
    }

    public void habilitar() {

        txtNombres.setEnabled(true);
        txtCorreo.setEnabled(true);
        txtTelefono.setEnabled(true);
        dcFechaNacimiento.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        btnBorrar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        dcFechaNacimiento = new com.toedter.calendar.JDateChooser();

        setTitle("MODIFICAR CLIENTE");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/editar_usuario.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Nombres");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("DNI");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Fecha de Nacimineto");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Correo");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Telefono");

        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombresKeyPressed(evt);
            }
        });

        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDniKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDniKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });

        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCorreoKeyPressed(evt);
            }
        });

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyPressed(evt);
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

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cross_2.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        dcFechaNacimiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dcFechaNacimientoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
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
                        .addGap(87, 87, 87)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNombres, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                    .addComponent(dcFechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDni))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(dcFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed

        limpiar();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        if (txtDni.getText().length() > 0) {
            if (txtNombres.getText().length() > 0) {
                if (dcFechaNacimiento.getDate().toString().length() > 0) {
                    if (txtCorreo.getText().length() > 0) {
                        if (txtTelefono.getText().length() > 0) {

                            ClienteNatural cn = new ClienteNatural();
                            ClienteNaturalBD cnbd = new ClienteNaturalBD();

                            int dia = dcFechaNacimiento.getCalendar().get(Calendar.DAY_OF_MONTH);
                            int mes = dcFechaNacimiento.getCalendar().get(Calendar.MONTH) + 1;
                            int año = dcFechaNacimiento.getCalendar().get(Calendar.YEAR);
                            String fecha = año + "-" + mes + "-" + dia;

                            cn.setDni(Integer.parseInt(txtDni.getText()));
                            cn.setNombres(txtNombres.getText().toUpperCase());
                            cn.setCorreo(txtCorreo.getText().toUpperCase());
                            cn.setFechaNacimiento(fecha);
                            cn.setTelefono(txtTelefono.getText());
                            cnbd.modificarCliente(cn);

                            JOptionPane op = new JOptionPane("Cliente modificado");
                            op.setMessageType(JOptionPane.INFORMATION_MESSAGE);
                            limpiar();
                        } else {
                            JOptionPane op = new JOptionPane("Debe ingresar telefono");
                            op.setMessageType(JOptionPane.WARNING_MESSAGE);
                        }
                    } else {
                        JOptionPane op = new JOptionPane("Debe ingresar correo");
                        op.setMessageType(JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    JOptionPane op = new JOptionPane("Debe ingresar fecha de nacimiento");
                    op.setMessageType(JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane op = new JOptionPane("Debe ingresar nombres");
                op.setMessageType(JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane op = new JOptionPane("Debe ingresar dni");
            op.setMessageType(JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        // TODO add your handling code here:

        char caracter = evt.getKeyChar();

        if (Character.isLetter(caracter) && caracter != KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDniKeyTyped

    private void txtDniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyReleased


    }//GEN-LAST:event_txtDniKeyReleased

    private void txtDniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyPressed
        // TODO add your handling code here:

        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            txtNombres.requestFocus();
        }

        if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE) {

            dcFechaNacimiento.setEnabled(true);
            btnRegistrar.setEnabled(true);

            txtNombres.setText("");
            txtCorreo.setText("");
            txtTelefono.setText("");
        }

    }//GEN-LAST:event_txtDniKeyPressed

    private void txtNombresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyPressed
        // TODO add your handling code here:

        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            dcFechaNacimiento.requestFocus();
        }

    }//GEN-LAST:event_txtNombresKeyPressed

    private void dcFechaNacimientoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dcFechaNacimientoKeyPressed
        // TODO add your handling code here:

        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            txtCorreo.requestFocus();
        }

    }//GEN-LAST:event_dcFechaNacimientoKeyPressed

    private void txtCorreoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyPressed
        // TODO add your handling code here:

        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            txtTelefono.requestFocus();
        }

    }//GEN-LAST:event_txtCorreoKeyPressed

    private void txtTelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyPressed
        // TODO add your handling code here:

        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            btnRegistrar.requestFocus();
            btnRegistrar.doClick();
        }

    }//GEN-LAST:event_txtTelefonoKeyPressed

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed

        if (txtDni.getText().length() > 0) {

            ClienteNaturalBD cbd = new ClienteNaturalBD();

            String dni = txtDni.getText();
            DefaultTableModel tabla_temporal;
            tabla_temporal = cbd.buscarClienteNatural(dni);

            if (tabla_temporal.getRowCount() > 0) {

                txtNombres.setText(tabla_temporal.getValueAt(0, 1).toString());
                txtDni.setText(tabla_temporal.getValueAt(0, 2).toString());
                txtCorreo.setText(tabla_temporal.getValueAt(0, 3).toString());
                String fecha_bd = String.valueOf(tabla_temporal.getValueAt(0, 4).toString());
                SimpleDateFormat fecha_formatear = new SimpleDateFormat("yyy-MM-dd");
                java.util.Date fecha;
                try {
                    fecha = (java.util.Date) fecha_formatear.parse(fecha_bd);
                    dcFechaNacimiento.setDate(fecha);
                } catch (ParseException e) {
                }
                txtTelefono.setText(tabla_temporal.getValueAt(0, 5).toString());

                habilitar();
            } else {
                JOptionPane op = new JOptionPane("Cliente no encontrado");
                op.setMessageType(JOptionPane.WARNING_MESSAGE);
                txtDni.requestFocus();
            }
        } else {
            JOptionPane op = new JOptionPane("Debe ingresar dni");
            op.setMessageType(JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtDniActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnRegistrar;
    private com.toedter.calendar.JDateChooser dcFechaNacimiento;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
