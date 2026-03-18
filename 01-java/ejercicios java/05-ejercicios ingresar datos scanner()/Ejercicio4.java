// Ejercicio 4. Conversión Celsius-Fahrenheit
// Pide una cifra en grados Celsius y los convierte a grados Fahrenheit

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número de grados Celsius para pasarlos a grados Fahrenheit: ");

        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println(celsius + " grados Celsius son " + fahrenheit + " grados Fahrenheit");
    }
}
