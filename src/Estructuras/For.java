package Estructuras;

/* For sintaxis
    for (inicializacion; condicion; incremento/decremento){
        bloque código

       for (int i = 5; i >= 1; i--) {
            System.out.println("Numero:  " + i);
        }

        }

      for con Arrays
       String[] nombres = {"Sabina","Marcelo","Hector","José Luis"};

        for (int i =0; i<nombres.length; i++) {
            System.out.println("Nombre: " + nombres[i]);
        }
* */
public class For {
    public static void main(String[] args) {
       for (int i = 0; i <= 10; i++) {
           for (int j = 0; j <= 10; j++) {
               System.out.println("i = " + i + " - j = " + j);
           }
       }
    }
}
