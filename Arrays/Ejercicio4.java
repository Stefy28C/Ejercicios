package Arrays;

public class Ejercicio4 {

    DatosClases obj4 = new DatosClases();
    int i, c = 0;

    public void buscarNumero() {

        obj4.Arreglo = new int[]{1, 2, 3, 4, 5, 8, 0, 20, 18, 16, 15, 12, 11, 13, 10};

        System.out.println("Ingrese el numero que quiere encontar");
        obj4.BNumero = Leer.datoInt();


        for (i = 0; i < obj4.Arreglo.length; i++) {

            if (obj4.Arreglo[i] == obj4.BNumero) {
                System.out.println("La posicion del Array es Arreglo[ " + i + " ] Y el numero encontrado fue =  " + obj4.Arreglo[i]);
                c = 1;
            }
        }

        if (c == 0) {
            System.out.println("El numero no se encuentra en el vector"
            );
        }

    }
}
