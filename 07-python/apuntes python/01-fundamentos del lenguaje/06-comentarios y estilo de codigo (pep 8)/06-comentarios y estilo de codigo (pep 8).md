**6\. COMENTARIOS Y ESTILO DE CÓDIGO (PEP 8)**

Escribir código que funcione es importante, pero escribir código **legible, limpio y mantenible** es igual de esencial. Python tiene una guía oficial de estilo llamada **PEP 8**, que establece buenas prácticas para escribir código claro y consistente.

**💬 1. Comentarios en Python**

Los comentarios sirven para **explicar el código**, aclarar decisiones o dejar notas para otros desarrolladores (o para ti mismo en el futuro).

**🔸 Comentarios de una sola línea**

Se escriben con #.

![](./06-comentarios%20y%20estilo%20de%20codigo%20(pep%208)_images/image-001.png)

**Buenas prácticas:**

-   Sé breve y claro.
-   No expliques lo obvio.
-   Úsalos para aclarar *por qué* haces algo, no *qué* hace el código.

❌ Malo:

![](./06-comentarios%20y%20estilo%20de%20codigo%20(pep%208)_images/image-002.png)

✔️ Bueno:

![](./06-comentarios%20y%20estilo%20de%20codigo%20(pep%208)_images/image-003.png)

**🔸 Comentarios multilínea**

Python no tiene comentarios multilínea como tal, pero se suelen usar varias líneas con #:

![](./06-comentarios%20y%20estilo%20de%20codigo%20(pep%208)_images/image-004.png)

**🔸 Docstrings (comentarios para funciones y módulos)**

Los **docstrings** documentan funciones, clases o módulos. Se escriben con triple comilla """ """.

![](./06-comentarios%20y%20estilo%20de%20codigo%20(pep%208)_images/image-005.png)

Puedes verlos con:

![](./06-comentarios%20y%20estilo%20de%20codigo%20(pep%208)_images/image-006.png)

**🎨 2. Estilo de código según PEP 8**

PEP 8 es la guía oficial de estilo de Python. Su objetivo es que el código sea **legible, uniforme y fácil de mantener**.

**📏 2.1. Identación**

Python usa **4 espacios** por nivel de indentación. Nunca uses tabulaciones mezcladas con espacios.

![](./06-comentarios%20y%20estilo%20de%20codigo%20(pep%208)_images/image-007.png)

**📐 2.2. Longitud de línea**

-   Máximo recomendado: **79 caracteres por línea**.
-   Para docstrings y comentarios: **72 caracteres**.

**🧩 2.3. Espacios en blanco**

**✔️ Correcto:**

![](./06-comentarios%20y%20estilo%20de%20codigo%20(pep%208)_images/image-008.png)

❌ Incorrecto:

![](./06-comentarios%20y%20estilo%20de%20codigo%20(pep%208)_images/image-009.png)

Reglas importantes:

-   Espacio después de coma: funcion(a, b, c)
-   No pongas espacios dentro de paréntesis: ( x + y ) ❌

**🔤 2.4. Nombres de variables y funciones**

PEP 8 recomienda:

| **Elemento** | **Estilo** |
| --- | --- |
| Variables | minusculas_con_guiones_bajos |
| Funciones | minusculas_con_guiones_bajos |
| Clases | CamelCase |
| Constantes | MAYÚSCULAS_CON_GUIONES |

Ejemplos:

![](./06-comentarios%20y%20estilo%20de%20codigo%20(pep%208)_images/image-010.png)

**📚 2.5. Organización del código**

Orden recomendado:

1.  Importaciones
2.  Constantes
3.  Funciones
4.  Clases
5.  Código principal dentro de

![](./06-comentarios%20y%20estilo%20de%20codigo%20(pep%208)_images/image-011.png)

**🔌 2.6. Importaciones**

-   Una importación por línea.
-   Orden: estándar → terceros → locales.

![](./06-comentarios%20y%20estilo%20de%20codigo%20(pep%208)_images/image-012.png)

**🧠 3. Herramientas para aplicar PEP 8**

Puedes usar herramientas que revisan tu código automáticamente:

-   **flake8**
-   **pylint**
-   **black** (formateador automático)
-   **autopep8**

Ejemplo de instalación:

![](./06-comentarios%20y%20estilo%20de%20codigo%20(pep%208)_images/image-013.png)

**📝 4. Buenas prácticas generales**

-   Escribe código para humanos, no solo para máquinas.
-   Usa nombres descriptivos.
-   Evita líneas demasiado largas.
-   Documenta funciones con docstrings.
-   Comenta *por qué*, no *qué*.
-   Mantén un estilo consistente en todo el proyect