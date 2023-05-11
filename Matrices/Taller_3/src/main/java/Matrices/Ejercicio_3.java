package Matrices;

public class Ejercicio_3 {

    DatosMatrices obj3 = new DatosMatrices();
    int fila, tam, col;

    public void numeroMayor() {

        float numero_mayor = 0;
        System.out.println("Ingrese el tamaño de la matriz");
        tam = Leer.datoInt();
        obj3.Matriz1 = new float[tam][tam];

        System.out.println("Ingrese los datos ");
        for (fila = 0; fila < tam; fila++) {
            for (col = 0; col < tam; col++) {
                System.out.print("m[" + fila + "][" + col + "| =  ");
                obj3.Matriz1[fila][col] = Leer.datoInt();
            }

        }

        System.out.println("Mostrar los datos");
        for (fila = 0; fila < tam; fila++) {
            for (col = 0; col < tam; col++) {
                System.out.print(obj3.Matriz1[fila][col] + "\t");

            }
            System.out.println("");
        }
        for (fila = 0; fila < tam; fila++) {
            for (col = 0; col < tam; col++) {
                if (obj3.Matriz1[fila][col] > numero_mayor) {
                    numero_mayor = obj3.Matriz1[fila][col];
                    obj3.f = fila + 1;
                    obj3.c= col + 1;
                }

            }
        }
        System.out.println("El numero mayor es: " + numero_mayor);
        System.out.println("La fila es: " + obj3.f + " La columna es: " + obj3.c);
    }
}
