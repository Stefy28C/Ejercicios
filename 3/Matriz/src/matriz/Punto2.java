package matriz;

public class Punto2 {

    public void Ejercicio2() {
        int nElementos;
        int aux;
        System.out.print("Número de elementos del vector ");
        nElementos = Leer.datoInt();
        int[] m = new int[nElementos]; // crear la matriz m
        int i = 0; // subíndice

        System.out.println("Introducir los valores del vector.");
        for (i = 0; i < nElementos; i++) {
            System.out.print("m[" + i + "] = ");
            m[i] = Leer.datoInt();

        }
        //Organizar el vector de mayor a menor
        System.out.println();
        for (i = 0; i < nElementos; i++) {
            System.out.print(m[i] + " ");
        }
        System.out.println("");
        for (i = 0; i < (nElementos - 1); i++) {
            for (int j = 0; j < (nElementos - 1); j++) {
                if (m[j] > m[j + 1]) {
                    aux = m[j];
                    m[j] = m[j + 1];
                    m[j + 1] = aux;

                }
            }
        }

        System.out.println("El vector ordenado en forma creciente : ");
        for (i = 0; i < nElementos; i++) {
            System.out.print(m[i] + "|");

        }
        System.out.println("");
        System.out.println("El vector ordenado de forma decreciemte : ");
        //if(m[i]<0){
        for (i = (nElementos - 1); i >= 0; i--) {
            System.out.print(m[i] + " - ");
        }
        System.out.println("");
        //}
    }
}
