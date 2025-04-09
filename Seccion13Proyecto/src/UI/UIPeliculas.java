/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;
import javax.swing.JOptionPane;
import Negocio.Modelo.*;

public class UIPeliculas {
    public static void interfazUsuario(){
        ICatalogoPeliculas peliculas = new ImplementacionCatalogoPelicula();
        Pelicula pelicula;
        
        CERRAR:
        while(true){
            String opcion = JOptionPane.showInputDialog(null, 
                    "1- Insertar Pelicula\n"
                    + "2- Listar Pelicula\n"
                    + "3- Buscar Pelicula\n"
                    + "4- Salir", "Ingrese una opcion", 3);
            
            switch(opcion){
                case "1":
                    String nombrePelicula = JOptionPane.showInputDialog(null,
                            "Ingrese el nombre de la pelicula",
                            "Entrada",
                            3);
                    pelicula = new Pelicula(nombrePelicula);
                    peliculas.insertarPelicula(pelicula);
                    break;
                case "2":
                    peliculas.listarPelicula();
                    break;
                case "3":
                    nombrePelicula = JOptionPane.showInputDialog(null,
                            "Ingrese el nombre de la pelicula",
                            "Entrada",
                            3);
                    peliculas.buscarPelicula(nombrePelicula);
                    break;
                case "4":
                    break CERRAR;
                default:
                    JOptionPane.showMessageDialog(null,"OPCION INCORRECTA \n ", "ERROR", 2);
            }
        }
    }
}
