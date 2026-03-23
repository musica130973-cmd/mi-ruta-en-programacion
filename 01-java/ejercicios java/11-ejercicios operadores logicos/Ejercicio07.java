// Determinar si un año es bisiesto
// - divisible entre 4
// - y no divisible entre 100
// - o divisible entre 400

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un año: ");
        int year = sc.nextInt();

        boolean bisiesto = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if(bisiesto){
            System.out.println(year + " es bisiesto");
        }else{
            System.out.println(year + " no es bisiesto");
        }
    }
}
