**1\. CLASES Y OBJETOS**

**🧠 1. ¿Qué es la Programación Orientada a Objetos (POO)?**

La POO es un paradigma que organiza el código en **objetos**, que representan entidades del mundo real. Java está diseñado para trabajar con este enfoque.

**Sus pilares fundamentales:**

-   **Encapsulación**
-   **Herencia**
-   **Polimorfismo**
-   **Abstracción**

En este tema nos centramos en **clases y objetos**, la base de todo.

**🏗️ 2. ¿Qué es una clase?**

Una **clase** es un **molde** o **plantilla** que describe cómo serán los objetos.

Una clase define:

-   **Atributos** → características (variables)
-   **Métodos** → comportamientos (funciones)
-   **Constructores** → forma de crear objetos

**📌 Ejemplo de clase:**

![](./01-clases%20y%20objetos_images/image-001.png)

**🚗 3. ¿Qué es un objeto?**

Un **objeto** es una **instancia** de una clase. Si la clase es el molde, el objeto es el producto final.

**📌 Crear un objeto:**

![](./01-clases%20y%20objetos_images/image-002.png)

**¿Qué ocurre aquí?**

-   Coche → tipo de dato (clase)
-   miCoche → nombre del objeto
-   new → crea el objeto en memoria
-   Coche(...) → llama al constructor

**🧱 4. Atributos**

Son **variables dentro de una clase**. Representan el estado del objeto.

Tipos:

-   **Públicos** (public)
-   **Privados** (private) → recomendados para encapsulación
-   **Protegidos** (protected)

**Ejemplo:**

**![](./01-clases%20y%20objetos_images/image-003.png)**

**🛠️ 5. Métodos**

**Son acciones que puede realizar un objeto.**

**Tipos de métodos:**

-   **Getters y Setters (acceder/modificar atributos privados)**
-   **Métodos normales (acciones)**
-   **Métodos estáticos (static) → pertenecen a la clase, no al objeto**

**Ejemplo:**

**![](./01-clases%20y%20objetos_images/image-004.png)**

**🧩 6. Constructores**

**Un constructor es un método especial que se ejecuta al crear un objeto.**

**Características:**

-   **Se llama igual que la clase**
-   **No tiene tipo de retorno**
-   **Puede haber varios (sobrecarga)**

**Ejemplo:**

**![](./01-clases%20y%20objetos_images/image-005.png)**

**🔒 7. Encapsulación (muy importante)**

**Consiste en proteger los datos del objeto usando atributos privados y métodos públicos para acceder a ellos.**

**Ejemplo:**

**![](./01-clases%20y%20objetos_images/image-006.png)**

**🧪 8. Ejemplo completo para estudiar**

**![](./01-clases%20y%20objetos_images/image-007.png)**

**![](./01-clases%20y%20objetos_images/image-008.png)**

**📝 9. Resumen para memorizar**

| **Concepto** | **Qué es** |
| --- | --- |
| **Clase** | **Plantilla que define atributos y métodos** |
| **Objeto** | **Instancia de una clase** |
| **Atributos** | **Datos del objeto** |
| **Métodos** | **Acciones del objeto** |
| **Constructor** | **Inicializa el objeto** |
| **Encapsulación** | **Proteger datos con private + getters/setters** |