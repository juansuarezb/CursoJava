package persistenciadatos;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        List lista1 = new ArrayList(); 
//        lista1.add(1); // Los considera como objetos
//        lista1.add("Juan Suarez");
//        lista1.add(25);
//        lista1.add(1.67);
//        lista1.add(true);
//
//     
//        lista1.forEach(dato -> {
//            System.out.println(dato);
//        });
//        
//       System.out.println(lista1.get(0));
//       lista1.remove(1);
//       System.out.println(lista1);
//       
//       
//       lista1.set(0, "Pedro");
//       System.out.println(lista1);

//    HashSet dias = new HashSet();
//       dias.add("lunes");
//       dias.add("martes");
//       dias.add("miercoles");
//       dias.add("jueves");
//       dias.add("viernes");
//       
//        for(Object dia: dias){
//           System.out.println(dia + "\n");
//        }
//        dias.remove("lunes");
//        System.out.println(dias);
//        
//        dias.clear();
//        System.out.println(dias);
        Map numeros = new HashMap();
        numeros.put(1, "uno");
        numeros.put(2, "dos");
        numeros.put(3, "tres");
        numeros.put(4, "cinco");
        
        System.out.println(numeros); 
        System.out.println(numeros.get(1));
        
        for(Object valores: numeros.keySet()){ //keySet obtengo las claves o values para los valores
            System.out.println(valores);
        }
        
        for(Object clave: numeros.keySet()){
            System.out.println(clave+" "+ numeros.get(clave)); //RECUPERO CLAVE Y VALOR
        }

    }
}
