package transportSolutionsPresentacion;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transportSolutionsLogica.AreaTrabajoBD;
import transportSolutionsLogica.EmpleadoBD;
import transportSolutionsLogica.PuestoLaboralBD;
import transportSolutionsModelo.AreaTrabajo;
import transportSolutionsModelo.Empleado;

public class transportSolutionsNuevoColaboradorView extends javax.swing.JInternalFrame {
    
    List<AreaTrabajo> lista_area;
    List<AreaTrabajo> lista_puesto;
    
    public transportSolutionsNuevoColaboradorView() {
        initComponents();
        cargarAreaTrabajo();
        cargarPuestoTrabajo();
        txtAfp.setEnabled(false);
    }
    
    void limpiar() {
        txtNombres.setText("");
        txtDni.setText("");
        txtCuentaBancaria.setText("");
        txtCorreo.setText("");
        txtTelefono.setText("");
        txtAfp.setText("");
        txtEntidadFinanciera.setText("");
        txtCuentaBancaria.setText("");
        txtSueldo.setText("");
        cmbAreaTrabajo.setSelectedIndex(0);
        cmbPuesto.setSelectedIndex(0);
        cmbSistemaPensiones.setSelectedIndex(0);
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
    
    private void cargarPuestoTrabajo() {
        
        try {
            cmbPuesto.removeAllItems();
            PuestoLaboralBD pbd = new PuestoLaboralBD();
            DefaultTableModel tabla_temporal;
            tabla_temporal = pbd.reportarPuestoTrabajo();
            lista_puesto = new ArrayList<>();
            for (int i = 0; i < tabla_temporal.getRowCount(); i++) {
                
                String descripcion = String.valueOf(tabla_temporal.getValueAt(i, 1).toString());
                lista_puesto.add(new AreaTrabajo(descripcion));
                cmbPuesto.addItem(descripcion);
            }
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al cargar puesto de trabajo");
            op.setMessageType(JOptionPane.WARNING_MESSAGE);
        }
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
        btnCerrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cmbAreaTrabajo = new javax.swing.JComboBox<>();
        cmbPuesto = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cmbSistemaPensiones = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCuentaBancaria = new javax.swing.JTextField();
        txtEntidadFinanciera = new javax.swing.JTextField();
        txtAfp = new javax.swing.JTextField();
        txtSueldo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setTitle("NUEVO COLABORADOR");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/nuevo_empleado.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Nombres");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("DNI");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Puesto");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Correo");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Telefono");

        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombresKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresKeyTyped(evt);
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

        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
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
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
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

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Area de trabajo");

