import java.util.Scanner;

// Validar login con usuario y contraseña
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el usuario: ");
        String usuario = sc.next();

        System.out.println("Introduzca la contraseña: ");
        String password = sc.next();

        boolean loginCorrecto = usuario.equals("juan") && password.equals("1234");

        if(loginCorrecto){
            System.out.println("Puede pasar");
        }else{
            System.out.println("NO puede pasar");
        }

    }
}