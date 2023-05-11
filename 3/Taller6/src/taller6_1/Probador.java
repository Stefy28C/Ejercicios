package taller6_1;

import java.util.ArrayList;

public class Probador {

    public static void main(String[] args) {
        
        Factura fac = new Factura();
        ArrayList<Factura> al = new ArrayList<Factura>();
        
        //System.out.println("cantidad de productos");
        int cant = 2;
        float acum=0;
        for (int i = 0; i < cant; i++) {
            System.out.println("______________________________________");
            fac = new Factura();
            System.out.println("Ingrese el nombre del empleado ");
            fac.nombre = Leer.dato();
            System.out.println("Ingrese el documento de identidad del empleado ");
            fac.documento = Leer.datoInt();
            System.out.println("Ingrese el cargo del empleado");
            fac.cargo=Leer.dato();
            System.out.println("Ingrese el sueldo del Empleado");
            fac.sueldo=Leer.datoFloat();
            acum+=fac.valorTotal();
            //Add Agrega el elemento especificado al final de esta lista
            al.add(fac);
        }
        ProcesadorArraylist p = new ProcesadorArraylist();
        p.imprimirArraylistFacturas(al);
        System.out.println("Total "+acum);
    }

}
