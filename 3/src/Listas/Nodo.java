package Listas;

public class Nodo {
    /*
     * Cada vez que se crea un nuevo nodo estaremos creando un objeto de la clase nodo
     *o sea esteremos creando un nuevo nodo
     **/
    String dato;
    //contiene el enelace contendra la direccion del siguietne nodo, su tipo de dato es nodo
    Nodo siguiente;

    //creando el contructor de la clase para agregar nodos
    public Nodo(String d, Nodo sig) {
        dato = d;
        siguiente = sig;

//
    }

    public Nodo(String d) {
        dato = d;
        siguiente = null;
    }
}
