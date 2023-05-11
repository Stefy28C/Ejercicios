package sabado;

import java.util.function.Function;
import jdk.nashorn.api.tree.BreakTree;

public class Serie {

    int Numero;
    String Nombre;
    int primerNumero = 1;
    int segundoNumero = 2;
    int suma;
    int Acumulador = 0;
    int acumulador2;

    public void Ingresar() {
        System.out.println("Ingrese su nombre");
        Nombre = Leer.dato();
        System.out.println("Ingrese la cantidad de elementos que quiere que tenga la serie ");
        Numero = Leer.datoInt();

        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("El nombre del usuario fue: " + Nombre + " Y el numero escogido para la serie fue: " + Numero);

    }

    public void Calcular() {

        if (Numero == 1) {
            System.out.println(primerNumero + "\n");

        } else if (Numero == 2) {
             System.out.println(primerNumero + "\n");
            System.out.println(segundoNumero);
        } else {
            for (int i = 0; i < Numero; i++) {
                System.out.println("popo");
                 
                //System.out.println("Acumulador"+Acumulador);
                // System.out.println(primerNumero);
                //System.out.println("suma"+suma);
                //System.out.println(primerNumero);
                //suma=Acumulador;
                // primerNumero++;
                //Acumulador=Acumulador+(primerNumero=segundoNumero);
                //  0 1 2 3 6 12 24 48 96 192 384…..
                //Acumulador=Acumulador+primerNumero;
                //suma=primerNumero+segundoNumero;
                //primerNumero=segundoNumero;
                //segundoNumero=suma;
                //suma=Acumulador+primerNumero+segundoNumero;
                //Acumulador=primerNumero+segundoNumero+suma;
                //Acumulador=Acumulador+suma;
                //Acumulador=primerNumero+segundoNumero+suma;
                //Acumulador=Acumulador+(segundoNumero=suma);
                //Acumulador=Acumulador+suma;
            }
        }

    }
}
