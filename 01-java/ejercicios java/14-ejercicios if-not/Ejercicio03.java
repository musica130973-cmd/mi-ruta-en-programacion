// Ejercicio 3
// Escribe un programa que lea un número entero y muestre "El número NO es par" si el número no es par.

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int numero = entrada.nextInt();

        if(!(numero % 2 == 0)){
            System.out.println("El número no es par");
        }
        entrada.close();
    }
}
