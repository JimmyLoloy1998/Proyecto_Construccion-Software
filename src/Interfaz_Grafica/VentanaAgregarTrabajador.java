/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz_Grafica;

import Metodos.MetodosDoctor;
import Metodos.MetodosPAS;
import Metodos.MetodosPDI;
import Metodos.MetodosTrabajador;
import Principal.Doctor;
import Principal.PAS;
import Principal.PDI;
import Principal.Trabajador;
import java.awt.Color;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.plaf.basic.BasicBorders;
import javax.swing.text.Document;

/**
 *
 * @author ALUMNO - FIIS
 */
public class VentanaAgregarTrabajador extends javax.swing.JFrame {

    //Ventanas
    VentanaPrincipal vtnPrincipal = new VentanaPrincipal();
    VentanaIngresoUniversidad vtnIngresoUni = new VentanaIngresoUniversidad();
    
    //Metodos
    MetodosTrabajador metTrab = new MetodosTrabajador();
    MetodosDoctor metDoc = new MetodosDoctor();
    MetodosPDI metPDI = new MetodosPDI();
    MetodosPAS metPAS = new MetodosPAS();
    
    //Variables
    ButtonGroup GrupoBotonesPDIoPAS = new ButtonGroup();
    ButtonGroup GrupoBotonesOpcion = new ButtonGroup();
    
