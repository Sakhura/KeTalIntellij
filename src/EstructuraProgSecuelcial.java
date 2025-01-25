import java.util.Scanner;

/*Problema: Cargar 2 nros enteros por teclado y mostrar (imprimir)
* suma y el promedio
* Inicio-> nro1 -> nro2 -> suma = nro1+ nro2 -> promedio = suma /2 -> fin
*
* */
public class EstructuraProgSecuelcial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nro1, nro2, suma, promedio;

        //ingreso teclado
        System.out.println("Ingrese el primer nro: ");
        nro1 = teclado.nextInt();
        System.out.println("Ingrese el segundo nro: ");
        nro2 = teclado.nextInt();
        suma = nro1 + nro2;
        promedio = suma / 2;
        System.out.println("La suma de " + nro1 + " y " + nro2 + " es: " + suma);
        System.out.println("El promedio es: " + promedio);
    }
}


