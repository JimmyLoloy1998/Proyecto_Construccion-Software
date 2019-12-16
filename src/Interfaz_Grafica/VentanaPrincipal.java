/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz_Grafica;

import Metodos.MetodosDepartamento;
import Metodos.MetodosUniversidad;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class VentanaPrincipal extends javax.swing.JFrame {

    //Ventanas
    VentanaAgregarUniversidad AgregarUniversidad = new VentanaAgregarUniversidad();
    
    //Metodos
    MetodosUniversidad metUni = new MetodosUniversidad();
    MetodosDepartamento metDep = new MetodosDepartamento();
    
    //Variables
    String nombreUni = ""; 
    public VentanaPrincipal() {
          
        initComponents();
        for(int i = 0 ; i < metUni.Tamanio() ; i++)
            cbxUniversidades.addItem(metUni.Obtener(i).getNombre());
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblUniversidades = new javax.swing.JLabel();
        cbxUniversidades = new javax.swing.JComboBox();
        btnIngresarUniversidad = new javax.swing.JButton();
        btnAgregarUniversidad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblUniversidades.setText("Universidad --> ");

        cbxUniversidades.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar" }));

        btnIngresarUniversidad.setText("Ingresar");
        btnIngresarUniversidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarUniversidadActionPerformed(evt);
            }
        });

        btnAgregarUniversidad.setText("Agregar Universidad");
        btnAgregarUniversidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarUniversidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAgregarUniversidad)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblUniversidades)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxUniversidades, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnIngresarUniversidad)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUniversidades)
                    .addComponent(cbxUniversidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIngresarUniversidad))
                .addGap(18, 18, 18)
                .addComponent(btnAgregarUniversidad)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarUniversidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarUniversidadActionPerformed
        AgregarUniversidad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAgregarUniversidadActionPerformed

    private void btnIngresarUniversidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarUniversidadActionPerformed
        VentanaIngresoUniversidad vtnUni = new VentanaIngresoUniversidad();
        
        if(!cbxUniversidades.getSelectedItem().toString().equals("Seleccionar")) {
            vtnUni.setVisible(true);
            this.dispose();
        }
        else {
            JOptionPane.showMessageDialog(null, "Seleccione una universidad");
        }
    }//GEN-LAST:event_btnIngresarUniversidadActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    //------------ GET Y SET ----------
    public VentanaAgregarUniversidad getAgregarUniversidad() {
        return AgregarUniversidad;
    }

    public void setAgregarUniversidad(VentanaAgregarUniversidad AgregarUniversidad) {
        this.AgregarUniversidad = AgregarUniversidad;
    }

    public JButton getBtnAgregarUniversidad() {
        return btnAgregarUniversidad;
    }

    public void setBtnAgregarUniversidad(JButton btnAgregarUniversidad) {
        this.btnAgregarUniversidad = btnAgregarUniversidad;
    }

    public JButton getBtnIngresarUniversidad() {
        return btnIngresarUniversidad;
    }

    public void setBtnIngresarUniversidad(JButton btnIngresarUniversidad) {
        this.btnIngresarUniversidad = btnIngresarUniversidad;
    }

    public JComboBox getCbxUniversidades() {
        return cbxUniversidades;
    }

    public void setCbxUniversidades(JComboBox cbxUniversidades) {
        this.cbxUniversidades = cbxUniversidades;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JLabel getLblUniversidades() {
        return lblUniversidades;
    }

    public void setLblUniversidades(JLabel lblUniversidades) {
        this.lblUniversidades = lblUniversidades;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarUniversidad;
    private javax.swing.JButton btnIngresarUniversidad;
    private javax.swing.JComboBox cbxUniversidades;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblUniversidades;
    // End of variables declaration//GEN-END:variables

    

}
