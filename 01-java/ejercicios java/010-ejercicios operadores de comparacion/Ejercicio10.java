// Ejercicio 10
// Comparación con un límite
// Compara un número con un límite y comprueba si la diferencia es menor de 10 sin usar Math.abs

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int numero = entrada.nextInt();
        int limite = 50;

        if(numero < limite){
            System.out.println(numero + " es menor que " + limite);
        }else if(numero > limite){
            System.out.println(numero + " es mayor que " + limite);
        }else{
            System.out.println(numero + " es igual que " + limite);
        }
    }
}
