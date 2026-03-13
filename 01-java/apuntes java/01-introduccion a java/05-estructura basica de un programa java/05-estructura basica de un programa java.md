**5\. ESTRUCTURA BÁSICA DE UN PROGRAMA JAVA**

Un programa en Java tiene una estructura muy definida. Aunque con el tiempo aprenderás muchas variantes, todos los programas comparten estos elementos esenciales:

**🟦 1. El archivo .java**

Todo programa empieza en un archivo cuyo nombre debe coincidir con el nombre de la clase pública.

Ejemplo:

![](./05-estructura%20basica%20de%20un%20programa%20java_images/image-001.png)

**🟩 2. La clase**

Java es un lenguaje orientado a objetos, así que **todo el código debe estar dentro de una clase**.

Ejemplo básico:

![](./05-estructura%20basica%20de%20un%20programa%20java_images/image-002.png)

-   public → indica que la clase es accesible desde cualquier parte.
-   class → palabra clave para definir una clase.
-   HolaMundo → nombre de la clase (debe coincidir con el nombre del archivo).

**🟧 3. El método main**

Es el punto de entrada del programa.

Cuando ejecutas un programa Java, **la JVM busca este método**:

![](./05-estructura%20basica%20de%20un%20programa%20java_images/image-003.png)

Significado de cada parte:

-   public → accesible desde cualquier parte.
-   static → no necesita crear un objeto para ejecutarse.
-   void → no devuelve ningún valor.
-   main → nombre obligatorio del método de entrada.
-   String\[\] args → argumentos que se pueden pasar desde la consola.

**🟨 4. Instrucciones dentro del método main**

Dentro del main escribes las acciones que quieres que el programa realice.

Ejemplo:

![](./05-estructura%20basica%20de%20un%20programa%20java_images/image-004.png)

System.out.println() → imprime texto en la consola.

🟪 5. **Ejemplo completo de un programa Java**

![](./05-estructura%20basica%20de%20un%20programa%20java_images/image-005.png)

Este es el programa más simple posible en Java.

**🟫 6. Reglas importantes**

-   El nombre del archivo debe coincidir con el nombre de la clase pública. Ejemplo: public class HolaMundo → archivo: HolaMundo.java
-   Java es sensible a mayúsculas y minúsculas.
-   Cada instrucción termina con ;
-   Las llaves { } delimitan bloques de código.

**🟦 7. Resumen rápido**

Un programa Java siempre tiene:

1.  Un archivo .java
2.  Una clase
3.  Un método main
4.  Instrucciones dentro del main