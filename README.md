# Sección 17: PD - Introducción a Java Web

> [!NOTE]
> **Temas cubiertos:**
> - Instalar Apache Tomcat 9 
> - Hola Mundo Web 
> - ¿Qué es JSP?
> - Diseñar en JSP - Crear mensaje
> - Diseñar en JSP - Mostrar mensaje
> - Metodos GET y POST

## 1. Instalar Apache Tomcat 9

> [!IMPORTANT]
> **Descarga e instalación de Apache Tomcat 9**  
> <p>Acceda al <a href="https://tomcat.apache.org/download-90.cgi" target="_blank" rel="noopener noreferrer">sitio oficial</a> para descargar el instalador.</p>

> [!NOTE]
> **Paso 1: Descargar el instalador**  
> <div align="center">
>   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion17/Imagenes/Imagen1.avif" alt="Página de descarga Tomcat 9" width="85%">
>   <p><em>Seleccione el instalador Windows Service (32/64-bit) para descargar el instaldor.</em></p>
> </div>

> [!NOTE]
> **Paso 2: Ejecutamos la descarga**
> <div align="center">
>   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion17/Imagenes/Imagen2.avif" alt="Ejecucion instalador" width="85%">
>   <p><em>Seleccionamos Next y aceptar condiciones hasta llegar al siguiente paso.</em></p>
> </div>

> [!NOTE]
> **Paso 3: Ejecución**
> <div align="center">
>   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion17/Imagenes/Imagen3.avif" alt="Ejecucion instalador" width="85%">
>   <p><em>Seleccionamos el tipo de instalación normal</em></p>
> </div>   

> [!NOTE]
> **Paso 4: Tipo de instalación**  
> <div align="center">
>   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion17/Imagenes/Imagen4.avif" alt="Ejecucion instalador" width="85%">
>   <p><em>Seleccionamos el tipo de instalación normal</em></p>
> </div> 

> [!WARNING]
> *Configuración clave*  
> **¡Atención!** Guardar esta contraseña generada, es fundamental para acceder al servidor. <br>
> **Además, es importante configurar el puerto, la recomendación es dejar en el 8080**


> [!NOTE]
> **Paso 5: Buscar el path donde tenemos instalado el JDK**  
> <div align="center">
>   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion17/Imagenes/Imagen5.avif" alt="Ejecucion instalador" width="85%">
>   <p><em>Seleccionamos el path donde esta el jdk (puede seleccionarse automáticamente)</em></p>
> </div> 

> [!NOTE]
> **Paso 6: Configuración de variables del sistema** 
> <div align="center">
>   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion17/Imagenes/Imagen6.avif" alt="Ejecucion instalador" width="85%">
>   <p><em>Seleccionamos la opción de propiedades sobre nuestro equipo.</em></p>
> </div> 

> [!NOTE]
> **Paso 7: Accedemos a configuración avanzada del sistema**  
> <div align="center">
>   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion17/Imagenes/Imagen7.avif" alt="Ejecucion instalador" width="85%">
> </div> 

> [!NOTE]
> *Paso 8: Seleccionamos variables de entorno*  
> <div align="center">
>   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion17/Imagenes/Imagen8.avif" alt="Ejecucion instalador" width="85%">
> </div> 

> [!NOTE]
> **Paso 9:**  
> <div align="center">
>   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion17/Imagenes/Imagen9.avif" alt="Ejecucion instalador" width="85%">
>   <p><em>Agregamos una variable del sistema llamado "CATALINA_HOME" </em></p>
> </div> 

> [!NOTE]
> **Paso 10:**  
> <div align="center">
>   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion17/Imagenes/Imagen10.avif" alt="Ejecucion instalador" width="85%">
>   <p><em>Seleccionamos la variable path y agregamos la ruta hacia la carpeta "bin" del path donde instalamos el apache</em></p>
> </div> 

> [!NOTE]
> **Paso 11: Ejecución del apache**  
> <div align="center">
>   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion17/Imagenes/Imagen11.avif" alt="Ejecucion instalador" width="85%">
>   <p><em>Ejecutamos el archivo tomcat9.exe</em></p>
> </div> 

> [!NOTE]
> **Paso 11: Comprobación de la instalación del Apache Tomcat 9**  
> <div align="center">
>   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion17/Imagenes/Imagen12.avif" alt="Ejecucion instalador" width="85%">
>   <p><em>Ingresamos al localhost en el puerto 8080 y comprobamos que ingresamos al apache.</em></p>
> </div> 

