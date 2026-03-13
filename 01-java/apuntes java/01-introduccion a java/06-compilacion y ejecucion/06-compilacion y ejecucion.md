**6\. COMPILACIÓN Y EJECUCIÓN**

**🧩 Qué ocurre al compilar y ejecutar un programa Java**

Java no se ejecuta directamente desde el código fuente. Pasa por dos fases clave:

-   **Compilación**: convierte el archivo .java en **bytecode** .class.
-   **Ejecución**: la **JVM** interpreta ese bytecode y lo ejecuta en el sistema operativo.

Este modelo es lo que permite la portabilidad entre plataformas.

**🛠️ Proceso de compilación en Java**

**1\. Escribir el código fuente**

El programador crea un archivo con extensión .java, por ejemplo:

![](./06-compilacion%20y%20ejecucion_images/image-001.png)

El nombre del archivo debe coincidir con el de la clase pública principal: Hola.java.

**2\. Compilar con javac**

El compilador de Java (javac) transforma el código fuente en bytecode.

Desde la terminal:

![](./06-compilacion%20y%20ejecucion_images/image-002.png)

Si no hay errores, se genera un archivo:

![](./06-compilacion%20y%20ejecucion_images/image-003.png)

Este archivo contiene bytecode, un formato intermedio independiente del sistema operativo.

**3\. Errores de compilación**

Si el código tiene errores de sintaxis, el compilador los mostrará indicando:

-   Línea del error
-   Tipo de error
-   Descripción del problema

Hasta que no se corrijan, no se generará el .class.

**▶️ Proceso de ejecución en Java**

**1\. Ejecutar con java**

Una vez compilado, se ejecuta el programa con:

![](./06-compilacion%20y%20ejecucion_images/image-004.png)

Importante: **no se escribe** .class **ni** .java, solo el nombre de la clase.

**2\. Qué hace la JVM**

La **Java Virtual Machine**:

-   Carga el bytecode del archivo .class.
-   Lo interpreta o lo compila a código máquina.
-   Gestiona la memoria y el *Garbage Collector*.
-   Ejecuta el método main.

**🧠 Relación entre compilación y ejecución**

-   javac → convierte código fuente en bytecode.
-   java → ejecuta el bytecode en la JVM.

Ambos forman parte del **JDK**, por lo que es necesario tenerlo instalado.

**🧪 Ejemplo completo paso a paso**

**Archivo: Saludo.java**

**![](./06-compilacion%20y%20ejecucion_images/image-005.png)**

**Compilar:**

**![](./06-compilacion%20y%20ejecucion_images/image-006.png)**

**Ejecutar:**

**![](./06-compilacion%20y%20ejecucion_images/image-007.png)**

**Resultado:**

**![](./06-compilacion%20y%20ejecucion_images/image-008.png)**

**📌 Compilación y ejecución con paquetes**

Si el archivo tiene un paquete:

![](./06-compilacion%20y%20ejecucion_images/image-009.png)

La estructura de carpetas debe coincidir:

![](./06-compilacion%20y%20ejecucion_images/image-010.png)

Compilación:

![](./06-compilacion%20y%20ejecucion_images/image-011.png)

Ejecución:

![](./06-compilacion%20y%20ejecucion_images/image-012.png)

**🧰 Compilación y ejecución en un IDE**

Los IDE como IntelliJ, Eclipse o VS Code automatizan este proceso:

-   Compilan automáticamente al guardar.
-   Ejecutan con un botón de “Run”.
-   Muestran errores de compilación en tiempo real.
-   Gestionan rutas, paquetes y dependencias.

Aun así, es importante conocer el proceso manual para entender cómo funciona Java internamente.

**📝 Resumen para estudiar**

-   La compilación transforma .java en .class mediante javac.
-   La ejecución usa java para correr el bytecode en la JVM.
-   El método main es el punto de entrada del programa.
-   Los IDE facilitan el proceso, pero la base es la misma.
-   Con paquetes, la estructura de carpetas y el comando de ejecución cambian.