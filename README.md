# Sección 18: PD - Proyecto de Mensajes

> [!NOTE]
> **Temas cubiertos:**
>  <ul>
>    <li><strong>Conexión a MySQL</strong></li>
>    <li><strong>Clase Mensaje</strong></li>
>    <li><strong>Listar datos del tipo objeto</strong></li>
>    <li><strong>Insertar datos del tipo objeto</strong></li>
>    <li><strong>Editar datos del tipo objeto</strong></li>
>    <li><strong>Eliminar datos del tipo objeto</strong></li>
>    <li><strong>Mostrar Mensaje</strong></li>
>    <li><strong>Editar Mensaje</strong></li>
>    <li><strong>Eliminar Mensaje</strong></li>
>  </ul>

## 1. Conexión a MySQL

> [!NOTE]
> **Paso 1: Para conectarte a MySQL en tu proyecto debes agregar la dependencia de mysql-connector-java en tu archivo pom.xml**  
> ```html
> <dependency>
>    <groupId>mysql</groupId>
>    <artifactId>mysql-connector-java</artifactId>
>    <version>8.0.30</version> <!-- Reemplaza con la última versión estable si es necesario -->
> </dependency>
> ```
> *Gurdamos los cambios (Ctrl + S) y se descargará la dependencia necesaria, finalmente ejecutamos Clean and Build para el proyecto
> en caso de que se tengan que instalar otra dependencia faltante.**

> [!NOTE]
> **Paso 2: Creamos una clase Conexion para establer la conexión con MySQL**
>  ```java
> package com.oregoom.mensajes;
> import java.sql.*;
>  public class Conexion {
>    //Final para que no sea modificable
>    private static final String URL = "jdbc:mysql://localhost/mensajes_db?serverTimezone=UTC";
>    private static final String USR = "root";
>    private static final String PASS = "root";
>    
>   public static Connection getConexion() throws SQLException, ClassNotFoundException{      
>        //Tenemos que agregar una configuracion para el driver
>        Class.forName("com.mysql.cj.jdbc.Driver");
>        return DriverManager.getConnection(URL, USR, PASS);    
>   }
>    //Sobrecarga de metod
>    public static void cerrar(ResultSet rs) throws SQLException{
>        rs.close();
>    }
>    public static void cerrar(PreparedStatement ps) throws SQLException{
>        ps.close();
>    }   
>    public static void cerrar(Connection conn) throws SQLException{
>        conn.close();
>    }
> }

> [!NOTE]  
> <div align="center"> 
>
> | Componente                | Función                                                                 |
> |---------------------------|-------------------------------------------------------------------------|
> | **URL**                    | Define la URL de conexión a la base de datos MySQL (usando `localhost`) |
> | **USR**                    | Contiene el nombre de usuario para la base de datos (`root`)            |
> | **PASS**                   | Contiene la contraseña para la base de datos (`root`)                   |
> | **Class.forName()**        | Carga el driver de MySQL para establecer la conexión                    |
> | **DriverManager.getConnection()** | Establece la conexión con la base de datos usando URL, usuario y contraseña |
> | **getConexion()**          | Método que devuelve una conexión a la base de datos                      |
> | **cerrar(ResultSet)**      | Cierra un `ResultSet` para liberar recursos                             |
> | **cerrar(PreparedStatement)** | Cierra un `PreparedStatement` para liberar recursos                   |
> | **cerrar(Connection)**     | Cierra una `Connection` para liberar recursos                          |
> </div>
>  
 ![image](https://github.com/user-attachments/assets/badd875d-5dfa-43e4-b6cb-ec6c8ca42b93)


## 2. Clase mensaje
> [!NOTE]
> **Vamos a considerar a cada mensaje como un objeto para mayor facilidad de abstracción debido al lenguaje java**
> *Para ello vamos a crear una clase Mensaje la cual tendrá un atributo por cada "categoría" o variable* 
> ```java
> package com.oregoom.mensajes;
> public class Mensaje {
>    private int id;
>    private String mensaje;
>    private String autor;
>    private String fecha;
>    //Sobrecarga de constructor
>    public Mensaje() {
>    }
>    //Constructor para eliminar un mensaje mediante el id
>   public Mensaje(int id) {
>        this.id = id;
>    }
>    //Constructor para ingresar 
>    public Mensaje(String mensaje, String autor) {
>        this.mensaje = mensaje;
>        this.autor = autor;
>    }
>    //Constructor para actualizar un mensaje
>    public Mensaje(int id, String mensaje, String autor) {
>        this.id = id;
>        this.mensaje = mensaje;
>        this.autor = autor;
>    }
>    //Constructor para recupear un mensaje
>    public Mensaje(int id, String mensaje, String autor, String fecha) {
>        this.id = id;
>        this.mensaje = mensaje;
>        this.autor = autor;
>        this.fecha = fecha;
>    }
>    public int getId() {
>        return id;
>    }
>    public void setId(int id) {
>        this.id = id;
>    }
>    public String getMensaje() {
>        return mensaje;
>    }
>    public void setMensaje(String mensaje) {
>        this.mensaje = mensaje;
>    }
>    public String getAutor() {
>        return autor;
>    }
>    public void setAutor(String autor) {
>        this.autor = autor;
>    }
>    public String getFecha() {
>        return fecha;
>    }
>
>    public void setFecha(String fecha) {
>        this.fecha = fecha;
>    }
>
>    @Override
>    public String toString() {
>        StringBuilder sb = new StringBuilder();
>        sb.append("Mensaje{");
>        sb.append("id=").append(id);
>        sb.append(", mensaje=").append(mensaje);
>        sb.append(", autor=").append(autor);
>        sb.append(", fecha=").append(fecha);
>        sb.append('}');
>        return sb.toString();
>     }    
> }

