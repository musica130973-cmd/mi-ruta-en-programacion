// Ejercicio 10
// Crea una variable int stock. Si no hay stock (es decir, si stock == NO), muestra "Producto agotado"

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("¿Hay stock? SI/NO: ");
        String stock = entrada.nextLine().toLowerCase();

        if(!(stock.equals("si"))){
            System.out.println("Producto agotado");
        }else{
            System.out.println("Producto disponible");
        }
    }
}
