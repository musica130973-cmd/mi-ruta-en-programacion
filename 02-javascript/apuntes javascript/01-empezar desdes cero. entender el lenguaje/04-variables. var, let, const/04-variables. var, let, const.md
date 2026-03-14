**4\. VARIABLES. VAR, LET, CONST**

**🧩 Qué es una variable en JavaScript**

Una variable es un **identificador que almacena un valor**. Ese valor puede cambiar o no según cómo se haya declarado. JavaScript permite declarar variables de tres formas modernas:

-   **var** — la forma antigua, con alcance amplio.
-   **let** — introducida en ES6, con alcance de bloque.
-   **const** — también de ES6, para valores que no deben reasignarse.

**🧱 var: alcance amplio y comportamiento tradicional**

var fue la única forma de declarar variables hasta ES6. Su comportamiento es más permisivo, pero también más propenso a errores.

**Características**

-   **Ámbito de función o global**, nunca de bloque.
-   **Permite redeclaración** dentro del mismo ámbito.
-   **Permite reasignación**.
-   Se ve afectada por el **hoisting**, quedando declarada al inicio del ámbito.

**Ejemplo**

![](./04-variables.%20var%2C%20let%2C%20const_images/image-001.png)

**🧱 let: alcance de bloque y mayor control**

let es la forma recomendada para variables que cambiarán, pero que deben estar **limitadas al bloque donde se declaran**.

**Características**

-   **Ámbito de bloque** (entre llaves { }).
-   **No permite redeclaración** en el mismo bloque.
-   **Permite reasignación**.
-   Tiene **zona muerta temporal**, evitando usarla antes de declararla.

**Ejemplo**

![](./04-variables.%20var%2C%20let%2C%20const_images/image-002.png)

**🧱 const: valores constantes (pero objetos mutables)**

const se usa para valores que **no deben reasignarse**, aunque el contenido interno de objetos y arrays sí puede cambiar.

**Características**

-   **Ámbito de bloque**.
-   **No permite redeclaración**.
-   **No permite reasignación**.
-   Ideal para valores fijos o referencias que no deben cambiar.

**Ejemplo**

![](./04-variables.%20var%2C%20let%2C%20const_images/image-003.png)

**🔍 Comparación clara entre var, let y const**

| **Característica** | **var** | **let** | **const** |
| --- | --- | --- | --- |
| Ámbito | Función / global | Bloque | Bloque |
| Redeclaración | Sí | No | No |
| Reasignación | Sí | Sí | No |
| Hoisting | Sí (valor undefined) | Sí (zona muerta) | Sí (zona muerta) |
| Uso recomendado | Evitar | Variables que cambian | Valores fijos o referencias |

**🧠 Cómo elegir entre var, let y const**

Las guías modernas recomiendan:

-   **Usar const por defecto** para evitar cambios accidentales.
-   **Usar let solo cuando el valor vaya a cambiar**.
-   **Evitar var** porque su alcance amplio y su hoisting pueden generar errores difíciles de detectar.

**📝 Resumen para estudiar**

-   var tiene alcance de función y permite redeclaración; es la opción menos segura.
-   let tiene alcance de bloque y permite reasignación, pero no redeclaración.
-   const también es de bloque, pero no permite reasignación.
-   La elección correcta mejora la legibilidad, evita errores y hace el código más predecible.