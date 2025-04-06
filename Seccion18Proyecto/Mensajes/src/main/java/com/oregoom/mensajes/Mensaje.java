/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oregoom.mensajes;

/**
 *
 * @author juand_jus2zd
 */
public class Mensaje {
    private int id;
    private String mensaje;
    private String autor;
    private String fecha;

    //Sobrecarga de constructor
    public Mensaje() {
    }

    //Constructor para eliminar un mensaje mediante el id
    public Mensaje(int id) {
        this.id = id;
    }

    //Constructor para ingresar 
    public Mensaje(String mensaje, String autor) {
        this.mensaje = mensaje;
        this.autor = autor;
    }

    //Constructor para actualizar un mensaje
    public Mensaje(int id, String mensaje, String autor) {
        this.id = id;
        this.mensaje = mensaje;
        this.autor = autor;
    }
    
    //Constructor para recupear un mensaje
    public Mensaje(int id, String mensaje, String autor, String fecha) {
        this.id = id;
        this.mensaje = mensaje;
        this.autor = autor;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Mensaje{");
        sb.append("id=").append(id);
        sb.append(", mensaje=").append(mensaje);
        sb.append(", autor=").append(autor);
        sb.append(", fecha=").append(fecha);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
