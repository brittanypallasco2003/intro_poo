package classANDobjects;

import java.util.Scanner;
/*
Es el mismo ejercicio de crear una clase llamada Operacion, solo que en este en la Declaracion del metodo, van a ir
parametros y en la invocacion del metodo van los argumentos que se le pidio al usuario en la clase main
 */

public class Operacion {
    Scanner entrada = new Scanner(System.in);
    //Atributos
    //cuando LAS VARIABLES ESTAN FUERA DE UN METODO, SE CONOCEN como VARIABLES GLOBALES
    //cuando las variables estan DENTRO DE UN METODO, SE CONOCEN como VARIABLES LOCALES
    int suma, resta, mult, division;

    //METODOS

    //metodo para sumar dos numeros
    public void sumar(int n1, int n2) {
        suma = n1 + n2;
    }

    //metodo para restar dos numeros
    public void restar(int n1, int n2) {
        resta = n1 - n2;
    }

    //metodo para multiplicar dos numeros
    public void multiplicar(int n1, int n2) {
        mult = n1 * n2;
    }

    //metodo para dividir dos numeros
    public void dividir(int n1, int n2) {
        division = n1 / n2;
    }

    //metodo para mostrar los resultados

    //Este metodo funciona porque las variables suma, division, resta, producto se declararon fuera de los metodos, por lo que pueden ser ocupados por cualquiera de los metodos
    //Ejemplo: "suma" se ocupo en el metodo sumar y en el metodo mostrar resultado

    public void mostrarResultados() {
        System.out.println("la suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("El producto es: " + mult);
        System.out.println("La division es: " + division);

        //A este punto no se ha creado un objeto a la clase Operacion
        //Hay 2 cosas que se pueden hacer:
        //1. Se crea un metodo main en esta misma clase
        //2. se crea una nueva clase que se llame main y ahi se instancia o se crean objetos de la clase Operacion
    }
}
