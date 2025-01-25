package Estructuras;

import java.util.Scanner;

public class While {

    /*public static void main(String[] args) {
        int contador = 1; // inicializar variable

        while (contador <= 10) { //Condición_ mientras el contador sea menor o igual a 10
            System.out.println("Número:  " + contador);
            contador++; // aumento en la variable
        }*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        do{
            System.out.println("Introduce un numero positivo: ");
            numero = teclado.nextInt();
        }while(numero <= 0);
        System.out.println("El numero introducido es: " + numero);
    }

    }
