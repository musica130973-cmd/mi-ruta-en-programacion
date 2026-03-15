// Ejercicio 5
// Objetos con var

public class Ejercicio5 {
    public static void main(String[] args) {

        // Se declara una variable usando 'var'. El compilador infiere el tipo automáticamente.
        // Como estamos creando un nuevo StringBuilder(), el tipo inferido será StringBuilder.
        var sb = new StringBuilder();

        // Se añade la primera parte del texto al StringBuilder.
        // append() agrega contenido al final sin crear nuevos objetos String
        sb.append("Usando var en Java");

        // Se añade otra frase. StringBuilder permite construir cadenas largas de forma eficiente.
        sb.append("Para aprender por mi cuenta");



        // Se convierte el contenido del StringBuilder en un String normal
        // y se imprime en pantalla.
        System.out.println(sb);
    }
}
