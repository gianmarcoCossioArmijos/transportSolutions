package transportSolutionsPresentacion;

import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.table.DefaultTableModel;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;
import transportSolutionsLogica.CajaBD;
import transportSolutionsLogica.CargaBD;
import transportSolutionsLogica.ClienteRucBD;
import transportSolutionsLogica.CorrelativoFacturaBD;
import transportSolutionsLogica.DetalleFacturaBD;
import transportSolutionsLogica.FacturaBD;
import transportSolutionsLogica.FleteBD;
import transportSolutionsLogica.RecepcionBD;
import transportSolutionsLogica.UsuarioBD;
import transportSolutionsModelo.Carga;
import transportSolutionsModelo.CorrelativoFactura;
import transportSolutionsModelo.DetalleFactura;
import transportSolutionsModelo.Factura;
import transportSolutionsModelo.Flete;
import transportSolutionsModelo.Recepcion;

public class facturaView extends javax.swing.JInternalFrame {

    DefaultTableModel tablaProductos;
    String codigoActual = "";
    String serieActual = "";
    String estado = "ACTIVO";

    public facturaView() {

        initComponents();
        obtenerFecha();
        obtenerNumero();
        desactivar();
        verificarCaja();
    }

    private void activar() {

        txtOrigen.setEnabled(true);
        txtDestino.setEnabled(true);
        txtTipoCarga.setEnabled(true);
        txtDescripcion.setEnabled(true);
        txtPrecio.setEnabled(true);
        btnQuitar.setEnabled(true);
        btnAgregar.setEnabled(true);
        txtIgv.setEnabled(true);
        txtTotal.setEnabled(true);
        txtFecha.setEnabled(true);
        txtRuc.setEnabled(true);
        btnBuscar.setEnabled(true);
        txtRazonSocial.setEnabled(true);
        txtTelefono.setEnabled(true);
        btnLimpiar.setEnabled(true);
        btnProforma.setEnabled(true);
        btnVenta.setEnabled(true);
        cmbTipo.setEnabled(true);
    }

    private void desactivar() {

        txtOrigen.setEnabled(false);
        txtDestino.setEnabled(false);
        txtTipoCarga.setEnabled(false);
        txtDescripcion.setEnabled(false);
        txtPrecio.setEnabled(false);
        btnQuitar.setEnabled(false);
        btnAgregar.setEnabled(false);
        txtIgv.setEnabled(false);
        txtTotal.setEnabled(false);
        txtFecha.setEnabled(false);
        txtCorrelativo.setEnabled(false);
        txtRuc.setEnabled(false);
        btnBuscar.setEnabled(false);
        txtRazonSocial.setEnabled(false);
        txtTelefono.setEnabled(false);
        txtCaja.setEnabled(false);
        btnLimpiar.setEnabled(false);
        btnProforma.setEnabled(false);
        btnVenta.setEnabled(false);
        txtDniDestinatario.setEnabled(false);
        txtDestinatario.setEnabled(false);
        cmbTipo.setEnabled(false);
    }

    public void verificarCaja() {

        if (transportSolutionsSesionCajaView.idCaja > 0) {

            CajaBD cbd = new CajaBD();
            int id = transportSolutionsSesionCajaView.idCaja;
            String descripcion = cbd.buscarNombreCaja(id);
            txtCaja.setText(descripcion);
            activar();
        } else {
            JOptionPane op = new JOptionPane("Debe aperturar caja");
            op.setMessageType(JOptionPane.WARNING_MESSAGE);
        }
    }

    public void limpiarProducto() {

        txtOrigen.setText("");
        txtDestino.setText("");
        txtTipoCarga.setText("");
        txtDescripcion.setText("");
        txtPrecio.setText("");
    }

    public void limpiarCliente() {

        txtRazonSocial.setText("");
        txtRuc.setText("");
        txtTelefono.setText("");
        txtFecha.setText("");
        txtCorrelativo.setText("");
    }

