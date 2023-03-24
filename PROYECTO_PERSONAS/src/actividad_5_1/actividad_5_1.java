/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package actividad_5_1;

import clases.VentanaInicio;
import clases.FormCapturaPersonas;
import clases.Persona;
import clases.TablaModeloPersona;
import java.awt.BorderLayout;
import java.io.File;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;

public class actividad_5_1 {

 
  private static VentanaInicio  aplicacion;  
 // static FormCapturaPersonas formPersonas;

  
  private static void initComponents() {
      
   aplicacion = new VentanaInicio();
    
 }
  
  
    
    public static void main(String[] args) {
        // TODO code application logic here
        /* Create and display the form */
        
         initComponents();
         aplicacion.setSize(1600, 900);
         aplicacion.setResizable(false);
         aplicacion.getContentPane().setLayout(new BorderLayout());
         aplicacion.setLocationRelativeTo(null);
       //  aplicacion.setLocationRelativeTo(null);
         aplicacion.setVisible(true);
        
    //    aplicacion.getContentPane().add(formPersonas);
       
    
   
    

    }
}