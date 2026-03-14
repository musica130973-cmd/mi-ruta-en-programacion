**4\. CONVERSIÓN DE TIPOS (CASTING)**

En Java, cada dato tiene un **tipo** (int, double, char, boolean, etc.). A veces necesitamos convertir un valor de un tipo a otro, y para eso existe el **casting**. La conversión puede ser **automática** o **forzada**, dependiendo de si Java puede garantizar que no habrá pérdida de información.

**🔄 1. Conversión implícita (Widening Casting)**

También llamada **conversión automática**. Ocurre cuando convertimos un tipo **pequeño** a uno **más grande**, es decir, con mayor capacidad.

Java lo hace sin que tú tengas que indicar nada.

**✔️ Tipos de menor a mayor capacidad:**

![](./04-conversion%20de%20tipos%20(casting)_images/image-001.png)

✔️ Ejemplo:

![](./04-conversion%20de%20tipos%20(casting)_images/image-002.png)

**Por qué funciona:** Un double puede almacenar cualquier valor que cabe en un int, así que no hay riesgo.

**⚠️ 2. Conversión explícita (Narrowing Casting)**

También llamada **casting forzado**. Se usa cuando convertimos un tipo **más grande** a uno **más pequeño**, lo cual puede provocar **pérdida de información**.

Java exige que lo indiques manualmente.

**✔️ Ejemplo:**

![](./04-conversion%20de%20tipos%20(casting)_images/image-003.png)

**Resultado:** num vale **9**, porque se pierden los decimales.

**🧠 ¿Cuándo es obligatorio usar casting?**

-   Cuando pasas de double a int
-   Cuando pasas de long a short
-   Cuando conviertes un char a un tipo numérico más pequeño
-   Cuando trabajas con operaciones entre tipos distintos

**Ejemplo:**

![](./04-conversion%20de%20tipos%20(casting)_images/image-004.png)

**🔤 3. Casting entre tipos numéricos y char**

En Java, los caracteres (char) se representan con códigos Unicode, por lo que pueden convertirse a números y viceversa.

**✔️ Ejemplo char → int:**

![](./04-conversion%20de%20tipos%20(casting)_images/image-005.png)

✔️ Ejemplo int → char:

![](./04-conversion%20de%20tipos%20(casting)_images/image-006.png)

**🧩 4. Casting en expresiones**

Cuando mezclas tipos en una operación, Java convierte automáticamente al tipo más grande.

**Ejemplo:**

![](./04-conversion%20de%20tipos%20(casting)_images/image-007.png)

Si quieres forzar un tipo concreto:

![](./04-conversion%20de%20tipos%20(casting)_images/image-008.png)

**🚫 5. Casting NO permitido**

No se puede convertir entre tipos incompatibles, como:

-   boolean ↔ numéricos
-   String ↔ numéricos (sin métodos especiales)

Ejemplo incorrecto:

![](./04-conversion%20de%20tipos%20(casting)_images/image-009.png)

Para eso se usan métodos como:

![](./04-conversion%20de%20tipos%20(casting)_images/image-010.png)

**📌 Resumen**

-   **Widening (implícito):** seguro, automático, sin pérdida.
-   **Narrowing (explícito):** manual, puede perder datos.
-   **char ↔ numéricos:** permitido mediante códigos Unicode.
-   **boolean:** no se puede convertir a otros tipos.
-   **String:** requiere métodos especiales, no casting.