package Metodo_constructor;

public class Mainpersona {

    public static void main(String[] args) {
        //1. Se crea el objeto
        Persona p1 = new Persona("Juana", 19);//Como el metodo persona ya se definio, se le debe mandar los argumentos, a la declaracion del metodo constructor, de acuerdo al tipo de dato de sus parametros

        /*
        En resumen:
        Al crear el objeto p1 y al poner el constructor Persona, se le llama al metodo constructor
        Y ENVIA los argumentos que se hayan dentro de los () y son recibidos por los parametros definidos en la declaracion del metodo

        Constructor persona, le asigna un valor a los atributos definidos
         */
        p1.mostrarDatos();
    }
}