        cmbAreaTrabajo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "VENTAS", "ADMINISTRATIVO", "OPERACIONES" }));
        cmbAreaTrabajo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbAreaTrabajoKeyPressed(evt);
            }
        });

        cmbPuesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR" }));
        cmbPuesto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbPuestoKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Sistema Pensiones");

        cmbSistemaPensiones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "SNP", "AFP" }));
        cmbSistemaPensiones.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbSistemaPensionesItemStateChanged(evt);
            }
        });
        cmbSistemaPensiones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbSistemaPensionesKeyPressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("AFP");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Entidad Financiera");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Cuenta");

        txtCuentaBancaria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCuentaBancariaKeyPressed(evt);
            }
        });

        txtEntidadFinanciera.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEntidadFinancieraKeyPressed(evt);
            }
        });

        txtAfp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAfpKeyPressed(evt);
            }
        });

        txtSueldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSueldoKeyPressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Sueldo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombres)
                    .addComponent(txtCorreo)
                    .addComponent(txtDni)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cmbAreaTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbSistemaPensiones, 0, 174, Short.MAX_VALUE)
                            .addComponent(txtEntidadFinanciera))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCuentaBancaria, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSueldo)
                                    .addComponent(txtAfp, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(cmbAreaTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbSistemaPensiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtAfp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(txtCuentaBancaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEntidadFinanciera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
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
                if (cmbAreaTrabajo.getSelectedItem().toString().length() > 0) {
                    if (cmbPuesto.getSelectedItem().toString().length() > 0) {
                        if (txtTelefono.getText().length() > 0) {
                            if (txtCorreo.getText().length() > 0) {
                                if (cmbSistemaPensiones.getSelectedItem().toString().length() > 0) {
                                    if (txtEntidadFinanciera.getText().length() > 0) {
                                        if (txtCuentaBancaria.getText().length() > 0) {
                                            
                                            Empleado e = new Empleado();
                                            EmpleadoBD ebd = new EmpleadoBD();
                                            
                                            e.setDni(txtDni.getText());
                                            e.setNombres(txtNombres.getText().toUpperCase());
                                            e.setCorreo(txtCorreo.getText().toUpperCase());
                                            e.setTelefono(txtTelefono.getText());
                                            e.setEntidadBancaria(txtEntidadFinanciera.getText().toUpperCase());
                                            e.setCuentaBancaria(txtCuentaBancaria.getText());
                                            e.setSueldo(Double.parseDouble(txtSueldo.getText()));
                                            
                                            if (cmbSistemaPensiones.getSelectedItem().toString().equals("SNP")) {
                                                e.setSistemaPensiones("SNP");
                                            } else if (cmbSistemaPensiones.getSelectedItem().toString().equals("AFP")) {
                                                e.setSistemaPensiones(txtAfp.getText().toUpperCase());
                                            } else {
                                                JOptionPane op = new JOptionPane("Debe seleccionar sistema de pensiones");
                                                op.setMessageType(JOptionPane.WARNING_MESSAGE);
                                            }
                                            
                                            AreaTrabajoBD atbd = new AreaTrabajoBD();
                                            String idArea = atbd.buscarAreaTrabajo(cmbAreaTrabajo.getSelectedItem().toString());
                                            e.setIdAreaTrabajo(Integer.parseInt(idArea));
                                            
                                            PuestoLaboralBD ptbd = new PuestoLaboralBD();
                                            String idPuesto = ptbd.buscarPuestoTrabajo(cmbPuesto.getSelectedItem().toString());
                                            e.setIdPuestoTrabajo(Integer.parseInt(idPuesto));
                                            
                                            ebd.registrarEmpleado(e);
                                            JOptionPane op = new JOptionPane("empleado registrado");
                                            op.setMessageType(JOptionPane.INFORMATION_MESSAGE);
                                            limpiar();
                                            
                                        } else {
                                            JOptionPane op = new JOptionPane("Debe ingresar cuenta bancaria");
                                            op.setMessageType(JOptionPane.WARNING_MESSAGE);
                                        }
                                    } else {
                                        JOptionPane op = new JOptionPane("Debe ingresar entidad financiera");
                                        op.setMessageType(JOptionPane.WARNING_MESSAGE);
                                    }
                                } else {
                                    JOptionPane op = new JOptionPane("Debe seleccionar sistema de pensiones");
                                    op.setMessageType(JOptionPane.WARNING_MESSAGE);
                                }
                            } else {
                                JOptionPane op = new JOptionPane("Debe ingresar correo");
                                op.setMessageType(JOptionPane.WARNING_MESSAGE);
                            }
                        } else {
                            JOptionPane op = new JOptionPane("Debe ingresar telefono");
                            op.setMessageType(JOptionPane.WARNING_MESSAGE);
                        }
                    } else {
                        JOptionPane op = new JOptionPane("Debe seleccionar puesto de trabajo");
                        op.setMessageType(JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    JOptionPane op = new JOptionPane("Debe seleccionar area de trabajo");
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
        
        char caracter = evt.getKeyChar();
        if (Character.isLetter(caracter) && caracter != KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDniKeyTyped

    private void txtDniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyReleased

    }//GEN-LAST:event_txtDniKeyReleased

    private void txtDniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyPressed
        
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            txtNombres.requestFocus();
        }
    }//GEN-LAST:event_txtDniKeyPressed

    private void txtNombresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyPressed
        
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            cmbAreaTrabajo.requestFocus();
        }
    }//GEN-LAST:event_txtNombresKeyPressed

    private void txtCorreoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyPressed
        
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            txtTelefono.requestFocus();
        }
    }//GEN-LAST:event_txtCorreoKeyPressed

    private void txtTelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyPressed
        
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            txtSueldo.requestFocus();
        }
    }//GEN-LAST:event_txtTelefonoKeyPressed

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        
        char caracter = evt.getKeyChar();
        if (Character.isLetter(caracter) && caracter != KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        
        if (txtDni.getText().length() > 0) {
            
            EmpleadoBD ebd = new EmpleadoBD();
            
            String buscar = txtDni.getText();
            int dni = Integer.parseInt(buscar);
            DefaultTableModel tabla_temporal;
            tabla_temporal = ebd.buscarEmpleado(dni);
            
            if (tabla_temporal.getRowCount() > 0) {
                
                txtDni.setText(tabla_temporal.getValueAt(0, 1).toString());
                txtNombres.setText(tabla_temporal.getValueAt(0, 2).toString());
                txtCorreo.setText(tabla_temporal.getValueAt(0, 3).toString());
                txtTelefono.setText(tabla_temporal.getValueAt(0, 4).toString());
                cmbPuesto.setSelectedItem(tabla_temporal.getValueAt(0, 5).toString());
                cmbAreaTrabajo.setSelectedItem(tabla_temporal.getValueAt(0, 6).toString());
                txtEntidadFinanciera.setText(tabla_temporal.getValueAt(0, 8).toString());
                txtCuentaBancaria.setText(tabla_temporal.getValueAt(0, 9).toString());
                
                String sp = tabla_temporal.getValueAt(0, 7).toString();
                if (sp.equals("SNP")) {
                    cmbSistemaPensiones.setSelectedItem(sp);
                } else {
                    cmbSistemaPensiones.setSelectedItem("AFP");
                    txtAfp.setText(sp);
                }
                
                JOptionPane op = new JOptionPane("El empleado ya esta registrado");
                op.setMessageType(JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane op = new JOptionPane("Debe ingresar dni");
            op.setMessageType(JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtDniActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void cmbAreaTrabajoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbAreaTrabajoKeyPressed
        
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            cmbPuesto.requestFocus();
        }
    }//GEN-LAST:event_cmbAreaTrabajoKeyPressed

    private void txtNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyTyped
        char caracter = evt.getKeyChar();
        if (!Character.isLetter(caracter) && caracter != KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombresKeyTyped

    private void cmbPuestoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbPuestoKeyPressed
        
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            txtCorreo.requestFocus();
        }
    }//GEN-LAST:event_cmbPuestoKeyPressed

    private void cmbSistemaPensionesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbSistemaPensionesKeyPressed
        
        if (cmbSistemaPensiones.getSelectedItem().toString().equals("AFP")) {
            
            if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
                txtAfp.requestFocus();
            }
        } else {
            
            if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
                txtEntidadFinanciera.requestFocus();
            }
        }
    }//GEN-LAST:event_cmbSistemaPensionesKeyPressed

    private void txtAfpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAfpKeyPressed
        
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            txtEntidadFinanciera.requestFocus();
        }
    }//GEN-LAST:event_txtAfpKeyPressed

    private void txtEntidadFinancieraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEntidadFinancieraKeyPressed
        
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            txtCuentaBancaria.requestFocus();
        }
    }//GEN-LAST:event_txtEntidadFinancieraKeyPressed

    private void txtCuentaBancariaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCuentaBancariaKeyPressed
        
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            btnRegistrar.requestFocus();
            btnRegistrar.doClick();
        }
    }//GEN-LAST:event_txtCuentaBancariaKeyPressed

    private void cmbSistemaPensionesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbSistemaPensionesItemStateChanged
        
        if (cmbSistemaPensiones.getSelectedItem().toString().equals("AFP")) {
            
            txtAfp.setEnabled(true);
        } else {
            
            txtAfp.setEnabled(false);
        }
    }//GEN-LAST:event_cmbSistemaPensionesItemStateChanged

    private void txtSueldoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSueldoKeyPressed
        
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            cmbSistemaPensiones.requestFocus();
        }
    }//GEN-LAST:event_txtSueldoKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cmbAreaTrabajo;
    private javax.swing.JComboBox<String> cmbPuesto;
    private javax.swing.JComboBox<String> cmbSistemaPensiones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAfp;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtCuentaBancaria;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEntidadFinanciera;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtSueldo;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
