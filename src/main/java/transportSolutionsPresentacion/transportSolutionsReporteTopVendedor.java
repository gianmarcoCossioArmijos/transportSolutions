package transportSolutionsPresentacion;

import java.io.IOException;
import java.util.Calendar;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import transportSolutionsLogica.BoletaBD;
//import net.sf.jasperreports.engine.JRException;
//import net.sf.jasperreports.engine.JasperFillManager;
//import net.sf.jasperreports.engine.JasperPrint;
//import net.sf.jasperreports.engine.JasperReport;
//import net.sf.jasperreports.engine.util.JRLoader;
//import net.sf.jasperreports.view.JasperViewer;
import transportSolutionsReporte.Reporte;

public class transportSolutionsReporteTopVendedor extends javax.swing.JInternalFrame {

    Reporte rtv;

    public transportSolutionsReporteTopVendedor() {
        initComponents();
        espaciadoTabla();
    }

    private void espaciadoTabla() {

        reporteTopClientes.getColumnModel().getColumn(0).setPreferredWidth(20);
        reporteTopClientes.getColumnModel().getColumn(1).setPreferredWidth(200);
        reporteTopClientes.getColumnModel().getColumn(2).setPreferredWidth(100);
        reporteTopClientes.getColumnModel().getColumn(3).setPreferredWidth(200);
    }

    private void limpiar() {

        DefaultTableModel temp = (DefaultTableModel) reporteTopClientes.getModel();
        int filas = reporteTopClientes.getRowCount();

        for (int i = 0; filas > i; i++) {
            temp.removeRow(0);
        }
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
        btnBuscar = new javax.swing.JButton();
        dcFechaInicio = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dcFechaFinal = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("REPORTE LISTA TOP DE VENDEDORES");
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
                "VENTAS", "NOMBRE", "DNI", "CORREO", "ID"
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

        btnBuscar.setBackground(new java.awt.Color(204, 255, 0));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buscar.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Fecha de Inicio");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Fecha Final");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnImprimir, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                        .addComponent(btnCargar, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dcFechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dcFechaFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelMantenimiento)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelMantenimiento)
                        .addGap(249, 249, 249))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dcFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dcFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnBuscar)
                        .addGap(31, 31, 31)
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

        limpiar();
    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        BoletaBD b = new BoletaBD();
        DefaultTableModel tabla_temporal;

        int diaInicio = dcFechaInicio.getCalendar().get(Calendar.DAY_OF_MONTH);
        int mesInicio = dcFechaInicio.getCalendar().get(Calendar.MONTH) + 1;
        int anioInicio = dcFechaInicio.getCalendar().get(Calendar.YEAR);
        String fechaInincio = anioInicio + "-" + mesInicio + "-" + diaInicio;

        int diaFin = dcFechaFinal.getCalendar().get(Calendar.DAY_OF_MONTH);
        int mesFin = dcFechaFinal.getCalendar().get(Calendar.MONTH) + 1;
        int anioFin = dcFechaFinal.getCalendar().get(Calendar.YEAR);
        String fechaFin = anioFin + "-" + mesFin + "-" + diaFin;

        tabla_temporal = b.topVendedor(fechaInincio, fechaFin);
        reporteTopClientes.setModel(tabla_temporal);
        espaciadoTabla();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed

        try {
            rtv = new Reporte();
            rtv.exportarExcel(reporteTopClientes);
        } catch (IOException e) {

        }
//        Conexion mysql = new Conexion();
//        Connection cn = null;
//        try {
//
//            JasperReport reporte = null;
//            String ruta = "C:\\Users\\gianmarcoCossio\\Documents\\NetBeansProjects\\transport solutions\\transportSolutions\\src\\main\\java\\transportSolutionsReporte\\ReporteTopVendedor.jasper";
//
//            int diaInicio = dcFechaInicio.getCalendar().get(Calendar.DAY_OF_MONTH);
//            int mesInicio = dcFechaInicio.getCalendar().get(Calendar.MONTH) + 1;
//            int anioInicio = dcFechaInicio.getCalendar().get(Calendar.YEAR);
//            String fechaInincio = anioInicio + "-" + mesInicio + "-" + diaInicio;
//
//            int diaFin = dcFechaFinal.getCalendar().get(Calendar.DAY_OF_MONTH);
//            int mesFin = dcFechaFinal.getCalendar().get(Calendar.MONTH) + 1;
//            int anioFin = dcFechaFinal.getCalendar().get(Calendar.YEAR);
//            String fechaFin = anioFin + "-" + mesFin + "-" + diaFin;
//
//            Map parametro = new HashMap();
//            parametro.clear();
//            parametro.put("fechaInicio", fechaInincio);
//            parametro.put("fechaFinal", fechaFin);
//
//            reporte = (JasperReport) JRLoader.loadObjectFromFile(ruta);
//            JasperPrint print = JasperFillManager.fillReport(reporte, parametro, cn);
//            JasperViewer view = new JasperViewer(print, false);
//            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//            view.setTitle("Reporte Top de Vendedores");
//            view.setVisible(true);
//        } catch (JRException ex) {
//            Logger.getLogger(transportSolutionsReporteTopVendedor.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_btnImprimirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnSalir;
    private com.toedter.calendar.JDateChooser dcFechaFinal;
    private com.toedter.calendar.JDateChooser dcFechaInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JDesktopPane panelMantenimiento;
    public static javax.swing.JTable reporteTopClientes;
    // End of variables declaration//GEN-END:variables
}
