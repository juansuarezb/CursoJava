
package Encapsulamiento;

public class Persona {
    private String nombre;
    private int edad;
    private boolean eliminado; //Estado de la persona

    
    //Generamos un constructor
    public Persona(String nombre, int edad, boolean eliminado) {
        this.nombre = nombre; //Utilizamos this para referirnos al atributo de la clase
        this.edad = edad;
        this.eliminado = eliminado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isEliminado(){
        return this.eliminado;
    }
    
    public void setEliminado(Boolean estado){
        this.eliminado = estado;
    }

    
    //Anotador que me permite modificar un método que ya esta implementado
    @Override
    public String toString() {
        return "Persona: [Nombre: %s, Edad: %d, Eliminado: %b]"
                .formatted(this.nombre, this.edad, this.eliminado);
    }
    
    
    
    
    
    
}
