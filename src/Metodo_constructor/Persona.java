package Metodo_constructor;

public class Persona {
    //Atributos
    String nombre;
    int edad;

    //Metodos
    //Metodo Constructor
    public Persona(String _nombre, int _edad){//--->como es un metodo, este puede tener parametros
        nombre=_nombre;
        edad=_edad;
    }

    //Metodo para mostrar los atributos
    public void mostrarDatos(){
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
    }


}
