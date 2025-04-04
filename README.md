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


## 3. SELECT desde Java 

> [!NOTE]
> **Objetivo**:  
> Consultar y mostrar registros de una tabla MySQL directamente desde Java usando JDBC.

### 🔍 Método `listarRegistros()`
```java
package com.oregoom.mensajes;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        listarRegistros(); // Ejecutar consulta
    }
    
    static void listarRegistros() throws SQLException {
        // 1. Establecer conexión
        Connection conexion = DriverManager.getConnection(
            "jdbc:mysql://localhost/mensajes_db?serverTimezone=UTC", 
            "root", 
            "root"
        );
        
        // 2. Preparar consulta SQL
        String sql = "SELECT * FROM mensajes";
        PreparedStatement ps = conexion.prepareStatement(sql);
        
        // 3. Ejecutar y procesar resultados
        ResultSet resultados = ps.executeQuery();
        System.out.println("📊 Registros encontrados:");
        
        while(resultados.next()) {
            System.out.printf(
                "| ID: %d | Mensaje: %-20s | Autor: %-10s | Fecha: %s |\n",
                resultados.getInt("id_mensaje"),
                resultados.getString("mensaje"),
                resultados.getString("autor_mensaje"),
                resultados.getString("fecha_creacion")
            );
        }
        
        // 4. Cerrar recursos
        resultados.close();
        ps.close();
        conexion.close();
    }
}
```

> [!NOTE]  
> <div align="center">
> 
> ```mermaid
> flowchart LR
>     A[DriverManager] -->|Conexión| B[PreparedStatement]
>     B -->|Ejecuta| C[ResultSet]
>     C -->|Muestra| D[printf]
> ```
> 
> | Componente | Propósito |
> |------------|-----------|
> | **DriverManager** | Inicia la conexión JDBC |
> | **PreparedStatement** | Ejecuta queries SQL de forma segura |
> | **ResultSet** | Iteración sobre resultados |
> | **printf** | Formateo profesional de salida |
> 
> </div>
> ![Diagrama de flujo UPDATE JDBC](https://github.com/juansuarezb/CursoJava/raw/Seccion16/Imagenes/Imagen5.avif)  


## 4. INSERT desde Java 
> [!NOTE]
> **Objetivo**:  
> Insertar registros a una tabla MySQL directamente desde Java usando JDBC.
> ```mermaid
> flowchart TB
>     A[DriverManager] -->|Establece conexión| B[PreparedStatement]
>     B -->|Parametriza| C[Valores SQL]
>     C -->|Ejecuta| D[executeUpdate]
>     D -->|Confirma| E[Registro insertado]
> ```

<div align="center">

| Componente | Función |
|------------|---------|
| **DriverManager** | Crea la conexión a la BD (`jdbc:mysql://...`) |
| **PreparedStatement** | Prepara el INSERT con parámetros seguros (`?`) |
| **setString()** | Asigna valores a los parámetros (1=mensaje, 2=autor) |
| **executeUpdate()** | Ejecuta la inserción (retorna filas afectadas) |
| **CURRENT_TIME()** | Función MySQL para timestamp automático |

</div>

```java
static void insertarRegistros(String mensaje, String autor) throws SQLException {
    Connection conexion = DriverManager.getConnection(
        "jdbc:mysql://localhost/mensajes_db?serverTimezone=UTC", 
        "root", 
        "root"
    );
    
    String sql = "INSERT INTO mensajes (mensaje, autor_mensaje, fecha_creacion) " +
                 "VALUES (?, ?, CURRENT_TIME())";
    
    PreparedStatement ps = conexion.prepareStatement(sql);
    ps.setString(1, mensaje);  // Primer parámetro (mensaje)
    ps.setString(2, autor);    // Segundo parámetro (autor)
    ps.executeUpdate();
    
    ps.close();
    conexion.close();
}
```
</div>

## 5. UPDATE - desde Java
> [!NOTE]
> **Objetivo**:  
> Modificar registros existentes en MySQL mediante JDBC usando parámetros seguros.
> 
> ```java
> static void actualizarRegistros(String mensaje, String autor, int id) throws SQLException{
>     // 1. Establecer conexión
>     Connection conexion = DriverManager.getConnection(
>             "jdbc:mysql://localhost/mensajes_db?serverTimezone=UTC", 
>             "root", 
>             "root");
>     
>     // 2. Preparar consulta parametrizada
>     String sql = "UPDATE mensajes SET mensaje = ?, autor_mensaje = ? WHERE id_mensaje = ?";
>     PreparedStatement ps = conexion.prepareStatement(sql);
>     
>     // 3. Asignar valores
>     ps.setString(1, mensaje);
>     ps.setString(2, autor);
>     ps.setInt(3, id);
>     
>     // 4. Ejecutar
>     int filasAfectadas = ps.executeUpdate();
>     System.out.println(filasAfectadas + " registro(s) actualizado(s)");
>     
>     // 5. Liberar recursos
>     ps.close();
>     conexion.close();
> }
> ```
>   
> ![Diagrama de flujo UPDATE JDBC](https://github.com/juansuarezb/CursoJava/raw/Seccion16/Imagenes/Imagen6.avif)   


<div align="center">

| Elemento | Rol en la Actualización |
|----------|-------------------------|
| `UPDATE mensajes` | Especifica la tabla a modificar |
| `SET campo=?` | Indica qué columnas actualizar |
| `WHERE id_mensaje=?` | Condición para actualizar solo el registro con ese ID |
| `ps.setInt(3, id)` | Vincula el valor del ID al tercer parámetro (?) |
| `executeUpdate()` | Retorna 1 si se actualizó, 0 si no encontró el ID |

</div>
 
## 6. DELETE - desde Java
> [!NOTE]
> **Objetivo**:  
> Eliminar registros específicos de MySQL usando JDBC con parámetros seguros.
> 
> ```java
> static void eliminarRegistros(int id) throws SQLException{
>         // 1. Establecer conexión
>         Connection conectar = DriverManager.getConnection(
>                 "jdbc:mysql://localhost/mensajes_db?serverTimezone=UTC", 
>                 "root", 
>                 "root");
>         
>         // 2. Preparar consulta DELETE
>         String sql = "DELETE FROM mensajes WHERE id_mensaje = ?";
>         PreparedStatement ps = conectar.prepareStatement(sql);
>         
>         // 3. Asignar valor al parámetro
>         ps.setInt(1, id);
>         
>         // 4. Ejecutar eliminación
>         int filasEliminadas = ps.executeUpdate();
>         System.out.println(filasEliminadas + " registro(s) eliminado(s)");
>         
>         // 5. Liberar recursos
>         ps.close();
>         conectar.close();
>     }
> ```

<div align="center">

| Componente | Función Específica en DELETE |
|------------|------------------------------|
| **DELETE FROM** | Sintaxis SQL para eliminar registros |
| **WHERE** | Cláusula que identifica el registro a eliminar por ID |
| **executeUpdate()** | Retorna el número de filas eliminadas (1=éxito, 0=ID no encontrado) |

</div>
