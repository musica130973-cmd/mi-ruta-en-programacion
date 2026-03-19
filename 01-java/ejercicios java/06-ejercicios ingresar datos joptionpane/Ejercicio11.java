// Muestra un menú desplegable con colores

// Importamos la librería Swing para poder usar JOptionPane (ventanas emergentes)
import javax.swing.*;

public class Ejercicio11 {
    public static void main(String[] args) {

        // Creamos un array de Strings con los colores que aparecerán en el menú desplegable
        // Estos serán las opciones que el usuario podrá elegir
        String[] colores = {"Rojo", "Verde", "Azul"};

        // showInputDialog puede mostrar un cuadro de texto o un menú desplegable
        // En esta versión extendida, al pasarle un array de opciones,
        // automáticamente crea un menú desplegable (combo box)
        String elegido = (String) JOptionPane.showInputDialog(
                null,                           // Ventana padre (null = centrado en pantalla)
                "Elige un color",               // Mensaje que se muestra arriba del menú
                "Selector",                     // Título de la ventana
                JOptionPane.QUESTION_MESSAGE,   // Icono de pregunta
                null,                           // Icono personalizado (no usamos ninguno)
                colores,                        // Opciones del menú desplegable
                colores[0]                      // Opción seleccionada por defecto ("Rojo")
        );
        JOptionPane.showMessageDialog(null, "Elegiste: " + elegido);

    }
}
