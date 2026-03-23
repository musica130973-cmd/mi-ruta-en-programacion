// Ejercicio 5
// Pide al usuario una unidad de medida:
// 1 metros
// 2 centimetros
// 3 milimetros
// Luego pide una cantidad en metros y convierte la opción elegida

// Importamos la clase Scanner para poder leer datos del usuario desde el teclado
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        // Creamos un objeto Scanner llamado "entrada" para leer números introducidos por el usuario
        Scanner entrada = new Scanner(System.in);

        // Mostramos un pequeño menú con las unidades disponibles.
        System.out.println("Introduzca la unidad de conversión:");
        System.out.println("1. Metros");
        System.out.println("2. Centímetros");
        System.out.println("3. Milímetros");

        // Leemos la opción elegida por el usuario (1, 2 o 3)
        int unidad = entrada.nextInt();

        // Leemos la cantidad en metros que el usuario quiere convertir.
        System.out.print("Introduce una cantidad en metros: ");
        double metros = entrada.nextDouble();

        // Evaluamos qué unidad eligió el usuario.
        switch (unidad){
            // Si elige 1 → no hay conversión, se queda en metros.
            case 1:
                System.out.println("Resultado: " + metros + " m");
                break;
            // Si elige 2 → convertimos metros a centímetros.
            // 1 metro = 100 centímetros
            case 2:
                System.out.println("Resultado: " + (metros * 100) + " cm");
                break;
            // Si elige 3 → convertimos metros a milímetros.
            // 1 metro = 1000 milímetros
            case 3:
                System.out.println("Resultado: " + (metros * 1000) + " mm");
                break;
            // Si el usuario introduce un número distinto de 1, 2 o 3.
            default:
                System.out.println("Unidad incorrecta");
        }
    }
}
