/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Interfaz_Productos extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public Interfaz_Productos() {
        initComponents();
        String columnas[]={"Nombre","Codigo","Codigo Proveedor","Cantidad"};
        this.tabla.setColumnIdentifiers(columnas);
        this.Tabla_Producto.setModel(tabla);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Btn_Agregar_Prod = new javax.swing.JButton();
        Btn_Modificar_Prod = new javax.swing.JButton();
        Btn_Eliminar_Prod = new javax.swing.JButton();
        ComboBox_QueBusca = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Producto = new javax.swing.JTable();
        Texto_Buscar_Prod = new javax.swing.JTextField();
        Img_QR_Prod = new javax.swing.JLabel();
        Btn_Buscar_Prod = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(730, 250));
        setPreferredSize(new java.awt.Dimension(930, 490));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btn_Agregar_Prod.setText("Agregar");
        Btn_Agregar_Prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Agregar_ProdActionPerformed(evt);
            }
        });
        add(Btn_Agregar_Prod, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 130, 40));

        Btn_Modificar_Prod.setText("Modificar");
        add(Btn_Modificar_Prod, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 130, 40));

        Btn_Eliminar_Prod.setText("Eliminar");
        add(Btn_Eliminar_Prod, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 130, 40));

        ComboBox_QueBusca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Codigo", "Proveedor" }));
        add(ComboBox_QueBusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 110, -1));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        Tabla_Producto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Código producto", "Código Proveedor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla_Producto.setGridColor(new java.awt.Color(102, 102, 102));
        Tabla_Producto.setRowHeight(30);
        Tabla_Producto.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(Tabla_Producto);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 660, 350));

        Texto_Buscar_Prod.setText("Buscar");
        add(Texto_Buscar_Prod, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 150, -1));

        Img_QR_Prod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(Img_QR_Prod, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 150, 170, 170));

        Btn_Buscar_Prod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BTN_Buscar.png"))); // NOI18N
        add(Btn_Buscar_Prod, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 35, 35));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Fondo_Paginas.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 500));
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_Agregar_ProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Agregar_ProdActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_Btn_Agregar_ProdActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        agrInt.dispose();
    }//GEN-LAST:event_formMouseClicked

    public Interfaz_agregarProd agrInt=new Interfaz_agregarProd();
    public DefaultTableModel tabla = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Hacer todas las celdas no editables
            }
        };
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Btn_Agregar_Prod;
    public javax.swing.JLabel Btn_Buscar_Prod;
    public javax.swing.JButton Btn_Eliminar_Prod;
    public javax.swing.JButton Btn_Modificar_Prod;
    public javax.swing.JComboBox<String> ComboBox_QueBusca;
    public javax.swing.JLabel Img_QR_Prod;
    public javax.swing.JTable Tabla_Producto;
    public javax.swing.JTextField Texto_Buscar_Prod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}