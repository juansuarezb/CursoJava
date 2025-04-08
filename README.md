# Sección 9: POO - ENCAPSULAMIENTO

<p align="center">
  <img src="https://github.com/user-attachments/assets/a996c5c5-c61f-42d3-83fa-b822f331ceab" alt="Curso Java Persistencia" width="600"/>
</p>

> [!NOTE]
> **Temas cubiertos:**
> - ¿Qué es encapsulamiento?
> - Getters y Setters  
> - Sobre escribir métodos - toString

> [!NOTE]
> # 1. ¿Qué es encapsulamiento?
> <h4 align="center">El modificador de acceso que vamos a utilizar es el private (-)</h4>
> 
> <p align="center">
>   <img src="https://github.com/user-attachments/assets/0f233c88-95eb-4500-b160-b6637604364f" width="600"/>
> </p>
> 
> La única manera de acceder a estos datos y modificarlos es a través de los métodos. Así, protegemos los datos internos de la clase.
>

> [!NOTE]
> # 2. Getters y Setters.
> Creamos un nuevo paquete y una nueva clase `Persona` para practicar el encapsulamiento. <br>
> *En la clase Persona agregamos 3 atributos y sus respectivos getters y setters. Netbeans tiene la opción de ingresar*
> *automáticamente los getters y setters que necesitemos*


```java
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
```
> [!NOTE]
> <p align="center">
>   <img src="https://github.com/user-attachments/assets/2e29d578-02c4-44c2-b518-5a75972121ec" width="600"/>
> </p>
>
> <p align="center">
>   <img src="https://github.com/user-attachments/assets/fb19c4f2-822c-44d2-b867-608603d407a8" width="600"/>
> </p>
> <p>Para el atributo de eliminado vamos a escribir manualmente los métodos para obtener y settear el atributo.</p>
> <p align="center">
>   <img src="https://github.com/user-attachments/assets/f7df33ff-7e30-41db-871f-51f76935b571" width="600"/>
> </p>

> [!NOTE]
> Creamos un nuevo paquete llamado "test" para **ya no realizar las pruebas directamente en el main** y una nueva clase `TestPersona` para probar la clase Persona <br>
> *En la clase Persona agregamos 3 atributos y sus respectivos getters y setters. Netbeans tiene la opción de ingresar*
> *automáticamente los getters y setters que necesitemos* <br>
> ```java
> package test;
> import Encapsualimento.*;   //Importamos todo lo que este en el paquete Encapsulamiento
> public Class TestPersona(){
>   public static void main(String[] args){
>       //Construimos el primer objeto de la clase Persona
>       Persona persona1 = new Persona("Juan", 22, false);
>       System.out.println("Nombre :" + persona1.getNombre());
>
>       //Para editar un atributo
>       persona.setEdad(23);
>       System.out.println("Nueva edad :" + persona1.getEdad());
> }
> }
> ```
> ![image](https://github.com/user-attachments/assets/cc7e179e-928a-41f5-9625-73466ce6802a)

> [!NOTE]
> # 3. Sobre Escribir Métodos - toString
> Ahora, vamos a sobre escribir un método, todos estos métodos ya vienen implementados en la clase Object.
> *Debemos implementar nuestro propio método toString() para imprimir los datos de la clase Persona.
> 
> ```java
> //Anotador que me permite modificar un método que ya esta implementado
>    @Override
>     //Modificamos el metodo toString para formatear los valores del bojeto. .formatted
>    public String toString() {
>        return "Persona: [Nombre: %s, Edad: %d, Eliminado: %b]"
>                .formatted(this.nombre, this.edad, this.eliminado);
>    }
> ```
> ![image](https://github.com/user-attachments/assets/cfed38b3-8c10-477d-8771-922b6e16ea5b)
