<%@page import="com.oregoom.mensajes.Mensaje"%>
<%@page import="java.util.*"%>
<%@page import="com.oregoom.mensajes.MensajeDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mensajes</title>
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
                    <!-- Este codigo debemos de iterar para cada mensaje -->
                    <%                        //MensajeDao mensajeDao = new MensajeDao();
                        List<Mensaje> mensajes = mensajeDao.seleccionar();
                        //Invertir la lista para mostrar el ultimo mensaje
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
                                    <a href="editar.jsp?id=<%=mensaje.getId()%>
                                       &&mensaje=<%=mensaje.getMensaje()%>
                                       &&autor=<%=mensaje.getAutor()%>"
                                       class="btn btn-outline-primary btn-sm">Editar</a>
                                    <a href="eliminar.jsp" id="<%=mensaje.getId()%>" class="btn btn-outline-danger btn-sm">Eliminar</a>
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
