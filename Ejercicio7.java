import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa el total de caramelos:");
        int caramelos = entrada.nextInt();

        System.out.println("Ingresa la capacidad de cada bolsa:");
        int capacidad = entrada.nextInt();

        int bolsasCompletas = caramelos / capacidad;
        int caramelosRestantes = caramelos % capacidad;

        System.out.println("Bolsas completas: " + bolsasCompletas);
        System.out.println("Caramelos restantes: " + caramelosRestantes);
    }
}
