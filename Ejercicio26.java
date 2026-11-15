import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa un numero entero:");
        int num = entrada.nextInt();

        boolean dosDigitos = num >= 10 && num <= 99;

        System.out.println("Es un numero positivo de dos digitos: " + dosDigitos);
    }
}
