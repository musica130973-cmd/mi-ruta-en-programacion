**3\. BUCLES: for, while, do while**

Los **bucles** permiten repetir un bloque de código varias veces. Son fundamentales para automatizar tareas, recorrer datos y controlar flujos repetitivos dentro de un programa.

En Java existen tres bucles principales:

-   for
-   while
-   do while

Cada uno tiene su uso ideal según la situación.

**🔹 1. Bucle for**

El bucle for se utiliza cuando **sabemos cuántas veces queremos repetir** una acción. Es muy común para recorrer rangos de números o arrays.

**✔️ Estructura**

![](./03-bucles.%20for%2C%20while%2C%20do%20while_images/image-001.png)

**Explicación:**

-   **inicialización:** se ejecuta una vez al inicio
-   **condición:** mientras sea true, el bucle continúa
-   **actualización:** se ejecuta al final de cada iteración

✔️ Ejemplo básico

![](./03-bucles.%20for%2C%20while%2C%20do%20while_images/image-002.png)

Salida:

![](./03-bucles.%20for%2C%20while%2C%20do%20while_images/image-003.png)

✔️ Bucle for decreciente

![](./03-bucles.%20for%2C%20while%2C%20do%20while_images/image-004.png)

**✔️ for mejorado (for-each)**

Ideal para recorrer arrays o colecciones.

![](./03-bucles.%20for%2C%20while%2C%20do%20while_images/image-005.png)

**🔹 2. Bucle while**

El bucle while se usa cuando **no sabemos cuántas veces se repetirá** la acción, pero depende de una condición.

**✔️ Estructura**

![](./03-bucles.%20for%2C%20while%2C%20do%20while_images/image-006.png)

✔️ Ejemplo

![](./03-bucles.%20for%2C%20while%2C%20do%20while_images/image-007.png)

✔️ Uso típico: leer datos hasta que el usuario escriba algo concreto

![](./03-bucles.%20for%2C%20while%2C%20do%20while_images/image-008.png)

**🔹 3. Bucle do while**

El bucle do while es similar al while, pero con una diferencia clave:

👉 **El código se ejecuta al menos una vez**, porque la condición se evalúa al final.

**✔️ Estructura**

![](./03-bucles.%20for%2C%20while%2C%20do%20while_images/image-009.png)

✔️ Ejemplo

![](./03-bucles.%20for%2C%20while%2C%20do%20while_images/image-010.png)

✔️ Ejemplo típico: menú interactivo

![](./03-bucles.%20for%2C%20while%2C%20do%20while_images/image-011.png)

**🔸 4. Diferencias entre for, while y do while**

| **Bucle** | **Cuándo usarlo** | **Característica principal** |
| --- | --- | --- |
| **for** | Cuando sabemos cuántas veces se repite | Control total en una sola línea |
| **while** | Cuando depende de una condición | Puede no ejecutarse nunca |
| **do while** | Cuando debe ejecutarse al menos una vez | La condición se evalúa al final |

**📌 Resumen**

-   **for:** ideal para repeticiones contadas y recorridos.
-   **while:** se ejecuta mientras la condición sea verdadera.
-   **do while:** garantiza una ejecución inicial.
-   Los bucles permiten automatizar tareas repetitivas.
-   Cuidado con los **bucles infinitos** (cuando la condición nunca cambia).