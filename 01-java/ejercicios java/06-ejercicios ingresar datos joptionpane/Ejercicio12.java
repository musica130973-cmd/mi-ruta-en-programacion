// Pide precio e IVA y calcula el total

import javax.swing.*;

public class Ejercicio12 {
    public static void main(String[] args) {
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el precio: "));
        double iva = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el IVA (%)"));

        double total = precio + (precio * (iva / 100));

        JOptionPane.showMessageDialog(null,"El precio total es igual a: " + total + "€");
    }
}
