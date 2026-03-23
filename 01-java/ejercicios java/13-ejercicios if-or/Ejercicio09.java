// ¿Es un color primario?

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca un color: ");
        String color = entrada.nextLine().toLowerCase();

        if(color.equals("rojo") || color.equals("verde") || color.equals("azul")){
            System.out.println("Es un color primario");
        }else{
            System.out.println("No es un color primario");
        }
    }
}
