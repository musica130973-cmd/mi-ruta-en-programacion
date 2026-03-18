// Ejercicio 5
//Pide la edad al usuario y le dice la edad que tendrá el próximo año

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca su edad: ");
        int edad = sc.nextInt() + 1;

        System.out.println("Usted el año que viene tendrá " + edad + " años");
    }
}
