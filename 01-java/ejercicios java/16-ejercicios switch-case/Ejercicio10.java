// Ejercicio 10
// Identificador de estaciones
// Invierno: 12, 1, 2
// Primavera: 3, 4, 5
// Verano: 6, 7, 8
// Otoño: 9, 10, 11

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce un mes (1-12): ");
        int mes = entrada.nextInt();

        switch (mes){
            case 12, 1, 2:
                System.out.println("Invierno");
                break;
            case 3, 4, 5:
                System.out.println("Primavera");
                break;
            case 6, 7, 8:
                System.out.println("Verano");
                break;
            case 9, 10 , 11:
                System.out.println("Otoño");
                break;
            default:
                System.out.println("Mes no válido");
        }
    }
}
