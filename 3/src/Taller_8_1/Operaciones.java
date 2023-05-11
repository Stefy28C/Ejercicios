package Taller_8_1;

public class Operaciones {


    public Nodo añadirInicio(Nodo cabeza, Nodo nuevo) {
        if (cabeza != null) {
            Nodo recorrer = cabeza;

            while (recorrer.siguiente != null) {
                recorrer = recorrer.siguiente;
            }
            recorrer.siguiente = nuevo;
            nuevo.siguiente = null;
        } else {
            cabeza = nuevo;
        }
        return cabeza;
    }

    public Nodo añadirFinal(Nodo cabeza, Nodo nuevo) {
        if (cabeza != null) {
            Nodo recorrer = cabeza;
            Nodo current_last=recorrer;
            while (recorrer != null) {
                current_last=recorrer;
                recorrer = recorrer.siguiente;
            }
    current_last.siguiente=nuevo;
        } else {
            cabeza = nuevo;
        }
        return cabeza;
    }


    public void Listar(Nodo cabeza) {
        Nodo Cabeza = new Nodo();
        Nodo recorrer = Cabeza;
        int contador = 80;
        while (contador <= 100) {
            recorrer.informacion.newNumero = contador;
            if (contador < 100) {
                recorrer.siguiente = new Nodo();
            }
            recorrer = recorrer.siguiente;
            contador += 2;
        }
        recorrer = Cabeza;
        while (recorrer != null) {

            System.out.println(recorrer.informacion.newNumero);
            recorrer = recorrer.siguiente;
        }
     //   System.out.println(new Operaciones().añadirFinal(cabeza,new Nodo()));
    }

}
