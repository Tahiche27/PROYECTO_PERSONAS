/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;


import java.time.Year;

//Creacion de la clase persona.

public class Persona {
    
//Declaracion de variables.

   private int edad;
   private String nombre;
   private String apellido1;
   private String apellido2;
   private String anyoNac;
   private String correo;
   private String dni;
   private String password;
   
//Constructor de Persona.   
public Persona(){}
   
   public Persona(String nombre, String apellido1,String apellido2, String anyoNac, String correo, String dni,String password){
   
       this.nombre = nombre;
       this.apellido1 = apellido1;
       this.apellido2 = apellido2;
       this.anyoNac = anyoNac;
       this.correo = correo;
       this.dni=dni;
       this.password = password;
       //this.edad = Year.now().getValue() - anyoNac; 
   
   }


//Get y Set de cada variable necesaria.

       
public int getEdad(){  return this.edad;   } 
public String getNombre() {    return this.nombre; }
public String getApellido1(){  return this.apellido1;  }
public String getApellido2(){  return this.apellido2;  }
public String getanyoNac(){    return this.anyoNac;}
public String getCorreo(){ return this.correo; }
public String getDNI(){    return this.dni;     }
public String getPassword(){ return this.password; }


//En el caso de setanyoNac. Utilizo la funcion de java time Year para calcular la edad a partir del anyo de nacimiento. 

public void setNombre(String nombre) {     this.nombre= nombre ; }
public void setApellido1(String apellido1){   this.apellido1=apellido1;  }
public void setApellido2(String apellido2){   this.apellido2=apellido2;  }
public void setanyoNac(String anyoNac){   this.anyoNac=anyoNac;}
public void  setCorreo(String correo){  this.correo=correo; }
public void setDNI(String dni){     this.dni=dni;     }
public void setPassword(String password){ this.password = password;}
   

//Override de la funcion toString para que al llamarla en la actividad 4_1 me pongo cada uno de los datos separados.

@Override

public String toString(){

return this.nombre + " , "  +this.apellido1+ " , "+this.apellido2+ " , "  +this.anyoNac+ " , " +this.correo+ " , "  +this.dni+ " , "  +this.edad+ " , " +this.password+ " \n";

}

}