package Taller_8_1;

public class Main {


    public static void main(String[] args) {
        Nodo cabeza = null;
        int opcion = 0;
        while (opcion != 2) {
            System.out.println("1. Agregar ");
            //System.out.println("2. Agregar al final");
            System.out.println("2. Salir");

            System.out.print("digite el numero de la opcion deseada: ");
            opcion = Leer.datoInt();
            switch (opcion) {
                case 1:
                    Nodo nodo = new Nodo();
                    System.out.println("Ingrese el numero que quiere incluir al inicio");
                    nodo.informacion.newNumero = Leer.datoInt();

                    cabeza = new Operaciones().añadirInicio(cabeza, nodo);


                    System.out.println("Ingrese el numero que quiere incluir al final");
                    nodo.informacion.newNumero = Leer.datoInt();

                    cabeza = new Operaciones().añadirFinal(cabeza, nodo);
                    break;

            }
            System.out.println("Gracias por usarnos.");
        }

        Nodo Cabeza = new Nodo();
        Nodo recorrer = Cabeza;
        int contador = 80;
        while (contador <= 100) {
            recorrer.informacion.newNumero = contador;
            if (contador < 100) {
                recorrer.siguiente = new Nodo();
            }
            recorrer = recorrer.siguiente;
            contador += 2;
        }
        recorrer = Cabeza;
        while (recorrer != null) {

            System.out.println(recorrer.informacion.newNumero);
            recorrer = recorrer.siguiente;
        }
    }

}