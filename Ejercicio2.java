import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa el radio de la esfera:");
        double r = entrada.nextDouble();

        double volumen = (4.0 / 3.0) * 3.14159 * r * r * r;

        System.out.println("El volumen es: " + volumen);
    }
}
