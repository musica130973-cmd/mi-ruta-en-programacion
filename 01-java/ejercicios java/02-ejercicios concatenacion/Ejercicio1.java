// Ejercicio 1
// Pide al usuario su nombre y apellido por separado y muestra un mensaje concatenado como: Hola, Juan Pérez


import java.util.Scanner; // Importa la clase Scanner, necesaria para leer datos que escribe el usuario.

// Declara la clase pública llamada Ejercicio1
public class Ejercicio1 {

    // Aquí empieza la ejecución del programa
    public static void main(String[] args) {

        // Crea un objeto Scanner llamado "sc" para leer texto desde el teclado
        Scanner sc = new Scanner(System.in);

        // Muestra un mensaje pidiendo elnombre sin salto de línea
        System.out.print("Escriba su nombre por favor: ");

        // Lee la línea completa que escribe el usuario y la guarda en la variable "nombre"
        String nombre = sc.nextLine();

        // Pide el apellido
        System.out.print("Escriba su apellido por favor: ");

        // Lee el apellido y lo guarda en la variable "apellido"
        String apellido = sc.nextLine();

        //Crea un mensaje concatenando texto fijo con las variables nombre y apellido
        String mensaje = "Hola, " + nombre + " " +  apellido;

        //Muestra el mensaje final en pantalla
        System.out.println(mensaje);
    }
}
