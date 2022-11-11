package transportSolutionsPresentacion;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class transportSolutionsReportesView extends javax.swing.JFrame {

    public transportSolutionsReportesView() {
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

        btnVentasPorClienteRuc = new javax.swing.JButton();
        btnTopClientesNatural = new javax.swing.JButton();
        btnVentasPorClienteNatural = new javax.swing.JButton();
        btnTopClientesRuc = new javax.swing.JButton();
        btnVentasPorDia = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnVentasPorVendedor = new javax.swing.JButton();
        btnVentasPorFecha = new javax.swing.JButton();
        ImageIcon icon = new ImageIcon(getClass().getResource("/fondo4.jpg"));
        Image image = icon.getImage();
        principalView = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        }
        ;
        btnTopVendedor = new javax.swing.JButton();
        btnCierreCaja = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        btnVentasPorClienteRuc.setBackground(new java.awt.Color(204, 204, 255));
        btnVentasPorClienteRuc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVentasPorClienteRuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_ventas.png"))); // NOI18N
        btnVentasPorClienteRuc.setText("Ventas por cliente RUC");
        btnVentasPorClienteRuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasPorClienteRucActionPerformed(evt);
            }
        });

        btnTopClientesNatural.setBackground(new java.awt.Color(204, 204, 255));
        btnTopClientesNatural.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTopClientesNatural.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_clientes.png"))); // NOI18N
        btnTopClientesNatural.setText("Top Clientes Natural");
        btnTopClientesNatural.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTopClientesNaturalActionPerformed(evt);
            }
        });

        btnVentasPorClienteNatural.setBackground(new java.awt.Color(204, 204, 255));
        btnVentasPorClienteNatural.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVentasPorClienteNatural.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_ventas.png"))); // NOI18N
        btnVentasPorClienteNatural.setText("Ventas por Cliente Natural");
        btnVentasPorClienteNatural.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasPorClienteNaturalActionPerformed(evt);
            }
        });

        btnTopClientesRuc.setBackground(new java.awt.Color(204, 204, 255));
        btnTopClientesRuc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTopClientesRuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_clientes.png"))); // NOI18N
        btnTopClientesRuc.setText("Top Clientes RUC");
        btnTopClientesRuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTopClientesRucActionPerformed(evt);
            }
        });

        btnVentasPorDia.setBackground(new java.awt.Color(204, 204, 255));
        btnVentasPorDia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVentasPorDia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_ventas.png"))); // NOI18N
        btnVentasPorDia.setText("Ventas por Dia");
        btnVentasPorDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasPorDiaActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cross_2.png"))); // NOI18N
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnVentasPorVendedor.setBackground(new java.awt.Color(204, 204, 255));
        btnVentasPorVendedor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVentasPorVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_ventas.png"))); // NOI18N
        btnVentasPorVendedor.setText("Ventas por vendedor");
        btnVentasPorVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasPorVendedorActionPerformed(evt);
            }
        });

        btnVentasPorFecha.setBackground(new java.awt.Color(204, 204, 255));
        btnVentasPorFecha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVentasPorFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_ventas.png"))); // NOI18N
        btnVentasPorFecha.setText("Ventas por Fecha");
        btnVentasPorFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasPorFechaActionPerformed(evt);
            }
        });

        principalView.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout principalViewLayout = new javax.swing.GroupLayout(principalView);
        principalView.setLayout(principalViewLayout);
        principalViewLayout.setHorizontalGroup(
            principalViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1150, Short.MAX_VALUE)
        );
        principalViewLayout.setVerticalGroup(
            principalViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnTopVendedor.setBackground(new java.awt.Color(204, 204, 255));
        btnTopVendedor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTopVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_clientes.png"))); // NOI18N
        btnTopVendedor.setText("Top Vendedor");
        btnTopVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTopVendedorActionPerformed(evt);
            }
        });

        btnCierreCaja.setBackground(new java.awt.Color(204, 204, 255));
        btnCierreCaja.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCierreCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cierre_caja.png"))); // NOI18N
        btnCierreCaja.setText("Sesiones de Caja");
        btnCierreCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCierreCajaActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(11, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnVentasPorClienteRuc, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(btnVentasPorClienteNatural)
                            .addComponent(btnTopClientesNatural, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(btnTopClientesRuc, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(btnVentasPorDia, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(btnVentasPorFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(btnVentasPorVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(btnTopVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(btnCierreCaja, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(principalView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(btnVentasPorClienteNatural, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVentasPorClienteRuc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTopClientesNatural, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTopClientesRuc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVentasPorDia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVentasPorFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVentasPorVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTopVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCierreCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(16, 16, 16))
            .addComponent(principalView)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVentasPorClienteRucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasPorClienteRucActionPerformed
        // TODO add your handling code here:

        transportSolutionsReporteClienteRuc cr = new transportSolutionsReporteClienteRuc();
        principalView.add(cr);
        Dimension desktopSize = principalView.getSize();
        Dimension FrameSize = cr.getSize();
        cr.setLocation((desktopSize.width - FrameSize.width) / 5, (desktopSize.height - FrameSize.height) / 2);
        cr.setVisible(true);
    }//GEN-LAST:event_btnVentasPorClienteRucActionPerformed

    private void btnTopClientesNaturalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTopClientesNaturalActionPerformed

        transportSolutionsReporteTopClienteNatural tcn = new transportSolutionsReporteTopClienteNatural();
        principalView.add(tcn);
        Dimension desktopSize = principalView.getSize();
        Dimension FrameSize = tcn.getSize();
        tcn.setLocation((desktopSize.width - FrameSize.width) / 18, (desktopSize.height - FrameSize.height) / 4);
        tcn.setVisible(true);
    }//GEN-LAST:event_btnTopClientesNaturalActionPerformed

    private void btnVentasPorClienteNaturalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasPorClienteNaturalActionPerformed

        transportSolutionsReporteClienteNatural cn = new transportSolutionsReporteClienteNatural();
        principalView.add(cn);
        Dimension desktopSize = principalView.getSize();
        Dimension FrameSize = cn.getSize();
        cn.setLocation((desktopSize.width - FrameSize.width) / 5, (desktopSize.height - FrameSize.height) / 2);
        cn.setVisible(true);
    }//GEN-LAST:event_btnVentasPorClienteNaturalActionPerformed

    private void btnTopClientesRucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTopClientesRucActionPerformed

        transportSolutionsReporteTopClienteRuc tcr = new transportSolutionsReporteTopClienteRuc();
        principalView.add(tcr);
        Dimension desktopSize = principalView.getSize();
        Dimension FrameSize = tcr.getSize();
        tcr.setLocation((desktopSize.width - FrameSize.width) / 18, (desktopSize.height - FrameSize.height) / 4);
        tcr.setVisible(true);
    }//GEN-LAST:event_btnTopClientesRucActionPerformed

    private void btnVentasPorDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasPorDiaActionPerformed
        
        transportSolutionsReporteVentaDia vd = new transportSolutionsReporteVentaDia();
        principalView.add(vd);
        Dimension desktopSize = principalView.getSize();
        Dimension FrameSize = vd.getSize();
        vd.setLocation((desktopSize.width - FrameSize.width) / 18, (desktopSize.height - FrameSize.height) / 4);
        vd.show();
    }//GEN-LAST:event_btnVentasPorDiaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnVentasPorVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasPorVendedorActionPerformed

        transportSolutionsReporteVentasVendedor vv = new transportSolutionsReporteVentasVendedor();
        principalView.add(vv);
        Dimension desktopSize = principalView.getSize();
        Dimension FrameSize = vv.getSize();
        vv.setLocation((desktopSize.width - FrameSize.width) / 18, (desktopSize.height - FrameSize.height) / 4);
        vv.show();
    }//GEN-LAST:event_btnVentasPorVendedorActionPerformed

    private void btnVentasPorFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasPorFechaActionPerformed
        
        transportSolutionsReporteVentaFecha vf = new transportSolutionsReporteVentaFecha();
        principalView.add(vf);
        Dimension desktopSize = principalView.getSize();
        Dimension FrameSize = vf.getSize();
        vf.setLocation((desktopSize.width - FrameSize.width) / 18, (desktopSize.height - FrameSize.height) / 4);
        vf.show();
    }//GEN-LAST:event_btnVentasPorFechaActionPerformed

    private void btnTopVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTopVendedorActionPerformed
        
        transportSolutionsReporteTopVendedor tv = new transportSolutionsReporteTopVendedor();
        principalView.add(tv);
        Dimension desktopSize = principalView.getSize();
        Dimension FrameSize = tv.getSize();
        tv.setLocation((desktopSize.width - FrameSize.width) / 18, (desktopSize.height - FrameSize.height) / 4);
        tv.show();
    }//GEN-LAST:event_btnTopVendedorActionPerformed

    private void btnCierreCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCierreCajaActionPerformed
                
        transportSolutionsReporteSesionCaja sc = new transportSolutionsReporteSesionCaja();
        principalView.add(sc);
        Dimension desktopSize = principalView.getSize();
        Dimension FrameSize = sc.getSize();
        sc.setLocation((desktopSize.width - FrameSize.width) / 18, (desktopSize.height - FrameSize.height) / 4);
        sc.show();        
    }//GEN-LAST:event_btnCierreCajaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCierreCaja;
    public javax.swing.JButton btnTopClientesNatural;
    public javax.swing.JButton btnTopClientesRuc;
    public javax.swing.JButton btnTopVendedor;
    private javax.swing.JButton btnVentasPorClienteNatural;
    private javax.swing.JButton btnVentasPorClienteRuc;
    public javax.swing.JButton btnVentasPorDia;
    public javax.swing.JButton btnVentasPorFecha;
    public javax.swing.JButton btnVentasPorVendedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDesktopPane principalView;
    // End of variables declaration//GEN-END:variables
}
