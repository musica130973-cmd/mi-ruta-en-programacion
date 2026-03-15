**3\. TIPOS DE DATOS BÁSICOS**

Python es un lenguaje **dinámicamente tipado**, lo que significa que no necesitas declarar el tipo de dato: Python lo detecta automáticamente según el valor que le asignes. Aun así, es fundamental conocer los tipos básicos para escribir código claro y evitar errores.

**🔢 1. Enteros (int)**

Los **enteros** representan números sin decimales.

Ejemplos:

![](./03-tipos%20de%20datos%20basicos_images/image-001.png)

Características:

-   No tienen límite de tamaño (Python los amplía automáticamente).
-   Se pueden usar en operaciones aritméticas.

Operaciones comunes:

![](./03-tipos%20de%20datos%20basicos_images/image-002.png)

**🔢 2. Flotantes (float)**

Los **flotantes** representan números con decimales.

Ejemplos:

![](./03-tipos%20de%20datos%20basicos_images/image-003.png)

Detalles importantes:

-   Usan punto . como separador decimal.
-   Pueden representar valores muy grandes o muy pequeños mediante notación científica:

![](./03-tipos%20de%20datos%20basicos_images/image-004.png)

**🔤 3. Cadenas de texto (str)**

Las **cadenas** representan texto. Se pueden escribir con comillas simples ' ' o dobles " ".

Ejemplos:

![](./03-tipos%20de%20datos%20basicos_images/image-005.png)

Operaciones útiles:

![](./03-tipos%20de%20datos%20basicos_images/image-006.png)

Acceso por índice:

![](./03-tipos%20de%20datos%20basicos_images/image-007.png)

Funciones comunes:

![](./03-tipos%20de%20datos%20basicos_images/image-008.png)

**🔘 4. Booleanos (bool)**

Los **booleanos** representan valores lógicos:

![](./03-tipos%20de%20datos%20basicos_images/image-009.png)

Se usan en condicionales, comparaciones y lógica de control.

Ejemplos:

![](./03-tipos%20de%20datos%20basicos_images/image-010.png)

Operadores lógicos:

![](./03-tipos%20de%20datos%20basicos_images/image-011.png)

**🧪 5. Conversión entre tipos (casting)**

Python permite convertir valores entre tipos:

![](./03-tipos%20de%20datos%20basicos_images/image-012.png)

Reglas importantes:

-   bool(0) es False, cualquier otro número es True.
-   Una cadena vacía "" es False, cualquier otra es True.

**🧠 6. Comprobación del tipo de dato**

Puedes comprobar el tipo con:

![](./03-tipos%20de%20datos%20basicos_images/image-013.png)

**📝 7. Buenas prácticas**

-   Usa nombres descriptivos para tus variables.
-   No mezcles tipos sin necesidad (ej: sumar texto con números).
-   Convierte tipos explícitamente cuando sea necesario.
-   Recuerda que Python es sensible a mayúsculas y minúsculas (True ≠ true).