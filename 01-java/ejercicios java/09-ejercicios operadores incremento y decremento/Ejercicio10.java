// Ejercicio 10
// Expresion para resolver


public class Ejercicio10 {
    public static void main(String[] args) {
        int x = 5;
        int y = x++ + ++x + x;
        //      5(6)+   7 + 7 = 19

        System.out.println("El resultado de la operación es: " + y);
    }
}
