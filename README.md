# Sección 7: POO - Programación Orientada a Objetos

> [!NOTE]
> **Temas cubiertos:**
> - Presentación del curso POO
> - Programación Orientada a Objetos
> - ¿Qué es un objeto?
> - ¿Qué es una clase?
> - Modularidad

> [!NOTE]  
> # 1. Presentación del Curso de POO  
> 
> <p>¡Bienvenido al curso de <strong>Programación Orientada a Objetos</strong>! En este espacio aprenderemos los fundamentos y conceptos clave del paradigma orientado a objetos utilizando el lenguaje de programación <strong>Java</strong>.</p>
> 
> <p>Java fue diseñado específicamente con la Programación Orientada a Objetos en mente; en este lenguaje, <strong>todo es un objeto</strong>.</p>
> 
> <p align="center">
>   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion7/Imagenes/Imagen1.avif" width="600" alt="Imagen introductoria de POO en Java"/>
> </p>
> 
> <p><strong>Comenzaremos explorando los principios fundamentales de la POO y sus características principales:</strong></p>
> 
> <ul>
>   <li><u>¿Qué es una clase? ¿Y qué es un objeto?</u></li>
>   <li><u>¿Qué es la herencia?</u></li>
>   <li><u>Encapsulamiento y polimorfismo</u></li>
>   <li><u>Clases abstractas e interfaces</u></li>
>   <li><u>Manejo de excepciones</u></li>
> </ul>
> 
> <p align="center">
>   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion7/Imagenes/Imagen2.avif" width="600" alt="Diagrama de características POO"/>
> </p>

> [!NOTE]  
> # 2. Programación Orientada a Objetos (POO)  
> 
> <p>¿Qué es la <strong>Programación Orientada a Objetos (POO)</strong>?</p>
> 
> <p>La POO es un <strong>paradigma de programación</strong>, es decir, una forma o modelo estructurado de pensar y resolver problemas a través del código. Existen varios paradigmas en la programación, y la POO es uno de los más utilizados en la actualidad.</p>
> 
> <p>Este paradigma nos ayuda a mejorar la <strong>organización</strong> de nuestros programas, facilitando la reutilización del código, la escalabilidad y una mejor <strong>abstracción</strong> de conceptos del mundo real en estructuras de software.</p>
> 
> <p align="center">
>   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion7/Imagenes/Imagen3.avif" width="600" alt="Concepto de POO"/>
> </p>
> 
> <p>Con POO, podemos representar objetos del mundo real (como una <strong>Persona</strong>, un <strong>Doctor</strong>, un <strong>Auto</strong>, etc.) mediante clases y objetos en nuestro código.</p>
> 
> <p align="center">
>   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion7/Imagenes/Imagen4.avif" width="600" alt="Ejemplo de objetos en POO"/>
> </p>
> 
> <p>La POO se compone de cuatro elementos fundamentales que permiten representar el comportamiento y las características de los objetos:</p>
> 
> <p align="center">
>   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion7/Imagenes/Imagen5.avif" width="600" alt="Elementos fundamentales de POO"/>
> </p>
> 
> <p>Además, está basada en cuatro pilares esenciales:</p>
> 
> <p align="center">
>   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion7/Imagenes/Imagen6.avif" width="600" alt="Pilares de la POO"/>
> </p>
> 
> <p>Si en otro lenguaje encuentras estos pilares, significa que ese lenguaje posee características de programación orientada a objetos.</p>


> [!NOTE]
> # 3. ¿Qué es un Objeto?
>
> En la **Programación Orientada a Objetos (POO)**, un **objeto** es una instancia concreta de una clase que encapsula tanto datos como comportamientos relacionados. Es decir, un objeto representa una entidad del mundo real dentro del contexto del software, combinando atributos (propiedades) y métodos (funciones) que operan sobre esos atributos.
>
> **Características principales de un objeto:**
>
> - **Estado:** Representado por los atributos del objeto, que almacenan información sobre las características del objeto.
> - **Comportamiento:** Definido por los métodos del objeto, que determinan las acciones que el objeto puede realizar.
> - **Identidad:** Cada objeto tiene una identidad única que lo distingue de otros objetos, incluso si tienen el mismo estado.
>
> Por ejemplo, consideremos una clase `Coche` con atributos como `marca`, `modelo` y `color`, y métodos como `acelerar()` y `frenar()`. A partir de esta clase, podemos crear múltiples objetos (instancias), cada uno representando un coche específico con valores particulares para sus atributos.
>
> <p align="center">
>   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion7/Imagenes/Imagen7.avif" width="600" alt="Diagrama de un objeto en POO"/>
> </p>
>
> En el diagrama anterior, se muestra cómo un objeto encapsula sus atributos y métodos, manteniendo una estructura organizada y modular.
>
> La creación de objetos a partir de clases permite una representación más cercana a la realidad dentro del software, facilitando la comprensión y el mantenimiento del código. Además, promueve la reutilización y modularidad, ya que las clases pueden ser reutilizadas para crear múltiples objetos con comportamientos similares pero con estados diferentes.
>
> <p align="center">
>   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion7/Imagenes/Imagen8.avif" width="600" alt="Ejemplo de objetos creados a partir de una clase"/>
> </p>
>
> En resumen, los objetos son fundamentales en la POO, ya que permiten modelar elementos del mundo real de manera efectiva dentro del software, combinando datos y comportamientos en una sola entidad.

