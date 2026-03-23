// Ejercicio 11
// Expresión para resolver

public class Ejercicio11 {
    public static void main(String[] args) {
        int a = 6;
        int b = 2 * --a + a++ - --a;
        //      2 *   5 + 5(6)-   5
        //           10 + 0 = 10

        System.out.println("El resultado final es: " + b);
    }
}
