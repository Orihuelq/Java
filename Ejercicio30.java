import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa la primera calificacion:");
        double calificacion1 = entrada.nextDouble();

        System.out.println("Ingresa la segunda calificacion:");
        double calificacion2 = entrada.nextDouble();

        System.out.println("Ingresa la tercera calificacion:");
        double calificacion3 = entrada.nextDouble();

        double promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
        boolean buenDesempeno = promedio >= 8.0 && calificacion1 >= 7.0 && calificacion2 >= 7.0 && calificacion3 >= 7.0;

        System.out.println("Promedio: " + promedio);
        System.out.println("Buen desempeno: " + buenDesempeno);
    }
}
