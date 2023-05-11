package Arrays;

import Taller1.Datos;

public class Ejercicio1 {

    DatosClases obj1 = new DatosClases();
    int i;

    public void SumaVectores() {

        System.out.println("Ingrese  tamaño vector ");
        obj1.tam = Leer.datoInt();
        obj1.A = new int[obj1.tam];
        obj1.B = new int[obj1.tam];
        obj1.C = new int[obj1.tam];


        System.out.println("Ingrese datos del vector A ");

        System.out.println("Ingrese datos del vector A ");
        for (i = 0; i < obj1.tam; i++) {
            System.out.print("A[ " + i + " ]=  ");
            obj1.A[i] = Leer.datoInt();
        }

        System.out.println("Ingrese datos del vector B ");
        for (i = 0; i < obj1.tam; i++) {
            System.out.print("B[ " + i + " ]=  ");
            obj1.B[i] = Leer.datoInt();
        }

        for (i = 0; i < obj1.tam; i++) {

//Se suma el vector
            obj1.C[i] = obj1.A[i] + obj1.B[i];
        }
        System.out.println("LOS  DATOS DEL VECTOR A SON :");
        for (i = 0; i < obj1.tam; i++) {
            System.out.print(obj1.A[i] + "\t");

        }

        System.out.println("");
        for (i = 0; i < obj1.tam; i++) {
            System.out.print(obj1.B[i] + "\t");

        }
        System.out.println("");

        for (i = 0; i < obj1.tam; i++) {
            System.out.print(obj1.C[i] + "\t");

        }
        System.out.println("");

    }
}
