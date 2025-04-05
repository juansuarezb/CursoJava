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
> [!NOTE]  
> **JSP O Java Server Page**  
> - Es un archivo en el cual podemos trabajar con Html y Xml <br>
> - Es similar a un archivo de PHP en el cuál podemos trabajar con código Java mediante etiquetas.
> - 

> [!NOTE]
> **Paso 1: Borramos nuestro archivo index.html**  
> <div align="center">
>   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion17/Imagenes/Imagen19.avif" alt="Página de descarga Tomcat 9" width="85%"> <br>
>   <p><em>Click derecho & delete.</em></p> <br>
>    <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion17/Imagenes/Imagen20.avif" alt="Página de descarga Tomcat 9" width="85%" <br>
>   <p><em>Creamos un archivo del tipo JSP</em></p> <rb></rb>
>    <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion17/Imagenes/Imagen21.avif" alt="Página de descarga Tomcat 9" width="85%" <br>
>   <p><em>Nombramos al archivo y seleccionamos finalizar</em></p> <rb></rb>
>    <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion17/Imagenes/Imagen22.avif" alt="Página de descarga Tomcat 9" width="85%" <br>
>   <p><em>Código del index.jsp</em></p> <rb></rb>
> </div>

> [!NOTE]  
> <div align="center">
> 
> | Elemento | Propósito |
> |----------|-----------|
> | **`<%@page ... %>`** | Define directivas JSP, como el tipo de contenido y codificación. |
> | **`<!DOCTYPE html>`** | Indica al navegador que se usará HTML5. |
> | **`<html>`** | Etiqueta raíz de todo el documento HTML. |
> | **`<head>`** | Contiene metadatos como codificación y título. |
> | **`<meta charset>`** | Especifica la codificación de caracteres (UTF-8). |
> | **`<title>`** | Define el título de la pestaña del navegador. |
> | **`<body>`** | Contiene el contenido visible de la página. |
> | **`<h1>Hello World!</h1>`** | Encabezado que muestra el texto en pantalla. |
> 
> </div>

> [!NOTE]
> **Paso 2: Colocamos un nuevo mensaje en el archivo index.jsp y ejecutamos con el click derecho**  
> <div align="center">
>   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion17/Imagenes/Imagen23.avif" alt="Página de descarga Tomcat 9" width="85%"> <br>
>    <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion17/Imagenes/Imagen24.avif" alt="Página de descarga Tomcat 9" width="85%" <br>
>   <p><em>Ejecución del programa en el localhost:8080</em></p> <rb></rb>
> </div>


> [!NOTE]
> **Paso 3: Utilizamos la etiqueta <%%> y dentro podemos utilizar el lenguaje Java.**  
```html
<!-- Codigo JSP -->
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!-- Codigo HTML -->
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hola desde JSP</h1>
        <!-- Dentro de esta etiqueta podemos ejecutar código Java -->
        <%
            String nombre = "Juan Suarez";
            int edad = 22;
            out.println("Nombre: " + nombre + "\n");
            out.println("Edad: " + edad);
        %>
    </body>
</html>
```
> <div align="center">
>    <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion17/Imagenes/Imagen25.avif" alt="Página de descarga Tomcat 9" width="85%" <br>
>   <p><em>Ejecución del programa en el localhost:8080</em></p> <rb></rb>
> </div>

> [!IMPORTANT]
> Así, un archivo JSP nos permite trabajar con HTML y con XML.

## 4. Diseñar en JSP - Crear mensaje
> [!IMPORTANT]
> **Ahora, ya podemos empezar a diseñar nuestra intefaz de salida** <br>
> *Boostrap nos ayudará con el diseño de la interfaz enfoncandonos en lo estilos para que se vea mejor* <br>
> <p>Acceda al <a href="https://getbootstrap.com/docs/" target="_blank" rel="noopener noreferrer">sitio oficial</a> de Bootstrap.</p>

> [!NOTE]  
> **Paso 1: Copiamos el código para utilizar los estilos CSS de Bootstrap (sin JS ni componentes interactivos)**  
> **Y lo colocamos en el `<head>` de nuestro `index.jsp`**  
>  
> ```html
> <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.5/dist/css/bootstrap.min.css"
> rel="stylesheet" integrity="sha384-SgOJa3DmI69IUzQ2PVdRZhwQ+dy64/BUtbMJw1MZ8t5HZApcHrRKUc4W0kG879m7"
> crossorigin="anonymous">
> ```
>  
> ```html
> <head>
>     <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
>     <title>JSP Page</title>
>     <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.5/dist/css/bootstrap.min.css"
>     rel="stylesheet" integrity="sha384-SgOJa3DmI69IUzQ2PVdRZhwQ+dy64/BUtbMJw1MZ8t5HZApcHrRKUc4W0kG879m7"
>     crossorigin="anonymous">
> </head>
> ```
> <div align="center">
>    <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion17/Imagenes/Imagen26.avif" alt="Página de descarga Tomcat 9" width="85%" <br>
>   <p><em>Vemos que se ha cambiado el tipo de fuente.</em></p> <rb></rb>
> </div> 

