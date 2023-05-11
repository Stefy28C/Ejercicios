package Alumnos;

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
        Informacion informacion=new Informacion();
        while (rec != null) {
            
            System.out.println("Nombre  " + rec.info.Nombre);
            System.out.println("Nota 1: " + rec.info.n1);
            System.out.println("Nota 2: " + rec.info.n2);
            System.out.println("Nota 3: " + rec.info.n3);
            System.out.println("________________________________________");
            System.out.println("El promedio fue "+rec.info.promedio());
            rec = rec.siguiente;
        }
    }
    
    
    
}
