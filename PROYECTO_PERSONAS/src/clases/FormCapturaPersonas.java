package clases;

import java.awt.Color;
import java.awt.Window;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


public class  FormCapturaPersonas extends javax.swing.JPanel {

    ArrayList listaPersonas = new ArrayList<Persona>();
    TablaModeloPersona modeloDatosPersona = new TablaModeloPersona(listaPersonas);
    Boolean editando=false;
    int filaSeleccionada; 

    
    public TablaModeloPersona getModelo(){
    
      
    return modeloDatosPersona;
    }
    
    public  FormCapturaPersonas() {
        initComponents();
        this.setVisible(false);
        this.jTable1.setModel(modeloDatosPersona);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        choice1 = new java.awt.Choice();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        form_Panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        form_dni = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        form_nombre = new javax.swing.JTextField();
        form_ape1 = new javax.swing.JTextField();
        form_ape2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        form_fechaNac = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        form_email = new javax.swing.JTextField();
        form_pwd = new javax.swing.JPasswordField();
        jToolBar2 = new javax.swing.JToolBar();
        botonRegistrar = new java.awt.Button();
        button1 = new java.awt.Button();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BotonSalir = new javax.swing.JButton();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(102, 153, 198));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, null, java.awt.Color.cyan, java.awt.Color.red));
        setToolTipText("<HTML>\n<h1>Modelo de Datos</h1>\n</HTML>");
        setName("PanelTrabajoPersonas"); // NOI18N

        jPanel2.setBackground(new java.awt.Color(102, 153, 198));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(102, 102, 102), new java.awt.Color(0, 102, 102)));
        jPanel3.setToolTipText("");
        jPanel3.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setText("FORMULARIO DE  GESTIÓN DE USUARIOS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(321, 321, 321))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        form_Panel.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("DNI:");

        form_dni.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Apellidos:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Año de nacimiento");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("email: ");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("password: ");

        jToolBar2.setBackground(new java.awt.Color(255, 153, 102));
        jToolBar2.setBorder(null);
        jToolBar2.setRollover(true);

        botonRegistrar.setBackground(new java.awt.Color(255, 204, 153));
        botonRegistrar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        botonRegistrar.setLabel("Registrar ");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });
        jToolBar2.add(botonRegistrar);

        button1.setBackground(new java.awt.Color(255, 204, 153));
        button1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        button1.setLabel("Cancelar");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        jToolBar2.add(button1);
        button1.getAccessibleContext().setAccessibleName("LimpiarCampos");

        javax.swing.GroupLayout form_PanelLayout = new javax.swing.GroupLayout(form_Panel);
        form_Panel.setLayout(form_PanelLayout);
        form_PanelLayout.setHorizontalGroup(
            form_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(form_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(form_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(form_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(form_PanelLayout.createSequentialGroup()
                        .addComponent(form_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(form_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(form_email))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(form_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(form_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(form_ape1)
                    .addComponent(form_pwd, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                .addGroup(form_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(form_PanelLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(form_PanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(form_ape2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(form_fechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        form_PanelLayout.setVerticalGroup(
            form_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(form_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(form_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(form_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(form_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(form_ape1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(form_ape2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(form_fechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(form_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(form_PanelLayout.createSequentialGroup()
                        .addGroup(form_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(form_pwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(form_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(form_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(form_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(466, 466, 466)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(102, 153, 198));

        jTable1.setBackground(new java.awt.Color(102, 102, 102));
        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "DNI", "Nombre", "Apellido1", "Apellido2", "FechaNAC", "email", "password"
            }
        ));
        jTable1.setColumnSelectionAllowed(true);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setHeaderValue("DNI");
            jTable1.getColumnModel().getColumn(1).setHeaderValue("Nombre");
            jTable1.getColumnModel().getColumn(2).setHeaderValue("Apellido1");
            jTable1.getColumnModel().getColumn(3).setHeaderValue("Apellido2");
            jTable1.getColumnModel().getColumn(4).setHeaderValue("FechaNAC");
            jTable1.getColumnModel().getColumn(5).setHeaderValue("email");
            jTable1.getColumnModel().getColumn(6).setHeaderValue("password");
        }

        BotonSalir.setBackground(new java.awt.Color(255, 204, 153));
        BotonSalir.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BotonSalir.setText("Cerrar");
        BotonSalir.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(BotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
         this.setVisible(false); 
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       filaSeleccionada= this.jTable1.getSelectedRow(); 
       if (filaSeleccionada < 0){
          JOptionPane.showMessageDialog(this, "Debe selecionar alguna Fila", "error", JOptionPane.ERROR_MESSAGE);
         } else {
            editando=true; 
            String mensaje="Se dispone a editar la fila  "+filaSeleccionada;
            JOptionPane.showMessageDialog(this, mensaje, "DATOS",JOptionPane.INFORMATION_MESSAGE);
            form_Panel.setBackground(Color.GREEN);
             botonRegistrar.setLabel("Guardar");
            var persona = (Persona) this.listaPersonas.get(filaSeleccionada);
            cargarCampos(filaSeleccionada);
       }
        
       
       
       
    }//GEN-LAST:event_jTable1MouseClicked

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_button1ActionPerformed

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        Persona persona = new Persona();
        persona.setDNI(form_dni.getText());
        persona.setNombre(form_nombre.getText());
        persona.setApellido1(form_ape1.getText());
        persona.setApellido2(form_ape2.getText());
        persona.setanyoNac(form_fechaNac.getText());
        persona.setCorreo(form_email.getText());
        persona.setPassword(form_pwd.getText());
        String mensaje="editando = "+editando;
        JOptionPane.showMessageDialog(this, mensaje, "DATOS",JOptionPane.INFORMATION_MESSAGE);
        
        
        
        
        
        
        
        
        
        
        if (!editando){        // Si no esta editando creamos un nuevo usuario.
            modeloDatosPersona.setPersona(persona);
            limpiarCampos();
        } else{    // Si esta editando modificamos el dato del modelo.
            modeloDatosPersona.setValueRow(persona, filaSeleccionada);
            limpiarCampos();
        }
        XML();
    }//GEN-LAST:event_botonRegistrarActionPerformed

    
    private void limpiarCampos(){
      this.form_dni.setText("");  this.form_nombre.setText(""); this.form_ape1.setText(""); this.form_ape2.setText("");
       this.form_fechaNac.setText(""); this.form_email.setText(""); this.form_pwd.setText("");
       if (editando){ 
           form_Panel.setBackground(Color.LIGHT_GRAY);
            botonRegistrar.setLabel("Registrar");
            editando=false;
       }
     }
     
    public ArrayList cargarCampos(int filaSeleccionada){
          
      var persona = (Persona) this.listaPersonas.get(filaSeleccionada);
      this.form_dni.setText(persona.getDNI());  
      this.form_nombre.setText(persona.getNombre()); 
      this.form_ape1.setText(persona.getApellido1()); 
      this.form_ape2.setText(persona.getApellido2());
      this.form_fechaNac.setText(persona.getanyoNac()); 
      this.form_email.setText(persona.getCorreo());
      this.form_pwd.setText(persona.getPassword());
      
      return listaPersonas;
     }
    
public void XML(){

        
        
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder;
            try {
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();

            
            
            
            // Agregar un elemento raíz al documento
            Element rootElement = doc.createElement("personas");
            doc.appendChild(rootElement);

             for(int i=0;i<modeloDatosPersona.getlistaPersonas().size();i++){
            
            
            // Agregar elementos hijo al elemento raíz

            //for(int i=0;i<;i++){   
            Element persona = doc.createElement("persona");
            rootElement.appendChild(persona);


            // Agregar elementos hijo al elemento hijo
            Element nombre = doc.createElement("nombre");
            nombre.appendChild(doc.createTextNode(modeloDatosPersona.getlistaPersonas().get(i).getNombre()));
            persona.appendChild(nombre);
        
            Element apellido1 = doc.createElement("Apellido1");
            apellido1.appendChild(doc.createTextNode(modeloDatosPersona.getlistaPersonas().get(i).getApellido1()));
            persona.appendChild(apellido1);

             Element apellido2 = doc.createElement("Apellido2");
            apellido2.appendChild(doc.createTextNode(modeloDatosPersona.getlistaPersonas().get(i).getApellido2()));
            persona.appendChild(apellido2);
            
            Element correo = doc.createElement("Correo");
            correo.appendChild(doc.createTextNode(modeloDatosPersona.getlistaPersonas().get(i).getCorreo()));
            persona.appendChild(correo);

            Element anyo_nac = doc.createElement("anionac");
            anyo_nac.appendChild(doc.createTextNode(modeloDatosPersona.getlistaPersonas().get(i).getanyoNac()));
            persona.appendChild(anyo_nac);

            Element contrasena = doc.createElement("contasena");
            contrasena.appendChild(doc.createTextNode(modeloDatosPersona.getlistaPersonas().get(i).getPassword()));
            System.out.println("CONTRASEÑA"+modeloDatosPersona.getlistaPersonas().get(i).getPassword());
            persona.appendChild(contrasena);

            Element dni = doc.createElement("dni");
            dni.appendChild(doc.createTextNode((modeloDatosPersona.getlistaPersonas().get(i).getDNI())));
            persona.appendChild(dni);
            // Imprimir el documento XML generado
            System.out.println(doc);
            }
            // Escribir el documento en un archivo XML
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            File file = new File("personas.xml");
            StreamResult result = new StreamResult(file);
            transformer.transform(source, result);
            String mensaje="XML exportado en la siguiente ruta:  "+file.getAbsolutePath();
            JOptionPane.showMessageDialog(this, mensaje, "EXPORTADO A XML",JOptionPane.INFORMATION_MESSAGE);
              

            } catch (ParserConfigurationException e) {
            e.printStackTrace();
            }catch (TransformerException e) {
                e.printStackTrace();
            } 



}
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonSalir;
    private java.awt.Button botonRegistrar;
    private java.awt.Button button1;
    private java.awt.Choice choice1;
    private javax.swing.JPanel form_Panel;
    private javax.swing.JTextField form_ape1;
    private javax.swing.JTextField form_ape2;
    private javax.swing.JTextField form_dni;
    private javax.swing.JTextField form_email;
    private javax.swing.JTextField form_fechaNac;
    private javax.swing.JTextField form_nombre;
    private javax.swing.JPasswordField form_pwd;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar2;
    // End of variables declaration//GEN-END:variables
}
