// Validación de login

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca el usuario: ");
        String user = entrada.nextLine();

        if(user.equalsIgnoreCase("root") || user.equalsIgnoreCase("invitado")){
            System.out.println("Login permitido");
        }else{
            System.out.println("Usuario no autorizado");
        }
    }
}
