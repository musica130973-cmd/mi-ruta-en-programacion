// Clasificar un número según su rango
// Pide un número entre 1 y 100 y clasifícalo
// 1-25 Bajo
// 26-50 Medio
// 51-75 Alto
// 76-100 Muy alto

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int numero = entrada.nextInt();

        if(numero > 1 && numero <= 25){
            System.out.println(numero + " es Bajo");
        }else if(numero <= 50){
            System.out.println(numero + " es Medio");
        }else if(numero <= 75){
            System.out.println(numero + " es Alto");
        }else if(numero <= 100){
            System.out.println(numero + " es Muy alto");
        }else{
            System.out.println("Fuera de rango");
        }

    }
}
