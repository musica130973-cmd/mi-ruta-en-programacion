// Ejercicio 7
// El usuario ingresa minutos y el programa muestra cuántas horas y minutos son

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el número de minutos: ");
        int minutos = sc.nextInt();

        int horas = minutos / 60;
        int minutosResto = minutos % 60;

        System.out.println(minutos + " minutos son: " + horas + " horas y " + minutosResto + " minutos");


    }
}
