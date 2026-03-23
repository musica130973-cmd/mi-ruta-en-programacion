// Ejercicio 8
// Pide una contraseña y comprueba si no coincide con 1234. Si no coincide, muestra "Contraseña incorrecta"

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca la contraseña: ");
        String password = entrada.nextLine();

        if(!(password.equals("1234"))){
            System.out.println("Contraseña incorrecta");
        }else{
            System.out.println("Acceso permitido");
        }
    }
}
