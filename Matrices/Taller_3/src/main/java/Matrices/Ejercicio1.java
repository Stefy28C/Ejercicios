package Matrices;




public class Ejercicio1 {

    DatosMatrices obj1 = new DatosMatrices();
    int tamano, fila, col;

    public void SumaFilasColumnas() {
        System.out.println("Ingrese el numero de filas");
        tamano = Leer.datoInt();

        obj1.Matriz = new int[tamano][tamano];
        obj1.Vector = new int[tamano];
        obj1.VectorF = new int[tamano];

        System.out.println("Ingrese los datos de la matriz");
        for (fila = 0; fila < tamano; fila++) {
            for (col = 0; col < tamano; col++) {
                System.out.print("m[" + fila + "][" + col + "]= ");
                obj1.Matriz[fila][col] = Leer.datoInt();
            }

        }

        System.out.println("Mostrar los datos");
        for (fila = 0; fila < tamano; fila++) {
            for (col = 0; col < tamano; col++) {
                System.out.print(obj1.Matriz[fila][col] + "\t");
            }
            System.out.println("");
        }

        //aqui se empiezan a sumar las columnas

        for (fila = 0; fila < tamano; fila++) {
            for (col = 0; col < tamano; col++) {
                obj1.VectorF[fila] += obj1.Matriz[fila][col];
                obj1.Vector[col] += obj1.Matriz[fila][col];

            }
        }


        System.out.println("Vector suma de filas");
        for (fila = 0; fila < tamano; fila++) {
            System.out.println("m[" + fila + "] = "+obj1.VectorF[fila] + "\t");
        }

        System.out.println("Vector suma de columnas");

        for (col = 0; col < tamano; col++) {
            System.out.println("m[" + col + "] = "+obj1.Vector[col] + "\t");
        }


    }
}