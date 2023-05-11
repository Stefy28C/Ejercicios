package Matrices;



public class Ejercicio_2 {

    DatosMatrices obj2 = new DatosMatrices();
    int tamano, fila, col;

    public void diagonal() {

        System.out.println("Ingrese el numero de filas");
        tamano = Leer.datoInt();

        obj2.Matrix = new int[tamano][tamano];
        obj2.VectorResultante=new int[tamano];

        System.out.println("Ingrese los datos de la matriz");
        for (fila = 0; fila < tamano; fila++) {
            for (col = 0; col < tamano; col++) {
                System.out.print("m[" + fila + "][" + col + "]= ");
                obj2.Matrix[fila][col] = Leer.datoInt();
            }

        }
        System.out.println("Mostrar los datos");
        for (fila = 0; fila < tamano; fila++) {
            for (col = 0; col < tamano; col++) {
                System.out.print(obj2.Matrix[fila][col] + "\t");
                if (fila == col) {
                    obj2.VectorResultante[fila] = obj2.Matrix[fila][col];
                }
            }
            System.out.println("");
        }

        for (fila = 0; fila < tamano; fila++) {
            System.out.println("El vector resultante fue " + obj2.VectorResultante[fila]);
        }
    }
}