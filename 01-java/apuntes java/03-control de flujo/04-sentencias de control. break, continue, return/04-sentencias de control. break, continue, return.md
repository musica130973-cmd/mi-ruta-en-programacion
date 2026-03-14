**4\. SENTENCIAS DE CONTROL: break, continue y return**

Las sentencias de control permiten **alterar el flujo normal de ejecución** dentro de bucles, estructuras de control y métodos. En Java, las más utilizadas son:

-   break
-   continue
-   return

Cada una tiene un propósito específico y es fundamental entenderlas para escribir código claro y eficiente.

**🔹 1. break**

La sentencia break sirve para **interrumpir por completo** un bucle o un switch. Cuando se ejecuta, el programa **sale inmediatamente** de la estructura en la que se encuentra.

**✔️ Uso en bucles**

![](./04-sentencias%20de%20control.%20break%2C%20continue%2C%20return_images/image-001.png)

Salida:

![](./04-sentencias%20de%20control.%20break%2C%20continue%2C%20return_images/image-002.png)

👉 Cuando i vale 5, el bucle se detiene.

✔️ Uso en switch

![](./04-sentencias%20de%20control.%20break%2C%20continue%2C%20return_images/image-003.png)

**🔹 2. continue**

La sentencia continue **no detiene el bucle**, sino que **salta a la siguiente iteración**. Es útil cuando quieres omitir parte del código bajo ciertas condiciones.

**✔️ Ejemplo básico**

![](./04-sentencias%20de%20control.%20break%2C%20continue%2C%20return_images/image-004.png)

Salida:

![](./04-sentencias%20de%20control.%20break%2C%20continue%2C%20return_images/image-005.png)

👉 Cuando i es 3, no se ejecuta el println.

✔️ Ejemplo con while

![](./04-sentencias%20de%20control.%20break%2C%20continue%2C%20return_images/image-006.png)

**🔹 3. return**

La sentencia return se utiliza para **salir de un método**. Puede devolver un valor (si el método no es void) o simplemente finalizar la ejecución.

**✔️ Ejemplo en un método que devuelve valor**

![](./04-sentencias%20de%20control.%20break%2C%20continue%2C%20return_images/image-007.png)

✔️ Ejemplo en un método void

![](./04-sentencias%20de%20control.%20break%2C%20continue%2C%20return_images/image-008.png)

**🔸 4. Diferencias entre break, continue y return**

| **Sentencia** | **Qué hace** | **Dónde se usa** |
| --- | --- | --- |
| **break** | Sale del bucle o switch | bucles y switch |
| **continue** | Salta a la siguiente iteración | bucles |
| **return** | Sale del método (puede devolver valor) | métodos |

**📌 Resumen para tus apuntes**

-   break → rompe el bucle o el switch.
-   continue → salta a la siguiente vuelta del bucle.
-   return → finaliza un método y opcionalmente devuelve un valor.
-   Son esenciales para controlar el flujo de ejecución y evitar código innecesario.