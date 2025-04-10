# Sección 6: PRÁCTICAS : CREAR APLICACIONES

> [!NOTE]
> **Temas cubiertos:**
> - Presentación del módulo
> - Primalidad
> - Palíndromos
> - Generador de contraseñas
> - Conversor de moneda: Parte 01
> - Conversor de moneda: Parte 02
> - Juego: Adivina un número parte 01
> - Juego: Adivina un número parte 02
> - JavaDoc
> - Ejecutable JAR


> [!NOTE]  
> # 1. Presentación del módulo
> <div align="center">
>   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion6/Imagenes/Imagen1.avif" alt="Página de descarga Tomcat 9" width="85%">
>   <p><em>En este módulo vamos a crear aplicaciones aplicando todo lo que hemos aprendido hasta ahora</em></p>
> </div>
> <div align="center">
>   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion6/Imagenes/Imagen2.avif" alt="Página de descarga Tomcat 9" width="85%">
>   <p><em>En este módulo vamos a crear aplicaciones aplicando todo lo que hemos aprendido hasta ahora</em></p>
> </div>

> [!NOTE]  
> # 2. Primalidad
> <p><em>Vamos a crear la primera aplicación que detecte si un número es primo o no</em></p>

## ¿Qué es un número primo?
<p>Un <b>número primo</b> es un número natural mayor que 1 que cumple las siguientes condiciones:</p>

- Solo es divisible exactamente entre 1 y sí mismo
- Tiene exactamente dos divisores distintos
- No puede formarse como producto de otros números naturales más pequeños

**Ejemplos:**
- 2 (primer número primo)
- 3, 5, 7, 11, 13, 17...
- El 4 NO es primo (divisible por 2)
- El 9 NO es primo (divisible por 3)

## Aplicación para detectar primos
*Creamos un nuevo proyeto "Primalidad" para la aplicación*
<div align="center">
  <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion6/Imagenes/Imagen3.avif" alt="Página de descarga Tomcat 9" width="85%">
</div>

```java
import java.util.Scanner;
public class Main { 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = scan.nextInt();
        
        if(!esPrimo(numero)){
            System.out.printf("El numero %d NO es primo \n", numero);
        }else{
            System.out.printf("El numero %d es primo \n", numero);
        }
    }
    
    //declaramos un metodo que va a devolver un boolean (true si es primo) que tiene 
    //como parametro un numero n "el que ingresa el usuario"
    static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
```
<div align="center">
  <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion6/Imagenes/Imagen4.avif" alt="Página de descarga Tomcat 9" width="85%">
</div>


> [!NOTE]  
> # 3. Palíndromos 
> <p><em>Vamos a crear la primera aplicación que detecte si un número es primo o no</em></p>


> [!NOTE]  
> # 4. Generador de contraseñas
> 

> [!NOTE]  
> # 5. Conversor de moneda: Parte 01
> 

> [!NOTE]  
> # 6. Conversor de moneda: Parte 02
> 

> [!NOTE]  
> # 7. Juego: Adivina un número parte 01
> 

> [!NOTE]  
> # 8. Juego: Adivina un número parte 02
> 

> [!NOTE]  
> # 9. JavaDoc
> 

> [!NOTE]  
> # 10. Ejecutable JAR
> 


[![Main](https://img.shields.io/badge/🏠_Volver_al_Main-8A2BE2?style=for-the-badge&logo=github&logoColor=white)](https://github.com/juansuarezb/CursoJava/blob/main/README.md)
[![Anterior](https://img.shields.io/badge/←_Volver_a_Sección_5-8A2BE2?style=for-the-badge&logo=github&logoColor=white)](https://github.com/juansuarezb/CursoJava/blob/Seccion5/README.md)
[![Siguiente](https://img.shields.io/badge/Seccion7→-2E8B57?style=for-the-badge&logo=github&logoColor=white)](https://github.com/juansuarezb/CursoJava/blob/Seccion7/README.md)