  /** Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Negocio.Modelo;

/**
 *
 * @author juand_jus2zd
 */
public interface ICatalogoPeliculas {
    void insertarPelicula(Pelicula nombre);
    void listarPelicula();
    void buscarPelicula(String nombreP);
    
}
