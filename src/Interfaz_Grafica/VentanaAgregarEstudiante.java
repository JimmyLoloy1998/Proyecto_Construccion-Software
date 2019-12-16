package Interfaz_Grafica;

import Metodos.MetodosDepartamento;
import Metodos.MetodosEst_Doctorado;
import Metodos.MetodosEst_Grado;
import Metodos.MetodosEstudiante;
import Metodos.MetodosUniversidad;
import Principal.Departamento;
import Principal.Est_Doctorado;
import Principal.Est_Grado;
import Principal.Estudiante;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.plaf.basic.BasicBorders;
import javax.swing.text.Document;

public class VentanaAgregarEstudiante extends javax.swing.JFrame {
    //Ventanas
    VentanaPrincipal vtnPrincipal = new VentanaPrincipal();
    VentanaIngresoUniversidad vtnIngresoUni = new VentanaIngresoUniversidad();
    //Metodos
    MetodosUniversidad metUni = new MetodosUniversidad();
    MetodosDepartamento metDep = new MetodosDepartamento(); 
    MetodosEstudiante metEst = new MetodosEstudiante();
    MetodosEst_Doctorado metEst_Doc = new MetodosEst_Doctorado();
    MetodosEst_Grado metEst_Grad = new MetodosEst_Grado();
    
    public VentanaAgregarEstudiante() {
        initComponents();
        agregarAccionDocumento(txtNombre, new accionColorCampoNumero(txtNombre));
        agregarAccionDocumento(txtCodigo, new accionColorCampoString(txtCodigo));
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblMatricula = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        rdbEst_Grado = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        txtPrograma = new javax.swing.JTextField();
        rdbEst_Doct = new javax.swing.JRadioButton();
        btnSalir = new javax.swing.JButton();
        btnAgregarEstudiante = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMatricula.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblMatricula.setText("MATRICULA");

        lblNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombre.setText("Nombre");

        lblCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCodigo.setText("Codigo");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        rdbEst_Grado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdbEst_Grado.setText("Estudiante de Grado");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Programa");

        txtPrograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProgramaActionPerformed(evt);
            }
        });

        rdbEst_Doct.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdbEst_Doct.setText("Estudiante Doctorado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addComponent(lblMatricula)
                .addGap(81, 81, 81))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCodigo)
                            .addComponent(lblNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(rdbEst_Grado)
                            .addComponent(txtPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdbEst_Doct))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMatricula)
                .addGap(25, 25, 25)
                .addComponent(lblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rdbEst_Grado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(rdbEst_Doct)
                .addContainerGap())
        );

        btnSalir.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnAgregarEstudiante.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnAgregarEstudiante.setText("Agregar Estudiante");
        btnAgregarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEstudianteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Titulo");

        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregarEstudiante))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnAgregarEstudiante))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        vtnIngresoUni.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAgregarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEstudianteActionPerformed
        if(txtNombre.getText().equals("")) {
            if(txtCodigo.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Rellene todos los campos");
            }else {
                JOptionPane.showMessageDialog(null, "Falta rellenar campos");
            }
        }else {
            if(txtCodigo.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Falta rellenar campos");
            }else {
                if(rdbEst_Grado.isSelected()) {
                    Est_Grado est_grado = new Est_Grado(txtNombre.getText(), txtCodigo.getText(), txtTitulo.getText());
                    Estudiante x = new Estudiante(txtNombre.getText(), txtCodigo.getText());
                    metEst.Agregar(x);
                    metEst.Grabar();
                    metEst_Grad.Agregar(est_grado);
                    metEst_Grad.Grabar();
                    vtnIngresoUni.setVisible(true);
                    this.dispose();
                }
                else if(rdbEst_Doct.isSelected()) {
                    Est_Doctorado est_doctorado = new Est_Doctorado(txtNombre.getText(), txtCodigo.getText(), txtTitulo.getText());
                    Estudiante x = new Estudiante(txtNombre.getText(), txtCodigo.getText());
                    metEst.Agregar(x);
                    metEst.Grabar();
                    metEst_Doc.Agregar(est_doctorado);
                    metEst_Doc.Grabar();
                    vtnIngresoUni.setVisible(true);
                    this.dispose();
                }
                else {
                    JOptionPane.showMessageDialog(null, "Marque si es Estudiante de Grado o Doctorado");
                }
            }
        }
    }//GEN-LAST:event_btnAgregarEstudianteActionPerformed

    private void txtProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProgramaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProgramaActionPerformed

    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloActionPerformed

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
    //====================================================================
//    public void AgregarEstudiante() {
//        Estudiante x = new Estudiante(txtNombre.getText(), txtCodigo.getText());
//        metEst.Agregar(x);
//        metEst.Grabar();
//    }
    
    
    //====================================================================
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
            java.util.logging.Logger.getLogger(VentanaAgregarEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregarEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregarEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregarEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAgregarEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarEstudiante;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JRadioButton rdbEst_Doct;
    private javax.swing.JRadioButton rdbEst_Grado;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrograma;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
