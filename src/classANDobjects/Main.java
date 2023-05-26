package classANDobjects;
/*
Es el mismo ejercicio de crear una clase llamada Operacion, solo que en este en la Declaracion del metodo, van a ir
parametros y en la invocacion del metodo van los argumentos que se le pidio al usuario en la clase main
 */

import java.util.Scanner;

public class Main {
    //se crea el metodo main para la creacion de los objetos
    //en el metodo main se le pedira los numeros al usuario
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        //creacion del objeto op1
        Operacion op1 =new Operacion();

        System.out.println("Ingrese dos numeros: ");
        int n1=entrada.nextInt();
        int n2=entrada.nextInt();

        //como ya se esta trabajando con parametros en la declaracion de los metodos, se deben introducir los argumentos en la invocacion de los metodos
        op1.sumar(n1,n2);
        op1.restar(n1,n2);
        op1.multiplicar(n1,n2);
        op1.dividir(n1,n2);
        op1.mostrarResultados();//aqui no hace falta enviar un argumento, porque en la declaracion no hay ningun parametro que lo reciba
    }
}
