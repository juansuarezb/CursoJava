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
