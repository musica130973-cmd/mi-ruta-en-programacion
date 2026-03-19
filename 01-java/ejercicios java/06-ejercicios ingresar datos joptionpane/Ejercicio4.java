// Pide la edad y clasifica: niño, adolescente, adulto o mayor


import javax.swing.*;


public class Ejercicio4 {
    public static void main(String[] args) {
        String edad = JOptionPane.showInputDialog("Introduzca su edad");
        int edadnum = Integer.parseInt(edad);
        String categoria;
        if(edadnum < 12){
            categoria = "Niño";
        }else if(edadnum < 18){
            categoria = "Adolescente";
        }else if(edadnum < 60){
            categoria = "Adulto";
        }else{
            categoria = "Mayor";
        }
        JOptionPane.showMessageDialog(null,"Usted es " + categoria);
    }
}
