package Metodos_con_valor_de_retorno;

import java.util.Scanner;

public class Main_retornovalues {

    //1. crear el metodo main
    public static void main (String[]args){

        //2. crear el objeto
        RetornoValues op1 =new RetornoValues();

        //3. Pedir al usuario que ingrese datos
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros: ");
        int numero1= entrada.nextInt();
        int numero2= entrada.nextInt();

        //4. Invocacion de los metodos
            //todos estos metodos retornaban algo
        int suma= op1.sumar(numero1, numero2);
        int producto= op1.multiplicar(numero1,numero2);
        int resta= op1.restar(numero1, numero2);
        int division= op1.dividir(numero1,numero2);
            //tanto suma, producto, resta, division son variables locales por que NO estan fuera del main, en especifico, de su  respectivo metodo

        //se almacenan los valores que retornan la ejecucion de los metodos en esas variables locales

        //5. Invocar el metodo de imprimir resultados
        op1.mostrarResultados(suma, producto, resta, division);//-->se mandan como argumentos los valores que retornan de los metodos al metodo "MOSTRAR"


        /*
        Otra forma de mostrar los resultados es:
        System.out.println("La suma es: "+op1.sumar(numero1, numero2));
    */
    }


}