> [!NOTE]
> # 4. ¿Qué es una Clase?
>
> En la **Programación Orientada a Objetos (POO)**, una **clase** es una plantilla o modelo que define las características y comportamientos que tendrán los objetos creados a partir de ella. Es decir, una clase especifica los atributos (propiedades) y métodos (funciones) que sus objetos asociados poseerán.
>
> **Características principales de una clase:**
>
> - **Atributos:** Representan las propiedades o características de la clase. Por ejemplo, en una clase `Coche`, los atributos podrían ser `marca`, `modelo` y `color`.
> - **Métodos:** Definen las acciones o comportamientos que la clase puede realizar. Siguiendo el ejemplo anterior, métodos como `acelerar()` o `frenar()` serían apropiados para la clase `Coche`.
>
> Una clase actúa como un plano detallado para construir objetos específicos. Por ejemplo, la clase `Coche` define las características generales de un coche, y cada objeto creado a partir de esta clase representará un coche específico con valores particulares para sus atributos.
>
> <p align="center">
>   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion7/Imagenes/Imagen12.avif" width="600" alt="Diagrama de una clase en POO"/>
> </p>
>
> En el diagrama anterior, se ilustra cómo una clase encapsula tanto atributos como métodos, estableciendo una estructura organizada para la creación de objetos.
>
> A continuación, se presentan más representaciones visuales relacionadas con las clases:
>
> <p align="center">
>   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion7/Imagenes/Imagen13.avif" width="600" alt="Representación de una clase con atributos y métodos"/>
> </p>
>
> <p align="center">
>   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion7/Imagenes/Imagen14.avif" width="600" alt="Ejemplo de diagrama de clases en POO"/>
> </p>
>
> <p align="center">
>   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion7/Imagenes/Imagen15.avif" width="600" alt="Estructura de una clase en programación orientada a objetos"/>
> </p>
>
> <p align="center">
>   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion7/Imagenes/Imagen16.avif" width="600" alt="Diagrama de clases con relaciones entre objetos"/>
> </p>
>
> Al definir clases, promovemos la reutilización del código y facilitamos la organización y mantenimiento del software, ya que las clases permiten agrupar datos y comportamientos relacionados en una sola entidad.


> [!NOTE]
> # 5. Modularidad
>
> La **modularidad** es un principio fundamental en el desarrollo de software que implica dividir un programa en partes más pequeñas y manejables, conocidas como módulos. Cada módulo es una unidad independiente que encapsula una parte específica de la funcionalidad del programa, permitiendo que se desarrolle, pruebe y mantenga de forma aislada.
>
> **Beneficios de la modularidad:**
>
> - **Reutilización:** Los módulos pueden ser reutilizados en diferentes partes del programa o incluso en otros proyectos, reduciendo la duplicación de código y mejorando la eficiencia del desarrollo.
> - **Mantenibilidad:** Al tener el código dividido en módulos independientes, es más sencillo localizar y corregir errores, así como implementar mejoras o nuevas funcionalidades sin afectar otras partes del sistema.
> - **Escalabilidad:** Facilita la ampliación del sistema, ya que se pueden agregar nuevos módulos sin interferir con los existentes.
>
> En el contexto de la **Programación Orientada a Objetos (POO)**, la modularidad se logra mediante la creación de clases y objetos que encapsulan datos y comportamientos relacionados. Cada clase actúa como un módulo que puede interactuar con otros módulos a través de interfaces bien definidas.
>
> A continuación, se presentan representaciones visuales que ilustran la modularidad en POO:
>
> <p align="center">
>   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion7/Imagenes/Imagen17.avif" width="600" alt="Diagrama de modularidad en programación orientada a objetos"/>
> </p>
>
> <p align="center">
>   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion7/Imagenes/Imagen18.avif" width="600" alt="Ejemplo de modularidad en diseño de software"/>
> </p>
>
> <p align="center">
>   <img src="https://github.com/juansuarezb/CursoJava/raw/Seccion7/Imagenes/Imagen19.avif" width="600" alt="Representación de módulos en programación orientada a objetos"/>
> </p>
>
> La modularidad no solo mejora la estructura y organización del código, sino que también facilita la colaboración en equipos de desarrollo, ya que diferentes miembros pueden trabajar en módulos distintos de manera simultánea sin interferencias.



[![Main](https://img.shields.io/badge/🏠_Volver_al_Main-8A2BE2?style=for-the-badge&logo=github&logoColor=white)](https://github.com/juansuarezb/CursoJava/blob/main/README.md)
[![Anterior](https://img.shields.io/badge/←_Volver_a_Sección_6-8A2BE2?style=for-the-badge&logo=github&logoColor=white)](https://github.com/juansuarezb/CursoJava/blob/Seccion6/README.md)
[![Siguiente](https://img.shields.io/badge/Seccion8→-2E8B57?style=for-the-badge&logo=github&logoColor=white)](https://github.com/juansuarezb/CursoJava/blob/Seccion8/README.md)