import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa x1:");
        double x1 = entrada.nextDouble();

        System.out.println("Ingresa y1:");
        double y1 = entrada.nextDouble();

        System.out.println("Ingresa x2:");
        double x2 = entrada.nextDouble();

        System.out.println("Ingresa y2:");
        double y2 = entrada.nextDouble();

        double pendiente = (y2 - y1) / (x2 - x1);
        boolean positiva = pendiente > 0;

        System.out.println("Pendiente: " + pendiente);
        System.out.println("Pendiente positiva: " + positiva);
    }
}
