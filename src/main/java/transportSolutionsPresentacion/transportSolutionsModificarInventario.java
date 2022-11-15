package transportSolutionsPresentacion;

import java.awt.event.KeyEvent;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transportSolutionsLogica.InventarioBD;
import transportSolutionsLogica.ProveedorBD;
import transportSolutionsModelo.Inventario;
import transportSolutionsModelo.Proveedor;

public class transportSolutionsModificarInventario extends javax.swing.JInternalFrame {
    
    List<Proveedor> lista_proveedor;

    public transportSolutionsModificarInventario() {
        initComponents();
        deshabilitar();
        cargarInventario();
    }

    public void limpiar() {

        txtCodigoBarras.setText("");
        txtDescripcion.setText("");
        txtCategoria.setText("");
        txtMarca.setText("");
        txtPrecio.setText("");
        cmbProveedor.setSelectedIndex(0);
        txtComprobante.setText("");
    }

    private void habilitar() {

        txtDescripcion.setEnabled(true);
        txtCategoria.setEnabled(true);
        txtMarca.setEnabled(true);
        txtPrecio.setEnabled(true);
        cmbProveedor.setEnabled(true);
        txtComprobante.setEnabled(true);
        dcFechaCompra.setEnabled(true);
        btnCargarComprobante.setEnabled(true);
    }

    private void deshabilitar() {

        txtDescripcion.setEnabled(false);
        txtCategoria.setEnabled(false);
        txtMarca.setEnabled(false);
        txtPrecio.setEnabled(false);
        cmbProveedor.setEnabled(false);
        txtComprobante.setEnabled(false);
        dcFechaCompra.setEnabled(false);
        btnCargarComprobante.setEnabled(false);
    }

