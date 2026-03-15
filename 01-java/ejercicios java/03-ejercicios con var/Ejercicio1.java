// Ejercicio1. Declaración básica con var
// Declara variables usando var y observa qué tipo infiere Java.

public class Ejercicio1 {
    public static void main(String[] args) {
        var numero = 10; //int
        var texto = "Hola"; // String
        var decimal = 3.14; // Double
        var booleano = true; // Boolean

        // Java infiere el tipo según el valor asignado


        System.out.println(numero);
        System.out.println(texto);
        System.out.println(decimal);
        System.out.println(booleano);
    }
}
