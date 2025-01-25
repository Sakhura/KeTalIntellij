
/*Es una platilla o molde a partir de la cual se pueden crear objetos
* Propiedades (Atributos)
* Comportamiento (métodos)*/
public class ClaseQueEs {

    // atributos (propiedades)
    String nombre;
    int edad;

    public ClaseQueEs(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //metodo (comportamiento)
    public void saludar(){
        System.out.println(this.nombre + " saludando");
    }
}
