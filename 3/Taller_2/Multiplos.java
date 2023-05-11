package Taller_2;

public class Multiplos {

    public void Calcular() {
        int cantidad;
        int numero;
        int intentos = 3;
        int cuatro = 0;
        int cinco = 0;
        int seis = 0;

        System.out.println("cantidad de numeros");
        cantidad = Leer.datoInt();
        //if(numero % 4 == 0 numero % 5 == 0)

        for (int i = 1; i <= cantidad; i++) {

            System.out.println("Ingrese un número ");

            numero = Leer.datoInt();

            if (numero % 4 == 0 || numero % 5 == 0 || numero % 6 == 0) {

                if (numero % 4 == 0) {
                    cuatro = cuatro + numero;

                }
                if (numero % 5 == 0) {

                    cinco = cinco + numero;

                }
                if (numero % 6 == 0) {

                    seis = seis + numero;

                }
            } else {

                System.out.println("\n" + "Numero invalido");
                System.out.println("Intentos restantes" + intentos);
                intentos--;
                if (intentos == 0) {
                    i = 50;
                }
            }

        }

        System.out.println("La suma de los multiplos de 4 es: " + cuatro);
        System.out.println("La suma de los multiplos de 5 es: " + cinco);
        System.out.println("La suma de los multiplos de 6 es: " + seis);
    }
}
