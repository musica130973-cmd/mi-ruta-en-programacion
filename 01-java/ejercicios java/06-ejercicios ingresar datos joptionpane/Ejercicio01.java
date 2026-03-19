// Ejercicio 1
// Pide al usuario su nombre y muestra un saludo personalizado

import javax.swing.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("¿Cómo te llamas?");
        JOptionPane.showMessageDialog(null,"Hola " + nombre); //null hace indica que no hay ventan padre y pone la ventana en el centro de la pantalla
    }
}
