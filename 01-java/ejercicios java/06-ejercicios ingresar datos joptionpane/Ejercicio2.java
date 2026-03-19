import javax.swing.*;

// Pide dos números enteros y muestra la suma
public class Ejercicio2 {
    public static void main(String[] args) {
        String numero1 = JOptionPane.showInputDialog("Introduzca el primer número");
        String numero2 = JOptionPane.showInputDialog("Introduzca el segundo número");

        int number1 = Integer.parseInt(numero1); // Pasa a entero el String numero1
        int number2 = Integer.parseInt(numero2); // Pasa a entero el String numero2

        int suma = number1 + number2;

        JOptionPane.showMessageDialog(null,"La suma es igual a: " + suma);
    }
}
