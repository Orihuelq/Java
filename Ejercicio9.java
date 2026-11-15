import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa el ancho de la pared:");
        double ancho = entrada.nextDouble();

        System.out.println("Ingresa el alto de la pared:");
        double alto = entrada.nextDouble();

        System.out.println("Ingresa el precio por metro cuadrado:");
        double precio = entrada.nextDouble();

        double area = ancho * alto;
        double costoTotal = area * precio;

        System.out.println("Area de la pared: " + area);
        System.out.println("Costo total: " + costoTotal);
    }
}
