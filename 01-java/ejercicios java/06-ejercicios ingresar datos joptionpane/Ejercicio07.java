// Ejercicio 7
//Convierte una temperatura de Celsius a Fahrenheit

import javax.swing.*;

public class Ejercicio7 {
    public static void main(String[] args) {
        String celsius = JOptionPane.showInputDialog("Introduzca la temperatura en grados celsius");
        double c = Double.parseDouble(celsius);

        double f = (c * 1.8) + 32;

        JOptionPane.showMessageDialog(null, c + "°C son " + f + "°F");
    }
}
