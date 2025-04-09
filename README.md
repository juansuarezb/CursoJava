# Sección 13: POO - Proyecto Catálogo de películas

> [!NOTE]
> **Temas cubiertos:**
> - Presentación de Proyecto
> - JavaBeans
> - ArrayList
> - Cuadro de diálogo
> - Interface catálogo película
> - Implementar catálogo película
> - UI de Pelicula
> - Manejo de Errores
> - Final - Generar Ejecutable


> [!NOTE]
> <h2>📌 1. Presentación</h2>
> <p>En este módulo de POO vamos a aplicar todo en un proyecto asi, la salida de los datos se manejará mediante un cuadro de diálogo.</p>
> <em>Vamos a crear una pequeña aplicación Catálogo de películas y generar un archivo ejecutable .JAR</em>
> <p align="center">
>  <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion13/Imagenes/Imagen1.avif" width="600"/>
> </p>
> <p>Así mismo, vamos a aplicar lo aprendido sobre manejo de erroes para que no se cierre de manera brusca el progama.</p>


> [!NOTE]
> <h2>📌 2. JavaBeans</h2>
> <p>Vamos a empezar a crear nuestra aplicación. Creamos un nuevo proyecto del tipo Java with Ant "Peliculas" </p>
> <p>Si queremos crear una clase del modelo JavaBeans tenemos que codificar una estructura fija (estandarizada) </p>
> <p>Creamos un nuevo paquete "Negocio.Modelo" que deriva del paquete "Negocio" la misma que contiene nuestra main class.</p>
> <p align="center">
>   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion13/Imagenes/Imagen2.avif" width="600"/>
> </p>
> <p>Luego, creamos una clase que contiene el modelo de las peliculas. en esta clase vamos a ver como tiene que estar estructurada una clase del tipo JavaBeans</p>
> <p>El concepto de JavaBeans dice que debemos de implementar una interface serializable. </p>

```java
package Negocio.Modelo;

import java.io.Serializable;
import java.util.Objects;


//CLASE JAVABEANS

//Primero se implementa la interface que ya viene definida en JAVA (serializable) así,  se van a importar los paquetes necesarios.
public class Pelicula implements Serializable{

 ```

> [!NOTE]
> <p>1.TODOS los atributos de una clase del tipo JavaBeans tienen que ser privados (modificador de acceso privado) </p>
> <p>2. Debemos de tener un constructor vacio y los constructores que vayamos a necesitar</p>
> <p>3. Debemos de tener métodos de get y set de todos los atributos</p>
> <p>4. Debemos de tener implementado los métodos como toString, HashCode y equals</p>

## 📝 Clase Pelicula.java (JavaBeans)

```java
package Negocio.Modelo;

import java.io.Serializable;
import java.util.Objects;

/**
 * Clase que representa una Película siguiendo el estándar JavaBeans
 * Implementa Serializable para permitir serialización del objeto
 */
public class Pelicula implements Serializable {
    
    // Atributo privado según estándar JavaBeans
    private String nombreP;
    
    // ⚠️ Requerido por JavaBeans: Constructor vacío
    public Pelicula() {
        // Constructor sin parámetros
    }
    
    // Constructor con parámetros
    public Pelicula(String nombreP) {
        this.nombreP = nombreP;
    }
    
    // =========== GETTERS & SETTERS ===========
    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }
    
    // =========== MÉTODOS ESTÁNDAR ===========
    @Override
    public String toString() {
        return this.nombreP;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.nombreP);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        final Pelicula other = (Pelicula) obj;
        return Objects.equals(this.nombreP, other.nombreP);
    }
}
```

## 🔍 Explicación de la estructura JavaBeans

| Elemento           | Obligatorio | Descripción                                                                 |
|--------------------|-------------|-----------------------------------------------------------------------------|
| `Serializable`     | ✅ Sí       | Permite serializar el objeto para transmisión/persistencia                  |
| Atributos privados | ✅ Sí       | Encapsulación correcta de los datos                                         |
| Constructor vacío  | ✅ Sí       | Necesario para frameworks y herramientas que usan reflexión                 |
| Getters/Setters    | ✅ Sí       | Proporcionan acceso controlado a los atributos                              |
| hashCode()         | ✅ Sí       | Requerido para uso en colecciones                                           |
| equals()           | ✅ Sí       | Permite comparación lógica de objetos                                       |
| toString()         | ⚠️ Recomendado | Representación legible del objeto (útil para logging y debugging)          |

## 📂 Estructura de paquetes recomendada

```
src/
└── Negocio/
    ├── Modelo/       # Contiene las clases JavaBeans
    │   └── Pelicula.java
    └── Main.java     # Clase principal de la aplicación
```

> 💡 **Nota**: Esta implementación cumple con todos los requisitos del estándar JavaBeans y está lista para ser usada con frameworks como Spring, Hibernate, etc.


 

> [!NOTE]
> ## 📌 3. ArrayList


> [!NOTE]
> ## 📌 4. Cuadro de diálogo
> Primero, vamos a crear un nuevo proyecto en NetBeans llamado **"PersistenciaDatos"** y agregamos una clase `main`.

> [!NOTE]
> ## 📌 5. Interface Catalogo Pelicula

> [!NOTE]
> ## 📌 6. Implementar Catalogo Pelicula

> [!NOTE]
> ## 📌 7. UI de Pelicula
>

> [!NOTE]
> ## 📌 8. Manejo de Errores
>

> [!NOTE]
> ## 📌 9. Generar ejecutable
> <p>Vamos a generar un archivo JAR, para eso seleccionamos el proyecto y vamos a propiedades </p>
> <p>Luego, nos dirijimos a build y seleccionamos las casillas como en la imagen</p>
> <p align="center">
>   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion13/Imagenes/Imagen20.avif" width="600"/>
> </p>
> <p>Así, vamos a la parte de Run y seleccionamos a la clase main</p>
> <p align="center">
>   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion13/Imagenes/Imagen21.avif" width="600"/>
> </p>
> <p>Luego, vamos a la parte de Compiling en Build y seleccionamos todas las casillas y damos en aceptar</p>
> <p align="center">
>   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion13/Imagenes/Imagen22.avif" width="600"/>
> </p>
> <p>Nuevamente seleccionamos el proyecto y seleccionamos la opción de Clean and Build y así vamos a generar el archivo JAR</p>
> <p>Si nos dirijimos a las pestaña de Files vamos a observar que se creo una carpeta "dist" y si buscamos el .JAR y lo ejecutamos tendremos la ejecución del programa.</p>
> <p align="center">
>   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion13/Imagenes/Imagen23.avif" width="600"/>
> </p>

[![Main](https://img.shields.io/badge/🏠_Volver_al_Main-8A2BE2?style=for-the-badge&logo=github&logoColor=white)](https://github.com/juansuarezb/CursoJava/blob/main/README.md)
[![Anterior](https://img.shields.io/badge/←_Volver_a_Sección_12-8A2BE2?style=for-the-badge&logo=github&logoColor=white)](https://github.com/juansuarezb/CursoJava/blob/Seccion12/README.md)
[![Siguiente](https://img.shields.io/badge/Seccion14→-2E8B57?style=for-the-badge&logo=github&logoColor=white)](https://github.com/juansuarezb/CursoJava/blob/Seccion14/README.md)
