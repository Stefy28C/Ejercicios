package Taller_4;

public class Diagonal {

    public void calcularDiagonal() {
        int opc;

        do {
            int nfilas, ncols;     // filas y columnas de la matriz

            do {
                System.out.print("Número de filas de la matriz:    ");
                nfilas = Leer.datoInt();
            } while (nfilas < 1);    // no permitir un valor negativo

            do {
                System.out.print("Número de columnas de la matriz: ");
                ncols = Leer.datoInt();
            } while (ncols < 1);     // no permitir un valor negativo

            //Vañidacion de tamaño de matriz 
            if (nfilas == ncols) {
                float[][] m = new float[nfilas][ncols]; // crear la matriz m
                int fila, col; // subíndices

                //llenar la matriz 
                for (fila = 0; fila < nfilas; fila++) {
                    for (col = 0; col < ncols; col++) {
                        m[fila][col] = 0;

                        //se almacena 1 en la diagonal principal 
                        if (col == fila) {
                            m[fila][col] = 1;
                        }
                    }
                }
                System.out.println();
                
                //imprimir la matriz
                for (fila = 0; fila < nfilas; fila++) {
                    //System.out.println("|");
                    for (col = 0; col < ncols; col++) {
                        System.out.print(m[fila][col] + "\t");
                        //System.out.print("\t");
                    }
                    System.out.println("");
                }
            } else {
                System.out.println("La matriz ingresada no es proporcional ");
            }
            System.out.println();

            System.out.println("Para intentarlo de nuevo presione 1 de lo contrario presione 0");
            opc = Leer.datoInt();
        } while (opc == 1);

    }
}
