package taller3;

/*public class Taller3 {

    // Creación de una matriz unidimensional
    public static void main(String[] args) {
        int nElementos;
        System.out.print("Número de elementos de la matriz: ");
        nElementos = Leer.datoInt();
        int[] m = new int[nElementos]; // crear la matriz m
        int i = 0; // subíndice

        System.out.println("Introducir los valores de la matriz.");
        for (i = 0; i < nElementos; i++) {
            System.out.print("m[" + i + "] = ");
            m[i] = Leer.datoInt();
        }

        // Visualizar los elementos de la matriz
        System.out.println();
        for (i = 0; i < nElementos; i++) {
            System.out.print(m[i] + " ");
        }
        System.out.println("\n\nFin del proceso.");
    }
}*/
public class Taller3 {

    public static void main(String[] args) {
        int nElementos;
        System.out.print("Número de notas del estudiante: ");
        nElementos = Leer.datoInt();
        int[] m = new int[nElementos]; // crear la matriz m
        int i = 0; // subíndice
        float validarn = 0;
        float promedio = 0;
        int ciclo = 2;

        System.out.println("Introducir las notas del estudiante.");

        for (i = 0; i < nElementos; i++) {
            System.out.print("m[" + i + "] = ");
            m[i] = Leer.datoInt();

            if (m[i] <= 0 || m[i] > 10) {
                //ciclo = 1;
                System.out.println("Usted ingreso una nota no valida ");
                i--;
            }
            validarn += m[i];
            promedio = validarn / nElementos;
        }

        // Visualizar los elementos de la matriz
        System.out.println();
        for (i = 0; i < nElementos; i++) {
            System.out.print(m[i] + " ");
        }
        System.out.println("Vector suma =" + validarn);
        System.out.println("Vector promedio =" + promedio);
        System.out.println("\nFin del proceso.");

    }
}
