import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa la velocidad inicial:");
        double v0 = entrada.nextDouble();

        System.out.println("Ingresa la aceleracion:");
        double a = entrada.nextDouble();

        System.out.println("Ingresa el tiempo:");
        double t = entrada.nextDouble();

        double velocidadFinal = v0 + (a * t);

        System.out.println("La velocidad final es: " + velocidadFinal);
    }
}