    public VentanaAgregarTrabajador() {
        initComponents();
        rdbOpcionSi.setEnabled(false);
        rdbOpcionNo.setEnabled(false);
        agregarAccionDocumento(txtNombreTrabajador, new accionColorCampoString(txtNombreTrabajador));
        agregarAccionDocumento(txtPuesto, new accionColorCampoString(txtPuesto));
        agregarAccionDocumento(txtCategoria, new accionColorCampoString(txtCategoria));
        agregarAccionDocumento(txtCodigoTrabajador, new accionColorCampoNumero(txtCodigoTrabajador));
        AgruparRadioBotones();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblNombreTrabajador = new javax.swing.JLabel();
        txtNombreTrabajador = new javax.swing.JTextField();
        lblFechaInicio = new javax.swing.JLabel();
        txtFechaInicio = new javax.swing.JTextField();
        txtCodigoTrabajador = new javax.swing.JTextField();
        lblCodigoTrabajador = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblDoctor = new javax.swing.JLabel();
        rdbPDI = new javax.swing.JRadioButton();
        rdbPAS = new javax.swing.JRadioButton();
        txtCategoria = new javax.swing.JTextField();
        lblCategoria = new javax.swing.JLabel();
        lblPuesto = new javax.swing.JLabel();
        txtPuesto = new javax.swing.JTextField();
        rdbOpcionSi = new javax.swing.JRadioButton();
        rdbOpcionNo = new javax.swing.JRadioButton();
        btnGenerarFecha = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Trabajador");

        lblNombreTrabajador.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombreTrabajador.setText("Nombre");

        lblFechaInicio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblFechaInicio.setText("Fecha Inicio");

        lblCodigoTrabajador.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCodigoTrabajador.setText("Codigo");

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblDoctor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDoctor.setText("Doctor");

        rdbPDI.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdbPDI.setText("PDI");
        rdbPDI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbPDIActionPerformed(evt);
            }
        });

        rdbPAS.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdbPAS.setText("PAS");
        rdbPAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbPASActionPerformed(evt);
            }
        });

        lblCategoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCategoria.setText("Categoria");

        lblPuesto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPuesto.setText("Puesto");

        rdbOpcionSi.setText("Si");

        rdbOpcionNo.setText("No");

        btnGenerarFecha.setText("Fecha Actual");
        btnGenerarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarFechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(264, 264, 264)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNombreTrabajador, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(lblNombreTrabajador)
                                .addComponent(txtFechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(lblFechaInicio)
                                .addComponent(txtCodigoTrabajador, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(lblCodigoTrabajador))
                            .addComponent(btnGenerarFecha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDoctor)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rdbOpcionSi)
                                .addGap(18, 18, 18)
                                .addComponent(rdbOpcionNo))
                            .addComponent(rdbPAS)
                            .addComponent(rdbPDI)
                            .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCategoria)
                            .addComponent(txtPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPuesto)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(103, 103, 103)))
                .addGap(60, 60, 60))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(lblFechaInicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btnGenerarFecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNombreTrabajador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCodigoTrabajador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigoTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addComponent(rdbPDI)
                .addGap(12, 12, 12)
                .addComponent(lblCategoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rdbPAS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPuesto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDoctor)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbOpcionSi)
                    .addComponent(rdbOpcionNo))
                .addContainerGap(88, Short.MAX_VALUE))
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

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        vtnIngresoUni.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed
    
    //Accion PDI
    private void rdbPDIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbPDIActionPerformed
        lblCategoria.setEnabled(true);
        txtCategoria.setEnabled(true);
        rdbOpcionSi.setEnabled(true);
        rdbOpcionNo.setEnabled(true);
        lblPuesto.setEnabled(false);
        txtPuesto.setEnabled(false);
    }//GEN-LAST:event_rdbPDIActionPerformed

    //Accion PAS
    private void rdbPASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbPASActionPerformed
        lblPuesto.setEnabled(true);
        txtPuesto.setEnabled(true);
        lblCategoria.setEnabled(false);
        txtCategoria.setEnabled(false);
        rdbOpcionSi.setEnabled(false);
        rdbOpcionNo.setEnabled(false);
        
    }//GEN-LAST:event_rdbPASActionPerformed
    //Agregar Trabajador
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(rdbPDI.isSelected()) {
            if(rdbOpcionSi.isSelected()){
                Doctor x = new Doctor(txtNombreTrabajador.getText(), txtCategoria.getText(), txtFechaInicio.getText());
                metDoc.Agregar(x);
                PDI pdi = new PDI(txtCategoria.getText(), null, x, null);
                metPDI.Agregar(pdi);
                JOptionPane.showMessageDialog(null, "Trabajador Agregado Correctamente");
                vtnIngresoUni.setVisible(true);
                this.dispose();
            }
            else if(rdbOpcionNo.isSelected()){
                Trabajador x = new Trabajador(txtNombreTrabajador.getText(), txtCategoria.getText(), txtFechaInicio.getText());
                metTrab.Agregar(x);
                PDI pdi = new PDI(txtCategoria.getText(), x, null, null);
                metPDI.Agregar(pdi);
                JOptionPane.showMessageDialog(null, "Trabajador Agregado Correctamente");
                vtnIngresoUni.setVisible(true);
                this.dispose();
            }
            else {
                JOptionPane.showMessageDialog(null, "Seleccione si es un Doctor o no");
            }
            
        }
        else if(rdbPAS.isSelected()) {
            Trabajador x = new Trabajador(txtNombreTrabajador.getText(), txtCategoria.getText(), txtFechaInicio.getText());
            metTrab.Agregar(x);
            PAS pas = new PAS(txtPuesto.getText(),x);
            JOptionPane.showMessageDialog(null, "Trabajador Agregado Correctamente");
            vtnIngresoUni.setVisible(true);
            this.dispose();
        }
        else {
            JOptionPane.showMessageDialog(null, "Seleccione PDI o PAS");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnGenerarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarFechaActionPerformed
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = new GregorianCalendar();
        
        String dia = Integer.toString(c2.get(Calendar.DATE));
        String mes = Integer.toString(c2.get(Calendar.MONTH)+1);
        String anio = Integer.toString(c2.get(Calendar.YEAR));
        
        String FechaActual = dia + "/" + mes + "/" + anio;
        txtFechaInicio.setText(FechaActual);
        
    }//GEN-LAST:event_btnGenerarFechaActionPerformed
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
    
    public void AgruparRadioBotones() {
        GrupoBotonesPDIoPAS.add(rdbPAS);
        GrupoBotonesPDIoPAS.add(rdbPDI);
        
        GrupoBotonesOpcion.add(rdbOpcionSi);
        GrupoBotonesOpcion.add(rdbOpcionNo);
    }
    public void AgregarTrabajador() {
        Trabajador x = new Trabajador(txtNombreTrabajador.getText(),txtCodigoTrabajador.getText(), txtFechaInicio.getText() );
        metTrab.Agregar(x);
        metTrab.Grabar();
    }
    //=======================================================================
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
            java.util.logging.Logger.getLogger(VentanaAgregarTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregarTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregarTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregarTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAgregarTrabajador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerarFecha;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCodigoTrabajador;
    private javax.swing.JLabel lblDoctor;
    private javax.swing.JLabel lblFechaInicio;
    private javax.swing.JLabel lblNombreTrabajador;
    private javax.swing.JLabel lblPuesto;
    private javax.swing.JRadioButton rdbOpcionNo;
    private javax.swing.JRadioButton rdbOpcionSi;
    private javax.swing.JRadioButton rdbPAS;
    private javax.swing.JRadioButton rdbPDI;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtCodigoTrabajador;
    private javax.swing.JTextField txtFechaInicio;
    private javax.swing.JTextField txtNombreTrabajador;
    private javax.swing.JTextField txtPuesto;
    // End of variables declaration//GEN-END:variables
}