> [!NOTE]  
> <div align="center"> 
> 
> | Componente        | Propósito                                                                 |
> |-------------------|---------------------------------------------------------------------------|
> | **id, mensaje, autor, fecha** | Atributos que representan las columnas de la tabla en la BD             |
> | **Constructores**  | Permiten crear objetos `Mensaje` según diferentes necesidades (insertar, eliminar, actualizar, recuperar) |
> | **Getters y Setters** | Métodos para acceder y modificar los atributos de forma controlada     |
> | **toString()**     | Devuelve una representación legible del objeto `Mensaje` (útil para depurar o mostrar datos) |
> 
> </div>

## 3. Listar Datos del tipo Objeto
> [!NOTE]
> **Vamos a crear una clase para manejar todas las consultas, "MensajeDao" de Data Access Object**  
> *Con esta clase primero vamos a recuperar los datos y se almacenarán en una lista*
> 
> ```java
> public class MensajeDao {
>     private Connection conn = null;
>     private PreparedStatement ps = null;
>     private ResultSet rs = null;
>     private Mensaje mensaje;
>     
>     public List<Mensaje> seleccionar() throws ClassNotFoundException {
>         String sql = "SELECT * FROM mensajes";
>         List<Mensaje> mensajes = new ArrayList<>();        
>         try {
>             //Para realizar la consulta a la BD primero debemos de conectarnos
>             this.conn = getConexion();
>             this.ps = this.conn.prepareStatement(sql);
>             this.rs = this.ps.executeQuery();
>             
>             //Recorrer todos los registros
>             while(this.rs.next()) {
>                 int id = this.rs.getInt("id_mensaje");
>                 String msm = this.rs.getString("mensaje");
>                 String atr = this.rs.getString("autor_mensaje");
>                 String fc = this.rs.getString("fecha_creacion");
>                 
>                 this.mensaje = new Mensaje(id, msm, atr, fc);
>                 mensajes.add(this.mensaje);
>             }
>         } catch (SQLException ex) {
>             ex.printStackTrace(System.out);
>         } finally {
>             try {
>                 cerrar(this.rs);
>                 cerrar(this.ps);
>                 cerrar(this.conn);
>             } catch (SQLException ex) {
>                 ex.printStackTrace(System.out);
>             }
>         }
>         return mensajes;
>     }
> }
> ```

