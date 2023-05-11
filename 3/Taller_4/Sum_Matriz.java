package Taller_4;

public class Sum_Matriz {

    public void sumaMatriz() {

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
        int fila, col; // subíndices
        float sumaTotal = 0;

        System.out.println("Introducir los valores de la matriz.");
        for (fila = 0; fila < nfilas; fila++) {
            for (col = 0; col < ncols; col++) {
                System.out.print("m[" + fila + "][" + col + "] = ");
                m[fila][col] = Leer.datoFloat();
            }
        }

        //Imprimir la matriz
        for (fila = 0; fila < nfilas; fila++) {
            //System.out.println("|");
            for (col = 0; col < ncols; col++) {
                System.out.print(m[fila][col] + "\t");
                //System.out.print("\t");
            }
            System.out.println("");
        }

        System.out.println();

        //suma de la matriz
        for (fila = 0; fila < nfilas; fila++) {

            for (col = 0; col < ncols; col++) {
                float elementos = m[fila][col];
                sumaTotal = sumaTotal + elementos;
            }

        }
        System.out.println();

        System.out.println("La sumatoria total de la matriz es " + sumaTotal);
        System.out.println();

        System.out.println("\nFin del proceso.");
    }
}
