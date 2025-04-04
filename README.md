# Sección 16: PD - Conexión a MySQL

> [!NOTE]
> **Temas cubiertos:**
> - Descargar dependencias de MySQL  
> - De Java a MySQL  
> - SELECT - desde Java
> - INSERT INTO - desde Java
> - UPDATE - desde Java
> - DELETE - desde Java
 

## 1. Descargar dependencias de MySQL  

> [!NOTE]  
> **Vamos a trabajar con un nuevo stack:** Maven + JDBC  
> - Proyecto Maven (en lugar de Ant) <br>
> ![Interfaz de instalación de MySQL](https://github.com/juansuarezb/CursoJava/raw/Seccion16/Imagenes/Imagen1.avif) <br>
> **Utilizamos el package "com.oregoom.mensajes" porque es la base de datos que vamos a utilizar** 
> - Objetivo: Conexión segura Java-MySQL   
> **Estructura Maven para Java + MySQL**  
>   
> 📂 **Raíz del proyecto**  
> - `pom.xml` (Configuración y dependencias)  
>   
> 📁 **src/main/java**  
> - Paquete: `com.oregoom.mensajes`  
> - Clase principal: `JavaMySQL.java` (Conexión a BD)  
>   
> 🔗 **Dependencias clave**  
> - JDK 18  (Instalado en la máquina por nosotros)
> - `mysql-connector-java` (en `pom.xml`)  
>   
> ![Estructura del proyecto](https://github.com/juansuarezb/CursoJava/raw/Seccion16/Imagenes/Imagen2.avif)  

## Configuración del proyecto Maven

### Archivo `pom.xml` esencial
```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0">
    <!-- Configuración básica -->
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.oregoom</groupId>
    <artifactId>Java_Mysql</artifactId>
    <version>1.0-SNAPSHOT</version>
    
    <!-- Dependencias clave -->
    <dependencies>
        <!-- Conector MySQL para JDBC -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
    </dependencies>
</project>
```
> [!NOTE]
> **Una vez que guardemos los cambios del archivo pom.xml se descargaran las dependencias en nuestro proyecto**
>  ![Interfaz de instalación de MySQL](https://github.com/juansuarezb/CursoJava/raw/Seccion16/Imagenes/Imagen3.avif) <br>
> *Agregamos una clase main para realizar la conexion*


## 2. De Java a MySQL

> [!TIP]
> Vamos a utilizar el API de sql ya que vamos a necesitar las clases e interfaces del paquete <br>
> ```java
> package com.oregoom.mensajes;
> import java.sql.*;
>
> public class Main {
>
>    public static void main(String[] args) throws SQLException {
>        //Utilizamos la clase DriverManager para manajera la conexion
>        Connection conectar = DriverManager.getConnection(
>                "jdbc:mysql://localhost/mensajes_db?serverTimezone=UTC", "root", "root");                                                        
>        //dentro del metodo getConnection() colocamos el url de nuestra BD, el usuario, la contrasena 
>        //el servidor se encuentra de manera local
>        //Nombre de la BD
>        //Zona horaria
>        System.out.println("Conexion exitosa");
>    }
>    
> }         
> ```

> [!NOTE] 
> Ejecutamos la main class y verificamos el mensaje en la consola <br>
> ![Interfaz de instalación de MySQL](https://github.com/juansuarezb/CursoJava/raw/Seccion16/Imagenes/Imagen4.avif) <br>


## 3. SELECT - desde Java
> [!NOTE]
> Una tabla es el lugar dónde vamos a almacenar los datos/registros.

![Interfaz de instalación de MySQL](https://github.com/juansuarezb/CursoJava/raw/Seccion15/Imagenes/Imagen16.avif) <br>
> [!NOTE] 
> Seleccionamos la opción "Create a new schema" e ingresamos el nombre de la DB, luego ingresamos los datos que va a tener la tabla. <br>

> Un consejo útil o una sugerencia.

![Interfaz de instalación de MySQL](https://github.com/juansuarezb/CursoJava/raw/Seccion15/Imagenes/Imagen17.avif) <br>

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
## 4. INSERT INTO - desde Java
> [!NOTE]
> Una vez creada la tabla podemos seleccionar los registros que tenga esta.
> Seleccionamos todos los registros de la tabla mensajes, actualmente está vacío. <br>
>![Interfaz de instalación de MySQL](https://github.com/juansuarezb/CursoJava/raw/Seccion15/Imagenes/Imagen18.avif) <br>

**Insertamos a la tabla mensajes con este comando:** <br>

```sql
INSERT INTO mensajes_db.mensajes (mensaje, autor_mensaje,fecha_creacion)
VALUES ("Hola Mundo", "Juan Suárez",current_time());
```
![Interfaz de instalación de MySQL](https://github.com/juansuarezb/CursoJava/raw/Seccion15/Imagenes/Imagen19.avif) <br>
> [!NOTE] 
> Volvemos a listar los registros de la tabla para verificar la inserción. <br>

## 5. UPDATE - desde Java
> [!NOTE]
> Vamos a editar o actualizar y también eliminar un registro.
> Para editar un registro necesitamos el id y los campos a ser editados<br>

```sql
UPDATE mensajes_db.mensajes 
SET mensaje= "Mensaje cambiado", 
autor_mensaje="Rolando Soto"
WHERE id_mensaje = 2;
```
> [!NOTE] 
> Volvemos a listar los registros de la tabla para verificar el cambio. <br>
> ![Interfaz de instalación de MySQL](https://github.com/juansuarezb/CursoJava/raw/Seccion15/Imagenes/Imagen20.avif) <br>

## 6. DELETE - desde Java
> [!NOTE]
> Vamos a editar o actualizar y también eliminar un registro.
> Para editar un registro necesitamos el id y los campos a ser editados<br>


> [!NOTE] 
> Finalmente, vamos a eliminar un registro mediante el comando: <br>

```sql
DELETE  FROM mensajes_db.mensajes 
WHERE id_mensaje = 2;
```
