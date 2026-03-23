// Clasificación de notas
// Introduce una nota del 0 al 10 y muestra:
// 0-4 Suspenso
// 5 Aprobado
// 6 Bien
// 7-8 Notable
// 8-9 Sobresaliente

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca la nota: ");
        int nota = entrada.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida");
            } else if (nota < 5) {
                System.out.println("Suspenso");
            } else if (nota == 5){
                System.out.println("Aprobado");
            } else if (nota == 6){
                System.out.println("Bien");
            } else if (nota <= 8){
                System.out.println("Notable");
            } else{
                System.out.println("Sobresaliente");
            }
    }
}