package Estructuras;

// &&
public class CompuestaOperadorLogicoY {
    public static void main(String[] args) {
        int edad = 25;
        boolean licenciaConducir = true;

        // condicion compuesta and &&
        if (edad >=18 && licenciaConducir) {
            System.out.println("Si puedes conducir el auto" );
        } else {
            System.out.println("No puedes conducir el auto" );
        }

    }

}
