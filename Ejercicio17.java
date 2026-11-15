import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa a:");
        int a = entrada.nextInt();

        System.out.println("Ingresa b:");
        int b = entrada.nextInt();

        boolean sonIguales = a * a == b;

        System.out.println("El cuadrado de a es igual a b: " + sonIguales);
    }
}
