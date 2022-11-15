package transportSolutionsPresentacion;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class transportSolutionsPrincipalView extends javax.swing.JFrame {

    public transportSolutionsPrincipalView() {
        initComponents();
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(transportSolutionsLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(transportSolutionsLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(transportSolutionsLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(transportSolutionsLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNuevoClienteRUC = new javax.swing.JButton();
        btnNuevoClienteNatural = new javax.swing.JButton();
        btnFactura = new javax.swing.JButton();
        btnSesionCaja = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnMantenimiento = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnGestionVentas = new javax.swing.JButton();
        ImageIcon icon = new ImageIcon(getClass().getResource("/fondo.jpg"));
        Image image = icon.getImage();
        principalView = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        }
        ;
        btnEconomia = new javax.swing.JButton();
        btnDocumentoTransporte = new javax.swing.JButton();
        btnDocumentoTransporte1 = new javax.swing.JButton();
        btnBoleta = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        btnNuevoClienteRUC.setBackground(new java.awt.Color(204, 204, 255));
        btnNuevoClienteRUC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNuevoClienteRUC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nuevo_cliente_ruc.png"))); // NOI18N
        btnNuevoClienteRUC.setText("Nuevo Cliente RUC");
        btnNuevoClienteRUC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoClienteRUCActionPerformed(evt);
            }
        });

        btnNuevoClienteNatural.setBackground(new java.awt.Color(204, 204, 255));
        btnNuevoClienteNatural.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNuevoClienteNatural.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nuevo_cliente.png"))); // NOI18N
        btnNuevoClienteNatural.setText("Nuevo Cliente");
        btnNuevoClienteNatural.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoClienteNaturalActionPerformed(evt);
            }
        });

        btnFactura.setBackground(new java.awt.Color(204, 255, 0));
        btnFactura.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boleta.png"))); // NOI18N
        btnFactura.setText("Factura");
        btnFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturaActionPerformed(evt);
            }
        });

        btnSesionCaja.setBackground(new java.awt.Color(204, 204, 255));
        btnSesionCaja.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSesionCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cierre_caja.png"))); // NOI18N
        btnSesionCaja.setText("Sesion Caja");
        btnSesionCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSesionCajaActionPerformed(evt);
            }
        });

        btnReportes.setBackground(new java.awt.Color(167, 167, 255));
        btnReportes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reporte_clientes.png"))); // NOI18N
        btnReportes.setText("Reportes");
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });

        btnMantenimiento.setBackground(new java.awt.Color(167, 167, 255));
        btnMantenimiento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mantenimiento.png"))); // NOI18N
        btnMantenimiento.setText("Gestion");
        btnMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMantenimientoActionPerformed(evt);
            }
        });

        btnCerrar.setBackground(new java.awt.Color(255, 0, 0));
        btnCerrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cross_2.png"))); // NOI18N
        btnCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Ayuda");

        btnGestionVentas.setBackground(new java.awt.Color(204, 204, 255));
        btnGestionVentas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGestionVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_ventas.png"))); // NOI18N
        btnGestionVentas.setText("Gestion Ventas");
        btnGestionVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionVentasActionPerformed(evt);
            }
        });

        principalView.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout principalViewLayout = new javax.swing.GroupLayout(principalView);
        principalView.setLayout(principalViewLayout);
        principalViewLayout.setHorizontalGroup(
            principalViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1402, Short.MAX_VALUE)
        );
        principalViewLayout.setVerticalGroup(
            principalViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnEconomia.setBackground(new java.awt.Color(167, 167, 255));
        btnEconomia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEconomia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/economia.png"))); // NOI18N
        btnEconomia.setText("Economia");
        btnEconomia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEconomiaActionPerformed(evt);
            }
        });

        btnDocumentoTransporte.setBackground(new java.awt.Color(204, 204, 255));
        btnDocumentoTransporte.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDocumentoTransporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recepcion_encomiendas.png"))); // NOI18N
        btnDocumentoTransporte.setText("Carga y Encomiendas");
        btnDocumentoTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocumentoTransporteActionPerformed(evt);
            }
        });

        btnDocumentoTransporte1.setBackground(new java.awt.Color(167, 167, 255));
        btnDocumentoTransporte1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDocumentoTransporte1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_transporte.png"))); // NOI18N
        btnDocumentoTransporte1.setText("Transporte");
        btnDocumentoTransporte1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocumentoTransporte1ActionPerformed(evt);
            }
        });

        btnBoleta.setBackground(new java.awt.Color(204, 255, 0));
        btnBoleta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBoleta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/factura.png"))); // NOI18N
        btnBoleta.setText("Boleta");
        btnBoleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBoletaActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                        .addGap(30, 30, 30)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSesionCaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevoClienteNatural, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevoClienteRUC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDocumentoTransporte1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMantenimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGestionVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDocumentoTransporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBoleta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEconomia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(principalView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnNuevoClienteNatural, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuevoClienteRUC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSesionCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGestionVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDocumentoTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEconomia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDocumentoTransporte1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCerrar)
                    .addComponent(jButton2))
                .addContainerGap(17, Short.MAX_VALUE))
            .addComponent(principalView)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoClienteRUCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoClienteRUCActionPerformed
        // TODO add your handling code here:

        transportSolutionsNuevoClienteRUCView cr = new transportSolutionsNuevoClienteRUCView();
        principalView.add(cr);
        Dimension desktopSize = principalView.getSize();
        Dimension FrameSize = cr.getSize();
        cr.setLocation((desktopSize.width - FrameSize.width) / 4, (desktopSize.height - FrameSize.height) / 4);
        cr.setVisible(true);
    }//GEN-LAST:event_btnNuevoClienteRUCActionPerformed

    private void btnNuevoClienteNaturalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoClienteNaturalActionPerformed

        transportSolutionsNuevoClienteView cn = new transportSolutionsNuevoClienteView();
        principalView.add(cn);
        Dimension desktopSize = principalView.getSize();
        Dimension FrameSize = cn.getSize();
        cn.setLocation((desktopSize.width - FrameSize.width) / 4, (desktopSize.height - FrameSize.height) / 4);
        cn.setVisible(true);
    }//GEN-LAST:event_btnNuevoClienteNaturalActionPerformed

    private void btnFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturaActionPerformed
        
        facturaView f = new facturaView();
        principalView.add(f);
        Dimension desktopSize = principalView.getSize();
        Dimension FrameSize = f.getSize();
        f.setLocation((desktopSize.width - FrameSize.width) / 18, (desktopSize.height - FrameSize.height) / 4);
        f.setVisible(true);
    }//GEN-LAST:event_btnFacturaActionPerformed

    private void btnSesionCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSesionCajaActionPerformed
        
        transportSolutionsSesionCajaView cc = new transportSolutionsSesionCajaView();
        principalView.add(cc);
        Dimension desktopSize = principalView.getSize();
        Dimension FrameSize = cc.getSize();
        cc.setLocation((desktopSize.width - FrameSize.width) / 30, (desktopSize.height - FrameSize.height) / 2);
        cc.setVisible(true);
        
    }//GEN-LAST:event_btnSesionCajaActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed

        transportSolutionsReportesView r = new transportSolutionsReportesView();
        r.setVisible(true);
        r.setTitle("REPORTES");
    }//GEN-LAST:event_btnReportesActionPerformed

    private void btnMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMantenimientoActionPerformed
        // TODO add your handling code here:

        transportSolutionsGestionView m = new transportSolutionsGestionView();
        m.setVisible(true);
        m.setTitle("REPORTES");
    }//GEN-LAST:event_btnMantenimientoActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed

        transportSolutionsLogin l = new transportSolutionsLogin();
        l.setVisible(true);
        transportSolutionsSesionCajaView.idCaja = 0;
        this.dispose();

    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnGestionVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionVentasActionPerformed

        transportSolutionsGestionVentasView gv = new transportSolutionsGestionVentasView();
        principalView.add(gv);
        Dimension desktopSize = principalView.getSize();
        Dimension FrameSize = gv.getSize();
        gv.setLocation((desktopSize.width - FrameSize.width) / 36, (desktopSize.height - FrameSize.height) / 4);
        gv.show();
    }//GEN-LAST:event_btnGestionVentasActionPerformed

    private void btnEconomiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEconomiaActionPerformed
        
        transportSolutionsEconomiaView e = new transportSolutionsEconomiaView();
        e.setVisible(true);
    }//GEN-LAST:event_btnEconomiaActionPerformed

    private void btnDocumentoTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocumentoTransporteActionPerformed
        
        transportSolutionsCargaEncomiendaView ce = new transportSolutionsCargaEncomiendaView();
        principalView.add(ce);
        Dimension desktopSize = principalView.getSize();
        Dimension FrameSize = ce.getSize();
        ce.setLocation((desktopSize.width - FrameSize.width) / 26, (desktopSize.height - FrameSize.height) / 2);
        ce.show();
    }//GEN-LAST:event_btnDocumentoTransporteActionPerformed

    private void btnDocumentoTransporte1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocumentoTransporte1ActionPerformed
        
        transportSolutionsTransporteView t = new transportSolutionsTransporteView();
        t.setVisible(true);
    }//GEN-LAST:event_btnDocumentoTransporte1ActionPerformed

    private void btnBoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoletaActionPerformed
        
        boletaView b = new boletaView();
        principalView.add(b);
        Dimension desktopSize = principalView.getSize();
        Dimension FrameSize = b.getSize();
        b.setLocation((desktopSize.width - FrameSize.width) / 36, (desktopSize.height - FrameSize.height) / 4);
        b.show();
    }//GEN-LAST:event_btnBoletaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBoleta;
    private javax.swing.JButton btnCerrar;
    public javax.swing.JButton btnDocumentoTransporte;
    public javax.swing.JButton btnDocumentoTransporte1;
    public javax.swing.JButton btnEconomia;
    private javax.swing.JButton btnFactura;
    public javax.swing.JButton btnGestionVentas;
    public javax.swing.JButton btnMantenimiento;
    private javax.swing.JButton btnNuevoClienteNatural;
    private javax.swing.JButton btnNuevoClienteRUC;
    public javax.swing.JButton btnReportes;
    public javax.swing.JButton btnSesionCaja;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDesktopPane principalView;
    // End of variables declaration//GEN-END:variables
}
