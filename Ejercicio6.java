import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa el primer numero:");
        double a = entrada.nextDouble();

        System.out.println("Ingresa el segundo numero:");
        double b = entrada.nextDouble();

        double promedioArmonico = (2 * a * b) / (a + b);

        System.out.println("El promedio armonico es: " + promedioArmonico);
    }
}
