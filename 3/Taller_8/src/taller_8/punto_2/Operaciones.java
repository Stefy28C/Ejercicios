
package taller_8.punto_2;

import taller_8.*;

public class Operaciones {
    
    
    ///Insertar un nodo
    public Nodo insertar(Nodo lista, Nodo nuevo) {
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
    
    
    ///Eliminar un nodo
    public Nodo eliminar(Nodo lista, int codigo) {
        Nodo recorrer = lista;
        Nodo anterior = null;
        while ((recorrer != null) && (recorrer.informacion.cod!=codigo)) {
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
    
    
    //Buscar nodo por codigo
    public Nodo buscar(Nodo lista, int codigo) {
        Nodo recorrer = lista;
        while ((recorrer != null) && (recorrer.informacion.cod!=codigo)) {
            recorrer = recorrer.siguiente;
        }
        if (recorrer != null) {
            return recorrer;
        } else {
            return null;
        }
    }
    
    
    ///modificar un nodo
    
    public Nodo modificar(Nodo lista, int codigo, String nuevoNombre, String nuevaPresentacion,int nuevaCantidad,int nuevoValorUnitario) {
        Nodo recorrer = lista;
        while ((recorrer != null) && (recorrer.informacion.cod!=codigo)) {

            recorrer = recorrer.siguiente;
        }
        if (recorrer != null) {
            recorrer.informacion.nombre= nuevoNombre;
            recorrer.informacion.presentacion = nuevaPresentacion;
            recorrer.informacion.cantidad=nuevaCantidad;
            recorrer.informacion.valor_total=nuevaCantidad;
            recorrer.informacion.cantidad=nuevaCantidad;
        }
        return lista;
    }
    
    
    ///Listar un nodo 
    
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
