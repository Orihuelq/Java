import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa la existencia actual:");
        int existencia = entrada.nextInt();

        System.out.println("Ingresa la cantidad vendida hoy:");
        int vendidos = entrada.nextInt();

        int restantes = existencia - vendidos;
        boolean inventarioBajo = restantes < 15;

        System.out.println("Unidades restantes: " + restantes);
        System.out.println("Inventario bajo: " + inventarioBajo);
    }
}