    private void limpiarTabla() {

        DefaultTableModel temp = (DefaultTableModel) tabla_factura.getModel();
        int filas = tabla_factura.getRowCount();

        for (int i = 0; filas > i; i++) {
            temp.removeRow(0);
        }
    }

    private void formatoTabla() {

        tabla_factura.getColumnModel().getColumn(2).setPreferredWidth(160);
        tabla_factura.getColumnModel().getColumn(3).setPreferredWidth(200);
    }

    private void obtenerFecha() {

        Calendar calendario = Calendar.getInstance();
        int dia = calendario.get(Calendar.DAY_OF_MONTH);
        int mes = calendario.get(Calendar.MONTH) + 1;
        int anio = calendario.get(Calendar.YEAR);
        String fecha = anio + "-" + mes + "-" + dia;
        txtFecha.setText(fecha);
    }

    private void obtenerNumero() {

        CorrelativoFacturaBD cfbd = new CorrelativoFacturaBD();
        CorrelativoFactura cf = new CorrelativoFactura();

        List<CorrelativoFactura> lista_correlativos = cfbd.obetenerNumero();
        String codigo = lista_correlativos.get(0).getCodigo();
        String serie = lista_correlativos.get(0).getSerie();
        int se = Integer.parseInt(serie);

//        CAMBIAR EL NUMERO 20 POR 999999, YA QUE SOLO SE COLOCO ASÌ PARA PROBAR EL METODO
        if (se < 30) {

            serieActual = serie(se);
            int antiguoNumero = Integer.valueOf(codigo) + 1;
            codigoActual = correlativo(antiguoNumero);
            txtCorrelativo.setText(serieActual + "-" + codigoActual);
        } else {

            int nuevaSerie = se + 1;
            serieActual = serie(nuevaSerie);
            int nuevoCodigo = 000001;
            codigoActual = correlativo(nuevoCodigo);
            cf.setSerie(serieActual);
            cf.setCodigo(codigoActual);
            cfbd.registrarCorrelativoF(cf);
            txtCorrelativo.setText(serieActual + "-" + codigoActual);
        }
    }

    private String correlativo(int antiguoNumero) {

        String nuevoNumero;
        String codTemporal = String.valueOf(antiguoNumero);
        if (codTemporal.length() == 1) {
            nuevoNumero = "00000" + antiguoNumero;
        } else if (codTemporal.length() == 2) {
            nuevoNumero = "0000" + antiguoNumero;
        } else if (codTemporal.length() == 3) {
            nuevoNumero = "000" + antiguoNumero;
        } else if (codTemporal.length() == 4) {
            nuevoNumero = "00" + antiguoNumero;
        } else if (codTemporal.length() == 5) {
            nuevoNumero = "0" + antiguoNumero;
        } else {
            nuevoNumero = "" + antiguoNumero;
        }
        return nuevoNumero;
    }

    private String serie(int antiguaSerie) {

        String nuevaSerie;
        String codTemporal = String.valueOf(antiguaSerie);
        if (codTemporal.length() == 1) {
            nuevaSerie = "000" + antiguaSerie;
        } else if (codTemporal.length() == 2) {
            nuevaSerie = "00" + antiguaSerie;
        } else if (codTemporal.length() == 3) {
            nuevaSerie = "0" + antiguaSerie;
        } else {
            nuevaSerie = "" + antiguaSerie;
        }
        return nuevaSerie;
    }

    private void obtenerTotal() {

        double precio = Double.parseDouble(txtPrecio.getText());
        if (txtTotal.getText().length() == 0) {

            txtTotal.setText("" + precio);
        } else {

            double p = Double.parseDouble(txtPrecio.getText());
            double total = Double.parseDouble(txtTotal.getText());
            double nuevoTotal = total + p;
            txtTotal.setText("" + nuevoTotal);
        }
    }

    private void actualizarTotal() {

        int filas = tabla_factura.getRowCount();
        DefaultTableModel tabla_temporal = (DefaultTableModel) tabla_factura.getModel();
        int total = 0;
        for (int i = 0; i < filas; i++) {

            total = total + Integer.parseInt(tabla_temporal.getValueAt(i, 4).toString());
        }
        txtTotal.setText(total + "");
    }

