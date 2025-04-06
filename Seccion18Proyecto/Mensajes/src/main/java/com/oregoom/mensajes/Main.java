/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.oregoom.mensajes;

import java.sql.SQLException;
import java.util.List;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //Conexion.getConexion();
        //System.out.println("Conexion exitosa");
        MensajeDao mensajeDao = new MensajeDao();     
        //Mensaje msm = new Mensaje("Hola desde Main", "MAIN");
        //int registro = mensajeDao.insertar(msm);
        //System.out.println("Se insertó: "+ registro + " registro");
        Mensaje ms = new Mensaje(4);
        int registro = mensajeDao.eliminar(ms);
        System.out.println("Se elimino: "+ registro + " registro");
        List<Mensaje> listaM = mensajeDao.seleccionar();
        for(Mensaje mensaje: listaM){
            System.out.println(mensaje);
        }
    }
    
}
