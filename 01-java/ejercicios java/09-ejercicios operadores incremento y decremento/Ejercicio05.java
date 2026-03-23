// Ejercicio 5
// Incremento dentro de una expresión
// El postincremento usa el valor antes de sumar1, por eso x++ aporta 4 a la operación, aunque x termine valiendo 5 después

public class Ejercicio5 {
    public static void main(String[] args) {
        int x = 4;
        int y = 2 * x++ + 3;

        System.out.println("El resultado de la operación es: " + y);
    }
}
