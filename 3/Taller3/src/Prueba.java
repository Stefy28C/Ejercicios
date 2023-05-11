public class Prueba {

    public static void main(String[] args) {
        int nElementos;
        System.out.print("Número de notas del estudiante: ");
        nElementos = taller3.Leer.datoInt();
        int[] m = new int[nElementos]; // crear la matriz m
        int i = 0; // subíndice
        float validarn = 0;
        float promedio = 0;
        
        System.out.println("Introducir las notas del estudiante.");
        
        
        
        for (i = 0; i < nElementos; i++) {
            System.out.print("m[" + i + "] = ");
            m[i] = taller3.Leer.datoInt();

            /* if(m[i]>0 && m[i]<=10){
                System.out.println("");                                                                                     
            }*/
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