    private void obtenerIGV() {

        double precio = Double.parseDouble(txtTotal.getText());
        double igv = precio * 0.18;
        BigDecimal bd = new BigDecimal(igv).setScale(2, RoundingMode.HALF_UP);
        double nuevoIgv = bd.doubleValue();
        txtIgv.setText(nuevoIgv + "");
    }

    private void registrarDetalleVenta(int idFactura) {

        DefaultTableModel tabla = (DefaultTableModel) tabla_factura.getModel();
        int filas = tabla.getRowCount();

        DetalleFactura df = new DetalleFactura();
        DetalleFacturaBD dfbd = new DetalleFacturaBD();

        for (int i = 0; i < filas; i++) {

            df.setOrigen(tabla.getValueAt(i, 0).toString());
            df.setDestino(tabla.getValueAt(i, 1).toString());
            df.setTipoCarga(tabla.getValueAt(i, 2).toString());
            df.setDescripcion(tabla.getValueAt(i, 3).toString());
            df.setPrecio(Double.parseDouble(tabla.getValueAt(i, 4).toString()));
            df.setIdFactura(idFactura);
            dfbd.registrarDetalleFactura(df);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVenta = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_factura = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtRuc = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        txtCorrelativo = new javax.swing.JTextField();
        txtRazonSocial = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtCaja = new javax.swing.JTextField();
        btnProforma = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        desc1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtOrigen = new javax.swing.JTextField();
        txtDestino = new javax.swing.JTextField();
        txtTipoCarga = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        txtPrecio = new javax.swing.JTextField();
        btnQuitar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        txtTotal = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtIgv = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        cmbTipo = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtDniDestinatario = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtDestinatario = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("FACTURA");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/boleta.png"))); // NOI18N

        btnVenta.setBackground(new java.awt.Color(204, 255, 0));
        btnVenta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/check.png"))); // NOI18N
        btnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentaActionPerformed(evt);
            }
        });

        btnCerrar.setBackground(new java.awt.Color(255, 0, 0));
        btnCerrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cross_2.png"))); // NOI18N
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        tabla_factura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ORIGEN", "DESTINO", "TIPO CARGA", "DESCRIPCION", "PRECIO"
            }
        ));
        jScrollPane2.setViewportView(tabla_factura);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setText("Correlativo");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setText("Fecha");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("RUC");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("R. Social");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("Telefono");

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyReleased(evt);
            }
        });

        txtRuc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRucKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRucKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRucKeyTyped(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(204, 255, 0));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buscar.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtRazonSocial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRazonSocialKeyPressed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("Caja");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtRuc, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCorrelativo, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(txtRazonSocial))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCaja)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorrelativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(txtCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(txtRuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13))
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        btnProforma.setBackground(new java.awt.Color(204, 204, 255));
        btnProforma.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnProforma.setText("Proforma");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Precio");

        desc1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        desc1.setText("Descripcion");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Tipo de Carga");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Destino");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Origen");

        txtOrigen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtOrigenKeyPressed(evt);
            }
        });

        txtDestino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDestinoKeyPressed(evt);
            }
        });

        txtTipoCarga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTipoCargaKeyPressed(evt);
            }
        });

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(txtDescripcion);

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPrecioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        btnQuitar.setBackground(new java.awt.Color(255, 0, 0));
        btnQuitar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnQuitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cross_2.png"))); // NOI18N
        btnQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarActionPerformed(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(204, 255, 0));
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/check.png"))); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTipoCarga)
                    .addComponent(txtOrigen)
                    .addComponent(txtDestino)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtPrecio)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(desc1)
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTipoCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desc1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Total a Pagar");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("IGV");

        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clean.png"))); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CARGA", "ENCOMIENDA", "FLETE" }));
        cmbTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTipoItemStateChanged(evt);
            }
        });
        cmbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("DNI Destinatario");

        txtDniDestinatario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDniDestinatarioKeyPressed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Destinatario");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDniDestinatario)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtDestinatario))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDniDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(19, 19, 19)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTotal)
                            .addComponent(txtIgv, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addGap(7, 7, 7))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                        .addComponent(btnProforma, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIgv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnProforma, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        if (txtOrigen.getText().length() > 0) {
            if (txtDestino.getText().length() > 0) {
                if (txtTipoCarga.getText().length() > 0) {
                    if (txtDescripcion.getText().length() > 0) {
                        if (txtPrecio.getText().length() > 0) {

                            DefaultTableModel tabla = (DefaultTableModel) tabla_factura.getModel();
                            String origen = txtOrigen.getText().toUpperCase();
                            String destino = txtDestino.getText().toUpperCase();
                            String tipoCarga = txtTipoCarga.getText().toUpperCase();
                            String descripcion = txtDescripcion.getText().toUpperCase();
                            String precio = txtPrecio.getText();

                            Object[] data = {origen, destino, tipoCarga, descripcion, precio};
                            tabla.addRow(data);
                            formatoTabla();

                            obtenerTotal();
                            obtenerIGV();
                            limpiarProducto();
                        } else {
                            JOptionPane op = new JOptionPane("Debe ingresar precio");
                            op.setMessageType(JOptionPane.WARNING_MESSAGE);
                        }
                    } else {
                        JOptionPane op = new JOptionPane("Debe ingresar descripcion");
                        op.setMessageType(JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    JOptionPane op = new JOptionPane("Debe ingresar tipo de carga");
                    op.setMessageType(JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane op = new JOptionPane("Debe ingresar destino");
                op.setMessageType(JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane op = new JOptionPane("Debe ingresar origen");
            op.setMessageType(JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarActionPerformed

        int filaSeleccionada = tabla_factura.getSelectedRow();

        try {

            DefaultTableModel tabla_temporal = (DefaultTableModel) tabla_factura.getModel();
            tabla_temporal.removeRow(filaSeleccionada);

            tabla_factura.setModel(tabla_temporal);

            actualizarTotal();
            obtenerIGV();
        } catch (Exception e) {
            JOptionPane op = new JOptionPane("Error al quitar");
            op.setMessageType(JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnQuitarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        if (txtRuc.getText().length() > 0) {

            ClienteRucBD crbd = new ClienteRucBD();

            String ruc = txtRuc.getText();
            DefaultTableModel tabla_temporal;
            tabla_temporal = crbd.buscarClienteRuc(ruc);

            if (tabla_temporal.getRowCount() > 0) {

                txtRuc.setText(tabla_temporal.getValueAt(0, 2).toString());
                txtRazonSocial.setText(tabla_temporal.getValueAt(0, 1).toString());
                txtTelefono.setText(tabla_temporal.getValueAt(0, 5).toString());
            }
        } else {
            JOptionPane op = new JOptionPane("Debe ingresar ruc");
            op.setMessageType(JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed

    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtPrecioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyPressed

        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            btnAgregar.requestFocus();
            btnAgregar.doClick();
        }
    }//GEN-LAST:event_txtPrecioKeyPressed

    private void txtRazonSocialKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRazonSocialKeyPressed

    }//GEN-LAST:event_txtRazonSocialKeyPressed

    private void txtDescripcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyPressed

        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            txtPrecio.requestFocus();
        }
    }//GEN-LAST:event_txtDescripcionKeyPressed

    private void txtRucKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRucKeyPressed

        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            btnBuscar.requestFocus();
            btnBuscar.doClick();
        }
    }//GEN-LAST:event_txtRucKeyPressed

    private void txtRucKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRucKeyReleased

    }//GEN-LAST:event_txtRucKeyReleased

    private void txtTelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoKeyPressed

    private void txtTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoKeyReleased

    private void txtTipoCargaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoCargaKeyPressed
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            txtDescripcion.requestFocus();
        }
    }//GEN-LAST:event_txtTipoCargaKeyPressed

    private void txtDestinoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDestinoKeyPressed

        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            txtTipoCarga.requestFocus();
        }
    }//GEN-LAST:event_txtDestinoKeyPressed

    private void txtOrigenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOrigenKeyPressed

        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            txtDestino.requestFocus();
        }
    }//GEN-LAST:event_txtOrigenKeyPressed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed

        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentaActionPerformed

        if (cmbTipo.getSelectedItem().toString().length() > 0) {
            if (txtFecha.getText().length() > 0) {
                if (txtCorrelativo.getText().length() > 0) {
                    if (txtRuc.getText().length() > 0) {
                        if (txtRazonSocial.getText().length() > 0) {
                            if (txtTelefono.getText().length() > 0) {

                                Factura f = new Factura();
                                FacturaBD fbd = new FacturaBD();

                                f.setTotal((Double.parseDouble(txtTotal.getText())));
                                f.setFecha(txtFecha.getText());
                                f.setCorrelativo(txtCorrelativo.getText());
                                f.setEstado(estado);
                                f.setTipo(cmbTipo.getSelectedItem().toString());

                                ClienteRucBD crbd = new ClienteRucBD();
                                int idCliente = Integer.parseInt(crbd.obtenerIdClienteRuc(txtRuc.getText()));
                                f.setIdClienteRuc(idCliente);

                                UsuarioBD ubd = new UsuarioBD();
                                int idUsuario = Integer.parseInt(ubd.obtenerIdUsuario(transportSolutionsLogin.dni_publico));
                                f.setIdUsuario(idUsuario);
                                f.setIdCaja(transportSolutionsSesionCajaView.idCaja);

                                int idFactura = fbd.registrarFactura(f);
                                registrarDetalleVenta(idFactura);

                                if (cmbTipo.getSelectedItem().toString().equals("CARGA")) {

                                    DefaultTableModel tabla = (DefaultTableModel) tabla_factura.getModel();
                                    int filas = tabla.getRowCount();

                                    Carga carga = new Carga();
                                    CargaBD cargabd = new CargaBD();

                                    for (int i = 0; i < filas; i++) {

                                        carga.setFechaVenta(txtFecha.getText());
                                        carga.setOrigen(tabla_factura.getValueAt(i, 0).toString());
                                        carga.setDestino(tabla_factura.getValueAt(i, 1).toString());
                                        carga.setDniDestinatario(txtDniDestinatario.getText());
                                        carga.setDestinatario(txtDestinatario.getText());
                                        carga.setDescripcion(tabla_factura.getValueAt(i, 3).toString());
                                        carga.setEstado("PENDIENTE");
                                        carga.setCorrelativo(txtCorrelativo.getText());
                                        cargabd.registrarCarga(carga);
                                    }
                                } else if (cmbTipo.getSelectedItem().toString().equals("ENCOMIENDA")) {

                                    DefaultTableModel tabla = (DefaultTableModel) tabla_factura.getModel();
                                    int filas = tabla.getRowCount();

                                    Recepcion recepcion = new Recepcion();
                                    RecepcionBD recepcionbd = new RecepcionBD();

                                    for (int i = 0; i < filas; i++) {

                                        recepcion.setFechaVenta(txtFecha.getText());
                                        recepcion.setOrigen(tabla_factura.getValueAt(i, 0).toString());
                                        recepcion.setDestino(tabla_factura.getValueAt(i, 1).toString());
                                        recepcion.setDescripcion(tabla_factura.getValueAt(i, 3).toString());
                                        recepcion.setEstado("PENDIENTE");
                                        recepcion.setDniDestinatario(txtDniDestinatario.getText());
                                        recepcion.setDestinatario(txtDestinatario.getText());
                                        recepcion.setCorrelativo(txtCorrelativo.getText());
                                        recepcionbd.registrarRecepcion(recepcion);
                                    }
                                } else if (cmbTipo.getSelectedItem().toString().equals("FLETE")) {

                                    Flete flete = new Flete();
                                    FleteBD fletebd = new FleteBD();

                                    flete.setFechaVenta(txtFecha.getText());
                                    flete.setOrigen(tabla_factura.getValueAt(0, 0).toString());
                                    flete.setDestino(tabla_factura.getValueAt(0, 1).toString());
                                    flete.setDocumentoCliente(txtRuc.getText());
                                    flete.setCliente(txtRazonSocial.getText());
                                    flete.setDescripcion(tabla_factura.getValueAt(0, 3).toString());
                                    flete.setEstado("PENDIENTE");
                                    flete.setCorrelativo(txtCorrelativo.getText());
                                    fletebd.registrarFlete(flete);
                                }

                                CorrelativoFactura cf = new CorrelativoFactura();
                                CorrelativoFacturaBD cfbd = new CorrelativoFacturaBD();
                                cf.setCodigo(codigoActual);
                                cf.setSerie(serieActual);
                                cfbd.actualizarCorrelativo(cf);

                                limpiarCliente();
                                limpiarTabla();
                                txtTotal.setText("");
                                txtIgv.setText("");
                                txtDniDestinatario.setText("");
                                txtDestinatario.setText("");
                                cmbTipo.setSelectedIndex(0);
                                obtenerFecha();
                                obtenerNumero();
                            } else {
                                JOptionPane op = new JOptionPane("Debe ingresar telefono");
                                op.setMessageType(JOptionPane.WARNING_MESSAGE);
                            }
                        } else {
                            JOptionPane op = new JOptionPane("Debe ingresar razon social");
                            op.setMessageType(JOptionPane.WARNING_MESSAGE);
                        }
                    } else {
                        JOptionPane op = new JOptionPane("Debe ingresar ruc");
                        op.setMessageType(JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    JOptionPane op = new JOptionPane("Debe ingresar correlativo");
                    op.setMessageType(JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane op = new JOptionPane("Debe ingresar fecha");
                op.setMessageType(JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane op = new JOptionPane("Debe indicar si la venta es carga o encomienda seleccionando en el recuadro tipo");
            op.setMessageType(JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnVentaActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        txtRazonSocial.setText("");
        txtRuc.setText("");
        txtTelefono.setText("");
        txtTotal.setText("");
        txtIgv.setText("");
        limpiarProducto();
        limpiarTabla();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void cmbTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTipoItemStateChanged

        if (cmbTipo.getSelectedItem().toString().equals("ENCOMIENDA") || cmbTipo.getSelectedItem().toString().equals("CARGA")) {

            txtDniDestinatario.setEnabled(true);
            txtDestinatario.setEnabled(true);
        } else {

            txtDniDestinatario.setEnabled(false);
            txtDestinatario.setEnabled(false);
        }
    }//GEN-LAST:event_cmbTipoItemStateChanged

    private void cmbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTipoActionPerformed

    private void txtDniDestinatarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniDestinatarioKeyPressed

        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            txtDestinatario.requestFocus();
        }
    }//GEN-LAST:event_txtDniDestinatarioKeyPressed

    private void txtRucKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRucKeyTyped
        
        char  caracter = evt.getKeyChar();   
        if (Character.isLetter(caracter) && caracter != KeyEvent.VK_SPACE){
            evt.consume();
        } 
    }//GEN-LAST:event_txtRucKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        
        char  caracter = evt.getKeyChar();   
        if (Character.isLetter(caracter) && caracter != KeyEvent.VK_SPACE){
            evt.consume();
        } 
    }//GEN-LAST:event_txtPrecioKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnProforma;
    private javax.swing.JButton btnQuitar;
    private javax.swing.JButton btnVenta;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JLabel desc1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla_factura;
    private javax.swing.JTextField txtCaja;
    private javax.swing.JTextField txtCorrelativo;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtDestinatario;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtDniDestinatario;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtIgv;
    private javax.swing.JTextField txtOrigen;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtRazonSocial;
    private javax.swing.JTextField txtRuc;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTipoCarga;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
