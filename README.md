# Sección 2: Introducción a Java

> [!NOTE]
> ## **1: ¿Qué es Java y cómo funciona?**
> 
> Actualmente, Java es propiedad de Oracle Corporation y sigue siendo uno de los lenguajes más utilizados en la industria del desarrollo de software:
> ![Que es Java](https://github.com/juansuarezb/CursoJava/raw/Seccion2/Imagenes/Imagen1.avif)
> ![Popularidad de Java](https://github.com/juansuarezb/CursoJava/raw/Seccion2/Imagenes/Imagen2.avif)
>
> ### **¿Qué aplicaciones se pueden crear con Java?**
> 
> ![Aplicaciones Java](https://github.com/juansuarezb/CursoJava/raw/Seccion2/Imagenes/Imagen3.avif)
> 
> ### **Conceptos básicos de programación**
> 
> Si eres nuevo en programación, debes entender que:
> - Es dar instrucciones precisas a una computadora en lenguaje máquina (binario {0,1})
> - Los lenguajes de programación actúan como intermediarios
> - Cada lenguaje tiene sintaxis (reglas) y semántica (significado) específicos
> 
> ![Proceso de programación](https://github.com/juansuarezb/CursoJava/raw/Seccion2/Imagenes/Imagen4.avif)
> 
> ### **Compilación vs Interpretación**
> 
> ![Compilación vs Interpretación](https://github.com/juansuarezb/CursoJava/raw/Seccion2/Imagenes/Imagen5.avif)
> 
> #### Lenguajes compilados (C, C++, Rust):
> - Se traduce todo el código a lenguaje máquina de una vez
> - Genera archivos ejecutables independientes
> - Mayor rendimiento en ejecución
> 
> #### Lenguajes interpretados (Python, JavaScript):
> - Se ejecutan línea por línea mediante intérprete
> - No genera archivos ejecutables independientes
> - Mayor flexibilidad y portabilidad
> 
> ### **El modelo único de Java**
> Java usa un enfoque híbrido:
> 1. Compilación a bytecode (no a lenguaje máquina)
> 2. Ejecución en JVM (Java Virtual Machine)
> 3. Combina ventajas de ambos modelos:
>    - Portabilidad ("Write once, run anywhere")
>    - Buen rendimiento
>    - Seguridad mediante la sandbox de la JVM <br>
> ![Como funciona java](https://github.com/juansuarezb/CursoJava/raw/Seccion2/Imagenes/Imagen6.avif)

> [!IMPORTANT]
> ### **¿Qué es el JDK? (Java Development Kit)**
> 
> ![Componentes del JDK](https://github.com/juansuarezb/CursoJava/raw/Seccion2/Imagenes/Imagen7.avif)
> 
> El **JDK (Java Development Kit)** es el paquete esencial para desarrollar aplicaciones en Java. Es el "kit completo" que incluye todo lo necesario para:
> 
> - **Compilar** código fuente (.java → .class)
> - **Ejecutar** aplicaciones Java
> - **Depurar** y diagnosticar problemas
> - **Documentar** tu código
> 
> #### Componentes principales del JDK:
> 
> 1. **javac** - El compilador de Java
> 2. **JRE (Java Runtime Environment)** - Entorno de ejecución que incluye:
>    - JVM (Java Virtual Machine)
>    - Bibliotecas estándar (Java Class Library)
> 3. **Herramientas adicionales**:
>    - javap (desensamblador de bytecode)
>    - javadoc (generador de documentación)
>    - jdb (depurador)
>    - jconsole (monitoreo)
> 
> #### ¿Por qué necesitas el JDK?
> 
> | Para... | Herramienta JDK |
> |---------|-----------------|
> | Escribir código | Editor de texto/IDE |
> | Compilar | javac |
> | Ejecutar | java (JRE) |
> | Empaquetar | jar |
> 
> **Versiones importantes**: Oracle JDK (comercial) vs OpenJDK (open-source). Para aprendizaje, recomiendo OpenJDK.
> 
>  💡 **Dato clave**: El JDK siempre incluye el JRE, pero si solo quieres ejecutar aplicaciones Java (no desarrollarlas), basta con instalar el JRE.

> [!IMPORTANT]
> ## **Ediciones de Java: ¿Cuál necesitas?**
> 
> ![Ediciones de Java](https://github.com/juansuarezb/CursoJava/raw/Seccion2/Imagenes/Imagen8.avif)
> 
> Java ofrece diferentes ediciones para distintos propósitos de desarrollo:
> 
> ### **1. Java SE (Standard Edition)**
> - **El núcleo fundamental** de Java
> - Contiene todas las APIs básicas y la JVM
> - Ideal para:
>   - Aplicaciones de escritorio
>   - Aplicaciones consola
>   - Fundamentos de programación Java
> - Versión actual: Java SE 21 (LTS)
> 
> ### **2. Java EE (Enterprise Edition) - Ahora Jakarta EE**
> - **Para desarrollo empresarial** a gran escala
> - Incluye:
>   - Servidores de aplicaciones (TomEE, WildFly)
>   - APIs para:
>     - Web Services (JAX-RS, JAX-WS)
>     - Persistencia (JPA)
>     - Seguridad (JAAS)
> - Usado en:
>   - Sistemas bancarios
>   - ERP/CRM
>   - Aplicaciones distribuidas
> 
> ### **3. Java ME (Micro Edition)**
> - **Para dispositivos embebidos** y con recursos limitados
> - Usado en:
>   - Dispositivos IoT
>   - Sistemas embebidos
>   - Teléfonos móviles (antes de Android)
> - Características:
>   - Footprint reducido
>   - APIs específicas para hardware
> 
> ### **4. JavaFX (Ahora proyecto independiente)**
> - **Para interfaces gráficas modernas**
> - Características:
>   - Gráficos vectoriales
>   - Animaciones
>   - Integración con Web (WebView)
> - Alternativa a Swing/AWT
> 
> ```mermaid
> graph TD
>   A[Java SE] -->|Base| B[Java EE]
>   A -->|Versión reducida| C[Java ME]
>   A -->|Grpahics| D[JavaFX]
> ```
> 
> 🔍 **Recomendación para principiantes**: Comienza con Java SE (Standard Edition) para dominar los fundamentos antes de explorar otras ediciones.

> [!NOTE]
> ## **2: Instalar el JDK**

Otra cosa más que vamos a agregar es la configuración de la variable de entorno para java. Así, otros entornos de desarrollo van a saber donde está instaldo el JDK
Lo que contiene esta variable de entorno JavaHome es la ruta de instalación del JDK
Nos dirimos a la configuración del sistema de Windows
<div align="center">
   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion2/Imagenes/Imagen17.avif" alt="Página de descarga Tomcat 9" width="85%">
   <p><em>Y luego, nos dirijimos a la parte de sistema.</em></p>
   *Nos dirijimos a "Acerca de" luego, a Configuración avanzada del sistema.
    <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion2/Imagenes/Imagen18.avif" alt="Página de descarga Tomcat 9" width="85%">
</div>

**Luego seleccionamos en variables del sistema: Nueva** <br>
<div align="center">
   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion2/Imagenes/Imagen20.avif" alt="Página de descarga Tomcat 9" width="85%"> <br>
    Copiamos el path donde tengamos instalado el jdk hasta la carpeta bin: D:\ProgramasProgra\JDK\bin y damos en aceptar y aceptar.
</div>


> [!NOTE]
> ## **3: Instalar APache Netbeans**


> [!NOTE]
> ## **4: Crea tu primer programa**: 
> <div align="center">
>   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion2/Imagenes/Imagen10.avif" alt="Página de descarga Tomcat 9" width="85%">
>   <p><em>Para crear tu primer proyecto en NetBeans nos dirijimos a:.</em></p>
> </div>
> <div align="center">
>   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion2/Imagenes/Imagen11.avif" alt="Página de descarga Tomcat 9" width="85%">
>   <p><em>Se nos mostrará la ventana para elegir el tipo de tecnología y aplicación que vamos a utilizar por ahora seleccionamos Java with Ant y java application  .</em></p>
> </div>
> <div align="center">
>   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion2/Imagenes/Imagen12.avif" alt="Página de descarga Tomcat 9" width="85%">
>   <p><em>Elegimos el nombre del proyecto y dejamos la opción de "create a main class" a continuación, se mostrará el editor de código y nuestra clase principal que nos servirá como "activador" del programa.</em></p>
> </div>
> <div align="center">
>   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion2/Imagenes/Imagen13.avif" alt="Página de descarga Tomcat 9" width="85%">
>   <p><em>Podemos crear clases, paquetes, interfacesy más desde el navegador que nos ofrece netbeans</em></p>
> </div>
> <div align="center">
>   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion2/Imagenes/Imagen14.avif" alt="Página de descarga Tomcat 9" width="85%">
>   <p><em>Creamos una nueva clase "Hola" (LAS CLASES EN JAVA SIEMPRE DEBEN INICIAR CON UNA LETRA MAYUSCULA) </em></p>
> </div>

> [!TIP]
> Existe un atajo para escribir el método main (el cual funciona como activador de la clase) si escribes psvm + shift se te creará el método main o puedes escribir todo el método. Otro atajo es colocar main +  shift.
```java
package seccion2proyecto;

public class Hola {
    public static void main(String[] args) {
        
    }
}  


```
### 🧾 Tabla explicativa de la clase `Hola`

| Línea de código                                 | Explicación                                                                 |
|--------------------------------------------------|-----------------------------------------------------------------------------|
| `package seccion2proyecto;`                     | Define el paquete al que pertenece la clase. Agrupa clases relacionadas.   |
| `public class Hola {`                           | Declara una clase pública llamada `Hola`. Las clases en Java empiezan con mayúscula. |
| `public static void main(String[] args) {`      | Método principal. Es el punto de entrada de toda aplicación Java.          |
| `}` (dentro del `main`)                         | Aquí irá el código que queremos ejecutar al iniciar el programa.           |
| `}` (cierre de la clase)                        | Finaliza el bloque de la clase.                                             |

*Finalmente colocamos el comando System.out.println para imprimir nuestro "Hola Mundo"*
*Atajo: coloca sout + shit*
```java
package seccion2proyecto;

public class Hola {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
    }
}  


```
**Finalmente ejecutamos nuestro programa con la flecha verde que se encuentra en la parte superior o dando click derecho en nuestra main class (en el navegador de la izquierda y ejecutar)**
<div align="center">
  <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion2/Imagenes/Imagen15.avif" alt="Página de descarga Tomcat 9" width="85%">  
</div>
<div align="center">
   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion2/Imagenes/Imagen16.avif" alt="Página de descarga Tomcat 9" width="85%">
   <p><em>Ejecución del programa </em></p>
</div>

> [!NOTE]
> ## **5: Compilacion y Ejecución**
>

> [!NOTE]
> ## **6: Sintaxis y semántica**
>


> [!NOTE]
> ## **7: JShell de Java**
> el Jshell de java es una herramienta de lineas de comando que está introducido desed el JDK 9 <br>
> El Jshell nos proporciona un entorno interactivo para escribir, probar y ejecutar un fragmento de código de java sin necesidad de crar un archivo <br>
> Abrimos la terminal del sistema y colocamos el comando jshell. <br>
> ![Resumen](https://github.com/juansuarezb/CursoJava/raw/Seccion2/Imagenes/Imagen19.avif)
> ![Resumen](https://github.com/juansuarezb/CursoJava/raw/Seccion2/Imagenes/Imagen21.avif)

> [!NOTE]
> ## **8: Resumen**
> ![Resumen](https://github.com/juansuarezb/CursoJava/raw/Seccion2/Imagenes/Imagen9.webp)

[![Main](https://img.shields.io/badge/🏠_Volver_al_Main-8A2BE2?style=for-the-badge&logo=github&logoColor=white)](https://github.com/juansuarezb/CursoJava/blob/main/README.md)
[![Anterior](https://img.shields.io/badge/←_Volver_a_Sección_1-8A2BE2?style=for-the-badge&logo=github&logoColor=white)](https://github.com/juansuarezb/CursoJava/blob/Seccion1/README.md)
[![Siguiente](https://img.shields.io/badge/Seccion3→-2E8B57?style=for-the-badge&logo=github&logoColor=white)](https://github.com/juansuarezb/CursoJava/blob/Seccion3/README.md)