> <div align="center">  
> 
> | Componente              | Propósito                                                                 |
> |--------------------------|---------------------------------------------------------------------------|
> | **Connection**           | Establece la conexión con la base de datos                               |
> | **PreparedStatement**    | Prepara la sentencia SQL de forma segura                                 |
> | **ResultSet**            | Almacena el resultado de la consulta para iterar sobre él                |
> | **List<Mensaje>**        | Colección donde se guardan todos los mensajes recuperados                |
> | **rs.getInt / getString**| Obtienen los valores de cada columna en la fila actual del `ResultSet`   |
> | **new Mensaje(...)**     | Crea un objeto `Mensaje` con los datos de cada fila                      |
> | **mensajes.add(...)**    | Agrega cada objeto `Mensaje` a la lista final                            |
> | **finally + cerrar(...)**| Cierra los recursos usados para evitar fugas de memoria                  |
> 
> </div>

> [!NOTE]
> **Este es el punto de entrada del programa (clase `Main`)**
> *Aquí se conecta con la base de datos y lista todos los mensajes usando `MensajeDao`*
>
> ```java
> package com.oregoom.mensajes;
>
> import java.sql.SQLException;
> import java.util.List;
>
> public class Main {
>     public static void main(String[] args) throws SQLException, ClassNotFoundException {
>         //Conexion.getConexion();
>         //System.out.println("Conexion exitosa");
>         MensajeDao mensajeDao = new MensajeDao();
>         List<Mensaje> listaM = mensajeDao.seleccionar();
>         
>         for(Mensaje mensaje : listaM){
>             System.out.println(mensaje);
>         }
>     }
> }
> ```

