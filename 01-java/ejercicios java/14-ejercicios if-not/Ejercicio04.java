// Ejercicio 4
// Define una variable boolean autorizado. Si no está autorizado (autorizado == false), el programa debe mostrar "Acceso denegado"

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca true/false: ");
        boolean autorizado = entrada.nextBoolean();

        if(!autorizado){
            System.out.println("Acceso denegado");
        }else{
            System.out.println("Acceso permitido");
        }
    }
}
