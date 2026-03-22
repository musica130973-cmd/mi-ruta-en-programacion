// Ejercicio 11
// Expresión compleja

public class Ejercicio11 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;
        int r = a + b * c - a % b;  //((a + b) - (a % b))

        System.out.println("El resultado de la operación es: " + r);
    }
}
