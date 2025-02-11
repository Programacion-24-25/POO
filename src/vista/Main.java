package vista;

import java.util.Scanner;

import modelo.Persona;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner leer=new Scanner(System.in);
        boolean paso=false;
        Persona persona=new Persona();
        
        System.out.println("Introduce el nombre: ");
        String nombre=leer.nextLine();
        persona.setNombre(nombre);
        
        System.out.println("Introduce el apellido:");
        String apellido=leer.nextLine();
        persona.setApellido(apellido);
        
        System.out.println("Introduce el número de teléfono: ");
        String telefono=leer.nextLine();
        persona.setTelefono(telefono);
        
        do {
            System.out.println("Introduce el DNI:");
            String DNI=leer.nextLine();
           try {
            persona.setDNI(DNI);
            paso=false;
        } catch (Exception ex) {
            System.out.println("El DNI no es correcto.");
            paso=true;
        } 
        } while (paso);
        
        
        //Contar número de personas. Introducimos numPersonas++ en los constructores.
            /* System.out.println("Número de personas: "+Persona.numPersonas);
            
            //Eliminar una persona. Introducimos numPersonas-- en el método morir.
            persona.morir();
            persona=null;
            
            System.out.println("Número de personas actual: " +Persona.numPersonas); */
    }
}
