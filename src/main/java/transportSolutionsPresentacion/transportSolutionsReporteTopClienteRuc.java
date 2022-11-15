package transportSolutionsPresentacion;

import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transportSolutionsLogica.FacturaBD;
import transportSolutionsReporte.Reporte;

public class transportSolutionsReporteTopClienteRuc extends javax.swing.JInternalFrame {
    
    Reporte rtv;

    public transportSolutionsReporteTopClienteRuc() {
        initComponents();
        reportar();
        espaciadoTabla();
    }

    private void espaciadoTabla() {
        
        reporteTopClientes.getColumnModel().getColumn(0).setPreferredWidth(20);
        reporteTopClientes.getColumnModel().getColumn(1).setPreferredWidth(170);
        reporteTopClientes.getColumnModel().getColumn(3).setPreferredWidth(170);
    }

    private void reportar() {

        FacturaBD f = new FacturaBD();
        DefaultTableModel tabla_temporal;
        tabla_temporal = f.topClienteRuc();
        reporteTopClientes.setModel(tabla_temporal);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMantenimiento = new javax.swing.JDesktopPane();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        reporteTopClientes = new javax.swing.JTable();
        btnImprimir = new javax.swing.JButton();
        btnCargar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("REPORTE LISTA TOP CLIENTE RUC");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_clientes.png"))); // NOI18N

        javax.swing.GroupLayout panelMantenimientoLayout = new javax.swing.GroupLayout(panelMantenimiento);
        panelMantenimiento.setLayout(panelMantenimientoLayout);
        panelMantenimientoLayout.setHorizontalGroup(
            panelMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelMantenimientoLayout.setVerticalGroup(
            panelMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 234, Short.MAX_VALUE)
        );

        btnSalir.setBackground(new java.awt.Color(255, 0, 0));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cross_2.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        reporteTopClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "SERIE", "CODIGO", "TIPO"
            }
        ));
        reporteTopClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reporteTopClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(reporteTopClientes);

        btnImprimir.setBackground(new java.awt.Color(204, 255, 0));
        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/download.png"))); // NOI18N
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        btnCargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clean.png"))); // NOI18N
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelMantenimiento)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(panelMantenimiento)
                        .addGap(249, 249, 249))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnCargar)
                        .addGap(28, 28, 28)
                        .addComponent(btnImprimir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir)))
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void reporteTopClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reporteTopClientesMouseClicked

    }//GEN-LAST:event_reporteTopClientesMouseClicked

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
       
        reportar();
        espaciadoTabla();
    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        
        try {
            rtv = new Reporte();
            rtv.exportarExcel(reporteTopClientes);
        } catch (IOException e) {
            JOptionPane op = new JOptionPane("Error al exportar excel");
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JDesktopPane panelMantenimiento;
    public static javax.swing.JTable reporteTopClientes;
    // End of variables declaration//GEN-END:variables
}
