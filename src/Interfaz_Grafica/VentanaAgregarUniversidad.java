package Interfaz_Grafica;

import Metodos.MetodosDepartamento;
import Metodos.MetodosDoctor;
import Metodos.MetodosUniversidad;
import Principal.Departamento;
import Principal.Universidad;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.plaf.basic.BasicBorders;
import javax.swing.text.Document;

public class VentanaAgregarUniversidad extends javax.swing.JFrame {
    //Metodos
    MetodosUniversidad metUni = new MetodosUniversidad();
    MetodosDepartamento metDep = new MetodosDepartamento();
    MetodosDoctor metDoc = new MetodosDoctor();
    
    public VentanaAgregarUniversidad() {
        initComponents();
        for(int i = 0 ; i < metDoc.Tamanio() ; i++)
            cbxDoctor.addItem(metDoc.Obtener(i).getNombre());
        agregarAccionDocumento(txtNombreUni, new accionColorCampoString(txtNombreUni));
        agregarAccionDocumento(txtCiudadUni, new accionColorCampoString(txtCiudadUni));
        agregarAccionDocumento(txtNombreDepart, new accionColorCampoString(txtNombreDepart));
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCiudadUni = new javax.swing.JTextField();
        txtNombreUni = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        lblDepartemento = new javax.swing.JLabel();
        lblNombreDepartamento = new javax.swing.JLabel();
        txtNombreDepart = new javax.swing.JTextField();
        lblDoctor = new javax.swing.JLabel();
        cbxDoctor = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Universidad");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Ciudad");

        txtCiudadUni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCiudadUniActionPerformed(evt);
            }
        });

        btnAgregar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        lblDepartemento.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblDepartemento.setText("Departamento");

        lblNombreDepartamento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombreDepartamento.setText("Nombre");

        lblDoctor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDoctor.setText("Doctor");

        cbxDoctor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        cbxDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDoctorActionPerformed(evt);
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(txtCiudadUni, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(txtNombreUni)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregar)))
                .addContainerGap())
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDoctor)
                    .addComponent(txtNombreDepart, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreDepartamento)
                    .addComponent(lblDepartemento))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreUni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCiudadUni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDepartemento, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNombreDepartamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNombreDepart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDoctor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnAgregar))
                .addGap(72, 72, 72))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCiudadUniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCiudadUniActionPerformed
        
    }//GEN-LAST:event_txtCiudadUniActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        VentanaPrincipal vtnPrincipal = new VentanaPrincipal();
        VentanaAgregarDepartamento vtnDepartamento = new VentanaAgregarDepartamento();
        
        if(txtNombreUni.getText().equals("")) {
            if(txtCiudadUni.getText().equals("")) {
                if(txtNombreDepart.getText().equals(""))
                    JOptionPane.showMessageDialog(null, "Rellene todos los campos");
                else
                    JOptionPane.showMessageDialog(null, "Falta rellenar campos");
            }
            else {
                JOptionPane.showMessageDialog(null, "Falta rellenar campos");
            }
        }
        else {
            if(txtCiudadUni.getText().equals("")) {
                if(txtNombreDepart.getText().equals(""))
                    JOptionPane.showMessageDialog(null, "Falta rellenar campos");
                else
                    JOptionPane.showMessageDialog(null, "Falta rellenar campos");
            }
            else{
                if(txtNombreDepart.getText().equals(""))
                    JOptionPane.showMessageDialog(null, "Falta rellenar campos");
                else{
                    vtnPrincipal.getCbxUniversidades().addItem(txtNombreUni.getText());
                    AgregarUniversidad();
                    JOptionPane.showMessageDialog(null, "Universidad Agregada");
                    vtnPrincipal.setVisible(true);
                    this.dispose();
                }
            }
        }
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void cbxDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxDoctorActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        VentanaPrincipal vtnPrincipal = new VentanaPrincipal();
        vtnPrincipal.setVisible(true);
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
    
    //==============================================================================
    public void AgregarUniversidad() {
        String nombreUni = getTxtNombreUni().getText();
        String ciudaUni = getTxtCiudadUni().getText();
        Universidad uni = new Universidad(nombreUni, ciudaUni);
        
        String nombreDep = getTxtNombreDepart().getText();
        Departamento dep = new Departamento(nombreDep);
        metDep.Agregar(dep);
        metDep.Grabar();
        metUni.Agregar(uni);
        metUni.Grabar();
    }
    public void AgregarDepartamentos() {
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
    //==============================================================================
   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAgregarUniversidad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbxDoctor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDepartemento;
    private javax.swing.JLabel lblDoctor;
    private javax.swing.JLabel lblNombreDepartamento;
    private javax.swing.JTextField txtCiudadUni;
    private javax.swing.JTextField txtNombreDepart;
    private javax.swing.JTextField txtNombreUni;
    // End of variables declaration//GEN-END:variables


    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JTextField getTxtCiudadUni() {
        return txtCiudadUni;
    }

    public void setTxtCiudadUni(JTextField txtCiudadUni) {
        this.txtCiudadUni = txtCiudadUni;
    }

    public JTextField getTxtNombreUni() {
        return txtNombreUni;
    }

    public void setTxtNombreUni(JTextField txtNombreUni) {
        this.txtNombreUni = txtNombreUni;
    }

    public JComboBox<String> getjComboBox1() {
        return cbxDoctor;
    }

    public void setjComboBox1(JComboBox<String> jComboBox1) {
        this.cbxDoctor = jComboBox1;
    }

    public JSeparator getjSeparator1() {
        return jSeparator1;
    }

    public void setjSeparator1(JSeparator jSeparator1) {
        this.jSeparator1 = jSeparator1;
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
