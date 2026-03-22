// Ejercicio 2
// Casting explícito (narrowing)

public class Ejercicio2 {
    public static void main(String[] args) {

        // Declaramos una variable double con decimales
        // Casting explícito (narrowing): de double a int
        // Se pierde la parte decimal, porque un int solo guarda números enteros
        double x = 9.78;
        int y = (int) x; // 9

        // Declaramos un long muy grande (3000000000).
        // Este valor NO cabe en un int, cuyo máximo es 2,147,483,647
        long z = 3000000000L;

        // Casting explícito de long a int.
        // Como el valor es demasiado grande, ocurre un overflow:
        // el número "da la vuelta" dentro del rango permitido por int.
        int w = (int) z; // -1294967296 overflow

        System.out.println(x);  // 9.78
        System.out.println(y);  // 9;

        System.out.println(z);  // 3000000000
        System.out.println(w);  // -1294967296 (overflow)
    }
}
