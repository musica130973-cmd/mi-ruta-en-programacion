**5\. ENTRADA Y SALIDA BÁSICA (SCANNER Y SYSTEM.OUT)**

En Java, la comunicación con el usuario se realiza principalmente mediante dos mecanismos:

-   **Salida de datos:** mostrar información en pantalla → System.out
-   **Entrada de datos:** leer información que escribe el usuario → Scanner

Dominar estas dos herramientas es esencial para cualquier programa interactivo.

**📤 1. Salida de datos con System.out**

System.out es el objeto que Java utiliza para mostrar texto en la consola.

**✔️ Métodos principales**

| **Método** | **Descripción** |
| --- | --- |
| **System.out.print()** | **Imprime texto sin salto de línea** |
| **System.out.println()** | **Imprime texto con salto de línea** |
| **System.out.printf()** | **Imprime texto formateado (similar a C)** |

**✔️ Ejemplos**

**![](./05-entrada%20y%20salida%20basica%20(scanner%2C%20system.out)_images/image-001.png)**

**Salida:**

**![](./05-entrada%20y%20salida%20basica%20(scanner%2C%20system.out)_images/image-002.png)**

**📥 2. Entrada de datos con Scanner**

Para leer datos del usuario, Java utiliza la clase Scanner, que forma parte del paquete java.util.

**✔️ Cómo se declara**

**![](./05-entrada%20y%20salida%20basica%20(scanner%2C%20system.out)_images/image-003.png)**

**System.in indica que la entrada proviene del teclado.**

**🧾 3. Métodos más usados de Scanner**

| **Método** | **Tipo que lee** | **Ejemplo** |
| --- | --- | --- |
| **nextInt()** | **Entero** | **int edad = sc.nextInt();** |
| **nextDouble()** | **Decimal** | **double nota = sc.nextDouble();** |
| **next()** | **Palabra (hasta espacio)** | **String nombre = sc.next();** |
| **nextLine()** | **Línea completa** | **String frase = sc.nextLine();** |
| **nextBoolean()** | **true/false** | **boolean activo = sc.nextBoolean();** |

**⚠️ 4. Problema común: nextLine() después de números**

Cuando lees un número y luego quieres leer una línea completa, puede quedar un salto de línea pendiente en el buffer.

**Ejemplo del problema:**

**![](./05-entrada%20y%20salida%20basica%20(scanner%2C%20system.out)_images/image-004.png)**

**✔️ Solución:**

**![](./05-entrada%20y%20salida%20basica%20(scanner%2C%20system.out)_images/image-005.png)**

**🧩 5. Ejemplo completo de entrada y salida**

**![](./05-entrada%20y%20salida%20basica%20(scanner%2C%20system.out)_images/image-006.png)**

**📌 Resumen**

-   **System.out se usa para mostrar datos en pantalla.**
-   **print, println y printf son los métodos más comunes.**
-   **Scanner permite leer datos del usuario desde el teclado.**
-   **Métodos clave: nextInt, nextDouble, nextLine, nextBoolean.**
-   **Cuidado con el salto de línea al mezclar nextInt() y nextLine().**
-   **Siempre es buena práctica cerrar el Scanner con sc.close().**