    private void cargarInventario() {
        
        try {
            cmbProveedor.removeAllItems();
            ProveedorBD abd = new ProveedorBD();
            DefaultTableModel tabla_temporal;
            tabla_temporal = abd.reportarProveedor();
            lista_proveedor = new ArrayList<>();
            for (int i = 0; i < tabla_temporal.getRowCount(); i++) {
                
                String id = String.valueOf(tabla_temporal.getValueAt(i, 0).toString());
                String razonSocial = String.valueOf(tabla_temporal.getValueAt(i, 1).toString());
                String ruc = String.valueOf(tabla_temporal.getValueAt(i, 2).toString());
                String direccion = String.valueOf(tabla_temporal.getValueAt(i, 3).toString());
                String telefono = String.valueOf(tabla_temporal.getValueAt(i, 4).toString());
                
                lista_proveedor.add(new Proveedor(id,razonSocial,ruc,direccion,telefono));
                cmbProveedor.addItem(razonSocial);
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
        txtCodigoBarras = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        btnCerrar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnBorrar = new javax.swing.JButton();
        txtDescripcion = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        txtComprobante = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnCargarComprobante = new javax.swing.JButton();
        dcFechaCompra = new com.toedter.calendar.JDateChooser();
        cmbProveedor = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setTitle("NUEVO INVENTARIO");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/modificar_inventario.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Codigo Barras");

        txtCodigoBarras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoBarrasActionPerformed(evt);
            }
        });
        txtCodigoBarras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoBarrasKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoBarrasKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Descripcion");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Categoria");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Marca");

        txtMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMarcaKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Precio");

        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPrecioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
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
        jLabel6.setText("Fecha Compra");

        btnBorrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clean.png"))); // NOI18N
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
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

        txtCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCategoriaKeyPressed(evt);
            }
        });

        txtComprobante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtComprobanteKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Proveedor");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Comprobante");

        btnCargarComprobante.setBackground(new java.awt.Color(204, 255, 0));
        btnCargarComprobante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buscar.png"))); // NOI18N
        btnCargarComprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarComprobanteActionPerformed(evt);
            }
        });

        dcFechaCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dcFechaCompraKeyPressed(evt);
            }
        });

        cmbProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(31, 31, 31)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                .addComponent(txtMarca))
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigoBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtComprobante, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCargarComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(dcFechaCompra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbProveedor, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                        .addGap(107, 107, 107)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(dcFechaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(cmbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCargarComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistrar)
                    .addComponent(btnCerrar)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed

        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        if (txtCodigoBarras.getText().length() > 0) {
            if (txtDescripcion.getText().length() > 0) {
                if (txtCategoria.getText().length() > 0) {
                    if (txtMarca.getText().length() > 0) {
                        if (txtPrecio.getText().length() > 0) {
                            if (dcFechaCompra.getDate().toString().length() > 0) {
                                if (!"SELECCIONAR".equals(cmbProveedor.getSelectedItem().toString())) {
                                    if (txtComprobante.getText().length() > 0) {

                                        Inventario i = new Inventario();
                                        InventarioBD ibd = new InventarioBD();

                                        String codigo = ibd.buscarIdInventario(txtCodigoBarras.getText().toUpperCase());

                                        if (codigo.length() > 0) {

                                            i.setCodigoBarras(txtCodigoBarras.getText().toUpperCase());
                                            i.setDescripcion(txtDescripcion.getText().toUpperCase());
                                            i.setCategoria(txtCategoria.getText().toUpperCase());
                                            i.setMarca(txtMarca.getText().toUpperCase());
                                            i.setPrecio(Double.parseDouble(txtPrecio.getText()));

                                            int dia = dcFechaCompra.getCalendar().get(Calendar.DAY_OF_MONTH);
                                            int mes = dcFechaCompra.getCalendar().get(Calendar.MONTH) + 1;
                                            int año = dcFechaCompra.getCalendar().get(Calendar.YEAR);
                                            String fecha = año + "-" + mes + "-" + dia;
                                            i.setFechaCompra(fecha);

                                            ProveedorBD pbd = new ProveedorBD();
                                            String idProveedor = pbd.buscarIdProveedorDescripcion(cmbProveedor.getSelectedItem().toString());
                                            i.setIdProveedor(Integer.parseInt(idProveedor));
                                            i.setComprobante(txtComprobante.getText().toUpperCase());

                                            int id = Integer.parseInt(codigo);
                                            ibd.modificarInventario(i, id);
                                            JOptionPane op = new JOptionPane("Inventario modificado");
                                            op.setMessageType(JOptionPane.INFORMATION_MESSAGE);
                                            limpiar();

                                        } else {
                                            JOptionPane op = new JOptionPane("No se encontro en el inventario");
                                            op.setMessageType(JOptionPane.WARNING_MESSAGE);
                                        }
                                    } else {
                                        JOptionPane op = new JOptionPane("Debe ingresar comprobante");
                                        op.setMessageType(JOptionPane.WARNING_MESSAGE);
                                    }
                                } else {
                                    JOptionPane op = new JOptionPane("Debe ingresar proveedor");
                                    op.setMessageType(JOptionPane.WARNING_MESSAGE);
                                }
                            } else {
                                JOptionPane op = new JOptionPane("Debe ingresar fecha de compra");
                                op.setMessageType(JOptionPane.WARNING_MESSAGE);
                            }
                        } else {
                            JOptionPane op = new JOptionPane("Debe ingresar precio");
                            op.setMessageType(JOptionPane.WARNING_MESSAGE);
                        }
                    } else {
                        JOptionPane op = new JOptionPane("Debe ingresar marca");
                        op.setMessageType(JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    JOptionPane op = new JOptionPane("Debe ingresar categoria");
                    op.setMessageType(JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane op = new JOptionPane("Debe ingresar descripcion");
                op.setMessageType(JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane op = new JOptionPane("Debe ingresar codigo de barras");
            op.setMessageType(JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed

        limpiar();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void txtCodigoBarrasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoBarrasKeyPressed

        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            txtDescripcion.requestFocus();
        }
    }//GEN-LAST:event_txtCodigoBarrasKeyPressed

    private void txtDescripcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyPressed

        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            txtCategoria.requestFocus();
        }
    }//GEN-LAST:event_txtDescripcionKeyPressed

    private void txtCategoriaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCategoriaKeyPressed

        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            txtMarca.requestFocus();
        }
    }//GEN-LAST:event_txtCategoriaKeyPressed

    private void txtMarcaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaKeyPressed

        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            txtPrecio.requestFocus();
        }
    }//GEN-LAST:event_txtMarcaKeyPressed

    private void txtPrecioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyPressed

        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            dcFechaCompra.requestFocus();
        }
    }//GEN-LAST:event_txtPrecioKeyPressed

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void txtCodigoBarrasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoBarrasKeyTyped

    }//GEN-LAST:event_txtCodigoBarrasKeyTyped

    private void txtDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyTyped

    }//GEN-LAST:event_txtDescripcionKeyTyped

    private void txtCodigoBarrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoBarrasActionPerformed

        if (txtCodigoBarras.getText().length() > 0) {

            InventarioBD ibd = new InventarioBD();
            DefaultTableModel tabla_temporal;
            String codigo = txtCodigoBarras.getText();
            tabla_temporal = ibd.buscarInventario(codigo);

            if (tabla_temporal.getRowCount() > 0) {

                txtDescripcion.setText(tabla_temporal.getValueAt(0, 2).toString());
                txtMarca.setText(tabla_temporal.getValueAt(0, 3).toString());
                txtCategoria.setText(tabla_temporal.getValueAt(0, 4).toString());
                txtPrecio.setText(tabla_temporal.getValueAt(0, 5).toString());

                String fecha_bd = String.valueOf(tabla_temporal.getValueAt(0, 6));
                SimpleDateFormat formato = new SimpleDateFormat("yyy-MM-dd");
                java.util.Date fecha;
                try {
                    fecha = (java.util.Date) formato.parse(fecha_bd);
                    dcFechaCompra.setDate(fecha);
                } catch (ParseException e) {
                }

                cmbProveedor.setSelectedItem(tabla_temporal.getValueAt(0, 7).toString());
                txtComprobante.setText(tabla_temporal.getValueAt(0, 9).toString());

                habilitar();
            } else {
                JOptionPane op = new JOptionPane("No encontrado en el nventario");
                op.setMessageType(JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane op = new JOptionPane("Debe buscar en inventario para modificar");
            op.setMessageType(JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtCodigoBarrasActionPerformed

    private void txtComprobanteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtComprobanteKeyPressed

        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            btnRegistrar.requestFocus();
            btnRegistrar.doClick();
        }
    }//GEN-LAST:event_txtComprobanteKeyPressed

    private void btnCargarComprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarComprobanteActionPerformed

        JFileChooser archivo = new JFileChooser();
        int ventana = archivo.showOpenDialog(null);
        if (ventana == JFileChooser.APPROVE_OPTION) {

            File file = archivo.getSelectedFile();
            txtComprobante.setText(String.valueOf(file));
        }
    }//GEN-LAST:event_btnCargarComprobanteActionPerformed

    private void dcFechaCompraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dcFechaCompraKeyPressed

        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            cmbProveedor.requestFocus();
        }
    }//GEN-LAST:event_dcFechaCompraKeyPressed

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped

        char caracter = evt.getKeyChar();
        if (Character.isLetter(caracter) && caracter != KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCargarComprobante;
    public javax.swing.JButton btnCerrar;
    public javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cmbProveedor;
    private com.toedter.calendar.JDateChooser dcFechaCompra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JTextField txtCategoria;
    public javax.swing.JTextField txtCodigoBarras;
    public javax.swing.JTextField txtComprobante;
    public javax.swing.JTextField txtDescripcion;
    public javax.swing.JTextField txtMarca;
    public javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables

}
