import javax.swing.*;

// Pide nombre, edad, ciudad y profesion
public class Ejercicio9 {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Nombre" );
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad: "));
        String ciudad = JOptionPane.showInputDialog("Ciudad: ");
        String profesion = JOptionPane.showInputDialog("Profesión: ");

        JOptionPane.showMessageDialog(null,
                "Datos ingresados\n" +
                "Nombre: " + nombre + "\n" +
                "Edad: " + edad + "\n" +
                "Ciudad: " + ciudad + "\n" +
                "Profesión: " + profesion);
    }
}
