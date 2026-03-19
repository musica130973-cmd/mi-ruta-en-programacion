// Pide el radio y calcula el área de un círculo

import javax.swing.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        String radio = JOptionPane.showInputDialog("Introduzca el radio del círculo: ");

        double rad = Double.parseDouble(radio); // Pasa a Double el String radio;
        double area = Math.PI * Math.pow(rad, 2);


        // Muestra el resultado dando formato de dos decimmales
        JOptionPane.showMessageDialog(null, "El área del círculo es: " + String.format("%.2f", area) + " cm cuadrados");
    }
}
