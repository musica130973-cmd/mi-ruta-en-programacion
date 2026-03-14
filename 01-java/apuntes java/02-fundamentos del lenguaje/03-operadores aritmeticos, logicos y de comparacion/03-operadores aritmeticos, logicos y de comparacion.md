**3\. OPERADORES ARITMETICOS, LOGICOS Y DE COMPARACION**

En Java, los operadores son símbolos que permiten realizar operaciones sobre variables y valores. Dominar estos operadores es fundamental para escribir código claro, eficiente y expresivo. A continuación se desarrollan los tres grupos más importantes: **aritméticos**, **lógicos** y **de comparación**.

**➕ 1. Operadores Aritméticos**

Los operadores aritméticos permiten realizar operaciones matemáticas básicas. Funcionan con tipos numéricos como int, double, float, etc.

| **Operador** | **Operación** | **Ejemplo** | **Resultado** |
| --- | --- | --- | --- |
| + | Suma | 5 + 3 | 8 |
| - | Resta | 5 - 3 | 2 |
| * | Multiplicación | 5 * 3 | 15 |
| / | División | 10 / 2 | 5 |
| % | Módulo (resto) | 10 % 3 | 1 |

**🔍 Notas importantes**

-   La división entre enteros descarta decimales: 7 / 2 da 3.
-   El operador % es muy útil para saber si un número es par (n % 2 == 0).

**➕ Incremento y decremento**

| **Operador** | **Significado** | **Ejemplo** |
| --- | --- | --- |
| ++ | Incrementa en 1 | x++ o ++x |
| \-- | Decrementa en 1 | x-- o --x |

**Diferencia entre prefijo y sufijo:**

-   ++x: incrementa y luego devuelve el valor.
-   x++: devuelve el valor y luego incrementa.

**⚖️ 2. Operadores de Comparación (Relacionales)**

Estos operadores comparan dos valores y devuelven un resultado booleano (true o false). Son esenciales en estructuras como if, while o for.

| **Operador** | **Significado** | **Ejemplo** | **Resultado** |
| --- | --- | --- | --- |
| == | Igual a | 5 == 5 | true |
| != | Distinto de | 5 != 3 | true |
| &gt; | Mayor que | 5 &gt; 3 | true |
| &lt; | Menor que | 3 &lt; 5 | true |
| &gt;= | Mayor o igual | 5 &gt;= 5 | true |
| &lt;= | Menor o igual | 3 &lt;= 5 | true |

**🔍 Nota importante**

-   Para comparar cadenas NO se usa ==, sino .equals().

Ejemplo:

![](./03-operadores%20aritmeticos%2C%20logicos%20y%20de%20comparacion_images/image-001.png)

**🔐 3. Operadores Lógicos**

Se utilizan para combinar expresiones booleanas. Son fundamentales en condiciones complejas.

| **Operador** | **Significado** | **Ejemplo** | **Resultado** |
| --- | --- | --- | --- |
| &amp;&amp; | AND lógico | true &amp;&amp; false | false |
| \|\| | OR lógico | true \|\| false | true |
| ! | NOT lógico | !true | false |

  

**🧠 Cómo funcionan**

-   && solo es true si **ambas** condiciones son true.
-   || es true si **al menos una** condición es true.
-   ! invierte el valor booleano.

**Ejemplo práctico**

![](./03-operadores%20aritmeticos%2C%20logicos%20y%20de%20comparacion_images/image-002.png)

🧩 Ejemplo integrando los tres tipos de operadores

![](./03-operadores%20aritmeticos%2C%20logicos%20y%20de%20comparacion_images/image-003.png)

Aquí se combinan:

-   Aritméticos: a + b
-   Comparación: a > b y (a + b) == 15
-   Lógicos: &&