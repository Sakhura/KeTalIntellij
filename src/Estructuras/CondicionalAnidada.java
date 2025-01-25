package Estructuras;

/* es una estructura compuesta dentro de otra estructura compuesta
if // if - else
* */

public class CondicionalAnidada {
    public static void main(String[] args) {
        int edad = 45;
        boolean tieneCarnetIdentidade = false;

        //condicional anidada

        if( edad>= 18) {//primera condicion
            if(tieneCarnetIdentidade) {//segunda condicion que esta dentro de la primera
                System.out.println("Puedes ingresar al recinto porque eres mayor de edad y tienes tu carnet de identidad");
            } else {
                System.out.println("No puedes entrar porque no tienes tu carnet de identidad");
            }

        }else{
            System.out.println("No puedes entrar porque NO eres mayo de edad");
        }

    }
}
