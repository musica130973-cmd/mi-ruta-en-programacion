// Aprobado por nota o recuperación

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nota final: ");
        double notaFinal = entrada.nextDouble();

        System.out.print("Nota recuperación: ");
        double notaRec = entrada.nextDouble();

        if(notaFinal >= 5 || notaRec >= 5){
            System.out.println("Aprobado");
        }else{
            System.out.println("Suspenso");
        }
    }
}
