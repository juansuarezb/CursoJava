
package test;
import Encapsulamiento.*;

public class TestPersona {
    public static void main(String[] args) {
        
        //Construimos el primer objeto de la clase Persona
        Persona persona1 = new Persona("Juan", 22, false);
        System.out.println("Nombre: " + persona1.getNombre()); //ASÍ ACCEDEMOS AL ATRIBUTO
        String estado = persona1.toString();
        //Para editar un atributo
        persona1.setEdad(23);
        System.out.println("Nueva Edad: " +persona1.getEdad());
        
        System.out.println(persona1);
    }
}
