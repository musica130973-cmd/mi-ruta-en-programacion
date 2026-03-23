// Ejercicio 1
// Compara dos números enteros
// Compara sos números y muestra si el primero es mayor, menor o igual que el segundo

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca el primer número: ");
        int numero1 = entrada.nextInt();

        System.out.print("Introduzca el segundo número: ");
        int numero2 = entrada.nextInt();



        if(numero1 > numero2){
            System.out.println(numero1 + " es mayor que " + numero2);
        }else if(numero1 < numero2){
            System.out.println(numero1 + " es menor que " + numero2);
        }else{
            System.out.println(numero1 + " es igual que " + numero2);
        }
    }
}
