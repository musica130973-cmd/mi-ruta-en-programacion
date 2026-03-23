// Ejercicio 7
// Expresión compleja
public class Ejercicio7 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = a++ + ++b + b++ + ++a;
        //      1   +   3 + 3   +   3
        System.out.println("El resultado de la operación final es " + c);
    }
}
