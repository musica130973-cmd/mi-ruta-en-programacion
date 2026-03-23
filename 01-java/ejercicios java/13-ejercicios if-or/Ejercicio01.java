// Número positivo o mayor que 100

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = entrada.nextInt();

        if(numero > 0 || numero > 100){
            System.out.print(numero + " Cumple la condición");
        }else{
            System.out.println(numero + " No cumple la condición");
        }
    }
}
