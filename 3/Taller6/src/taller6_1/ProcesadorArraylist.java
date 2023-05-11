package taller6_1;

import java.util.ArrayList;

public class ProcesadorArraylist {

    public void imprimirArraylistFacturas(ArrayList<Factura> arl) {
        int i = 0;
        System.out.println("Nombre\t\t\tDocumento\t\t\tCargo\t\t\tSueldo\t\t\tValor total");
        while (i < arl.size()) {
            System.out.println(arl.get(i).nombre + "\t\t\t" + arl.get(i).documento+ "\t\t\t" + arl.get(i).cargo + "\t\t\t" + arl.get(i).sueldo+ "\t\t\t" + arl.get(i).valorTotal());
            i++;  
       }
    }

}
