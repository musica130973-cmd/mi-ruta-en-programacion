// Ejercicio 15
// Expresión con varios operadores

public class Ejercicio15 {
    public static void main(String[] args) {
        int a = 8;
        int b = 3;
        int c = 2;
        int r = a / b * c + a % b;
        /*
        8/3 = 2;
        2*2 = 4;
        8%2 = 3;
        4+2 = 6;
        */

        System.out.println("El resultado de la operación es " + r);
    }
}
