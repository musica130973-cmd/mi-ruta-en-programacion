// Validar si un número es positivo y múltiplo de 3, o negativo y par

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        int numero = sc.nextInt();

        boolean condicion = (numero > 0 && numero % 3 == 0) || (numero < 0 && numero % 2 == 0);

        System.out.println(numero + " cumple la condición: " + condicion);

    }
}
