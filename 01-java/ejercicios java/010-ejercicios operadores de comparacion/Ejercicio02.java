// Ejercicio 2
// Mayor de tres números
// Determina cuál de tres números es el mayor

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduzca el primer número: ");
        int numero1 = entrada.nextInt();

        System.out.print("Introduzca el segundo número: ");
        int numero2 = entrada.nextInt();

        System.out.print("Introduzca el tercer número: ");
        int numero3 = entrada.nextInt();

        if(numero1 > numero2 && numero1 > numero3){
            System.out.println(numero1 + " es mayor que " + numero2 + " y " + numero3);
        }else if(numero2 > numero1 && numero2 > numero3){
            System.out.println(numero2 + " es mayor que " + numero1 + " y " + numero2);
        }else{
            System.out.println(numero3 + " es mayor que " + numero1 + " y " + numero2);
        }
    }
}

