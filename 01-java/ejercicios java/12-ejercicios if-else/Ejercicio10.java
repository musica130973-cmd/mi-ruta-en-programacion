import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

// Menú simple con opciones
// Simula un menú de opciones usando if-else
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("1. Saludar");
        System.out.println("2. Mostrar hora");
        System.out.println("3. Salir");
        System.out.print("Elige una opción ");
        int numero = entrada.nextInt();

        // Obtiene la hora actual del sistema (con precisión de nanosegundos)
        // y la guarda en la variable 'hora' como un objeto LocalTime.
        LocalTime hora = LocalTime.now();

        // Crea un formateador que define cómo se mostrará la hora.
        // "HH:mm:ss" significa: horas (00–23), minutos y segundos sin nanosegundos.
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");



        if(numero == 1){
            System.out.println("HOLA ¿COMO ESTÁS?");
        }else if(numero == 2){

            // hora.format(formato) convierte el objeto LocalTime en un String con el patrón "HH:mm:ss".
            // El operador + concatena el texto con la hora ya formateada.
            System.out.println("Hora actual: " + hora.format(formato)); //
        }else if(numero == 3){
            System.out.println("Saliendo de Java...");
        }else{
            System.out.println("Opción no válida");
        }
    }
}
