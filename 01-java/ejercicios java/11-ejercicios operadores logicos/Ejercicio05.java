// Comprobar si un número NO está entre 0 y 100

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        int numero = sc.nextInt();

        boolean fueraRango = !(numero >= 0 && numero <= 100);

        System.out.println(numero + " NO está entre 0 y 100: " + fueraRango);
    }
}
