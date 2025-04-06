<%-- 
    Document   : eliminar
    Created on : 6 abr. 2025, 13:34:04
    Author     : juand_jus2zd
--%>

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
