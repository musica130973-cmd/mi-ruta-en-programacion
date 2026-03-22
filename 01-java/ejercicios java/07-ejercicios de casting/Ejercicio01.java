// Ejercicio 1
// Casting implícito (widening)
// El widening convierte tipos pequeños en tipos más grandes sin pérdidas de información
// Java lo hace automáticamente

public class Ejercicio1 {
    public static void main(String[] args) {

        // Declaramos una varialble int con valor 42
        // Es un tipo entero de 32 bits
        int a = 42;

        // Casting implícito (widening): de int a double
        // Un double puede almacenar cualquier valor int sin pérdida
        // así que Java convierte automáticamente.
        double b = a;

        // Otro casting implícito: de int a long
        // long es un tipo más grande (64 bits), por eso no hace falta cast
        long c = a;

        // Casting implícito: de long a float
        // Aunque float tiene menos precisión que long, Java permite
        // este widening porque float puede representar el rango de long,
        // aunque no siempre con exactitud
        float d = c;

        // Imprimimos todas las variables para ver los resultados
        System.out.println(a);  // Imprime 42 (int)
        System.out.println(b);  // Imprime 42.0 (double)
        System.out.println(c);  // Imprime 42 (long)
        System.out.println(d);  // Imprime 42.0 (float)
    }
}


