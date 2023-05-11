/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fifo;

public class Cola {

    private Nodo cabeza;

    public void agregar(Informacion info) {
        if (cabeza == null) {
            cabeza = new Nodo();
            cabeza.info = info;
        } else {
            Nodo rec = cabeza;
            while (rec.siguiente != null) {
                rec = rec.siguiente;
            }
            rec.siguiente = new Nodo();
            rec.siguiente.info = info;
        }
    }

    public Informacion atender() {
        if (cabeza != null) {
            Nodo temp = cabeza;
            cabeza = cabeza.siguiente;
            temp.siguiente = null;
            return temp.info;
        }
        return new Informacion();
    }

    public void listar() {
        Nodo rec = cabeza;

        while (rec != null) {

            System.out.println("cliente : " + rec.info.dato1);
            System.out.println("________________________");
            rec = rec.siguiente;
        }
    }

    public void contador() {

        Nodo rec = cabeza;
        int cont = 0;
        while (rec != null) {

            rec = rec.siguiente;
            cont++;
        }
            System.out.println("El numero de nodos hasta el momento " + cont);
            System.out.println("________________________");

    }

}
