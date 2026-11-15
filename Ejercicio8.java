import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa x:");
        double x = entrada.nextDouble();

        System.out.println("Ingresa y:");
        double y = entrada.nextDouble();

        System.out.println("Ingresa z:");
        double z = entrada.nextDouble();

        double resultado = (x + 2 * y) / (z - x);

        System.out.println("El resultado es: " + resultado);
    }
}
