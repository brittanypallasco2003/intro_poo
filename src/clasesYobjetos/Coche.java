package clasesYobjetos;

public class Coche {
    //una clase debe tener:
    //Atributos
    String color, marca;
    int kmRecorridos;

    //metodo
    public static void main(String[]args) {
        //Dentro de este metodo main se crearan los objetos de la clase Coche
        Coche coche1 = new Coche(); //como objeto de la clase Coche, tiene todos los atributos de la clase Coche
        Coche coche2 = new Coche();

        //Rellenan los atributos del objeto
        coche1.color = "blanco";
        coche1.marca = "Audi";
        coche1.kmRecorridos = 0;

        //Imprimir los atributos de la clase coche
        System.out.println("El color del coche1 es: " + coche1.color);
        System.out.println("La marca del coche1 es: " + coche1.marca);
        System.out.println("Los km recorridos de coche1 son: " + coche1.kmRecorridos);


        coche2.color = "rojo";
        coche2.marca="ferrari";
        coche2.kmRecorridos=100;
        System.out.println("El color del coche1 es: " + coche2.color);
        System.out.println("La marca del coche1 es: " + coche2.marca);
        System.out.println("Los km recorridos de coche1 son: " + coche2.kmRecorridos);

        //El metodo main  puede estar dentro de la misma clase o se puede crear el metodo main en una clase extra

    }
}
