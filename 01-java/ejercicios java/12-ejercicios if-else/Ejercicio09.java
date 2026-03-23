// Validar una contraseña simple
// La contraseña es válida si:
// Tiene al menos 8 caractere
// Contiene al menos un número

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca la contraseña");
        String password = entrada.nextLine();

        boolean numero = false; // Variable booleana para saber si la contraseña contiene al menos un número

        for(int i = 0; i < password.length(); i++){ // Recorremos la contraseña caráter por carácter
            if(Character.isDigit(password.charAt(i))){  // Comprobamos si el carácter actual es un dígito (0-9)
                numero = true;  // Si encontramos un número, marcamos la variable como true
                break;
            }
        }
        // Validamos la contraseña
        // Debe tener al menos 8 caracteres y contener un número
        if(password.length() >= 8 && numero){
            System.out.println("Contraseña válida");
        }else{
            System.out.println("Contraseña inválida");
        }
    }
}
