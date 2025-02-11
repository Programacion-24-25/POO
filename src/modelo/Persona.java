package modelo;

import java.util.Scanner;

public class Persona {
Scanner leer=new Scanner(System.in);
    
    public static int numPersonas;
    private String nombre;
    private String apellido;
    private String telefono;
    private String DNI;
    boolean paso=false;

    //Cada vez que entramos a los constructores, se suma una persona
    public Persona() {
        numPersonas++;
    }

    public Persona(String nombre, String apellido, String telefono, String DNI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        numPersonas++;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String getDNI() {
       return DNI;
    }



    public void setDNI(String DNI) throws DNIException {
        
        //Llamamos al método para comprobar el DNI
        compruebaDNI(DNI);
        this.DNI = DNI;
    }
    
    //Para descontar una persona, llamamos al método morir
    public void morir(){
        numPersonas--;
    }
    
    @Override
    public String toString() {
        return "Persona= " + " Nombre: " + nombre + " Apellido: " +apellido + " Teléfono: " + telefono;
    }

    private void compruebaDNI(String DNI) throws DNIException {
        
        //Sacamos la letra del DNI.
            char letra;
            letra=DNI.charAt(8);
            
        //Sacamos los números del DNI y los convertimos a Entero.
            DNI=DNI.substring(0, 8);
            int numeros=0;
            numeros=Integer.parseInt(DNI);
            
        //Comprobamos el resto a partir del número.
            int resto=numeros%23;
            
        //Asignamos la letra usando el resto.
            String letras="TRWAGMYFPDXBNJZSQVHLCKE";
            char letraresto=letras.charAt(resto);
            
        //Comprobamos la longitud de las letras del DNI y que la letra es correcta.
        if (DNI.length()==8 & letra==letraresto){
            System.out.println("El DNI es correcto.");
        }
        else {
            //Si no es correcto, lanzamos la excepción.
            throw new DNIException(DNI);
        }
        
    }
} //End class

//Excepciones

    class DNIException extends Exception {
        
        public DNIException(String DNI){
            
           //Mensaje que obtiene la excepción
            super("El DNI introducido no es correcto.");
        }
}
