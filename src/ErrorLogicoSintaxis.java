import java.util.Scanner;

public class ErrorLogicoSintaxis {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int lado;
        int superficie; // lado * lado
        System.out.println("Introduce el valor del lado del cuadrado: ");
        lado = teclado.nextInt();
        superficie = lado *lado;
        System.out.println("El superficie es " + superficie);
    }
}
