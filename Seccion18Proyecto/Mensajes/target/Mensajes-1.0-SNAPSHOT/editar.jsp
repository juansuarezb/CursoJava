<%-- 
    Document   : editar
    Created on : 5 abr. 2025, 23:32:20
    Author     : juand_jus2zd
--%>

<%@page import="com.oregoom.mensajes.Mensaje"%>
<%@page import="com.oregoom.mensajes.MensajeDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar mensaje</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.5/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-SgOJa3DmI69IUzQ2PVdRZhwQ+dy64/BUtbMJw1MZ8t5HZApcHrRKUc4W0kG879m7" crossorigin="anonymous">
    </head>
    <body>
        <!-- Modal para crear mensajes -->
        <div class="modal" style="display: block; position: initial;">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form action="editar.jsp" method="POST">
                        <div class="modal-header">
                            <h1 class="modal-title fs-5">Editar mensaje</h1>            
                        </div>
                        <div class="modal-body">
                            <div class="mb-3">
                                <input type="hidden" name="id" value="<%=request.getParameter("id")%>">
                                <label for="mensajeTextarea" class="form-label">Ingrese el Mensaje</label>
                                <textarea class="form-control" name="mensaje" rows="3" required><%=request.getParameter("mensaje")%>
                                </textarea>
                            </div>
                            <div class="mb-3">
                                <label for="autorInput" class="form-label">Autor</label>
                                <input type="text" class="form-control" name="autor" required value="<%=request.getParameter("autor")%>">
                            </div>
                        </div>
                        <div class="modal-footer">
                            <a href="index.jsp" type="submit" class="btn btn-danger">Regresar</a>
                            <button type="submit" class="btn btn-primary" name="enviar">Guardar Cambios</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <%
            MensajeDao mensajeDao = new MensajeDao();
            //Para recuperar los datos de los campos utilizamos
            //el request.getParameter
            String id = request.getParameter("id");
            //Verificamos que no se ingresen valores nulos
            if (request.getParameter("enviar") != null) {
                Mensaje mensaje = new Mensaje(
                        Integer.parseInt(id.trim()),
                        request.getParameter("mensaje"),
                        request.getParameter("autor")
                );
                //Insertamos el objeto
                mensajeDao.editar(mensaje);
            }


        %>

    </body>
</html>
