// Ejercicio 6
// Aprobado o suspeso
// Comprueba si una nota es aprobada (>=5)

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce la nota: ");
        double nota = entrada.nextDouble();

        if(nota >= 5){
            System.out.println("Usted tiene un " + nota + " está aprobado");
        }else{
            System.out.println("Usted tiene un " + nota + " está suspenso");
        }
    }
}
