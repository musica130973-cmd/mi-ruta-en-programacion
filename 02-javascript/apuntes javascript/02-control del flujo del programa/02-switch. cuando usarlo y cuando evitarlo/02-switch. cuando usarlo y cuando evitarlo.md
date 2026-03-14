**2\. SWITCH: CUÁNDO USARLO Y CUÁNDO EVITARLO**

**🔀 switch en JavaScript**

**El switch es una estructura de control que permite ejecutar diferentes bloques de código según el valor de una expresión. Es una alternativa a múltiples if...else if.**

**🟢 ¿Cuándo usar switch?**

**✅ 1. Cuando tienes muchas condiciones basadas en el mismo valor**

**Si estás comparando una misma variable contra múltiples valores posibles, switch hace el código más limpio.**

**Ejemplo típico:**

**![](./02-switch.%20cuando%20usarlo%20y%20cuando%20evitarlo_images/image-001.png)**

**✅ 2. Cuando los valores son constantes y conocidos**

**Ideal para:**

-   **Menús**
-   **Estados de una máquina de estados**
-   **Tipos de eventos**
-   **Códigos numéricos o cadenas fijas**

**✅ 3. Cuando buscas legibilidad**

**Un switch bien organizado es más fácil de leer que una cadena larga de if...else if.**

**Ejemplo:**

**![](./02-switch.%20cuando%20usarlo%20y%20cuando%20evitarlo_images/image-002.png)**

**🔴 ¿Cuándo evitar switch?**

**❌ 1. Cuando las condiciones no dependen del mismo valor**

**Si cada condición evalúa cosas distintas, if...else es más natural.**

**Ejemplo donde NO usar switch:**

**![](./02-switch.%20cuando%20usarlo%20y%20cuando%20evitarlo_images/image-003.png)**

**❌ 2. Cuando necesitas comparaciones complejas**

**switch solo compara igualdad estricta (===). No sirve para:**

-   **rangos**
-   **condiciones lógicas**
-   **expresiones booleanas**

**Ejemplo imposible con switch:**

**![](./02-switch.%20cuando%20usarlo%20y%20cuando%20evitarlo_images/image-004.png)**

**❌ 3. Cuando puede crecer demasiado**

**Un switch con 20–30 casos se vuelve difícil de mantener.**

**En esos casos es mejor usar:**

-   **objetos como mapas**
-   **diccionarios de funciones**

**Ejemplo más elegante que un switch gigante:**

**![](./02-switch.%20cuando%20usarlo%20y%20cuando%20evitarlo_images/image-005.png)**

**❌ 4. Cuando olvidarte un break puede causar errores**

**El famoso *fall-through* puede generar bugs difíciles de detectar.**

**Ejemplo peligroso:**

**![](./02-switch.%20cuando%20usarlo%20y%20cuando%20evitarlo_images/image-006.png)**

**Esto imprime Uno y Dos, aunque x sea 1.**

**🧠 Ventajas y desventajas del switch**

| **✔️ Ventajas** | **❌ Desventajas** |
| --- | --- |
| **Más legible que muchos if...else** | **Fácil olvidar break** |
| **Ideal para valores fijos** | **No sirve para rangos o condiciones complejas** |
| **Rápido y claro en menús o estados** | **Puede crecer demasiado** |
| **Permite agrupar casos** | **Menos flexible que if** |

**🧩 Ejemplo integrador**

**Con switch (buena elección)**

**![](./02-switch.%20cuando%20usarlo%20y%20cuando%20evitarlo_images/image-007.png)**

**Con if (mejor elección)**

**![](./02-switch.%20cuando%20usarlo%20y%20cuando%20evitarlo_images/image-008.png)**

**🎯 Conclusión**

**Usa switch cuando:**

-   **Comparas una misma variable contra muchos valores fijos**
-   **Quieres orden y claridad**
-   **Las condiciones son simples y directas**

**Evítalo cuando:**

-   **Las condiciones son complejas o variadas**
-   **Necesitas rangos o lógica avanzada**
-   **El número de casos es enorme**