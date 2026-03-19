import javax.swing.*;

// Pide tres notas y calcula el promedio
public class Ejercicio8 {
    public static void main(String[] args) {

        double suma = 0;
        double media = 0;
        for(int i = 1; i <= 3; i++){
             double numero = Double.parseDouble(JOptionPane.showInputDialog(("Introduzca un número")));
             suma += numero;
        }
        media = suma / 3;
        JOptionPane.showMessageDialog(null, "La media de las notas es: " + media);
    }
}