> <div align="center">
> 
> | Componente            | Propósito                                                  |
> |------------------------|------------------------------------------------------------|
> | **MensajeDao**         | Encargado de acceder a los datos desde la base             |
> | **seleccionar()**      | Recupera los mensajes desde la tabla `mensajes`            |
> | **List<Mensaje>**      | Estructura para almacenar todos los mensajes recuperados   |
> | **System.out.println()** | Muestra cada mensaje en consola usando `toString()`         |
> 
> </div>

 ![image](https://github.com/user-attachments/assets/1a198047-67dd-4e3f-8b50-d9304ae43f61)

## 4. Insertar Datos del tipo Objeto
> [!NOTE]
> **Vamos a trabajar la inserción en la clase MensajeDao**
>
> ```java
> package com.oregoom.mensajes;
> import java.sql.*;
> import java.util.*;
> import static com.oregoom.mensajes.Conexion.*;
>
> public class MensajeDao {
>     private Connection conn = null;
>     private PreparedStatement ps = null;
>     private ResultSet rs = null;
>     private Mensaje mensaje;
>     
>     public List<Mensaje> seleccionar() throws ClassNotFoundException {
>         String sql = "SELECT * FROM mensajes";
>         List<Mensaje> mensajes = new ArrayList<>();        
>         try {
>             this.conn = getConexion();
>             this.ps = this.conn.prepareStatement(sql);
>             this.rs = this.ps.executeQuery();
>             
>             while(this.rs.next()) {
>                 int id = this.rs.getInt("id_mensaje");
>                 String msm = this.rs.getString("mensaje");
>                 String atr = this.rs.getString("autor_mensaje");
>                 String fc = this.rs.getString("fecha_creacion");
>                 
>                 this.mensaje = new Mensaje(id, msm, atr, fc);
>                 mensajes.add(this.mensaje);
>             }
>         } catch (SQLException ex) {
>             ex.printStackTrace(System.out);
>         } finally {
>             try {
>                 cerrar(this.rs);
>                 cerrar(this.ps);
>                 cerrar(this.conn);
>             } catch (SQLException ex) {
>                 ex.printStackTrace(System.out);
>             }
>         }
>         return mensajes;
>     }
>     
>     public int insertar(Mensaje mensaje) throws ClassNotFoundException {
>         String sql = "INSERT INTO mensajes (mensaje, autor_mensaje, fecha_creacion) " +
>                      "VALUES (?, ?, CURRENT_TIME())";
>         int registros = 0;
>         try {
>             this.conn = getConexion();
>             this.ps = this.conn.prepareStatement(sql);       
>             this.ps.setString(1, mensaje.getMensaje());
>             this.ps.setString(2, mensaje.getAutor());
>             registros = this.ps.executeUpdate();
>             
>         } catch (SQLException ex) {
>             ex.printStackTrace(System.out);
>         } finally {
>             try {
>                 cerrar(this.ps);
>                 cerrar(this.conn);
>             } catch (SQLException ex) {
>                 ex.printStackTrace(System.out);
>             }
>         }
>         return registros;
>     }
> }
> ```

> <div align="center">
>
> | Componente              | Propósito                                                  |
> |--------------------------|--------------------------------------------------------------|
> | **insertar()**           | Método que agrega un nuevo mensaje a la base de datos        |
> | **setString(1, ...)**    | Asigna el primer valor (`mensaje`) en la consulta SQL        |
> | **setString(2, ...)**    | Asigna el segundo valor (`autor`) en la consulta SQL         |
> | **CURRENT_TIME()**       | Función de MySQL que guarda la hora del sistema automáticamente |
> | **executeUpdate()**      | Ejecuta el INSERT y retorna cuántas filas fueron afectadas   |
>
> </div>
![image](https://github.com/user-attachments/assets/2dbfbc64-d756-4f95-a139-eee0f436672b)

> [!NOTE]
> **Este es el punto de entrada del programa (clase `Main`)**
> *Aquí se crea un mensaje desde el método `main`, se inserta en la base de datos con `MensajeDao`, y luego se listan todos los mensajes*
>
> ```java
> package com.oregoom.mensajes;
>
> import java.sql.SQLException;
> import java.util.List;
>
> public class Main {
>
>     public static void main(String[] args) throws SQLException, ClassNotFoundException {
>         //Conexion.getConexion();
>         //System.out.println("Conexion exitosa");
>         MensajeDao mensajeDao = new MensajeDao();
>         
>         Mensaje msm = new Mensaje("Hola desde Main", "MAIN");
>         int registro = mensajeDao.insertar(msm);
>         System.out.println("Se insertó: " + registro + " registro");
>         
>         List<Mensaje> listaM = mensajeDao.seleccionar();
>         for(Mensaje mensaje : listaM){
>             System.out.println(mensaje);
>         }
>     }
> }
> ```

> <div align="center">
>
> | Componente                  | Propósito                                                             |
> |-----------------------------|-----------------------------------------------------------------------|
> | **Mensaje(...)**            | Crea un objeto `Mensaje` con datos para insertar                     |
> | **insertar(msm)**           | Inserta el nuevo mensaje en la base de datos usando `MensajeDao`     |
> | **System.out.println(...)** | Muestra en consola cuántos registros se insertaron                   |
>
> </div>

## 5. Editar Datos del tipo Objeto
> [!NOTE]
> **Vamos a trabajar la actualización de nuestros registros en la clase `MensajeDao`**  
> *Este método recibe un objeto `Mensaje` con su `id` y nuevos valores de mensaje y autor, y actualiza la fila correspondiente en la base de datos.*
>
> ```java
> public int editar(Mensaje mensaje) throws ClassNotFoundException {
>     String sql = "UPDATE mensajes SET mensaje = ?, autor_mensaje = ? WHERE id_mensaje = ?";
>     int registros = 0;
>     try {
>         //Para realizar la consulta a la BD primero debemos de conectarnos
>         this.conn = getConexion();
>         this.ps = this.conn.prepareStatement(sql);       
>         this.ps.setString(1, mensaje.getMensaje());
>         this.ps.setString(2, mensaje.getAutor());
>         this.ps.setInt(3, mensaje.getId());
>         registros = this.ps.executeUpdate();
>     } catch (SQLException ex) {
>         ex.printStackTrace(System.out);
>     } finally {
>         try {
>             cerrar(this.ps);
>             cerrar(this.conn);
>         } catch (SQLException ex) {
>             ex.printStackTrace(System.out);
>         }
>     }
>     return registros;
> }
> ```

> <div align="center">
>
> | Componente                  | Propósito                                                                 |
> |-----------------------------|---------------------------------------------------------------------------|
> | **setInt()**                | Establece un valor entero como parámetro (en este caso, el `id`)         |
> | **UPDATE ... WHERE ...**    | Sentencia SQL que modifica solo la fila con el `id_mensaje` indicado     |
> | **editar(mensaje)**         | Ejecuta la modificación de un mensaje existente en la base de datos      |
>
> </div>

> [!NOTE]
> ```java
> package com.oregoom.mensajes;
>
> import java.sql.SQLException;
> import java.util.List;
>
> public class Main {
>
>     public static void main(String[] args) throws SQLException, ClassNotFoundException {
>         MensajeDao mensajeDao = new MensajeDao();     
>         Mensaje ms = new Mensaje(1, "Hola desde java Web", "JAVA WEB");
>         int registro = mensajeDao.editar(ms);
>         System.out.println("Se edito: "+ registro + " registro");
>         List<Mensaje> listaM = mensajeDao.seleccionar();
>         for(Mensaje mensaje: listaM){
>             System.out.println(mensaje);
>         }
>     }
> }
> ```

![image](https://github.com/user-attachments/assets/1b7823a4-f768-4932-9e0a-b1307b8b4d84)

## 6. Eliminar Datos del tipo Objeto
> [!NOTE]
> **Vamos a realizar la última operación del CRUD (DELETE)+**  
> ```java
> public int eliminar(Mensaje mensaje) throws ClassNotFoundException {
>     String sql = "DELETE FROM mensajes WHERE id_mensaje = ?";
>     int registros = 0;
>     try {
>         this.conn = getConexion();
>         this.ps = this.conn.prepareStatement(sql);       
>         this.ps.setInt(1, mensaje.getId());
>         registros = this.ps.executeUpdate();
>     } catch (SQLException ex) {
>         ex.printStackTrace(System.out);
>     } finally {
>         try {
>             cerrar(this.ps);
>             cerrar(this.conn);
>         } catch (SQLException ex) {
>             ex.printStackTrace(System.out);
>         }
>     }
>     return registros;
> }
> ```

> [!NOTE]
> ```java
> package com.oregoom.mensajes;
>
> import java.sql.SQLException;
> import java.util.List;
>
> public class Main {
>
>     public static void main(String[] args) throws SQLException, ClassNotFoundException {
>         MensajeDao mensajeDao = new MensajeDao();
>         Mensaje ms = new Mensaje(1);
>         int registro = mensajeDao.eliminar(ms);
>         System.out.println("Se eliminó: " + registro + " registro");
>
>         List<Mensaje> listaM = mensajeDao.seleccionar();
>         for (Mensaje mensaje : listaM) {
>             System.out.println(mensaje);
>         }
>     }
> }
> ```
![image](https://github.com/user-attachments/assets/cf4784ca-3bb3-42ba-90cb-4a573bc0d486)


## 7. Mostrar Mensaje
> [!NOTE]
> **Vamos a pasar a trabajar con el index.jsp, es necesario volver a ejecutar el servidor** <br>
> *Asi, vamos a cargar todos los mensajes de la BD en el modal "Todos los mensajes"* <br>
![image](https://github.com/user-attachments/assets/5914af2a-5675-4da8-b6b9-90492fe85e4a)

> [!IMPORTANT]
> Así se importan los paquetes o API´s en el archivo pom.xml <br>
> ![Estructura final](https://github.com/user-attachments/assets/3f368207-8f98-4305-81c0-ecb88a5e752d)

> [!NOTE]
> **Código para mostrar y crear mensajes en JSP:**
>
> ```jsp
> <%@page import="com.oregoom.mensajes.Mensaje"%>
> <%@page import="java.util.*"%>
> <%@page import="com.oregoom.mensajes.MensajeDao"%>
> <%@page contentType="text/html" pageEncoding="UTF-8"%>
> <!DOCTYPE html>
> <html>
>     <head>
>         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
>         <title>JSP Page</title>
>         <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.5/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-SgOJa3DmI69IUzQ2PVdRZhwQ+dy64/BUtbMJw1MZ8t5HZApcHrRKUc4W0kG879m7" crossorigin="anonymous">
>     </head>
>     <body>
>         <!-- Modal para crear mensajes -->
>         <div class="modal" style="display: block; position: initial;">
>             <div class="modal-dialog">
>                 <div class="modal-content">
>                     <form action="index.jsp" method="POST">
>                         <div class="modal-header">
>                             <h1 class="modal-title fs-5">Crear mensaje</h1>            
>                         </div>
>                         <div class="modal-body">
>                             <div class="mb-3">
>                                 <label for="mensajeTextarea" class="form-label">Ingrese el Mensaje</label>
>                                 <textarea class="form-control" id="mensajeTextarea" name="mensaje" rows="3" required></textarea>
>                             </div>
>                             <div class="mb-3">
>                                 <label for="autorInput" class="form-label">Autor</label>
>                                 <input type="text" class="form-control" id="autorInput" name="autor" required>
>                             </div>
>                         </div>
>                         <div class="modal-footer">
>                             <button type="submit" class="btn btn-primary">Enviar</button>
>                         </div>
>                     </form>
>                 </div>
>             </div>
>         </div>
>         <!-- Modal para mostrar mensajes -->
>         <div class="modal" style="display: block; position: initial; margin-top: 20px;">
>             <div class="modal-dialog">
>                 <div class="modal-content">
>                     <div class="modal-header">
>                         <h1 class="modal-title fs-5">Todos los mensajes</h1>            
>                     </div>
>                     <!-- Este codigo debemos de iterar para cada mensaje -->
>                     <%
>                         MensajeDao mensajeDao = new MensajeDao();
>                         List<Mensaje> mensajes = mensajeDao.seleccionar();
>                         //Invertir la lista para mostrar el ultimo mensaje
>                         Collections.reverse(mensajes);
>                         for(Mensaje mensaje : mensajes){
>                     %>
>                     <div class="modal-body">
>                         <div class="card">
>                             <div class="card-body">
>                                 <h5 class="card-title"><%=mensaje.getAutor()%></h5>
>                                 <p class="card-text"><%=mensaje.getMensaje()%></p>
>                                 <p class="blockquote-footer"><cite><%=mensaje.getFecha()%></cite></p>
>                                 <div class="d-flex gap-2">
>                                     <a href="#" class="btn btn-outline-primary btn-sm">Editar</a>
>                                     <a href="#" class="btn btn-outline-danger btn-sm">Eliminar</a>
>                                 </div>
>                             </div>
>                         </div>
>                     </div>
>                    <%}%>             
>                 </div>
>             </div>
>                                 
>         </div>
>     </body>
> </html>
> ```

![image](https://github.com/user-attachments/assets/7117cfb8-8987-47ae-8032-01bd4ce77707)


## 8. Crear Mensaje
> [!NOTE]
> **Vamos a trabajar la inserción de nuestros registros, que se guarden en la BD y en el modal de "Todos los mensajes" **  
```jsp
<%@page import="com.oregoom.mensajes.Mensaje"%>
<%@page import="java.util.*"%>
<%@page import="com.oregoom.mensajes.MensajeDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.5/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-SgOJa3DmI69IUzQ2PVdRZhwQ+dy64/BUtbMJw1MZ8t5HZApcHrRKUc4W0kG879m7" crossorigin="anonymous">
    </head>
    <body>
        <!-- Modal para crear mensajes -->
        <div class="modal" style="display: block; position: initial;">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form action="index.jsp" method="POST">
                        <div class="modal-header">
                            <h1 class="modal-title fs-5">Crear mensaje</h1>            
                        </div>
                        <div class="modal-body">
                            <div class="mb-3">
                                <label for="mensajeTextarea" class="form-label">Ingrese el Mensaje</label>
                                <textarea class="form-control" name="mensaje" rows="3" required></textarea>
                            </div>
                            <div class="mb-3">
                                <label for="autorInput" class="form-label">Autor</label>
                                <input type="text" class="form-control" id="autorInput" name="autor" required>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <button type="submit" class="btn btn-primary" name="enviar">Enviar</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <%
            MensajeDao mensajeDao = new MensajeDao();
            //Para recuperar los datos de los campos utilizamos
            //el request.getParameter

            //Verificamos que no se ingresen valores nulos
            if (request.getParameter("enviar") != null) {
                Mensaje mensaje = new Mensaje(
                        request.getParameter("mensaje"),
                        request.getParameter("autor")
                );
                //Insertamos el objeto
                mensajeDao.insertar(mensaje);
            }
        %>
        <!-- Modal para mostrar mensajes -->
        <div class="modal" style="display: block; position: initial; margin-top: 20px;">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h1 class="modal-title fs-5">Todos los mensajes</h1>            
                    </div>
                    <!-- Este código debe iterar para cada mensaje -->
                    <% 
                        List<Mensaje> mensajes = mensajeDao.seleccionar();
                        //Invertir la lista para mostrar el último mensaje
                        Collections.reverse(mensajes);
                        for (Mensaje mensaje : mensajes) {
                    %>
                    <div class="modal-body">
                        <div class="card">
                            <div class="card-body">
                                <h5 class="card-title"><%=mensaje.getAutor()%></h5>
                                <p class="card-text"><%=mensaje.getMensaje()%></p>
                                <p class="blockquote-footer"><cite><%=mensaje.getFecha()%></cite></p>
                                <div class="d-flex gap-2">
                                    <a href="#" class="btn btn-outline-primary btn-sm">Editar</a>
                                    <a href="#" class="btn btn-outline-danger btn-sm">Eliminar</a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <%}%>             
                </div>
            </div>
        </div>
    </body>
</html>
```

![image](https://github.com/user-attachments/assets/cd7741e6-f95a-4816-b04a-bcd8d8ea7b4e)



## 9. Editar Mensaje
> [!NOTE]
> **Vamos a trabajar en la edición de nuestros registros para esto, vamos a crear otro archivo .jsp"**  
> 
> *Este método recibe un objeto `Mensaje` con su `id` y nuevos valores de mensaje y autor, y actualiza la fila correspondiente en la base de datos.*
> - Tenemos que enviar los datos desde el index.jsp al momento de darle click en el botón de editar
> - Debemos agregar los estilos de BootStrap copiando el 2do código en el head de editar.jsp

``` html
<a href="editar.jsp" class="btn btn-outline-primary btn-sm">Editar</a>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.5/dist/css/bootstrap.min.css" rel="stylesheet"
integrity="sha384-SgOJa3DmI69IUzQ2PVdRZhwQ+dy64/BUtbMJw1MZ8t5HZApcHrRKUc4W0kG879m7" crossorigin="anonymous">

```
## Funcionalidad de Edición de Mensajes

### Interacción con el Botón "Editar"
Al hacer clic en el botón **Editar** en la vista de mensajes, el usuario es redirigido a un formulario donde puede modificar el mensaje y su autor. El proceso se realiza sin recargar la página completamente, gracias a la integración de JSP y Java. Aquí se describe cómo se comporta la aplicación:

1. **Vista Inicial de los Mensajes**: 
   Los mensajes se muestran con la opción de editar y eliminar. La vista tiene un diseño atractivo gracias a la integración de **Bootstrap**.

   ![Vista Inicial](https://github.com/user-attachments/assets/3261c852-e5fb-4ab6-a01d-bf4c4690068b)

2. **Cambio de Estilo al Editar**: 
   Al hacer clic en **Editar**, el diseño se ajusta y el formulario se despliega con el mensaje que el usuario desea modificar. Además, se mantiene el estilo visual de la interfaz, proporcionando una experiencia de usuario más intuitiva y fluida.

   ![Estilo Aplicado](https://github.com/user-attachments/assets/bf557fed-61c6-4237-a957-0c1c4d8ca7b9)

```html
<div class="d-flex gap-2">
    <a href="editar.jsp?id=<%=mensaje.getId()%>&mensaje=<%=mensaje.getMensaje()%>&autor=<%=mensaje.getAutor()%>" 
       class="btn btn-outline-primary btn-sm">
       Editar
    </a>
    <a href="eliminar.jsp?id=<%=mensaje.getId()%>" class="btn btn-outline-danger btn-sm">
       Eliminar
    </a>
</div>
```

> [!NOTE]
> **Vamos a recuperar los datos de un mensaje al selecconar la opción de editar un mensaje luego, nos dirigimos al editar.jsp**
> *En la barra de búsqueda vamos a encontrar los valores del objeto Mensaje que seleccionamos*

![image](https://github.com/user-attachments/assets/2253486a-a59b-434a-a28d-7978878cc7ae)

``` jsp
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Editar mensaje</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.5/dist/css/bootstrap.min.css" rel="stylesheet" 
          integrity="sha384-SgOJa3DmI69IUzQ2PVdRZhwQ+dy64/BUtbMJw1MZ8t5HZApcHrRKUc4W0kG879m7" crossorigin="anonymous">
</head>
<body>
    <!-- Modal para crear mensajes -->
    <div class="modal" style="display: block; position: initial;">
        <div class="modal-dialog">
            <div class="modal-content">
                <form action="index.jsp" method="POST">
                    <div class="modal-header">
                        <h1 class="modal-title fs-5">Editar mensaje</h1>            
                    </div>
                    <div class="modal-body">
                        <div class="mb-3">
                            <input type="hidden" name="id" value="<%=request.getParameter("id")%>">
                            <label for="mensajeTextarea" class="form-label">Ingrese el Mensaje</label>
                            <textarea class="form-control" name="mensaje" rows="3" required>
                                <%=request.getParameter("mensaje")%>
                            </textarea>
                        </div>
                        <div class="mb-3">
                            <label for="autorInput" class="form-label">Autor</label>
                            <input type="text" class="form-control" name="autor" required value="<%=request.getParameter("autor")%>">
                        </div>
                    </div>
                    <div class="modal-footer">
                        <a href="index.jsp" class="btn btn-primary">Regresar</a>
                        <button type="submit" class="btn btn-primary" name="enviar">Guardar Cambios</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</body>
</html>
```

![image](https://github.com/user-attachments/assets/90f3cce3-8ab6-4c94-96dd-3eaa5fb297e3)


## 10. Eliminar Mensaje
> [!NOTE]
> **Finalmente, vamos a eliminar un registro desde la vista** <br>
> *Asi mismo, vamos a crear un nuevo archivo "eliminar.jsp", aquí vamos a realizar la función y luego, regresaremos al index.jsp*

``` jsp
<%@page import="com.oregoom.mensajes.MensajeDao"%>
<%@page import="com.oregoom.mensajes.Mensaje"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String id = request.getParameter("id");
            Mensaje mensaje = new Mensaje(Integer.valueOf(id));
            MensajeDao mensajeDao = new MensajeDao();
            mensajeDao.eliminar(mensaje);
            request.getRequestDispatcher("index.jsp").forward(request, response);

        %>
    </body>
</html>

```

![image](https://github.com/user-attachments/assets/729c85d8-a734-4e60-b0bd-9d6c50d787c0)
