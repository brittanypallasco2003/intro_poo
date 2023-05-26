package clasesYobjetos;
//Lo primero que se leera sera el metodo main y se dara cuenta que se creo un objeto op  de la clase operacion
// y leera el primer metodo que mandara a llamar: leerNumeros, luego pasara a hacer todos los metodos que mande
public class Main {
    //se crea el metodo main para la creacion de los objetos
    public static void main(String[]args){
        Operacion op=new Operacion();

        //Utilizaremos el metodo leerNumeros
        op.leerNumeros();
        op.sumar();
        op.restar();
        op.multiplicar();
        op.dividir();
        op.mostrarResultados();

    }
}
