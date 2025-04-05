package com.oregoom.mensajes.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/hola") // Accesible en /api/hola
public class JakartaEE8Resource {
    @GET
    public Response saludar() {
        return Response.ok("¡Hola Mundo desde JAX-RS!").build();
    }
}