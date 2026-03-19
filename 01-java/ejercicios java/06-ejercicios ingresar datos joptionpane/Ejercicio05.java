// Ejercicio 5
// Muestra un menú con tres opciones: Sumar, Restar, Salir

// Importa la librería Swing, necesaria para usar JOptionPane y crear ventanas gráficas
import javax.swing.*;

public class Ejercicio5 {
    public static void main(String[] args) {


        // Creamos un array de Strings con las opciones que aparecerán como botones
        // Estos serán los botones personalizados del cuadro del diálogo
        String[] opciones = {"Sumar", "Restar", "Salir"};


        // Mostramos un cuadro de diálogo con botones personalizados
        // showOptionDialog permite configurar:
        // - El mensaje
        // - El título
        // - El tipo de botones (DEFAULT_OPTION = sin botones estándar)
        // - El tipo de icono (INFORMATION_MESSAGE = icono de información)
        // - Un icono personalizado (aquí null)
        // - Las opciones personalizadas (nuestro array)
        // - La opción seleccionada por defecto (opciones[0] = "Sumar")
        int opcion = JOptionPane.showOptionDialog(
                null,                           // Ventana pader (null = centrado en pantalla)
                "Elige una opción",             // Mensaje que se muestra
                "Menú",                         // Título de la ventana
                JOptionPane.DEFAULT_OPTION,     // Tipo de botones (sin botones estándar)
                JOptionPane.INFORMATION_MESSAGE,// Tipo de icono (información)
                null,                           // Icono personalizado ( no usamos)
                opciones,                       // Botones personalizados
                opciones[0]                     // Botón por defecto ("Sumar")
        );

        JOptionPane.showMessageDialog(null, "Elegiste: " + opciones[opcion]);
    }
}
