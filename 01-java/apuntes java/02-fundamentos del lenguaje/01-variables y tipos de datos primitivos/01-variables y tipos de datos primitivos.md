**1\. VARIABLES Y TIPOS DE DATOS PRIMITIVOS**

**🧩 1. ¿Qué es una variable?**

Una **variable** es un espacio en memoria donde Java guarda un valor que puede cambiar durante la ejecución del programa. Cada variable tiene:

-   **Nombre** → cómo la identificas
-   **Tipo** → qué clase de dato puede almacenar
-   **Valor** → el contenido actual
-   **Ámbito (scope)** → dónde es accesible en el código

**Ejemplo:**

![](./01-variables%20y%20tipos%20de%20datos%20primitivos_images/image-001.png)

**2\. Reglas para nombrar variables**

-   Deben **comenzar con letra**, $ o \_
-   No pueden empezar con número
-   No pueden contener espacios
-   Son **sensibles a mayúsculas/minúsculas**
-   No pueden usar palabras reservadas de Java

**Buenas prácticas:**

-   Usar *camelCase*: numeroDeEstudiantes
-   Nombres descriptivos

**3\. Tipos de datos en Java**

Java es un lenguaje **fuertemente tipado**, lo que significa que cada variable debe declararse con un tipo específico.

Los tipos se dividen en:

| **Categoría** | **Descripción** |
| --- | --- |
| **Primitivos** | Datos básicos integrados en el lenguaje |
| **Referenciados** | Objetos, arrays, clases, etc. |

Aquí nos centramos en los **primitivos**.

**4\. Tipos de datos primitivos en Java**

Java tiene **8 tipos primitivos**, cada uno con un tamaño y rango definidos.

**🔢 4.1 Enteros**

**byte**

-   Tamaño: 1 byte
-   Rango: −128 a 127
-   Útil para ahorrar memoria

**short**

-   Tamaño: 2 bytes
-   Rango: −32,768 a 32,767

**int (el más usado)**

-   Tamaño: 4 bytes
-   Rango: −2,147,483,648 a 2,147,483,647

**long**

-   Tamaño: 8 bytes
-   Rango muy grande
-   Los literales deben terminar en L

![](./01-variables%20y%20tipos%20de%20datos%20primitivos_images/image-002.png)

**🔢 4.2 Números decimales**

**float**

-   Tamaño: 4 bytes
-   Menos preciso
-   Los literales deben terminar en f

![](./01-variables%20y%20tipos%20de%20datos%20primitivos_images/image-003.png)

**double (el más usado)**

-   Tamaño: 8 bytes
-   Mayor precisión

![](./01-variables%20y%20tipos%20de%20datos%20primitivos_images/image-004.png)

**🔤 4.3 Caracteres**

**char**

-   Tamaño: 2 bytes
-   Almacena un solo carácter Unicode

![](./01-variables%20y%20tipos%20de%20datos%20primitivos_images/image-005.png)

**🔘 4.4 Booleanos**

**boolean**

-   Solo puede ser: true o false
-   Usado en condiciones y lógica

![](./01-variables%20y%20tipos%20de%20datos%20primitivos_images/image-006.png)

**5\. Tabla resumen**

| **Tipo** | **Tamaño** | **Rango** | **Ejemplo** |
| --- | --- | --- | --- |
| byte | 1 byte | −128 a 127 | byte b = 10; |
| short | 2 bytes | −32k a 32k | short s = 1000; |
| int | 4 bytes | ±2 mil millones | int x = 42; |
| long | 8 bytes | enorme | long l = 100000L; |
| float | 4 bytes | decimal menos preciso | float f = 3.14f; |
| double | 8 bytes | decimal preciso | double d = 3.14; |
| char | 2 bytes | carácter Unicode | char c = 'a'; |
| boolean | 1 bit (aprox.) | true/false | boolean ok = true; |

**6\. Conversión entre tipos (casting)**

**Conversión implícita (automática)**

Ocurre cuando no hay pérdida de información.

![](./01-variables%20y%20tipos%20de%20datos%20primitivos_images/image-007.png)

**Conversión explícita (casting)**

Necesaria cuando puede haber pérdida de datos.

![](./01-variables%20y%20tipos%20de%20datos%20primitivos_images/image-008.png)

**7\. Inicialización de variables**

Java **no permite usar una variable sin inicializarla**.

![](./01-variables%20y%20tipos%20de%20datos%20primitivos_images/image-009.png)