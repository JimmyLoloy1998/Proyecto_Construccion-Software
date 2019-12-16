/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz_Grafica;

import Metodos.MetodosDepartamento;
import Metodos.MetodosDoctor;
import Metodos.MetodosUniversidad;
import Principal.Departamento;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.plaf.basic.BasicBorders;
import javax.swing.text.Document;

/**
 *
 * @author ALUMNO - FIIS
 */
public class VentanaAgregarDepartamento extends javax.swing.JFrame {
    //Ventanas
    VentanaPrincipal vtnPrincipal = new VentanaPrincipal();
    VentanaIngresoUniversidad vtnIngresoUni = new VentanaIngresoUniversidad();
    //Metodos
    MetodosUniversidad metUni = new MetodosUniversidad();
    MetodosDepartamento metDep = new MetodosDepartamento();
    MetodosDoctor metDoc = new MetodosDoctor();
    
    public VentanaAgregarDepartamento() {
        initComponents();
        for(int i = 0 ; i < metDoc.Tamanio() ; i++)
            cbxDoctores.addItem(metDoc.Obtener(i).getNombre());
        agregarAccionDocumento(txtNombreDepart, new accionColorCampoString(txtNombreDepart));
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cbxDoctores = new javax.swing.JComboBox<>();
        txtNombreDepart = new javax.swing.JTextField();
        lblDepartemento = new javax.swing.JLabel();
        lblNombreDepartamento = new javax.swing.JLabel();
        lblDoctor = new javax.swing.JLabel();
        btnAgregarDepartamento = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbxDoctores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        cbxDoctores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDoctoresActionPerformed(evt);
            }
        });

        lblDepartemento.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblDepartemento.setText("Departamentos");

        lblNombreDepartamento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombreDepartamento.setText("Nombre");

        lblDoctor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDoctor.setText("Doctor");

        btnAgregarDepartamento.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnAgregarDepartamento.setText("Agregar");
        btnAgregarDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarDepartamentoActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxDoctores, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDoctor)
                    .addComponent(txtNombreDepart, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreDepartamento)
                    .addComponent(lblDepartemento))
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregarDepartamento)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDepartemento, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNombreDepartamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNombreDepart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDoctor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxDoctores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarDepartamento, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalir)))
                .addContainerGap())
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

    private void cbxDoctoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDoctoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxDoctoresActionPerformed

    private void btnAgregarDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarDepartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarDepartamentoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        vtnIngresoUni.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    //=======================================================================
    private void agregarBorde(JTextField[] listaCampoTexto){
    	for(JTextField c:listaCampoTexto)
            c.setBorder(BasicBorders.getTextFieldBorder());
    }
    
    private void agregarAccionDocumentoCNumero(JTextField[] listaCampoTexto){
    	for(JTextField c:listaCampoTexto){
            Document documentoCampoTexto=c.getDocument();
            documentoCampoTexto.addDocumentListener(new accionColorCampoNumero(c));
    	}
    }
    
    private void agregarAccionDocumentoCString(JTextField[] listaCampoTexto){
    	for(JTextField c:listaCampoTexto){
            Document documentoCampoTexto = c.getDocument();
            documentoCampoTexto.addDocumentListener(new accionColorCampoString(c));
        }
    }
    
    private void agregarAccionDocumento(JTextField campoTexto,DocumentListener accionDocumento){
    	Document documentoCampoTexto = campoTexto.getDocument();
    	documentoCampoTexto.addDocumentListener(accionDocumento);
    }
    
    private boolean soloLetras(String texto){
	char caracter = ' ';
	boolean soloHayLetras = true;
        for(int i=0;i<texto.length();i++){
            caracter=texto.charAt(i);
            switch (caracter){
		case'1': case '2': case '3': case '4': case '5':
		case '6': case '7': case '8': case '9': case '0':soloHayLetras = false;
            }		
	}
	return soloHayLetras;
    }
    
    private boolean soloNumero(String texto){
	char caracter = ' ';
	boolean esUnNumero=true;
	for(int i=0 ; i<texto.length() ; i++){
            caracter = texto.charAt(i);
            switch (caracter) {
		 case'1': case '2': case '3': case '4': case '5':
		case '6': case '7': case '8': case '9': case '0': case '.': break;
			   
		default:
                    esUnNumero=false;
            }
        }
	return esUnNumero;
    }
    private class accionColorCampoNumero implements DocumentListener{
	JTextField campoTexto;
	   
	public accionColorCampoNumero(JTextField campoTexto) {
            this.campoTexto=campoTexto;
	}
	@Override
	public void changedUpdate(DocumentEvent e){}
	@Override
	public void insertUpdate(DocumentEvent e){
            if(soloNumero(campoTexto.getText())) 	
		campoTexto.setBorder(BasicBorders.getTextFieldBorder());					
            else 
		campoTexto.setBorder(new BasicBorders.FieldBorder(Color.RED,null,null,null));
	}

	@Override
	public void removeUpdate(DocumentEvent e){
            if(soloNumero(campoTexto.getText())) 	
		campoTexto.setBorder(BasicBorders.getTextFieldBorder());					
            else 
		campoTexto.setBorder(new BasicBorders.FieldBorder(Color.RED,null,null,null));	
	} 
    }
  //==============ACCION PARA VERIFICAR LOS CAMPOS DE TEXTO Y PONERLE COLOR(CADENA)=====================
    private class accionColorCampoString implements DocumentListener{
	JTextField campoTexto;
	   
	public accionColorCampoString(JTextField campoTexto) {
            this.campoTexto=campoTexto;
	}
	@Override
	public void changedUpdate(DocumentEvent e) {}

	@Override
	public void insertUpdate(DocumentEvent e) {
            if(soloLetras(campoTexto.getText())) 	
		campoTexto.setBorder(BasicBorders.getTextFieldBorder());					
            else 
		campoTexto.setBorder(new BasicBorders.FieldBorder(Color.RED,null,null,null));
	}

	@Override
	public void removeUpdate(DocumentEvent e) {
            if(soloLetras(campoTexto.getText())) 	
		campoTexto.setBorder(BasicBorders.getTextFieldBorder());					
            else 
		campoTexto.setBorder(new BasicBorders.FieldBorder(Color.RED,null,null,null));
	}
   }
    
    //====================================================================
    public void AgregarDepartamento() {
        VentanaPrincipal vtnPrincipal = new VentanaPrincipal();
        String nombreUni = vtnPrincipal.getCbxUniversidades().getSelectedItem().toString();
        Departamento dep = new Departamento(getTxtNombreDepart().getText());
        for(int i = 0 ; i < metUni.Tamanio() ; i++) {
            if(metUni.Obtener(i).getNombre() == nombreUni) {
                metDep.Agregar(dep);
                metUni.Obtener(i).setDepartamentos(metDep.getDep());
                break;
            }
        }
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregarDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregarDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregarDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregarDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAgregarDepartamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarDepartamento;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbxDoctores;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDepartemento;
    private javax.swing.JLabel lblDoctor;
    private javax.swing.JLabel lblNombreDepartamento;
    private javax.swing.JTextField txtNombreDepart;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnAgregarDepartamento() {
        return btnAgregarDepartamento;
    }

    public void setBtnAgregarDepartamento(JButton btnAgregarDepartamento) {
        this.btnAgregarDepartamento = btnAgregarDepartamento;
    }

    public JComboBox<String> getCbxDoctores() {
        return cbxDoctores;
    }

    public void setCbxDoctores(JComboBox<String> cbxDoctores) {
        this.cbxDoctores = cbxDoctores;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JLabel getLblDepartemento() {
        return lblDepartemento;
    }

    public void setLblDepartemento(JLabel lblDepartemento) {
        this.lblDepartemento = lblDepartemento;
    }

    public JLabel getLblDoctor() {
        return lblDoctor;
    }

    public void setLblDoctor(JLabel lblDoctor) {
        this.lblDoctor = lblDoctor;
    }

    public JLabel getLblNombreDepartamento() {
        return lblNombreDepartamento;
    }

    public void setLblNombreDepartamento(JLabel lblNombreDepartamento) {
        this.lblNombreDepartamento = lblNombreDepartamento;
    }

    public JTextField getTxtNombreDepart() {
        return txtNombreDepart;
    }

    public void setTxtNombreDepart(JTextField txtNombreDepart) {
        this.txtNombreDepart = txtNombreDepart;
    }


}
