// Ejercicio 6
// Pide un número hasta que el usuario introduzca un valor válido

// Importamos Swing para poder usar JOptionPane (ventanas emergentes)
import javax.swing.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        boolean valido = false; // 'valido' controla si la entrada es correcta
        int numero = 0; // 'numero' almacenará el número introducido por el usuario


        // Mientras 'valido' sea false, seguimos pidiendo un número
        while(!valido){
            try{
                // Se muestra una ventana pidiendo un número
                // Integer.parseInt intenta convertir el texto a número entero
                // Si lo consigue, no hay error y seguimos
                numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));

                // Si no hubo error, marcamos la entrada como válida y salimos del bucle
                valido = true;

            // Si el usuario escribe algo que NO es un número (letras, vacío, símbolos...)
            // se produce una excepción NumberFormatException
            }catch (NumberFormatException e) {
                // Mostramos un mensaje de error y el bucle continúa
                JOptionPane.showMessageDialog(null, e.getMessage());//Muestra el tipo de error en con
                JOptionPane.showMessageDialog(null, "Error: introduce un número"); // Mostramos un mensaje de error y el bucle continúa

            }
        }
        // Cuando el usuario por fin introduce un número válido, lo mostramos
        JOptionPane.showMessageDialog(null, "Número introducido: " + numero);

    }
}
