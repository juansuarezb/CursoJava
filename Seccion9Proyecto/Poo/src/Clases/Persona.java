package Clases;

/**
 *
 * @author juand_jus2zd
 */
public class Persona {
    public String nombre;
    public int edad;
    
    
    public Persona(){
        System.out.println("Construyendo el objeto");
    }
    
    public Persona(String nombre){
        System.out.println("Hola " + nombre + " desde el constructor");
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
