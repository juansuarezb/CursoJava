
package Negocio.Modelo;

import java.io.Serializable;
import java.util.Objects;


//CLASE JAVABEANS

//Primero se implementa la interface que ya viene definida en JAVA (serializable)
public class Pelicula implements Serializable{
    //Si vamos a trabajar en el futuro con un servidor o framework se va a necesitar utilizar esta clase
    
    //Todos los atributos de una clase JAVA BEANS son privados
    private String nombreP;
    
    //Debe haber un constructor vacio
    public Pelicula(){
        
    }
    //Luego tengo el constructor que necesite
    public Pelicula(String nombreP){
        this.nombreP = nombreP;
    }
    
    //Se deben tener getters y setters de los atributos

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    //Agregar toString, hasCode, equals
    @Override
    public String toString() {
        return  this.nombreP;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.nombreP);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pelicula other = (Pelicula) obj;
        return Objects.equals(this.nombreP, other.nombreP);
    }
    
    //HASTA AQUI YA TENGO LA CLASE APLICANDO EL CONCEPTO DE JAVA BEANS
    
}
