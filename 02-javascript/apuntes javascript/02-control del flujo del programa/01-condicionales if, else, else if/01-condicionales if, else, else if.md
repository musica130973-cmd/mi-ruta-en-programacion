**1\. CONDICIONALES if, else, else if**

**🧩 1. ¿Qué es una estructura condicional?**

Una estructura condicional permite que un programa **tome decisiones** dependiendo de si una condición es verdadera (true) o falsa (false). En JavaScript, las principales estructuras condicionales son:

-   if
-   else
-   else if

**2\. La sentencia if**

Se usa para ejecutar un bloque de código **solo si** la condición es verdadera.

**✔ Sintaxis:**

![](./01-condicionales%20if%2C%20else%2C%20else%20if_images/image-001.png)

✔ Ejemplo:

![](./01-condicionales%20if%2C%20else%2C%20else%20if_images/image-002.png)

**3\. La sentencia else**

Se ejecuta cuando la condición del if es falsa.

**✔ Sintaxis:**

![](./01-condicionales%20if%2C%20else%2C%20else%20if_images/image-003.png)

✔ Ejemplo:

![](./01-condicionales%20if%2C%20else%2C%20else%20if_images/image-004.png)

**4\. La sentencia else if**

Permite evaluar **múltiples condiciones** en orden.

**✔ Sintaxis:**

![](./01-condicionales%20if%2C%20else%2C%20else%20if_images/image-005.png)

✔ Ejemplo:

![](./01-condicionales%20if%2C%20else%2C%20else%20if_images/image-006.png)

**5\. Reglas importantes**

-   Las condiciones deben evaluarse a **true o false**.
-   JavaScript convierte valores a booleanos automáticamente (truthy y falsy).
-   Solo puede haber **un** else.
-   Puede haber **varios** else if.
-   El orden importa: se evalúan de arriba hacia abajo.
-   Las llaves {} son opcionales si hay una sola instrucción, pero **se recomienda usarlas siempre**.

**6\. Valores truthy y falsy en JavaScript**

JavaScript convierte muchos valores a booleanos automáticamente.

**✔ Valores falsy (se consideran false):**

-   0
-   "" (cadena vacía)
-   null
-   undefined
-   NaN
-   false

**✔ Valores truthy (casi todo lo demás):**

-   Cualquier número distinto de 0
-   Cadenas no vacías
-   Objetos
-   Arrays
-   Funciones

**Ejemplo:**

![](./01-condicionales%20if%2C%20else%2C%20else%20if_images/image-007.png)

**7\. Operadores comunes en condiciones**

| **Operador** | **Significado** | **Ejemplo** |
| --- | --- | --- |
| == | Igual (comparación flexible) | 5 == "5" → true |
| === | Igual estricto | 5 === "5" → false |
| != | Distinto | x != 10 |
| !== | Distinto estricto | x !== "10" |
| &gt; | Mayor que | edad &gt; 18 |
| &lt; | Menor que | nota &lt; 50 |
| &gt;= | Mayor o igual | a &gt;= b |
| &lt;= | Menor o igual | a &lt;= b |
| &amp;&amp; | AND lógico | x &gt; 0 &amp;&amp; x &lt; 10 |
| \|\| | OR lógico | edad &lt; 18\|\| edad &gt; 65 |
| ! | Negación | !activo |

**8\. Ejemplo completo**

**![](./01-condicionales%20if%2C%20else%2C%20else%20if_images/image-008.png)**

**9\. Errores comunes**

-   **Usar = en vez de == o ===.**
-   **Olvidar los paréntesis en el if.**
-   **No considerar los valores truthy/falsy.**
-   **Ordenar mal las condiciones (por ejemplo, poner primero una condición demasiado general).**