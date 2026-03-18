// Ejercicio 3. Área de un rectángulo
// Pide la base y la altura y calcula el área de un rectángulo

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el valor de la base en cm.: ");
        double base = sc.nextDouble();

        System.out.print("Introduzca el valor de la altura en cm.: ");
        double altura = sc.nextDouble();

        double area = base * altura;

        System.out.println("El área del rectángulo es igual a: " + area + "cm²");
    }
}
