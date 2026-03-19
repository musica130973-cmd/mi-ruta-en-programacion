// Pide una frase y muestra cuantos caracteres tiene

import javax.swing.*;

public class Ejercicio13 {
    public static void main(String[] args) {
        String text = JOptionPane.showInputDialog("Introduzca una frase: ");

        int n = text.length();

        JOptionPane.showMessageDialog(null, "El número de caracteres de " + text + " es igual a: " + n);
    }
}
