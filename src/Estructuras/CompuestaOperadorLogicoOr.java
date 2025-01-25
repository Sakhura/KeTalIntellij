package Estructuras;
 // ||
public class CompuestaOperadorLogicoOr {
     public static void main(String[] args) {
         boolean esEstudiante = false;
         boolean esProfesor = true;

         //condicion compuesta or ||
         if (esEstudiante || esProfesor) {
             System.out.println("Tendra Descuento");
         }else {
             System.out.println("No tienes descuento");
         }
     }

}
