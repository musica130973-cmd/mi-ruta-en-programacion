**5\. ENTRADA Y SALIDA DE DATOS**

La **entrada y salida de datos** (I/O) es fundamental en cualquier lenguaje de programación. En Python, la entrada permite recibir información del usuario, y la salida permite mostrar resultados en pantalla.

**⌨️ 1. Entrada de datos: input()**

La función input() permite **leer datos desde el teclado**.

**Sintaxis:**

![](./05-entrada%20y%20salida%20de%20datos_images/image-001.png)

Ejemplo:

![](./05-entrada%20y%20salida%20de%20datos_images/image-002.png)

**Importante:**

input() **siempre devuelve una cadena (str)**, incluso si el usuario escribe números.

Si necesitas convertirlo:

![](./05-entrada%20y%20salida%20de%20datos_images/image-003.png)

**🔄 2. Conversión de tipos en la entrada**

Como input() devuelve texto, es común convertirlo:

| **Tipo** | **Conversión** |
| --- | --- |
| Entero | int() |
| Decimal | float() |
| Booleano | bool() (no recomendado directamente) |
| Texto | str() (ya lo es) |

Ejemplo:

![](./05-entrada%20y%20salida%20de%20datos_images/image-004.png)

**🖨️ 3. Salida de datos: print()**

La función print() muestra información en pantalla.

**Ejemplos básicos:**

**![](./05-entrada%20y%20salida%20de%20datos_images/image-005.png)**

**Múltiples valores:**

**![](./05-entrada%20y%20salida%20de%20datos_images/image-006.png)**

**Separadores personalizados:**

**![](./05-entrada%20y%20salida%20de%20datos_images/image-007.png)**

**Evitar salto de línea:**

**![](./05-entrada%20y%20salida%20de%20datos_images/image-008.png)**

**🧩 4. Formateo de cadenas (muy importante)**

**Python ofrece varias formas de mostrar texto con variables.**

**🔸 4.1. Concatenación**

**![](./05-entrada%20y%20salida%20de%20datos_images/image-009.png)**

**🔸 4.2. Formateo con format()**

**![](./05-entrada%20y%20salida%20de%20datos_images/image-010.png)**

**🔸 4.3. f-strings (recomendado)**

**Introducido en Python 3.6.**

**![](./05-entrada%20y%20salida%20de%20datos_images/image-011.png)**

**Ventajas:**

-   **Más rápido**
-   **Más legible**
-   **Permite expresiones dentro del texto**

**![](./05-entrada%20y%20salida%20de%20datos_images/image-012.png)**

**🧪 5. Entrada y salida combinadas**

**Ejemplo completo:**

**![](./05-entrada%20y%20salida%20de%20datos_images/image-013.png)**

**🧠 6. Errores comunes**

**❌ Olvidar convertir la entrada a número**

**![](./05-entrada%20y%20salida%20de%20datos_images/image-014.png)**

✔️ **Solución:**

![](./05-entrada%20y%20salida%20de%20datos_images/image-015.png)

❌ **Usar** int() **con valores no numéricos**

![](./05-entrada%20y%20salida%20de%20datos_images/image-016.png)

✔️ **Solución:** validar antes o usar try/except.

**📝 7. Buenas prácticas**

-   Usa **f-strings** para formatear texto.
-   Convierte la entrada al tipo correcto antes de usarla.
-   Muestra mensajes claros al usuario.
-   Evita concatenar números y texto sin convertirlos.
-   Usa end="" y sep="" cuando necesites controlar el formato.