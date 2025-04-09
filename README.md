# Sección 14: PD - Persistencia de Datos

<p align="center">
  <img src="https://github.com/user-attachments/assets/27b787ef-75bf-4bfa-ba2f-f67ccb4e4386" alt="Curso Java Persistencia" width="600"/>
</p>


> [!NOTE]
> <h2>📌 1. Presentación</h2>
> <p>Vamos a empezar a almacenar los datos de nuestro programa para que no se pierdan al momento de cerrar la aplicación.</p>
> <em>Primero, vamos a empezar a guardar nuestros datos en archivos y en secciones posteriores en una Base de datos.</em>
> <h2> Temas: (Imágen generada por IA) </h2>
> <p align="center">
>  <img src="https://github.com/user-attachments/assets/9fac5956-b940-4614-9152-f9e13b34e1d4" width="600"/>
> </p>


> [!NOTE]
> <h2>📌 2. Persistencia de datos</h2>
> <p>Vamos a almacenar los datos en el disco duro de la pc, diferente de lo que habiamos hecho últimamente (guardar en la memoria RAM) </p>
> <p>Primero, vamos a ver manejo de archivos luego, vamos a almacenar en una base de datos con ayuda del motor de bases de datos MySQL</p>
> <p align="center">
>  <img src="https://github.com/user-attachments/assets/2254dc9d-2024-4510-8112-e9d02d66522c" width="600"/>
> </p>
> <h2>API de colecciones en Java </h2>
> <p>En el paquete de java.util vamos a encontrar a las listas y los maps. </p>
> <p align="center">
>   <img src="https://github.com/user-attachments/assets/4884acec-4e60-4db6-a8f2-95e60a613160" width="600"/>
> </p>
> <p>Se puede observar que Set y List heredan de Collection. Estas 2 son interfaces que coleccionan datos y funcionan como un array.</p>



> [!NOTE]
> ## 📌 3. Lista
> Primero, vamos a crear un nuevo proyecto en NetBeans llamado **"PersistenciaDatos"** y agregamos una clase `main`.
> 
> <p align="center">
>   <img src="https://github.com/user-attachments/assets/0b7c35b4-573e-4dad-a2ce-68809376030a" width="600"/>
> </p>
> 
> ## Importamos el API de colecciones en nuestra clase main:
>
> ```java
> import java.util.*;
> ```
> *Creamos una lista del tipo ArrayList dentro del método main. (Estas colecciones son interfaces y no clases normales)* 
> ```java
> List lista1 = new ArrayList(); //Definimos un arrayList
> ```
> <p align="center">
>   <img src="https://github.com/user-attachments/assets/46f54a06-7d28-48dc-ba1d-a08134b650ee" width="600"/>
> </p>
> <p align="center">
>   <img src="https://github.com/user-attachments/assets/ebbbcd35-f43b-4d05-b2b5-79ee89bc9616" width="600"/>
> </p>

**También, podemos imprimir la lista con un `for-each` de la siguiente manera:**  
```java
for (Object dato : lista1) {
    System.out.println(dato);
}
```
**Expresada como función Lambda:**
```java
lista1.forEach(dato -> {
            System.out.println(dato);
        });
```

> [!NOTE]
> **Podemos recuperar los elementos de la lista de manera individual a través de sus índices**
> ```java	
> System.out.println(lista1.get(0)); //Primer elemento -> 1
> System.out.println(lista1.get(1)); //2do elemento -> Juan Suarez
> ```

> [!NOTE]
> **Podemos Eliminar los elementos de la lista de manera individual a través de sus índices (remove)**
> ```java	
> lista1.remove(1)); //Elimina 2do elemento -> Juan Suarez
>   System.out.println(lista1);
> ```
> <p align="center">
>   <img src="https://github.com/user-attachments/assets/e80614fe-d8d5-4f29-95f3-e78f5a858abd" width="600"/>
> </p>

> [!NOTE]
> **Podemos Editar los elementos de la lista de manera individual a través de sus índices (set)**
> ```java	
>   lista1.set(0, "Pedro");  //Pasamos como argumentos el índice y el dato.
> ```
> <p align="center">
>   <img src="https://github.com/user-attachments/assets/9ea40c01-3a16-4c2e-95ce-733dcef0288b" width="600"/>
> </p>


