import java.util.Scanner;

// Comprobar si un número es par y mayor de 10
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = entrada.nextInt();

        if(numero % 2 == 0 && numero > 10){
            System.out.println(numero + " es par y mayor de 10");
        }else{
            System.out.println("No cumple los requisitos");
        }
    }
}
