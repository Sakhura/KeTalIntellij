package Estructuras;

/* Estructura condicional Compuesta se utiliza cuando 2 o + posibles acciones se realizan;
es como tomar decisiones verdadero o falsa por lo general se usa IF-ELSE
**/
public class CondicionalCompuesta {

    public static void main(String[] args) {
        int edad = 30;

        //condicional compuesta

        if (edad >=18){
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
        System.out.println("El edad es " + edad);
    }
}
