# Sección 10: POO - Herencia

> [!NOTE]
> **Temas cubiertos:**
> - ¿Qué es la herencia?
> - Superclase y protected
> - Subclase y uso de Super
> - Probar Herencia
> - Polimorfismo
> - InstanceOf
> - Conversión de Objetos
> - Equals
> - HashCode



> [!NOTE]  
> # 1. ¿Qué es la herencia?
> <p>La herencia es un mecanismo fundamental de la programación orientada a objetos que permite crear nuevas clases basadas en clases existentes. <b>Una clase hija hereda atributos y métodos de su clase padre</b>, facilitando la reutilización de código y la creación de jerarquías lógicas.</p>
> 
> ![Diagrama conceptual herencia](https://github.com/juansuarezb/CursoJava/raw/Seccion10/Imagenes/Imagen1.avif)  
> ![Ejemplo herencia familia](https://github.com/juansuarezb/CursoJava/raw/Seccion10/Imagenes/Imagen2.avif)  
> 
> ## Analogía con herencia familiar
> <p>Al igual que en una familia los hijos heredan características de sus padres, en Java:</p>
> 
> - La clase padre (superclase) define características generales
> - Las clases hijas (subclases) heredan y amplían funcionalidades
> - Las subclases pueden tener atributos y métodos adicionales
> 
> ![Ejemplo herencia Persona-Empleado](https://github.com/juansuarezb/CursoJava/raw/Seccion10/Imagenes/Imagen3.avif)  
> 
> ## Funcionamiento en Java
> <p>En este ejemplo:</p>
> 
> ```java
> // Clase Padre
> public class Persona {
>     protected String nombre;
>     protected int edad;
>     
>     public Persona(String nombre, int edad) {
>         this.nombre = nombre;
>         this.edad = edad;
>     }
>     
>     public void mostrarDatos() {
>         System.out.println("Nombre: " + nombre);
>         System.out.println("Edad: " + edad);
>     }
> }
> 
> // Clase Hija
> public class Empleado extends Persona {
>     private double salario;
>     
>     public Empleado(String nombre, int edad, double salario) {
>         super(nombre, edad);  // Llama al constructor del padre
>         this.salario = salario;
>     }
>     
>     public void mostrarSalario() {
>         System.out.println("Salario: $" + salario);
>     }
> }
> ```
> 
> <p><b>Características clave:</b></p>
> 
> - La subclase obtiene automáticamente todos los campos y métodos públicos/protegidos del padre
> - Se usa <code>extends</code> para establecer la herencia
> - <code>super()</code> permite acceder a miembros de la clase padre
> - Las clases hijas pueden:
>   - Agregar nuevos atributos/métodos
>   - Sobrescribir métodos existentes (<code>@Override</code>)
> 
> ## Beneficios principales
> ✅ Reutilización de código  
> ✅ Jerarquía lógica de clases  
> ✅ Facilita el mantenimiento  
> ✅ Reduce duplicación  
> ✅ Permite polimorfismo

> [!NOTE]  
> # 2. Superclase y protected
> 

> [!NOTE]  
> # 3. Subclase y uso de Super
> 

> [!NOTE]  
> # 4. Probar Herencia
> 

> [!NOTE]  
> # 5. Polimorfismo
> 

> [!NOTE]  
> # 6. InstanceOf
> 

> [!NOTE]  
> # 7. Conversión de Objetos
> 

> [!NOTE]  
> # 8. Equals
> 

> [!NOTE]  
> # 9. HashCode
> 


[![Main](https://img.shields.io/badge/🏠_Volver_al_Main-8A2BE2?style=for-the-badge&logo=github&logoColor=white)](https://github.com/juansuarezb/CursoJava/blob/main/README.md)
[![Anterior](https://img.shields.io/badge/←_Volver_a_Sección_9-8A2BE2?style=for-the-badge&logo=github&logoColor=white)](https://github.com/juansuarezb/CursoJava/blob/Seccion9/README.md)
[![Siguiente](https://img.shields.io/badge/Seccion11→-2E8B57?style=for-the-badge&logo=github&logoColor=white)](https://github.com/juansuarezb/CursoJava/blob/Seccion11/README.md)