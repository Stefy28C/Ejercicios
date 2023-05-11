package taller__12;

public class Pila {

    private Nodo cabeza;

    public void agregar(Informacion info) {
        if (cabeza == null) {
            cabeza = new Nodo();
            cabeza.info = info;
        } else {
            Nodo nuevo = new Nodo();
            nuevo.info = info;
            nuevo.siguiente = cabeza;
            cabeza = nuevo;
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
         int est = 1;
        System.out.println("La pila esta conformada por ");
        while (rec != null) {
           

            System.out.println("Datos del estudiante " + est);
            System.out.println(rec.info.Nombre + "  ");
            System.out.println(rec.info.codigo + "  ");
            System.out.println(rec.info.n1 + "  ");
            System.out.println(rec.info.n2 + "  ");
            System.out.println(rec.info.n3 + "  ");
            System.out.println("El promedio fue " + rec.info.promedio() + "  ");
            rec = rec.siguiente;
            est++;
        }
    }

}
