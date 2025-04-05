<!--Codigo XMl-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!--Codigo html-->
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hola desde JSP</h1>
        <!--Dentro de esta etiqueta podemos ejecutar codigo java-->
        <%
            String nombre = "Juan Suarez";
            int edad = 22;
            out.println("Nombre: " + nombre + "\n");
            out.println("Edad: " + edad);
        
        %>
    </body>
</html>
