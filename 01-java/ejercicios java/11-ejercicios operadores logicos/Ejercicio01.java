// Comprobar si un número está entre 10 y 20
// Escribir un programa que diga si un número está entre 10 y 20 (incluidos)

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int numero = entrada.nextInt();

        boolean resultado = (numero >= 10 && numero <=20);

        System.out.println(numero + " está entre 10 y 20: " + resultado);

    }
}
