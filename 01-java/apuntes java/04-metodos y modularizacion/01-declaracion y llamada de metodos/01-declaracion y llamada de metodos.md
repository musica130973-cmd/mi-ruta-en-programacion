**1\. DECLARACIÓN Y LLAMADA DE MÉTODOS**

Los **métodos** son bloques de código que realizan una tarea específica. Permiten **organizar**, **reutilizar** y **estructurar** mejor un programa.

**🟦 1. ¿Qué es un método?**

Un método es un conjunto de instrucciones que:

-   tiene un **nombre**
-   puede recibir **parámetros**
-   puede devolver o no un **valor**
-   se ejecuta cuando lo llamamos

**🟩 2. Declaración de un método**

La estructura general es:

![](./01-declaracion%20y%20llamada%20de%20metodos_images/image-001.png)

✔️ Explicación de cada parte

| **Parte** | **Significado** |
| --- | --- |
| **modificador** | public, private, static, etc. |
| **tipoDeRetorno** | tipo del valor que devuelve (int, String, void…) |
| **nombreMetodo** | nombre que le damos al método |
| **parámetros** | datos que recibe (opcionales) |

**🟦 3. Ejemplo de método sin parámetros y sin retorno**

**![](./01-declaracion%20y%20llamada%20de%20metodos_images/image-002.png)**

**🟦 4. Ejemplo de método con parámetros**

**![](./01-declaracion%20y%20llamada%20de%20metodos_images/image-003.png)**

**🟦 5. Ejemplo de método que devuelve un valor**

**![](./01-declaracion%20y%20llamada%20de%20metodos_images/image-004.png)**

**✔️ Importante**

Cuando un método devuelve un valor, debe usar return.

**🟩 6. Llamada a un método**

Para ejecutar un método, simplemente lo llamamos por su nombre.

**✔️ Llamar a un método sin parámetros**

![](./01-declaracion%20y%20llamada%20de%20metodos_images/image-005.png)

**✔️ Llamar a un método con parámetros**

**![](./01-declaracion%20y%20llamada%20de%20metodos_images/image-006.png)**

**✔️ Llamar a un método que devuelve un valor**

**![](./01-declaracion%20y%20llamada%20de%20metodos_images/image-007.png)**

**🟦 7. Métodos static vs métodos normales**

**✔️ Métodos static**

**Se pueden llamar sin crear un objeto.**

**Ejemplo:**

**![](./01-declaracion%20y%20llamada%20de%20metodos_images/image-008.png)**

**Llamada:**

**![](./01-declaracion%20y%20llamada%20de%20metodos_images/image-009.png)**

**✔️ Métodos NO estáticos**

Necesitan un objeto:

![](./01-declaracion%20y%20llamada%20de%20metodos_images/image-010.png)

**Llamada:**

![](./01-declaracion%20y%20llamada%20de%20metodos_images/image-011.png)

**🟩 8. Sobrecarga de métodos (overloading)**

Java permite tener varios métodos con el mismo nombre, siempre que cambien los parámetros.

![](./01-declaracion%20y%20llamada%20de%20metodos_images/image-012.png)

**🟦 9. Buenas prácticas al crear métodos**

-   Usa nombres descriptivos: calcularArea(), obtenerEdad()
-   Un método debe hacer **una sola cosa**
-   Evita métodos demasiado largos
-   Usa parámetros cuando el método necesite datos externos

**📌 Resumen**

-   Un método es un bloque de código reutilizable.
-   Se declara con: modificador tipo nombre(parámetros)
-   Puede devolver un valor (return) o ser void.
-   Se llama usando su nombre y pasando los parámetros necesarios.
-   Puede ser static o no.
-   Se pueden sobrecargar métodos con el mismo nombre.