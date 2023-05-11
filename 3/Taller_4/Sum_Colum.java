package Taller_4;

public class Sum_Colum {

    public void sumaColumna() {

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

        int sumacolumna1 = 0;

        //declaramos un array que almacene las columnas 
        float vcolumna[] = new float[ncols];
        float mayor = vcolumna[0];

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

        //suma de columnas
        for (col = 0; col < ncols; col++) {
            sumacolumna1 = 0;

            for (fila = 0; fila < nfilas; fila++) {
                sumacolumna1 += m[fila][col];
                vcolumna[col] = sumacolumna1;
                if (vcolumna[col] > mayor) {
                    mayor = vcolumna[col];

                }

            }
            System.out.println("Suma de la columna " + col + ": " + sumacolumna1);

        }
   System.out.println();
        //Buscar en la matriz la columna 
        for (col = 0; col < ncols; col++) {
            if (mayor == vcolumna[col]) {
                System.out.println("La columna de la suma mayor es: "+col);
            }
        }

        System.out.println("La suma mayor es " + mayor);
        //recorrer el vector de sumacolumna

        System.out.println();

        System.out.println("\nFin del proceso.");
    }
}