> [!NOTE]
> ## 📌 4. Set
> `Set` es una colección que **no permite elementos duplicados**. Su comportamiento respecto al orden depende de la implementación:  
> **`HashSet`**: No garantiza orden alguno (basado en `hashCode`).  
> **`LinkedHashSet`**: Mantiene el orden de inserción.  
> **`TreeSet`**: Ordena los elementos (natural o con un `Comparator`).
> Ejemplo:  
> ```java
> import java.util.*
> public class Main(){
> public static void main(String[] args){
> Set<String> set = new HashSet<>();
> set.add("Hola");
> set.add("Hola");  // ¡Ignorado!  
> System.out.println(set);  // Salida: [Hola] (sin duplicados)
> ```
> ### **¿Por qué es importante esta distinción?**  
> Si necesitas **evitar duplicados pero mantener el orden**, usa `LinkedHashSet`.  
> Si necesitas **orden natural o personalizado**, elige `TreeSet`.
>  ```java
>  HashSet dias = new HashSet();
>  dias.add("lunes");
>  dias.add("martes");
>  dias.add("miercoles");
>  dias.add("jueves");
>  dias.add("viernes");
>
>  for(Object dia: dias){
>  	System.out.println(dias);
>  }
>  dias.remove("lunes");
>  System.out.println(dias);
>  dias.clear();
>  System.out.println(dias);
>
>  }
>  }
>  ```
>  
> <p align="center">
>   <img src="https://github.com/user-attachments/assets/ba980a5f-2320-4e2d-b2f5-2711db85f7c4" width="600"/>
> </p>



> [!NOTE]
> ## 📌 5. Map
> Un Map (mapa) almacena pares **clave-valor**, donde: <br>
> ✅ Claves únicas: No puede haber duplicados (si repites una clave, se sobrescribe el valor). <br>
> ✅ Valores pueden repetirse. <br> 
> ✅ Implementaciones comunes: HashMap, LinkedHashMap, TreeMap. <br>
> Map es independiente de Collections y se puede crear de la siguiente manera: <br>
> ```java
> Map numeros = new HashMap();
>        numeros.put(1, "uno");
>        numeros.put(2, "dos");
>        numeros.put(3, "tres");
>        numeros.put(4, "cinco");        
> ```
> <p align="center">
>   <img src="https://github.com/user-attachments/assets/d3171f03-762b-4776-a404-a572e3a68e44" width="600"/>
> </p>
>
> ```java
> System.out.println(numeros.get(1)); // -> 1 (Podemos considerar a la clave como el índice del objeto)
> for(Object valores: numeros.keySet()){ //keySet obtengo las claves
>            System.out.println(valores);
>        }
>    for(Object clave: numeros.keySet()){
>            System.out.println(clave+" "+ numeros.get(clave)); //Obtengo clave y valor
>        }
> ```
> <p align="center">
>   <img src="https://github.com/user-attachments/assets/8fbfe6a1-e894-49c8-aded-ba0cd3a50d6c" width="600"/>
> </p>


> [!NOTE]
> ## 📌 6. Crear Archivo
> Primero, vamos a crear un nuevo proyecto en NetBeans llamado **"PersistenciaDatos"** y agregamos una clase `main`.

> [!NOTE]
> ## 📌 7. Escribir Archivo

> [!NOTE]
> ## 📌 8. Leer Archivo

> [!NOTE]
> ## 📌 9. Eliminar Archivo

[![Main](https://img.shields.io/badge/🏠_Volver_al_Main-8A2BE2?style=for-the-badge&logo=github&logoColor=white)](https://github.com/juansuarezb/CursoJava/blob/main/README.md)
[![Anterior](https://img.shields.io/badge/←_Volver_a_Sección_13-8A2BE2?style=for-the-badge&logo=github&logoColor=white)](https://github.com/juansuarezb/CursoJava/blob/Seccion13/README.md)
[![Siguiente](https://img.shields.io/badge/Seccion15→-2E8B57?style=for-the-badge&logo=github&logoColor=white)](https://github.com/juansuarezb/CursoJava/blob/Seccion15/README.md)
