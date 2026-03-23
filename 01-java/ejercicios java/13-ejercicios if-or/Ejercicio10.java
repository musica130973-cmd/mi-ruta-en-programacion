// ¿Temperatura peligrosa?

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca una temperatura: ");
        int temperatura = entrada.nextInt();

        if(temperatura < 0 || temperatura > 40){
            System.out.println("Temperatura peligrosa");
        }else{
            System.out.println("Temperatura normal");
        }

    }

}
