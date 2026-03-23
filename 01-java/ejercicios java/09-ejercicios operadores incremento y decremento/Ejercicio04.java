// Ejecicio 4
// Mezcla de pre y post

public class Ejercicio4 {
    public static void main(String[] args) {
        int a = 3;
        int b = a++ + ++a;  // b = 3 + 5 = 8
        System.out.println("b es igual a: " + b);
    }
}
// a++ usa el valor antes de sumar
// ++a suma 1 antes de usar el valor