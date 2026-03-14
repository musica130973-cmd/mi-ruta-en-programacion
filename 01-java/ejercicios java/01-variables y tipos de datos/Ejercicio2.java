//Ejercicio 2. Conversión entre tipos de datos
//Escribe un programa que convierta un número entero a double y luego a String

public class Ejercicio2 {
    public static void main(String[] args) {
        int numero = 30;

        double numeroDouble = numero;

        String numeroTexto = String.valueOf(numeroDouble);

        System.out.println("Entero: " + numero);
        System.out.println("Double: " + numeroDouble);
        System.out.println("Texto: " + numeroTexto);
    }
}
