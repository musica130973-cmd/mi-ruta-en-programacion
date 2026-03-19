// Ejercicio 14
// El programa genera un número aleatorio del 1 al 10 y el usuario debe adivinarlo

import javax.swing.*;

public class Ejercicio14 {
    public static void main(String[] args) {

        // Generamos un número aleatorio entre 1 y 10
        // Math.random() devuelve un número entre 0.0 y 1.0 sin incluir 1.0
        // Lo multiplicamos por 10 0.0 a 9.999...
        // Le sumamos 1 1.0 a 10.9999
        // Convertimos a int 1 a 10
        int aleatorio = (int)(Math.random() * 10 + 1);

        // Variable donde guardaremos el número que introduce el usuario
        int intento = 0;

        // El bucle se repetirá mientras el usuario NO acierte el número
        while(intento != aleatorio){

            // Pedimos un número al usuario y lo convertimos a int
            intento = Integer.parseInt(JOptionPane.showInputDialog("Adivina el número"));

            // Si el número introducido es menor que el aleatorio
            if(intento < aleatorio){
                JOptionPane.showMessageDialog(null, "Demasiado bajo");

            // Si el número introducido es mayor que el aleatorio
            }else if(intento > aleatorio){
                JOptionPane.showMessageDialog(null, "Demasiado alto");
            }
            // Si no es menor ni mayor, significa que es igual, el bucle terminará
        }
        // Cuando el bucle termina, significa que el usuario acertó
        JOptionPane.showMessageDialog(null, "Correcto");
    }
}
