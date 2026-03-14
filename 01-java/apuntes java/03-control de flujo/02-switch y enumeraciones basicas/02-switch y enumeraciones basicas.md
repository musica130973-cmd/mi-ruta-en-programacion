**2\. SENTENCIA switch Y ENUMERACIONES (enum)**

La sentencia switch y las **enumeraciones (**enum**)** son herramientas muy útiles en Java para organizar decisiones múltiples y representar conjuntos de valores fijos de forma clara y segura.

**🎛️ 1. Sentencia switch**

La sentencia switch permite evaluar una variable y ejecutar diferentes bloques de código según su valor. Es una alternativa más limpia y legible que usar muchos if - else if.

**✔️ Estructura básica**

![](./02-switch%20y%20enumeraciones%20basicas_images/image-001.png)

**🔹 Explicación rápida**

-   switch (variable) → valor que se evalúa
-   case → cada posible valor
-   break → evita que el código “caiga” al siguiente caso
-   default → se ejecuta si no coincide ningún case (opcional pero recomendable)

✔️ Ejemplo sencillo

![](./02-switch%20y%20enumeraciones%20basicas_images/image-002.png)

**🆕 2. Switch mejorado (Java 14+)**

Java introdujo una versión más moderna del switch, más compacta y segura.

**✔️ Ejemplo con flechas (->)**

![](./02-switch%20y%20enumeraciones%20basicas_images/image-003.png)

✔️ Switch que devuelve un valor

![](./02-switch%20y%20enumeraciones%20basicas_images/image-004.png)

**🧩 3. Enumeraciones (enum)**

Una **enumeración** es un tipo especial que representa un conjunto fijo de valores. Sirve para evitar errores y hacer el código más claro.

✔️ Ejemplo básico de enum

![](./02-switch%20y%20enumeraciones%20basicas_images/image-005.png)

✔️ Uso de un enum

![](./02-switch%20y%20enumeraciones%20basicas_images/image-006.png)

**🔗 4. Switch + enum (combinación perfecta)**

Los enum funcionan de maravilla con switch, porque garantizan que solo se usen valores válidos.

**✔️ Ejemplo**

![](./02-switch%20y%20enumeraciones%20basicas_images/image-007.png)

**📌 Resumen**

**Switch**

-   Evalúa múltiples casos de forma ordenada.
-   Más limpio que muchos if - else.
-   Puede usar sintaxis clásica o moderna.
-   Puede devolver valores.

**Enum**

-   Representa un conjunto fijo de valores.
-   Evita errores al usar constantes.
-   Se integra perfectamente con switch.