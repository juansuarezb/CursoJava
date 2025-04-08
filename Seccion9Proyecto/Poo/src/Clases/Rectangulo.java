/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author juand_jus2zd
 */
public class Rectangulo {
    public int base, altura;
    
    public Rectangulo(){
        System.out.println(base);
        System.out.println(altura);
    }
    
    public int areaRectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
        return this.base*this.altura;
    }
    
    public int perimetro (int base, int altura){
        this.base = base;
       this. altura = altura;
        return 2*(this.base+this.altura);
    }
}
