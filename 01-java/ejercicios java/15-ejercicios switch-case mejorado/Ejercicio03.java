// Pide una nota del 0 al 10 y muestra:
// 0-4: Insuficiente
// 5: Suficiente
// 6: Bien
// 7-8: Notable
// 9-10: Sobresaliente

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca una nota (0-10): ");
        int nota = entrada.nextInt();

        switch(nota){
            case 0, 1, 2, 3, 4 -> System.out.println("Insuficiente");
            case 5 -> System.out.println("Suficiente");
            case 6 -> System.out.println("Bien");
            case 7, 8 -> System.out.println("Notable");
            case 9, 10 -> System.out.println("Sobresaliente");
            default -> System.out.println("Nota invalida");
        }
    }
}
