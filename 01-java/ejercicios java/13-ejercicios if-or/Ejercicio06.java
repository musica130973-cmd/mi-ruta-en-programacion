// ¿Es vocal?

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce una letra: ");
        char letra = entrada.next().toLowerCase().charAt(0);


        // Comprobamos si la letra está dentro de la cadena "aeiou"
        // indexOf(letra) devuelve la posición si la encuentra, o -1 si no
        // Si el resultado es distinto de -1, entonces es una vocal
        if("aeiou".indexOf(letra) != -1){
            System.out.println("Es una vocal");
        }else{
            System.out.println("No es una vocal");
        }
    }
}
