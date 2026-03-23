// Verificar si un número es mayor que 50

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int numero = entrada.nextInt();

        boolean mayor50 = numero > 50;

        System.out.println("Usted es mayor de 50: " + mayor50);
    }
}