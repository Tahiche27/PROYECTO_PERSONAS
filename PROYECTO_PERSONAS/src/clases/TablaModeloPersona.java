
package clases;

import java.awt.List;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.AbstractTableModel;
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


public class TablaModeloPersona extends AbstractTableModel{
    
    private static final int DNI = 0;
    private static final int NOMBRE = 1;
    private static final int APE1 = 2;
    private static final int APE2 = 3;
    private static final int FENAC = 4;
    private static final int EMAIL = 5;
    private static final int PWD = 6;
    
    private ArrayList<Persona> listaPersonas  = new ArrayList<Persona>(); 
    
    private static final String[] columns = new String[]{"Dni", "Nombre", "Ape1", "Ape2", "Fecha_Nac", "email", "Password"};
    private static final Class<?>[] clase = { String.class, String.class, String.class, String.class,String.class,String.class, String.class};
    
    
    private String[] columnNames = {"Dni", "Nombre", "Ape1", "Ape2", "Fecha_Nac", "email", "Password"};
    

    /**
     *
     * @param listaPersonas
     */
    
    public TablaModeloPersona(ArrayList<Persona> listaPersonas){
        this.listaPersonas=listaPersonas;
    }
    
    @Override
    public int getRowCount() {
        
        return listaPersonas.size();
        
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }
    
    
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Persona a = getPersona(rowIndex);

        if(a != null) {
            switch (columnIndex) {
                case DNI:
                    return a.getDNI();
                    
                case NOMBRE:
                    return a.getNombre();
                case APE1:
                    return a.getApellido1();
                case APE2:
                    return a.getApellido2();
                 case FENAC:
                    return a.getanyoNac();
                case EMAIL:
                    return a.getCorreo();
                case PWD:
                    return a.getPassword();
               }
        }
        return "";
    }
    
    
    @Override
    public void setValueAt(Object valor,int rowIndex, int columnIndex) {
        Persona a = getPersona(rowIndex);
       
 
        
        
        if(a != null) {
            switch (columnIndex) {
                case DNI:
                     a.setDNI(valor.toString());
                case NOMBRE:
                     a.setNombre(valor.toString());
                case APE1:
                     a.setApellido1(valor.toString());
                case APE2:
                     a.setApellido2(valor.toString());
                 case FENAC:
                     a.setanyoNac(valor.toString());
                case EMAIL:
                     a.setCorreo(valor.toString());
                case PWD:
                     a.setPassword(valor.toString());
               }
        }
       
    }
    
   
    public void setValueRow(Persona a,int rowIndex) {
        Persona modificar = getPersona(rowIndex);

        if(modificar != null) {
            modificar.setDNI(a.getDNI());
            modificar.setNombre(a.getNombre());
            modificar.setApellido1(a.getApellido1());
            modificar.setApellido2(a.getApellido2());
            modificar.setanyoNac(a.getanyoNac());
            modificar.setCorreo(a.getCorreo());
            modificar.setPassword(a.getPassword());
            this.fireTableDataChanged();
           }
    }
  
    
    public Persona getPersona(int rowIndex) {
        if (getRowCount() > rowIndex && rowIndex >= 0) {
            return listaPersonas.get(rowIndex);
        }
        return null;
    }

    public ArrayList<Persona> getlistaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
        this.fireTableDataChanged(); //informa que la tabla ha cambiado.
    }

    public void setPersona(Persona sb){
        listaPersonas.add(sb);
        this.fireTableRowsInserted(listaPersonas.size()-1, listaPersonas.size()-1);
    }
   @Override
    public Class<?> getColumnClass(int columnIndex) {
        return clase[columnIndex];
    }
    
    @Override 
    public String getColumnName(int index) { 
        return columnNames[index]; 
    } 

   
    public String[] getColumnNames() {
        return columnNames;
    }

    public void setColumnNames(String[] columnNames) {
        this.columnNames = columnNames;
    }
    
     public void XML(){
         
         
     
        }
}

