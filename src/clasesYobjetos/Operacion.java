package clasesYobjetos;

import java.util.Scanner;

public class Operacion {
    Scanner entrada = new Scanner(System.in);
    //Atributos
    int numero1, numero2, suma, resta, mult, division;

    //METODOS
    //metodo para pedirle al usuario que nos digite 2 numeros
    public void leerNumeros() {//como solo se le pedira la usuario ingresar datos, no se requiere retornar algo
        System.out.println("Ingrese 2 numeros: ");
        numero1 = entrada.nextInt();
        numero2 = entrada.nextInt();
    }

    //metodo para sumar dos numeros
    public void sumar() {
        suma = numero1 + numero2;
    }

    //metodo para restar dos numeros
    public void restar() {
        resta = numero1 - numero2;
    }

    //metodo para multiplicar dos numeros
    public void multiplicar() {
        mult = numero1 * numero2;
    }

    //metodo para dividir dos numeros
    public void dividir() {
        division = numero1 / numero2;
    }

    //metodo para mostrar los resultados
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
