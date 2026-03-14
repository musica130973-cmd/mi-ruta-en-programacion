**7\. COMENTARIOS Y BUENAS PRÁCTICAS INICIALES**

**📝 Tipos de comentarios en JavaScript**

Los comentarios permiten añadir notas dentro del código sin afectar su ejecución. Son útiles para explicar intenciones, aclarar lógica compleja o desactivar temporalmente partes del programa.

**Comentario de una sola línea**

Se usa para anotaciones breves o aclaraciones rápidas.

![](./07-comentarios%20y%20buenas%20practicas%20iniciales_images/image-001.png)

**Comentario multilínea**

Sirve para explicaciones más largas, documentación o bloques de código desactivados.

![](./07-comentarios%20y%20buenas%20practicas%20iniciales_images/image-002.png)

**Comentarios de documentación (JSDoc)**

Se utilizan para documentar funciones, parámetros y retornos.

![](./07-comentarios%20y%20buenas%20practicas%20iniciales_images/image-003.png)

**📚 Cuándo usar comentarios**

Los comentarios deben aportar valor, no repetir lo que ya se entiende leyendo el código.

-   Explicar **por qué** se hace algo, no **qué** hace el código (eso debe ser evidente).
-   Documentar funciones, clases y módulos.
-   Aclarar decisiones técnicas o casos especiales.
-   Marcar tareas pendientes con etiquetas como TODO, FIXME o NOTE.

Ejemplo:

![](./07-comentarios%20y%20buenas%20practicas%20iniciales_images/image-004.png)

**🧩 Buenas prácticas iniciales en JavaScript**

Adoptar buenas prácticas desde el principio evita errores comunes y mejora la calidad del código.

**Nombres descriptivos**

Usar nombres claros para variables y funciones.

![](./07-comentarios%20y%20buenas%20practicas%20iniciales_images/image-005.png)

**Evitar el uso de var**

let y const son más seguros por su alcance de bloque.

-   const para valores que no cambian.
-   let para valores que sí cambian.

**Mantener un estilo consistente**

-   Usar siempre el mismo tipo de comillas.
-   Indentar correctamente.
-   Seguir un estilo uniforme (camelCase para variables y funciones).

**Código limpio y modular**

-   Dividir el código en funciones pequeñas.
-   Evitar duplicar lógica.
-   Mantener cada archivo con una responsabilidad clara.

**Evitar comentarios innecesarios**

Un comentario como este no aporta nada:

![](./07-comentarios%20y%20buenas%20practicas%20iniciales_images/image-006.png)

Usar comentarios para aclarar lógica compleja

![](./07-comentarios%20y%20buenas%20practicas%20iniciales_images/image-007.png)

**🔍 Comentarios y depuración**

Los comentarios ayudan a depurar, pero también es útil combinarlo con herramientas como:

-   console.log() para inspeccionar valores.
-   Comentarios temporales para desactivar código.
-   Notas para recordar qué se está probando.

Ejemplo:

![](./07-comentarios%20y%20buenas%20practicas%20iniciales_images/image-008.png)

**📝 Resumen para estudiar**

-   JavaScript permite comentarios de una línea, multilínea y de documentación.
-   Los comentarios deben explicar intenciones, no repetir el código.
-   Buenas prácticas: nombres claros, uso de let y const, estilo consistente, modularidad y evitar duplicación.
-   Los comentarios ayudan a depurar y a mantener el código legible a largo plazo.