## 2. Hola Mundo Web
> [!NOTE]  
> Ahora que ya tenemos el servidor, vamos a crear un nuevo proyecto y lo vamos a ejecutar en el servidor con una aplicación de Java web el "Hola Mundo"

> [!NOTE] 
> **Paso 1: Configurar el servidor**  
> <div align="center">
>   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion17/Imagenes/Imagen13.avif" alt="Página de descarga Tomcat 9" width="85%">
>   <p><em>Actualmente, no tenemos ningun servidor configurado.</em></p>
> </div>

> [!NOTE]
> **Paso 2: Seleccionar el Apache Tomcat**  
> <div align="center">
>   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion17/Imagenes/Imagen14.avif" alt="Página de descarga Tomcat 9" width="85%">
>   <p><em>Luego, seleccionamos next</em></p>
> </div>

> [!NOTE]
> **Paso 3: Instalación y detalles de login**  
> <div align="center">
>   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion17/Imagenes/Imagen15.avif" alt="Página de descarga Tomcat 9" width="85%">
>   <p><em>Primero, seleccionamos la carpeta en la cual instalamos el Apache Tomcat</em></p> <br>
>   <p><em>Luego, ingresamos el usuario y contraseña de nuestro apache y seleccionamos Finish</em></p> <br>
>   <p><em>Finalmente, podemos arrancar el servidor dando click derecho en el menú de navegación de los servicios</em></p>
> </div>

> [!NOTE]
> **Paso 4: Creación de un nuevo proyeto con el servidor encendido**  
> <div align="center">
>   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion17/Imagenes/Imagen16.avif" alt="Página de descarga Tomcat 9" width="85%">
>   <p><em>Primero, creamos un proyecto con Maven para que nos ayude con las dependencias</em></p> <br>
>   <p><em>Luego, Selecionamos Web application</em></p> <br>
>   <p><em>Finalmente, podemos arrancar el servidor dando click derecho en el menú de navegación de los servicios</em></p> <br>
>   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion17/Imagenes/Imagen17.avif" alt="Página de descarga Tomcat 9" width="85%"> <br>
>   <p><em>Escogemos el servidor de Apache tomcat y la version de Java empreserial</em></p>
> </div>

> [!NOTE]
> **Paso 5: Esperamos a que se cree el proyecto**  
> <div align="center">
>   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion17/Imagenes/Imagen16.avif" alt="Página de descarga Tomcat 9" width="85%">
>   <p><em>Una vez creado el proyecto podemos navegar en el mismo</em></p> <br>
> </div>

> [!NOTE]
> **Estrucutura del proyecto"  
> <div align="center">
![Descripción de la imagen](https://github.com/juansuarezb/CursoJava/raw/Seccion17/Imagenes/Imagen1.avif)
| Componente | Función | Tecnología Relacionada |
|------------|---------|-----------------------|
| 📁 **WEB-INF** | Seguridad y configuración web | Servlet API |
| 🌐 **index.html** | Interfaz de usuario principal | HTML5 |
| 🔗 **RESTful Web Services** | Servicios API REST | JAX-RS (JavaEE) |
| 📦 **javax.mail-1.6.0.jar** | Manejo de correos electrónicos | JavaMail API |
| ⚙️ **nb-configuration.xml** | Configuración del IDE | NetBeans |

</div>

> [!NOTE]
> **Paso 6: Debemos de hacer un clean and build de nuestro proyecto para que se instalen las depedencias faltantes.**  
> <div align="center">
>   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion17/Imagenes/Imagen16.avif" alt="Página de descarga Tomcat 9" width="85%">
>   <p><em>Una vez creado el proyecto podemos navegar en el mismo</em></p> <br>
> </div>


> [!NOTE]
> **Paso 6: Agregamos la dependencia de mysql al archivo pom.xml**  
> <div align="center">
>   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion17/Imagenes/Imagen16.avif" alt="Página de descarga Tomcat 9" width="85%">
>   <p><em>Una vez creado el proyecto podemos navegar en el mismo</em></p> <br>
> </div>

## 3. ¿Qué es JSP?

## 4. Diseñar en JSP - Crear mensaje

## 5. Diseñar en JSP - Mostrar mensaje

## 6. Metodos GET y POST
