// Comprobar si un triángulo es válido
// La suma de dos lados debe ser mayor que el tercero

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el valor del primer lado: ");
        int lado1 = sc.nextInt();

        System.out.println("Introduzca el valor del segundo lado: ");
        int lado2 = sc.nextInt();

        System.out.println("Introduzca el valor del tercer lado: ");
        int lado3 = sc.nextInt();

    boolean valido = (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);

        System.out.println("El triangulo es válido: " + valido);

    }
}
