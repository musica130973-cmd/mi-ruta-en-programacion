// Acceso permitido

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca la edad: ");
        int edad = entrada.nextInt();
        entrada.nextLine(); // Limpiar buffer


        System.out.print("Rol (admin/usuario): ");
        String rol = entrada.nextLine();

        if(edad >=18 || rol.equalsIgnoreCase("admin")){
            System.out.println("Acceso permitido");
        }else{
            System.out.println("Acceso denegado");
        }
    }
}
