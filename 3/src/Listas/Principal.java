package Listas;

public class Principal {


    public static void main(String[] args) {
        //invocar al metodo para insertar metodos a la lista enlazada
        Lista miLista = new Lista();

miLista.agregandoAlfinal("Tefa");
        miLista.agregandoAlfinal("Juan");
        miLista.agregandoAlfinal("Ana");
        miLista.agregandoAlfinal("Lupita");
        miLista.agregandoAlfinal("María");
        miLista.agregandoInicio("German");//el primer elemento de la lista enlaceda es maria porque estamos agregandola al inciio a pesar que esta al final
        miLista.mostrarLista();


        if (miLista.estaVacia()) {
            System.out.println("La lista esta vacia ");
        } else {
            System.out.println("\nLa lista no esta vacia");
        }

        System.out.println("Cantidad de elementos de la lista enlazada: "+miLista.cantidadNodos());
    }
}
