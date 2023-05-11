
package taller_8;
public class Operaciones {
    public Nodo añadir(Nodo lista, Nodo nuevo) {
        if (lista != null) {
            Nodo recorrer = lista;
            while (recorrer.siguiente != null) {
                recorrer = recorrer.siguiente;
            }
            recorrer.siguiente = nuevo;
            nuevo.siguiente = null;
        } else {
            lista = nuevo;
        }
        return lista;
    }
    public Nodo eliminar(Nodo lista, String nombreCiudad) {
        Nodo recorrer = lista;
        Nodo anterior = null;
        while ((recorrer != null) && (!recorrer.informacion.ciudad.equals(nombreCiudad))) {
            anterior = recorrer;
            recorrer = recorrer.siguiente;
        }
        if (recorrer != null) {
            if (anterior != null) {
                anterior.siguiente = recorrer.siguiente;
                recorrer.siguiente = null;
            } else if (anterior == null) {
                lista = recorrer.siguiente;
                recorrer.siguiente = null;
            }
            System.out.println("nodo eliminado");
        }
        else
        {
            System.out.println("no existe el nodo");
        }
        return lista;
    }
    public Nodo buscar(Nodo lista, String nombreCiudad) {
        Nodo recorrer = lista;
        while ((recorrer != null) && (!recorrer.informacion.ciudad.equals(nombreCiudad))) {
            recorrer = recorrer.siguiente;
        }
        if (recorrer != null) {
            return recorrer;
        } else {
            return null;
        }
    }
    public Nodo modificar(Nodo lista, String ciudadbuscada, String nuevaCiudad, String nuevoDepartamento) {
        Nodo recorrer = lista;
        while ((recorrer != null) && (!recorrer.informacion.ciudad.equals(ciudadbuscada))) {

            recorrer = recorrer.siguiente;
        }
        if (recorrer != null) {
            recorrer.informacion.ciudad = nuevaCiudad;
            recorrer.informacion.departamento = nuevoDepartamento;
        }
        return lista;
    }
    public void listar(Nodo lista) {
        Nodo recorrer = lista;
            while (recorrer != null) {
                System.out.println("ciudad: "+recorrer.informacion.ciudad);
                System.out.println("departamento: "+recorrer.informacion.departamento);
                System.out.println("----------------------------------------------------");
                recorrer = recorrer.siguiente;
            }
    }
}
