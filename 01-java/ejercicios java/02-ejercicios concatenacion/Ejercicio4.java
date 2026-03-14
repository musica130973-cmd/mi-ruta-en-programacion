// Ejercicio 4
// Usar StringBuilder para construir un mensaje largo en varias líneas

public class Ejercicio4 {
    public static void main(String[] args) {

        // Se crea un objeto StringBuilder, una clase muy útil para construir textos largos
        // de forma eficiente sin crear muchas cadenas nuevas en memoria
        StringBuilder sb = new StringBuilder();

        // Se añade una línea de texto al StringBuilder
        // El carácter \n inserta un salto de línea
        sb.append("Bienvenido a PianoScore Studio.\n");

        // Se añade otra línea de texto
        sb.append("Estamos trabajando con el tema Astra.\n");

        // Se añade una tercera línea. Esta no tiene salto de línea al final
        sb.append("y creando un sitio profesional.");

        // Se convierte el contenido del StringBuilder a una cadena nomral (String)
        // y se imprime en pantalla
        System.out.println(sb.toString());
    }
}
