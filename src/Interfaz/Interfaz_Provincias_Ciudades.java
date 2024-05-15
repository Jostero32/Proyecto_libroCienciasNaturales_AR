/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Interfaz_Provincias_Ciudades extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public Interfaz_Provincias_Ciudades() {
        initComponents();
        String columnas[] = {"Nombre", "Codigo"};
        this.tablaProv.setColumnIdentifiers(columnas);
        this.tablaCiu.setColumnIdentifiers(columnas);
        this.Tabla_Provincias.setModel(tablaProv);
        this.Tabla_Ciudades.setModel(tablaCiu);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Btn_Buscar = new javax.swing.JLabel();
        Btn_Agregar_Prov = new javax.swing.JButton();
        Btn_Modificar_Prov = new javax.swing.JButton();
        Btn_Eliminar_Ciu = new javax.swing.JButton();
        Btn_Agregar_Ciu = new javax.swing.JButton();
        Btn_Modificar_Ciu = new javax.swing.JButton();
        Btn_Eliminar_Prov = new javax.swing.JButton();
        ComboBox_QueBusca = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Ciudades = new javax.swing.JTable();
        Texto_Buscar_Prov = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_Provincias = new javax.swing.JTable();
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

        Btn_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BTN_Buscar.png"))); // NOI18N
        add(Btn_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 35, 35));

        Btn_Agregar_Prov.setText("Agregar");
        Btn_Agregar_Prov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Agregar_ProvActionPerformed(evt);
            }
        });
        add(Btn_Agregar_Prov, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 130, 40));

        Btn_Modificar_Prov.setText("Modificar");
        add(Btn_Modificar_Prov, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 130, 40));

        Btn_Eliminar_Ciu.setText("Eliminar");
        add(Btn_Eliminar_Ciu, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 180, 130, 40));

        Btn_Agregar_Ciu.setText("Agregar");
        add(Btn_Agregar_Ciu, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 60, 130, 40));

        Btn_Modificar_Ciu.setText("Modificar");
        add(Btn_Modificar_Ciu, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 120, 130, 40));

        Btn_Eliminar_Prov.setText("Eliminar");
        add(Btn_Eliminar_Prov, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 130, 40));

        ComboBox_QueBusca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Codigo" }));
        add(ComboBox_QueBusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 110, -1));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        Tabla_Ciudades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Codigo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla_Ciudades.setGridColor(new java.awt.Color(102, 102, 102));
        Tabla_Ciudades.setRowHeight(30);
        Tabla_Ciudades.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(Tabla_Ciudades);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 260, 350));

        Texto_Buscar_Prov.setText("Buscar");
        add(Texto_Buscar_Prov, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 150, -1));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        Tabla_Provincias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Codigo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla_Provincias.setGridColor(new java.awt.Color(102, 102, 102));
        Tabla_Provincias.setRowHeight(30);
        jScrollPane2.setViewportView(Tabla_Provincias);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 280, 350));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Fondo_Paginas.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 500));
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_Agregar_ProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Agregar_ProvActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_Btn_Agregar_ProvActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        agrInt.dispose();
    }//GEN-LAST:event_formMouseClicked

    public Interfaz_Agregar_ProvCiu agrInt = new Interfaz_Agregar_ProvCiu();
    public DefaultTableModel tablaProv = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Hacer todas las celdas no editables
            }
        };
    public DefaultTableModel tablaCiu = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Hacer todas las celdas no editables
            }
        };
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Btn_Agregar_Ciu;
    public javax.swing.JButton Btn_Agregar_Prov;
    public javax.swing.JLabel Btn_Buscar;
    public javax.swing.JButton Btn_Eliminar_Ciu;
    public javax.swing.JButton Btn_Eliminar_Prov;
    public javax.swing.JButton Btn_Modificar_Ciu;
    public javax.swing.JButton Btn_Modificar_Prov;
    public javax.swing.JComboBox<String> ComboBox_QueBusca;
    public javax.swing.JTable Tabla_Ciudades;
    public javax.swing.JTable Tabla_Provincias;
    public javax.swing.JTextField Texto_Buscar_Prov;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}