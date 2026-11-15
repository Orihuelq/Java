import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa la calificacion:");
        double calificacion = entrada.nextDouble();

        boolean valida = calificacion >= 0.0 && calificacion <= 10.0;

        System.out.println("Calificacion valida: " + valida);
    }
}
