package Estructuras;

import java.util.Scanner;

public class Evento {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa tú edad: ");
        int edad = teclado.nextInt();
        System.out.println("Ingresa tu nombre: ");
        String nombre = teclado.next();
        System.out.println("Tienes carnet de identidad (true/ false): ");
        boolean tieneCarnet = teclado.nextBoolean();
        System.out.println("Estas acompañado de un adulto (true/ false): ");
        boolean AcompanadoAdulto = teclado.nextBoolean();

        //Condicion compuesta

        if((edad >= 18 && tieneCarnet) || (edad <= 18 && AcompanadoAdulto)) {
            System.out.println("Puedes Ingresar al evento");
        }else {
            System.out.println("No puedes Ingresar al evento");
        }

    }
}
