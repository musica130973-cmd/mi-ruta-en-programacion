// Ejercicio 7
// Crea una variable booleana (lloviendo). Si no está lloviendo, muestra "Puedes salir sin paraguas"

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca true o false: ");
        boolean lloviendo = entrada.nextBoolean();


        // Si NO está lloviendo (!lloviendo es equivalente a lloviendo == false)
        if(!lloviendo){
            System.out.println("Puedes salir sin paraguas");
        }else{
            System.out.println("Coge el paraguas que está lloviendo");
        }
    }
}
