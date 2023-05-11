package Taller_4;

public class Matriz_Vector {

    public void calcularVector() {

        int nfilas, ncols;     // filas y columnas de la matriz

        do {
            System.out.print("Número de filas de la matriz:    ");
            nfilas = Leer.datoInt();
        } while (nfilas < 1);    // no permitir un valor negativo

        do {
            System.out.print("Número de columnas de la matriz: ");
            ncols = Leer.datoInt();
        } while (ncols < 1);     // no permitir un valor negativo

        float[][] m = new float[nfilas][ncols]; // crear la matriz m
        int fila = 0, col; // subíndices
        int h=1;
        int tamresultante = nfilas * ncols;
        float vresultante[] = new float[tamresultante];

        System.out.println("Introducir los valores de la matriz.");
        for (fila = 0; fila < nfilas; fila++) {
            for (col = 0; col < ncols; col++) {
                System.out.print("m[" + fila + "][" + col + "] = ");
                m[fila][col] = Leer.datoFloat();
                vresultante[h]=m[fila][col];
            }
        }
        System.out.println();

        //Imprimir la matriz
        for (fila = 0; fila < nfilas; fila++) {
            //System.out.println("|");
            for (col = 0; col < ncols; col++) {
                System.out.print(m[fila][col] + "\t");
                //System.out.print("\t");
            }
            System.out.println("");
        }

        System.out.println("");
//almacenar en un vector 
        System.out.println("EL vector resultante es :");
        for (fila = 0; fila < tamresultante; fila++) {
            System.out.println(vresultante[fila]);
        }

        System.out.println();
    }
}
