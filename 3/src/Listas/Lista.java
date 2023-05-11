package Listas;

public class Lista {

    /*para acceder la lista necesitamos el enlace */

    Nodo inicio, fin;//para acceder al incio y al fin de la lista
    int cont = 0;

    public Lista() {
        //hay wque hacer una referencia a un objeto de nodo

        inicio = null;

        fin = null;
    }

    //este metodo me valida si la lista esta vacia
    public boolean estaVacia() {
        return inicio == null;

    }


    public void agregandoInicio(String d) {

        //valida si esta vacia o no
        //nos va a contar la cantidad de nodos eso significa que cada vez que se agrega un nuevo metodo el contador va a contar

        cont++;
        if (estaVacia()) {
            //se crea un nuevo nodo si la lista esta vacia
            //cada nodo que se cree se va a crear con un enlace
            inicio = new Nodo(d, inicio);
            //apunta a fin porque el inicio es el fin porque solo es un nodo
            fin = inicio;
        } else {
            //hacemos que inicio apunte a ese nuevo nodo
            inicio = new Nodo(d, inicio);
        }

    }

    //se invoca el constructo nuevo que hicimos
    public void agregandoAlfinal(String d) {
        //para que cuente el numero de nodos
        cont++;
        if (estaVacia()) {
            //si esta vacia
            inicio = new Nodo(d);
            fin = inicio;
        } else {
            //si la lista no esta vacia el puntero fin apunta a ese nodo
            //apunta al siguiente del nodo que acabamos de crear
            fin.siguiente = new Nodo(d);
            // para que fin se ubique en el final donde debe estar debe apuntar a fin siguiente
            fin = fin.siguiente;
        }
    }


    public int cantidadNodos() {
        return cont;

    }

    public void mostrarLista() {

        //necesitamos el punteero inciio para acceder al primer elemento
        //por eso aux apunta a donde esta el inicio
        Nodo aux = inicio;
        //si aux es diferente de null entonces incio no apunta a null
        while (aux != null) {
            //accedimos a un atributo de la clase nodo(accede al dato del primer nodo)
            System.out.print("[" + aux.dato + "]----->");
            aux = aux.siguiente;
        }

            /*
            //necesitamos que se brinque al siguiente o solo quedara en uno solo
            en este sentido auxiliar va a ser movible */
    }

}



