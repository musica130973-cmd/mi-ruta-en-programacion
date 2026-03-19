//Pide al usuario una contraseña y valida

import javax.swing.*;

public class Ejercicio10 {
    public static void main(String[] args) {
        String user = JOptionPane.showInputDialog("Usuario");
        String pass = JOptionPane.showInputDialog("Contraseña");

        if(user.equals("admin") && pass.equals("1234")){
            JOptionPane.showMessageDialog(null, "Acceso permitido");
        }else{
            JOptionPane.showMessageDialog(null, "Acceso denegado");
        }
    }
}
