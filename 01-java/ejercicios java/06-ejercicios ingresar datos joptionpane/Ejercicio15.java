// Ejercicio 15
// Pide datos y pregunta si desea confirmar antes de mostrar el resumen

import javax.swing.*;

public class Ejercicio15 {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Nombre");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad"));
        String correo = JOptionPane.showInputDialog("Correo");

        // Mostramos un cuadro de confirmación con botones: Sí, No, Cancelar
        // El metodo devuelve un número según lo que pulse el usuario
        // YES_OPTION = 0, NO_OPTION = 1, CANCEL_OPTION = 2
        int confirm = JOptionPane.showConfirmDialog(null, "¿Confirmar datos?");

        // Si el usuario pulsa "Sí" (YES_OPTION)
        if (confirm == JOptionPane.YES_OPTION){

            // Mostramos los datos introducidos
            JOptionPane.showMessageDialog(null,
                    "Datos confirmados. \nNombre: " + nombre +
                    "\nEdad: " + edad +
                    "\nCorreo: " + correo);
        }else{
            JOptionPane.showMessageDialog(null, "Operación cancelada");
        }
    }
}
