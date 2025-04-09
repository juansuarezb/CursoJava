/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio.Modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author juand_jus2zd
 */
public class ImplementacionCatalogoPelicula implements ICatalogoPeliculas{

    private final ArrayList<String> listaP;

    public ImplementacionCatalogoPelicula() {
        this.listaP = new ArrayList<>();
    }

    
    
    @Override
    public void insertarPelicula(Pelicula nombre) {
        this.listaP.add(nombre.toString()); 
    }

    @Override
    public void listarPelicula() {
//        for(String nombre: listaP){
//            JOptionPane.showMessageDialog(null, nombre, "Nombre Peliculas", 1);
//        }

        JOptionPane.showMessageDialog(null, this.listaP, "Lista Peliculas", 1);
    }

    @Override
    public void buscarPelicula(String nombreP) {
        String resultado = null;
        for(var pelicula: this.listaP){
            if(pelicula.equals(nombreP)){
                resultado = pelicula;
                break;
            }
            else{
                resultado = pelicula;
            }
        }
        if(nombreP.equals(resultado)){
            JOptionPane.showMessageDialog(null, resultado, "Buscar pelicula", 3);
        }
        else{
            JOptionPane.showMessageDialog(null, "No se encontro la pelicula" , "Buscar pelicula", 0);
        }
    }
    
}
