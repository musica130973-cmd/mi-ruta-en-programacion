**4\. BUENAS PRÁCTICAS DE ORGANIZACIÓN**

Organizar bien el código es tan importante como que funcione. Un programa mal estructurado es difícil de mantener, ampliar y entender. Estas buenas prácticas te ayudarán a escribir código limpio, profesional y fácil de leer.

**🟦 1. Organización del proyecto**

**✔️ Usa una estructura de carpetas clara**

En Java, lo habitual es:

![](./04-buenas%20practicas%20de%20organizacion_images/image-001.png)

**✔️ Agrupa clases por paquetes**

Los paquetes ayudan a organizar el código por funcionalidad.

**Ejemplo:**

**![](./04-buenas%20practicas%20de%20organizacion_images/image-002.png)**

**🟩 2. Organización dentro de una clase**

**✔️ Orden recomendado de elementos**

Dentro de una clase, sigue este orden:

1.  Atributos
2.  Constructores
3.  Métodos públicos
4.  Métodos privados
5.  Métodos auxiliares

**Ejemplo:**

**![](./04-buenas%20practicas%20de%20organizacion_images/image-003.png)**

**🟦 3. Nombres claros y significativos**

**✔️ Para clases**

**Usa nombres en PascalCase:**

-   **Persona**
-   **Calculadora**
-   **GestorUsuarios**

**✔️ Para métodos y variables**

**Usa camelCase:**

-   **calcularEdad()**
-   **numeroClientes**
-   **obtenerNombreCompleto()**

**✔️ Evita abreviaturas confusas**

**❌ calcEd() ✔️ calcularEdad()**

**🟩 4. Métodos cortos y con una sola responsabilidad**

**Un método debe hacer una sola cosa.**

**❌ Método largo que hace demasiadas cosas ✔️ Divide en métodos pequeños y reutilizables**

**Ejemplo:**

**![](./04-buenas%20practicas%20de%20organizacion_images/image-004.png)**

**🟦 5. Comentarios útiles (no obvios)**

**✔️ Comenta el *por qué*, no el *qué***

**❌**

**![](./04-buenas%20practicas%20de%20organizacion_images/image-005.png)**

**✔️**

**![](./04-buenas%20practicas%20de%20organizacion_images/image-006.png)**

**✔️ Usa JavaDoc para métodos públicos**

**![](./04-buenas%20practicas%20de%20organizacion_images/image-007.png)**

**🟩 6. Evita duplicar código (DRY)**

**DRY = Don't Repeat Yourself**

**Si repites código:**

-   **crea un método**
-   **usa una clase auxiliar**
-   **extrae lógica común**

**🟦 7. Usa constantes cuando sea necesario**

**![](./04-buenas%20practicas%20de%20organizacion_images/image-008.png)**

**Evita números mágicos:**

**❌ precio = cantidad \* 1.21;**

**✔️ precio = cantidad \* IVA;**

**🟩 8. Manejo adecuado de errores**

-   Usa try/catch solo cuando sea necesario
-   Lanza excepciones claras
-   No ocultes errores

![](./04-buenas%20practicas%20de%20organizacion_images/image-009.png)

**🟦 9. Mantén el código limpio**

-   Elimina código comentado que ya no sirve
-   Usa sangría consistente
-   Deja espacios en blanco para separar bloques lógicos
-   Formatea el código (IntelliJ lo hace con **Ctrl + Alt + L**)

**📌 Resumen**

-   Organiza el proyecto en paquetes y carpetas claras.
-   Dentro de una clase, sigue un orden lógico (atributos → constructores → métodos).
-   Usa nombres descriptivos y consistentes.
-   Métodos cortos y con una sola responsabilidad.
-   Comenta solo lo necesario y usa JavaDoc.
-   Evita duplicar código (DRY).
-   Usa constantes para valores fijos.
-   Mantén el código limpio y legible.