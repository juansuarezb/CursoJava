# Sección 7: POO - Programación Orientada a Objetos

> [!NOTE]
> **Temas cubiertos:**
> - Presentación del curso POO
> - Programación Orientada a Objetos
> - ¿Qué es un objeto?
> - ¿Qué es una clase?
> - Modularidad


> [!NOTE]
> # 1. Presentación del curso POO
> <p>Bienvenido al curso de PROGRAMACIÓN ORIENTADA A OBJETOS en este curso aprenderemos la paradigma de POO con Java.</p>
> <p>Recordemos que Java está creado para esta paradigma (en Java todo es un objeto TODO)</p>
> <p align="center">
>  <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion7/Imagenes/Imagen1.avif" width="600"/>
> </p>

> <p align="center">
>  <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion7/Imagenes/Imagen2.avif" width="600"/>
> </p>

> <p align="center">
>  <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion7/Imagenes/Imagen3.avif" width="600"/>
> </p>

> <p align="center">
>  <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion7/Imagenes/Imagen4.avif" width="600"/>
> </p>

> <p align="center">
>  <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion7/Imagenes/Imagen5.avif" width="600"/>
> </p>

> <p align="center">
>  <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion7/Imagenes/Imagen6.avif" width="600"/>
> </p>

> <p align="center">
>  <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion7/Imagenes/Imagen7.avif" width="600"/>
> </p>

> <p align="center">
>  <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion7/Imagenes/Imagen8.avif" width="600"/>
> </p>

> <p align="center">
>  <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion7/Imagenes/Imagen9.avif" width="600"/>
> </p>

> <p align="center">
>  <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion7/Imagenes/Imagen10.avif" width="600"/>
> </p>

> <p align="center">
>  <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion7/Imagenes/Imagen11.avif" width="600"/>
> </p>


> <p align="center">
>  <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion7/Imagenes/Imagen12.avif" width="600"/>
> </p>


> <p align="center">
>  <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion7/Imagenes/Imagen13.avif" width="600"/>
> </p>

> <p align="center">
>  <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion7/Imagenes/Imagen14.avif" width="600"/>
> </p>

> <p align="center">
>  <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion7/Imagenes/Imagen15.avif" width="600"/>
> </p>

> <p align="center">
>  <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion7/Imagenes/Imagen16.avif" width="600"/>
> </p>

> <p align="center">
>  <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion7/Imagenes/Imagen17.avif" width="600"/>
> </p>

> <p align="center">
>  <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion7/Imagenes/Imagen18.avif" width="600"/>
> </p>

> <p align="center">
>  <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion7/Imagenes/Imagen19.avif" width="600"/>
> </p>

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


[![Main](https://img.shields.io/badge/🏠_Volver_al_Main-8A2BE2?style=for-the-badge&logo=github&logoColor=white)](https://github.com/juansuarezb/CursoJava/blob/main/README.md)
[![Anterior](https://img.shields.io/badge/←_Volver_a_Sección_6-8A2BE2?style=for-the-badge&logo=github&logoColor=white)](https://github.com/juansuarezb/CursoJava/blob/Seccion6/README.md)
[![Siguiente](https://img.shields.io/badge/Seccion8→-2E8B57?style=for-the-badge&logo=github&logoColor=white)](https://github.com/juansuarezb/CursoJava/blob/Seccion8/README.md)