> [!IMPORTANT]  
> **Paso 2: Para el contenido vamos a utilizar algunos estilos**  
>
> <p>Acceda al <a href="https://getbootstrap.com/docs/5.3/customize/components/" target="_blank" rel="noopener noreferrer">sitio oficial</a> de los componentes de Bootstrap.</p> 

> [!NOTE]  
> **Paso 3: Vamos a utilizar un estilo de los modales para ventanas emergentes**  
> Acceda al [**sitio oficial**](https://getbootstrap.com/docs/5.3/components/modal/) de los modals de Bootstrap para más detalles.  
> Copiamos el código de la página de Bootstrap y lo pegamos dentro del `<body>` de nuestro archivo `index.jsp`.

> ```html
> <!-- Button trigger modal -->
> <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">
>   Launch demo modal
> </button>
> 
> <!-- Modal -->
> <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
>   <div class="modal-dialog">
>     <div class="modal-content">
>       <div class="modal-header">
>         <h1 class="modal-title fs-5" id="exampleModalLabel">Modal title</h1>
>         <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
>       </div>
>       <div class="modal-body">
>         ...
>       </div>
>       <div class="modal-footer">
>         <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
>         <button type="button" class="btn btn-primary">Save changes</button>
>       </div>
>     </div>
>   </div>
> </div>
> ```

> <div align="center">
>    <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion17/Imagenes/Imagen27.avif" alt="Página de descarga Tomcat 9" width="85%" <br>
>   <p><em>Al actualizar la página vemos un botón (sin funcionalidad)</em></p> <rb></rb>
> </div> 

> [!NOTE]  
> **Paso 4: Modal estático (sin JavaScript)**  
> Este modal aparecerá directamente en la página sin necesidad de interactuar con un botón.  
> 
> ```html
> <%@page contentType="text/html" pageEncoding="UTF-8"%>
> <!DOCTYPE html>
> <html>
>     <head>
>         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
>         <title>JSP Page</title>
>         <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.5/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-SgOJa3DmI69IUzQ2PVdRZhwQ+dy64/BUtbMJw1MZ8t5HZApcHrRKUc4W0kG879m7" crossorigin="anonymous">
>     </head>
>     <body>
>         <!-- Modal estático (sin funcionalidad JS) -->
>         <div class="modal" style="display: block; position: initial;">
>             <div class="modal-dialog">
>                 <div class="modal-content">
>                     <div class="modal-header">
>                         <h1 class="modal-title fs-5" id="exampleModalLabel">Modal title</h1>
>                         <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
>                     </div>
>                     <div class="modal-body">
>                         Contenido del modal aquí...
>                     </div>
>                     <div class="modal-footer">
>                         <button type="button" class="btn btn-secondary">Close</button>
>                         <button type="button" class="btn btn-primary">Save changes</button>
>                     </div>
>                 </div>
>             </div>
>         </div>
>     </body>
> </html>
> ```
> 
> <div align="center">
>    <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion17/Imagenes/Imagen27.avif" alt="Modal estático visible al cargar la página" width="85%">
>    <p><em>El modal aparece automáticamente al cargar la página (sin botón)</em></p>
> </div>

> [!NOTE]  
> **Paso 4: Entrys para el mensaje y el autor**  
> Código para los campos de formulario dentro del modal:
> 
> ```html
> <div class="modal-body">
>     <div class="mb-3">
>         <label for="exampleFormControlInput1" class="form-label">Email address</label>
>         <input type="email" class="form-control" id="exampleFormControlInput1" placeholder="name@example.com">
>     </div>
>     <div class="mb-3">
>         <label for="exampleFormControlTextarea1" class="form-label">Example textarea</label>
>         <textarea class="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
>     </div>
> </div>
> ```
> 
> <div align="center">
>   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion17/Imagenes/Imagen28.avif" alt="Modal estático visible al cargar la página" width="85%">
> </div>

> [!NOTE]  
> **Paso 5: Formulario completo para mensajes**  
> Código completo del modal con campos personalizados para mensajes:
> 
> ```html
> <%@page contentType="text/html" pageEncoding="UTF-8"%>
> <!DOCTYPE html>
> <html>
>     <head>
>         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
>         <title>JSP Page</title>
>         <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.5/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-SgOJa3DmI69IUzQ2PVdRZhwQ+dy64/BUtbMJw1MZ8t5HZApcHrRKUc4W0kG879m7" crossorigin="anonymous">
>     </head>
>     <body>
>         <!-- Modal estático (sin funcionalidad JS) -->
>         <div class="modal" style="display: block; position: initial;">
>             <div class="modal-dialog">
>                 <div class="modal-content">
>                     <div class="modal-header">
>                         <h1 class="modal-title fs-5">Crear mensaje</h1>            
>                     </div>
>                     <div class="modal-body">
>                         <div class="mb-3">
>                             <label for="exampleFormControlTextarea1" class="form-label">Ingrese el Mensaje</label>
>                             <textarea class="form-control" name="mensaje" rows="3"></textarea>
>                         </div>
>                         <div class="mb-3">
>                             <label for="exampleFormControlInput1" class="form-label">Autor</label>
>                             <input type="text" class="form-control" name="autor">
>                         </div>
>                     </div>
>                     <div class="modal-footer">
>                         <button type="button" class="btn btn-primary" name="enviar">Enviar</button>
>                     </div>
>                 </div>
>             </div>
>         </div>
>     </body>
> </html>
> ```
> 
> <div align="center">
>   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion17/Imagenes/Imagen29.avif" alt="Formulario completo para mensajes" width="85%">
> </div>

## 5. Diseñar en JSP - Mostrar mensaje
> [!IMPORTANT]
> **Ahora, ya que tenemos el diseño de crear mensaje, ahora vamos a diseñar el de mostrar mensaje** <br>
> *Boostrap nos ayudará con el diseño de la interfaz enfoncandonos en lo estilos para que se vea mejor* <br>
> 

> [!NOTE]  
> **Paso 1: <p>Accedemos a la sección Card del <a href="https://getbootstrap.com/docs/5.3/components/card/" target="_blank" rel="noopener noreferrer">sitio oficial</a> de Bootstrap.</p>**  
> **Buscamos la mejor opción para mostrar un mensaje, lo copiamos debajo del último div realizado.**  
>  
> ```html
> <div class="card" style="width: 18rem;">
>  <div class="card-body">
>    <h5 class="card-title">Card title</h5>
>    <h6 class="card-subtitle mb-2 text-body-secondary">Card subtitle</h6>
>    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
>    <a href="#" class="card-link">Card link</a>
>    <a href="#" class="card-link">Another link</a>
>  </div>
></div>
> ```

> [!NOTE]  
> **Paso 2: Corrección de formato y posición de la tarjeta**  
> <p>Para solucionar los problemas de formato y posición:</p> <br>
> 1. Copiamos la estructura del modal "Crear mensaje" <br>
> 2. Adaptamos el contenido para mostrar mensajes existentes <br> 
> 3. Agregamos botones de acción para cada mensaje. <br> 
>  
> ```html
> <div class="modal" style="display: block; position: initial;">
>     <div class="modal-dialog">
>         <div class="modal-content">
>             <div class="modal-header">
>                 <h1 class="modal-title fs-5">Todos los mensajes</h1>            
>             </div>
>             <div class="modal-body">
>                 <div class="card">
>                     <div class="card-body">
>                         <h5 class="card-title">Juan Suarez</h5>
>                         <p class="card-text">"Hola desde Java"</p>
>                         <p class="blockquote-footer"><cite>25/10/2020 02:10</cite></p>
>                         <a href="#" class="card-link">Editar</a>
>                         <a href="#" class="card-link">Eliminar</a>
>                     </div>
>                 </div>
>             </div>
>         </div>
>     </div>
> </div>
> ```
> <div align="center">
>   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion17/Imagenes/Imagen29.avif" alt="Vista de mensajes en modal con tarjeta" width="85%">
> </div>

 
> ```html
> <head>
>     <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
>     <title>JSP Page</title>
>     <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.5/dist/css/bootstrap.min.css"
>     rel="stylesheet" integrity="sha384-SgOJa3DmI69IUzQ2PVdRZhwQ+dy64/BUtbMJw1MZ8t5HZApcHrRKUc4W0kG879m7"
>     crossorigin="anonymous">
> </head>
> ```
> <div align="center">
>    <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion17/Imagenes/Imagen30.avif" alt="Página de descarga Tomcat 9" width="85%" <br>
>   
> </div> 

## 6. Metodos GET y POST
> [!IMPORTANT]
> **Ahora, vamos a agregar las funcionalidad de enviar un mensaje, ya que actualmente nuestro programa no hace nada** <br>
> *Para eso, vamos a agregar una etiqueta form con una acción y con el metodo get<br>
> *Asi, en la barra de navegación se mostrará los datos enviados"
> <div align="center">
>    <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion17/Imagenes/Imagen31.avif" alt="Página de descarga Tomcat 9" width="85%" <br>  
> </div>

> [!NOTE]
> **Luego, para recuperar la información y presentarla en el modal para mostrar mensajes, vamos a utilizar los tags de java** <br>
> *Así, declaramos unas variables para almacenar el autor y el mensaje y los pasamos en los respectivos campos"
> ```html
> <!-- Modal para crear mensajes -->
>        <div class="modal" style="display: block; position: initial;">
>            <div class="modal-dialog">
>                <div class="modal-content">
>                    <form action="index.jsp" method="GET">
>                        <div class="modal-header">
>                            <h1 class="modal-title fs-5">Crear mensaje</h1>            
>                        </div>
>                        <div class="modal-body">
>                            <div class="mb-3">
>                                <label for="mensajeTextarea" class="form-label">Ingrese el Mensaje</label>
>                                <textarea class="form-control" id="mensajeTextarea" name="mensaje" rows="3" required></textarea>
>                            </div>
>                            <div class="mb-3">
>                                <label for="autorInput" class="form-label">Autor</label>
>                                <input type="text" class="form-control" id="autorInput" name="autor" required>
>                            </div>
>                        </div>
>                        <div class="modal-footer">
>                            <button type="submit" class="btn btn-primary">Enviar</button>
>                        </div>
>                    </form>
>                </div>
>            </div>
>       </div>
> 
>        <%
>            String mensaje = request.getParameter("mensaje");
>            String autor = request.getParameter("autor");
>        %>
>        <!-- Modal para mostrar mensajes -->
>        <div class="modal" style="display: block; position: initial; margin-top: 20px;">
>            <div class="modal-dialog">
>                <div class="modal-content">
>                    <div class="modal-header">
>                        <h1 class="modal-title fs-5">Todos los mensajes</h1>            
>                    </div>
>                    <div class="modal-body">
>                        <div class="card">
>                            <div class="card-body">
>                                <h5 class="card-title"><%=autor%></h5>
>                                <p class="card-text"><%=mensaje%></p>
>                                <p class="blockquote-footer"><cite>25/10/2020 02:10</cite></p>
>                                <div class="d-flex gap-2">
>                                    <a href="#" class="btn btn-outline-primary btn-sm">Editar</a>
>                                    <a href="#" class="btn btn-outline-danger btn-sm">Eliminar</a>
>                                </div>
>                            </div>
>                        </div>
>                    </div>
>                </div>
>            </div>
>        </div>
> ```
> <div align="center">
>    <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion17/Imagenes/Imagen32.avif" alt="Página de descarga Tomcat 9" width="85%" <br>  
> </div> 

> [!NOTE]
> **Finalmente, para ocultar la información de la barra de búsqueda podemos utilizar el método POST.** <br>
> ```html
> <!-- Modal para crear mensajes -->
>        <div class="modal" style="display: block; position: initial;">
>            <div class="modal-dialog">
>                <div class="modal-content">
>                    <form action="index.jsp" method="POST">
>                        <div class="modal-header">
>                            <h1 class="modal-title fs-5">Crear mensaje</h1>            
>                        </div>
>                        <div class="modal-body">
>                            <div class="mb-3">
>                                <label for="mensajeTextarea" class="form-label">Ingrese el Mensaje</label>
>                                <textarea class="form-control" id="mensajeTextarea" name="mensaje" rows="3" required></textarea>
>                            </div>
>                            <div class="mb-3">
>                                <label for="autorInput" class="form-label">Autor</label>
>                                <input type="text" class="form-control" id="autorInput" name="autor" required>
>                            </div>
>                        </div>
>                        <div class="modal-footer">
>                            <button type="submit" class="btn btn-primary">Enviar</button>
>                        </div>
>                    </form>
>                </div>
>            </div>
>       </div>
> > <div align="center">
>    <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion17/Imagenes/Imagen33.avif" alt="Página de descarga Tomcat 9" width="85%" <br>  
> </div> 