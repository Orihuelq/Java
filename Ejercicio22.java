import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa el porcentaje de llenado del tanque:");
        double porcentaje = entrada.nextDouble();

        boolean alerta = porcentaje < 10.0 || porcentaje > 95.0;

        System.out.println("Alerta de nivel critico: " + alerta);
    }
}
