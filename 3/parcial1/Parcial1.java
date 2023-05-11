package parcial1;
// Parcial Realizado por Nestor Rodriguez y Ximena Buitrago :)

public class Parcial1 {

    public static void main(String[] args) {
        int nfilas, i, temporal = 0, j = 0, valorIngresar;
        do {
            System.out.print("Numero de filas del vector:    ");
            nfilas = Leer.datoInt();
        } while (nfilas < 1);//filas no negativas
        
        int[] vector = new int[nfilas];
        System.out.println();
        System.out.println("Ingrese los valores del vector");
        System.out.println();
        for (i = 0; i < nfilas; i++) {
            System.out.print("vector [" + i + "] :");
            valorIngresar = Leer.datoInt();
            if (valorIngresar % 2 == 1) {
                vector[i] = valorIngresar;
            } else {
                System.out.println("El numero ingresado debe ser impar");
                //intentos 
                i--;
            }
        }
        
        
        System.out.println();
        System.out.println("El vector ingresado es: ");
        System.out.print("[ ");
        for (i = 0; i < nfilas; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.print("]");
        System.out.println("");
        
        //ordenar de menor a mayor 
        for (i = 0; i < nfilas; i++) {
            for (j = 1; j < (nfilas - i); j++) {
                if (vector[j - 1] > vector[j]) {
                    temporal = vector[j - 1];
                    vector[j - 1] = vector[j];
                    vector[j] = temporal;
                }
            }
        }
        System.out.println();
        System.out.println("El vector ordenado es: ");
        System.out.print("[ ");
        for (i = 0; i < nfilas; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.print("]");
        System.out.println("");

        
        //llenar la matriz 
        int Tamano = vector.length;
        int m[][] = new int[Tamano][Tamano];
        int fila, col;
        i = 0;
        for (fila = 0; fila < Tamano; fila++) {
            for (col = 0; col < Tamano; col++) {
                if (fila == col) {
                    m[fila][col] = vector[i];
                    i++;
                } else {
                    m[fila][col] = 0;
                }
            }
        }
        System.out.println("");
        System.out.println("La Matrix generada es: ");
        System.out.println("");
        
// imprimir la matriz

        for (fila = 0; fila < Tamano; fila++) {
            for (col = 0; col < Tamano; col++) {
                System.out.print(m[fila][col] + "\t");
            }
            System.out.println("");
        }
        System.out.println();
    }

}