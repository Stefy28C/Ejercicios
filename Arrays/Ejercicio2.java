package Arrays;

public class Ejercicio2 {


    DatosClases obj2 = new DatosClases();
    int i;

    public void MayorVector() {
        System.out.println("Ingrese el tamaño del Vector ");
        obj2.tamano = Leer.datoInt();
        obj2.Array = new int[obj2.tamano];

        System.out.println("Ingrese datos del vector");


        obj2.mayor = obj2.Array[0];


        for (i = 0; i < obj2.tamano; i++) {
            System.out.print("A[ " + i + " ]=  ");
            obj2.Array[i] = Leer.datoInt();
            if (obj2.Array[0] > obj2.mayor) {
                obj2.mayor = obj2.Array[i];

            }
        }

        //System.out.println("La posicion del numero mayor del array es: "+obj2.Array[i]);
        System.out.println("El numero mayor del array es: " + obj2.mayor);

    }
}

