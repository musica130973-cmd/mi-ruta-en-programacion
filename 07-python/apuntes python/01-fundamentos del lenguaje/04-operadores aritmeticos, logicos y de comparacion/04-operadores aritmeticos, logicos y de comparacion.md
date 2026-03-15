**4\. OPERADORES ARITMÉTICOS, LÓGICOS Y DE COMPARACIÓN**

Python incluye varios tipos de operadores que permiten realizar cálculos, comparar valores y construir expresiones lógicas. Dominar estos operadores es esencial para escribir código claro y funcional.

**➗ 1. Operadores aritméticos**

Se utilizan para realizar operaciones matemáticas.

| **Operador** | **Descripción** | **Ejemplo** | **Resultado** |
| --- | --- | --- | --- |
| + | Suma | 5 + 3 | 8 |
| - | Resta | 10 - 4 | 6 |
| * | Multiplicación | 6 * 2 | 12 |
| / | División | 7 / 2 | 3.5 |
| // | División entera | 7 // 2 | 3 |
| % | Módulo (resto) | 7 % 2 | 1 |
| ** | Potencia | 2 ** 3 | 8 |

Ejemplos:

![](./04-operadores%20aritmeticos%2C%20logicos%20y%20de%20comparacion_images/image-001.png)

**🔍 2. Operadores de comparación**

Sirven para comparar valores y devuelven **True** o **False**.

| **Operador** | **Significado** | **Ejemplo** | **Resultado** |
| --- | --- | --- | --- |
| == | Igual a | 5 == 5 | True |
| != | Distinto de | 5 != 3 | True |
| &gt; | Mayor que | 7 &gt; 2 | True |
| &lt; | Menor que | 3 &lt; 1 | False |
| &gt;= | Mayor o igual | 5 &gt;= 5 | True |
| &lt;= | Menor o igual | 4 &lt;= 6 | True |

Ejemplos:

![](./04-operadores%20aritmeticos%2C%20logicos%20y%20de%20comparacion_images/image-002.png)

**🔘 3. Operadores lógicos**

Permiten combinar expresiones booleanas.

| **Operador** | **Descripción** | **Ejemplo** | **Resultado** |
| --- | --- | --- | --- |
| and | Verdadero si **ambas** condiciones son verdaderas | True and False | False |
| or | Verdadero si **al menos una** condición es verdadera | True or False | True |
| not | Invierte el valor lógico | not True | False |

Ejemplos:

![](./04-operadores%20aritmeticos%2C%20logicos%20y%20de%20comparacion_images/image-003.png)

**🧠 4. Combinación de operadores**

Puedes combinar operadores aritméticos, lógicos y de comparación en expresiones más complejas.

Ejemplo:

![](./04-operadores%20aritmeticos%2C%20logicos%20y%20de%20comparacion_images/image-004.png)

Otro ejemplo:

![](./04-operadores%20aritmeticos%2C%20logicos%20y%20de%20comparacion_images/image-005.png)

**📝 5. Precedencia de operadores**

Python evalúa los operadores en este orden:

1.  Paréntesis ()
2.  Potencia \*\*
3.  Multiplicación, división, módulo \* / // %
4.  Suma y resta + -
5.  Comparaciones == != > < >= <=
6.  Lógicos not
7.  Lógicos and
8.  Lógicos or

Ejemplo:

![](./04-operadores%20aritmeticos%2C%20logicos%20y%20de%20comparacion_images/image-006.png)

**🧪 6. Buenas prácticas**

-   Usa paréntesis para mejorar la claridad.
-   Evita expresiones demasiado largas.
-   Recuerda que las comparaciones encadenadas son válidas en Python:

![](./04-operadores%20aritmeticos%2C%20logicos%20y%20de%20comparacion_images/image-007.png)

No confundas = (asignación) con == (comparación).