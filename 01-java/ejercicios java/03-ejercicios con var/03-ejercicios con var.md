**3\. EJERCICIOS CON var**

**Ejercicio 1. Declaración básica con var**

Declara variables usando var y observa qué tipo infiere Java.

![](./03-ejercicios%20con%20var_images/image-001.png)

**Solución / Explicación:**

-   numero → tipo inferido: **int**
-   texto → tipo inferido: **String**
-   decimal → tipo inferido: **double**

Java infiere el tipo según el valor asignado.

**Ejercicio 2. Operaciones con var**

Sirve para verificar si un objeto pertenece a un tipo concreto.

![](./03-ejercicios%20con%20var_images/image-002.png)

**Solución / Explicación:**

-   a y b son **int**
-   resultado también es **int**, porque la suma de dos enteros produce un entero.

**Ejercicio 3. Listas con var**

![](./03-ejercicios%20con%20var_images/image-003.png)

**Solución / Explicación:**

-   lista → tipo inferido: **ArrayList<String>** Java toma el tipo del constructor que aparece a la derecha.

**Ejercicio 4. Bucle for-each con var**

![](./03-ejercicios%20con%20var_images/image-004.png)

**Solución / Explicación:**

-   nombres → tipo inferido: **List<String>**
-   nombre → tipo inferido: **String**, porque cada elemento de la lista es un String.

**Ejercicio 5. Objetos con var**

**![](./03-ejercicios%20con%20var_images/image-005.png)**

**Solución / Explicación:**

sb → tipo inferido: **StringBuilder** Java detecta el tipo según el constructor usado.

**Ejercicio 6. Error con var y null**

![](./03-ejercicios%20con%20var_images/image-006.png)

**Explicación:**

-   Java **no puede inferir el tipo** porque null no tiene tipo concreto.
-   Por eso el compilador muestra un error.

**Ejercicio 7 – Error por cambiar el tipo inferido**

**![](./03-ejercicios%20con%20var_images/image-007.png)**

**Explicación**:

dato se infiere como **int** al inicio.

Luego intentas asignarle un **String**, lo cual no es válido.

Las variables declaradas con **var** no son dinámicas, solo infieren el tipo una vez.