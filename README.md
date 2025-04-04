> [!NOTE]
> La instalación y configuración completa del entorno MySQL incluye:
> 
> **🗄️ Servidor MySQL**  
> - Instalación del motor de base de datos.  
> - Configuración de usuarios/contraseñas  
>  
> **🖥️ MySQL Workbench**  
> - Herramienta gráfica para administración  
>  
> **⌨️ Integración CLI**  
> - Acceso a comandos MySQL desde terminal nativo  
> - Variables de entorno configuradas globalmente  

## 1. Instalación de MySQL

> [!IMPORTANT]
> <p>Acceda al <a href="https://dev.mysql.com/downloads/installer/" target="_blank" rel="noopener noreferrer">sitio oficial</a> para descargar el instalador de MySQL.</p>

![Interfaz de instalación de MySQL](https://github.com/juansuarezb/CursoJava/raw/Seccion15/Imagenes/Imagen1.avif)
> [!NOTE]
> *Paso 1: Selección de versión*  
> En el instalador, elegir la versión completa con todos los componentes (opción más pesada pero completa).

![Interfaz de instalación de MySQL](https://github.com/juansuarezb/CursoJava/raw/Seccion15/Imagenes/Imagen2.avif)
> [!NOTE]
> *Paso 2: Descarga*  
> Seleccionar "No thanks, just start my download" para iniciar la descarga sin crear cuenta.

![Interfaz de instalación de MySQL](https://github.com/juansuarezb/CursoJava/raw/Seccion15/Imagenes/Imagen3.avif)
> [!NOTE]
> *Paso 3: Ejecución*  
> Ejecutar el instalador descargado para comenzar el proceso.

![Interfaz de instalación de MySQL](https://github.com/juansuarezb/CursoJava/raw/Seccion15/Imagenes/Imagen4.avif)
> [!NOTE]
> *Paso 4: Tipo de instalación*  
> Seleccionar "Custom Type" para controlar qué componentes instalar (solo servidor y Workbench).

![Interfaz de instalación de MySQL](https://github.com/juansuarezb/CursoJava/raw/Seccion15/Imagenes/Imagen5.avif)
> [!NOTE]
> *Paso 5: Selección de componentes*  
> Usar las flechas para agregar:  
> - MySQL Server (motor principal)  
> - MySQL Workbench (interfaz gráfica)

![Interfaz de instalación de MySQL](https://github.com/juansuarezb/CursoJava/raw/Seccion15/Imagenes/Imagen6.avif)
> [!NOTE]
> *Paso 6: Confirmación*  
> Seleccionar "Execute" para iniciar la descarga e instalación de los paquetes seleccionados.

![Interfaz de instalación de MySQL](https://github.com/juansuarezb/CursoJava/raw/Seccion15/Imagenes/Imagen7.avif)
> [!WARNING]
> *Paso 7: Configuración clave*  
> **¡Atención!** Guardar esta contraseña generada para el usuario root, es fundamental para acceder al sistema.

![Interfaz de instalación de MySQL](https://github.com/juansuarezb/CursoJava/raw/Seccion15/Imagenes/Imagen8.avif)
> [!NOTE]
> *Paso 8: Finalización*  
> Seleccionar "Execute" nuevamente para completar la instalación. El proceso puede tomar varios minutos.

![Interfaz de instalación de MySQL](https://github.com/juansuarezb/CursoJava/raw/Seccion15/Imagenes/Imagen9.avif)
> [!NOTE]
> *Paso 9: Conexión a MySQL*  
> Seleccionamos la opción "Connect a Database" para conectarnos a nuestro servidor MySQL.

![Interfaz de instalación de MySQL](https://github.com/juansuarezb/CursoJava/raw/Seccion15/Imagenes/Imagen10.avif)
> [!NOTE]
> *Paso 10: Store in Vault*  
> Seleccionamos la opción Store in Vault luego, ingresamos la contraseña del usuario root.

![Interfaz de instalación de MySQL](https://github.com/juansuarezb/CursoJava/raw/Seccion15/Imagenes/Imagen11.avif)
> [!NOTE]
> *Paso 11: Finalización*  
> Listo!, hemos instalado el servidor MySQL y Workbench y estamos listos para empezar a trabajar.


## 2. Crear Base de datos

> [!TIP]
> Vamos a mostrar los comandos más basicos y el manejo de las funciones de Workbench. <br>

![Interfaz de instalación de MySQL](https://github.com/juansuarezb/CursoJava/raw/Seccion15/Imagenes/Imagen12.avif) <br>
> [!NOTE] 
> Seleccionamos la opción "Create a new schema" e ingresamos el nombre de la DB. <br>

![Interfaz de instalación de MySQL](https://github.com/juansuarezb/CursoJava/raw/Seccion15/Imagenes/Imagen13.avif) <br>
> [!NOTE]
> Podemos eliminar la DB recien creada mediante la opción "DROP SCHEMA". <br> 

![Interfaz de instalación de MySQL](https://github.com/juansuarezb/CursoJava/raw/Seccion15/Imagenes/Imagen13.avif) <br>
> [!NOTE]
> Podemos eliminar la DB recien creada mediante la opción "DROP SCHEMA". <br>

![Interfaz de instalación de MySQL](https://github.com/juansuarezb/CursoJava/raw/Seccion15/Imagenes/Imagen14.avif) <br>
> [!NOTE]
> Podemos crear una DB directamente con el Query. <br>

![Interfaz de instalación de MySQL](https://github.com/juansuarezb/CursoJava/raw/Seccion15/Imagenes/Imagen15.avif) <br>
> [!NOTE]
> Podemos listar las DB directamente con el Query. <br>

```sql
-- Crear una base de datos
CREATE DATABASE mensajes_db;

--Eliminar una base de datos
DROP DATABASE mensajes_db;

--Mostrar las bases de datos
SHOW DATABASES;

```
## 3. Crear Tabla
> [!NOTE]
> Una tabla es el lugar dónde vamos a almacenar los datos/registros.

![Interfaz de instalación de MySQL](https://github.com/juansuarezb/CursoJava/raw/Seccion15/Imagenes/Imagen16.avif) <br>
> [!NOTE] 
> Seleccionamos la opción "Create a new schema" e ingresamos el nombre de la DB. <br>

> Un consejo útil o una sugerencia.

![Interfaz de instalación de MySQL](https://github.com/juansuarezb/CursoJava/raw/Seccion15/Imagenes/Imagen17.avif) <br>
> [!NOTE] 
> Seleccionamos la opción "Create a new schema" e ingresamos el nombre de la DB. <br>

```sql
CREATE TABLE mensajes_db.mensajes(
	id_mensaje INT NOT NULL AUTO_INCREMENT,
    /*
  seleccionamos la db (mensajes_db) y ponemos el nombre de la taba (mensajes)*/
    mensaje VARCHAR(280) NOT NULL,
	autor_mensaje VARCHAR(45) NOT NULL,
    fecha_creacion datetime NOT NULL,
    PRIMARY KEY (id_mensaje)
);;

```




> [!CAUTION]
> Consecuencias negativas si no haces caso.