/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juand_jus2zd
 */
public class Funciones {
    public static void main(String[] args) {
        saludar("Juan", 22);
        sumar(2,5);
    }
    
    static int sumar(int n1,int n2){
        return n1 + n2;
    }
    static void saludar(String nombre, int edad){
        System.out.printf("Hola %s tu edad es %d \n", nombre, edad);
    }
}
