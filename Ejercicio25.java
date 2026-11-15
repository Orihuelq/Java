import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa la edad:");
        int edad = entrada.nextInt();

        System.out.println("Tiene credencial de estudiante? 1 para si, 0 para no:");
        int credencial = entrada.nextInt();

        boolean gratis = edad < 6 || credencial == 1;

        System.out.println("Viaja gratis: " + gratis);
    }
}
