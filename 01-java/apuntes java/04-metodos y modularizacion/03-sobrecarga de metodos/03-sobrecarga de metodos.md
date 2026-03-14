**3\. SOBRECARGA DE MÉTODOS**

La sobrecarga de métodos permite definir varios métodos con el mismo nombre, siempre que tengan distintos parámetros. Es una forma de crear métodos más flexibles y reutilizables.

**🟦 1. ¿Qué es la sobrecarga de métodos?**

La **sobrecarga** ocurre cuando:

-   Dos o más métodos tienen **el mismo nombre**
-   Pero **difieren en**:
    -   número de parámetros
    -   tipo de parámetros
    -   orden de los parámetros

👉 **El tipo de retorno NO influye en la sobrecarga.**

**🟩 2. ¿Para qué sirve?**

-   Para ofrecer **varias versiones** de un mismo método
-   Para facilitar el uso del método con distintos tipos de datos
-   Para evitar nombres diferentes para tareas similares

Ejemplo real: System.out.println() Tiene decenas de versiones para imprimir int, double, String, char, etc.

**🟦 3. Reglas de la sobrecarga**

Un método está sobrecargado si:

**✔️ Cambia el número de parámetros**

![](./03-sobrecarga%20de%20metodos_images/image-001.png)

**✔️ Cambia el tipo de parámetros**

![](./03-sobrecarga%20de%20metodos_images/image-002.png)

**✔️ Cambia el orden de los parámetros**

**![](./03-sobrecarga%20de%20metodos_images/image-003.png)**

**🟥 Importante: lo que NO permite la sobrecarga**

**❌ Cambiar solo el tipo de retorno Esto no es sobrecarga válida:**

**![](./03-sobrecarga%20de%20metodos_images/image-004.png)**

**🟦 4. Ejemplo completo de sobrecarga**

**![](./03-sobrecarga%20de%20metodos_images/image-005.png)**

**✔️ Llamada a los métodos**

**![](./03-sobrecarga%20de%20metodos_images/image-006.png)**

**🟩 5. Sobrecarga y conversión automática (autoboxing)**

Java puede elegir la versión más adecuada del método según el tipo de dato.

![](./03-sobrecarga%20de%20metodos_images/image-007.png)

**🟦 6. Ventajas de la sobrecarga**

-   Código más limpio
-   Métodos más fáciles de recordar
-   Flexibilidad al trabajar con distintos tipos de datos
-   Evita duplicar lógica con nombres diferentes

**📌 Resumen**

-   La sobrecarga permite **varios métodos con el mismo nombre**.
-   Deben diferir en **parámetros** (número, tipo u orden).
-   El **tipo de retorno NO cuenta** para sobrecargar.
-   Es muy útil para crear métodos flexibles y reutilizables.
-   Java elige automáticamente la versión correcta según los argumentos.