**2\. EJECUCIÓN DE SCRIPTS Y USO DEL INTÉRPRETE INTERACTIVO**

**🧩 1. ¿Qué es el intérprete de Python?**

**El intérprete de Python es el programa que ejecuta el código línea por línea. Puedes usarlo de dos formas:**

-   **Modo interactivo (REPL) → ideal para probar código rápido.**
-   **Modo script → ejecutar archivos .py completos.**

**Ambos modos son esenciales en el día a día de cualquier programador Python.**

**🖥️ 2. Uso del intérprete interactivo (REPL)**

**El REPL (Read–Eval–Print Loop) permite escribir código y ver el resultado al instante.**

**Cómo abrirlo**

**Windows**

**![](./02-ejecucion%20de%20scripts%20y%20uso%20del%20interprete%20interactivo_images/image-001.png)**

**macOS / Linux**

**![](./02-ejecucion%20de%20scripts%20y%20uso%20del%20interprete%20interactivo_images/image-002.png)**

Si ves algo como esto, estás dentro:

![](./02-ejecucion%20de%20scripts%20y%20uso%20del%20interprete%20interactivo_images/image-003.png)

**¿Para qué sirve el REPL?**

-   Probar funciones rápidamente
-   Hacer cálculos
-   Explorar librerías
-   Depurar pequeños fragmentos de código
-   Aprender sintaxis sin crear archivos

**Ejemplos útiles**

![](./02-ejecucion%20de%20scripts%20y%20uso%20del%20interprete%20interactivo_images/image-004.png)

**Salir del intérprete**

**![](./02-ejecucion%20de%20scripts%20y%20uso%20del%20interprete%20interactivo_images/image-005.png)**

O

![](./02-ejecucion%20de%20scripts%20y%20uso%20del%20interprete%20interactivo_images/image-006.png)

**📄 3. Ejecución de scripts en Python**

Un **script** es un archivo con extensión .py que contiene código ejecutable.

Ejemplo de archivo hola.py:

![](./02-ejecucion%20de%20scripts%20y%20uso%20del%20interprete%20interactivo_images/image-007.png)

**Ejecutar un script**

**Windows**

![](./02-ejecucion%20de%20scripts%20y%20uso%20del%20interprete%20interactivo_images/image-008.png)

macOS / Linux

![](./02-ejecucion%20de%20scripts%20y%20uso%20del%20interprete%20interactivo_images/image-009.png)

**¿Qué ocurre al ejecutar un script?**

-   Python lee el archivo
-   Lo interpreta línea por línea
-   Ejecuta las instrucciones en orden
-   Finaliza cuando llega al final del archivo

**🧠 4. Diferencias entre REPL y scripts**

| **REPL** | **Script** |
| --- | --- |
| Ideal para pruebas rápidas | Ideal para programas completos |
| No guarda el código | El código queda almacenado |
| Se ejecuta línea a línea | Se ejecuta todo el archivo |
| Perfecto para aprender | Perfecto para proyectos |

**🧪 5. Ejecutar scripts desde cualquier carpeta**

Si estás dentro de la carpeta del archivo:

![](./02-ejecucion%20de%20scripts%20y%20uso%20del%20interprete%20interactivo_images/image-010.png)

Si estás en otra carpeta:

**![](./02-ejecucion%20de%20scripts%20y%20uso%20del%20interprete%20interactivo_images/image-011.png)**

En Linux/macOS puedes usar rutas relativas:

![](./02-ejecucion%20de%20scripts%20y%20uso%20del%20interprete%20interactivo_images/image-012.png)

**🧰 6. Ejecutar scripts con argumentos**

Python permite pasar valores desde la terminal:

![](./02-ejecucion%20de%20scripts%20y%20uso%20del%20interprete%20interactivo_images/image-013.png)

Dentro del script:

![](./02-ejecucion%20de%20scripts%20y%20uso%20del%20interprete%20interactivo_images/image-014.png)

Salida:

![](./02-ejecucion%20de%20scripts%20y%20uso%20del%20interprete%20interactivo_images/image-015.png)

Esto es útil para automatización y herramientas de consola.

**🧪 7. Ejecutar scripts como ejecutables (Linux/macOS)**

1.  Añade la línea shebang al inicio del archivo:

![](./02-ejecucion%20de%20scripts%20y%20uso%20del%20interprete%20interactivo_images/image-016.png)

2\. Dale permisos de ejecución:

![](./02-ejecucion%20de%20scripts%20y%20uso%20del%20interprete%20interactivo_images/image-017.png)

3\. Ejecútalo directamente:

![](./02-ejecucion%20de%20scripts%20y%20uso%20del%20interprete%20interactivo_images/image-018.png)

**🧠 8. Buenas prácticas**

-   Usa el REPL para probar ideas antes de escribir código definitivo.
-   Mantén tus scripts organizados en carpetas.
-   Usa nombres descriptivos para tus archivos .py.
-   Evita ejecutar scripts desde rutas confusas.
-   Usa if \_\_name\_\_ == "\_\_main\_\_": para controlar la ejecución del script.

Ejemplo:

![](./02-ejecucion%20de%20scripts%20y%20uso%20del%20interprete%20interactivo_images/image-019.png)