**2\. PARÁMETROS Y VALORES DE RETORNO**

Los **métodos** pueden recibir información desde fuera (parámetros) y pueden devolver un resultado (valor de retorno). Entender bien estos dos conceptos es fundamental para escribir código modular, reutilizable y limpio.

**🟦 1. ¿Qué son los parámetros?**

Los **parámetros** son variables que un método recibe para poder trabajar con ellas. Permiten que un mismo método funcione con distintos datos.

**✔️ Ejemplo básico**

![](./02-parametros%20y%20valores%20de%20retorno_images/image-001.png)

Aquí:

-   String nombre → es un parámetro
-   El método necesita ese dato para funcionar

**✔️ Llamada**

![](./02-parametros%20y%20valores%20de%20retorno_images/image-002.png)

**🟩 2. Tipos de parámetros**

**✔️ Parámetros simples (primitivos)**

![](./02-parametros%20y%20valores%20de%20retorno_images/image-003.png)

**✔️ Parámetros de referencia (objetos)**

**![](./02-parametros%20y%20valores%20de%20retorno_images/image-004.png)**

**✔️ Múltiples parámetros**

**![](./02-parametros%20y%20valores%20de%20retorno_images/image-005.png)**

**🟦 3. ¿Qué es un valor de retorno?**

**El valor de retorno es el resultado que un método devuelve al terminar. Se indica en el tipo de retorno del método.**

**✔️ Ejemplo**

**![](./02-parametros%20y%20valores%20de%20retorno_images/image-006.png)**

**Aquí:**

-   **int → tipo de retorno**
-   **return a + b; → devuelve un valor al que llamó al método**

**✔️ Llamada**

**![](./02-parametros%20y%20valores%20de%20retorno_images/image-007.png)**

**🟩 4. Métodos que NO devuelven nada: void**

**Si un método no devuelve ningún valor, se usa void.**

**![](./02-parametros%20y%20valores%20de%20retorno_images/image-008.png)**

No se usa return (salvo para salir antes del método).

**🟦 5. Uso de return**

return sirve para:

**✔️ 1. Devolver un valor**

![](./02-parametros%20y%20valores%20de%20retorno_images/image-009.png)

**✔️ 2. Finalizar el método antes de tiempo**

**![](./02-parametros%20y%20valores%20de%20retorno_images/image-010.png)**

**🟩 6. Parámetros vs argumentos**

| **Término** | **Significado** |
| --- | --- |
| **Parámetros** | Variables que define el método |
| **Argumentos** | Valores que se pasan al llamar al método |

**Ejemplo:**

**![](./02-parametros%20y%20valores%20de%20retorno_images/image-011.png)**

**🟦 7. Ejemplo completo**

**![](./02-parametros%20y%20valores%20de%20retorno_images/image-012.png)**

**🟩 8. Buenas prácticas**

-   Usa nombres descriptivos para los parámetros
-   Evita métodos con demasiados parámetros
-   Devuelve un valor solo si el método debe producir un resultado
-   Mantén los métodos cortos y claros

**📌 Resumen**

-   Los **parámetros** permiten pasar información a un método.
-   Los **valores de retorno** permiten que un método devuelva un resultado.
-   void indica que el método **no devuelve nada**.
-   return sirve para devolver un valor o finalizar el método.
-   Parámetros = lo que recibe el método.
-   Argumentos = lo que se envía al llamar al método.