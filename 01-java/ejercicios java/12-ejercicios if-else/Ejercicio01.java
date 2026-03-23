// Número positivo, negativo o cero
// Pide un número entero y muestra si es positivo, negativo o cero

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = entrada.nextInt();

        if(numero > 0){
            System.out.println(numero + " es positivo");
        }else if(numero < 0){
            System.out.println(numero + " es negativo");
        }else{
            System.out.println(numero + " es igual a 0");
        }
    }
}
