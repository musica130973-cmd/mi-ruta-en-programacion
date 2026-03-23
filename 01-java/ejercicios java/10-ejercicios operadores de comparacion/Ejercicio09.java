// Ejercicio 9
// Mayoría de edad según año de nacimiento
// Determina si una persona es mayor de edad

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        int actual = 2026;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca su año de nacimiento: ");
        int nacimiento = entrada.nextInt();

        int edad = actual - nacimiento;

        if(edad >= 18){
            System.out.println("Usted tiene " + edad + " años, usted es mayor de edad");
        }else{
            System.out.println("Usted tiene " + edad + " años, usted es menor de edad");
        }
    }
}
