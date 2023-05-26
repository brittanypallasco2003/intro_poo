package Metodos_con_valor_de_retorno;

import java.util.Scanner;
public class RetornoValues {

    //Metodos
    public int sumar (int n1, int n2){
        int suma= n1+n2;
        return suma;
    }

    public int multiplicar(int n1, int n2){
        int producto=n1*n2;
        return producto;
    }

    public int restar(int n1, int n2){
        int resta=n1-n2;
        return resta;
    }

    public int dividir(int n1, int n2){
        int division=n1/n2;
        return division;
    }

    //si no se enviaran los argumentos en la invocacion, y se declararan parametros, el metodo Mostrar no funcianria, ya que suma, resta... son variables loclaes de los otros metodos
    public void mostrarResultados(int suma, int producto, int resta, int division){
        System.out.println("La suma es: "+suma);
        System.out.println("El producto es: "+producto);
        System.out.println("La resta es: "+resta);
        System.out.println("La division es: "+division);
    }
}
