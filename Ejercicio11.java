import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa la temperatura en grados Celsius:");
        double temperatura = entrada.nextDouble();

        boolean puntoEbullicion = temperatura >= 100.0;

        System.out.println("Alcanzo el punto de ebullicion: " + puntoEbullicion);
    }
}
