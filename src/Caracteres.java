public class Caracteres {
    public static void main(String[] args) {
        String saludo = "Hola";
        String nombre = "Sabina";
        String mensaje= "¡" + saludo + " , " + nombre + "!";

        System.out.println("Mensaje: " + mensaje); // ¡Hola Sabina!
        System.out.println("Longitud: " +mensaje.length()); // cant caracteres
        System.out.println("Mayúsculas: " + mensaje.toUpperCase()); // la frase en mayúsculas
        System.out.println("¿Tiene la palabra Sabina? " + mensaje.contains("Sabina"));// true
        System.out.println("Cambiar el nombre: " + mensaje.replace("Sabina", "Percy")); // hola Percy

    }
}
