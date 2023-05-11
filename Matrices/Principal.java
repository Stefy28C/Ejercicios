package Matrices;

import Arrays.*;
import Arrays.Leer;

public class Principal {
    public static void main(String[] args) {

        int opcion, ciclo = 2;
        while (ciclo == 2) {
            System.out.println(" M E N U    P R I N C I P A L");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Ejercicio 4");
            System.out.println("5.Salir");
            System.out.println("Ingrese la opcion que desea ");
            opcion = Leer.datoInt();

            switch (opcion) {
                case 1:
                    Ejercicio_1 obj1 = new Ejercicio_1();
                    obj1.SumaFilasColumnas();
                    break;
                case 2:
                    Ejercicio_2 obj2 = new Ejercicio_2();
                    obj2.diagonal();
                    break;
                case 3:
                    Ejercicio_3 obj3 = new Ejercicio_3();
                    obj3.numeroMayor();
                    break;
                case 4:
                    Ejercicio_4 obj4 = new Ejercicio_4();
                    obj4.Conteo();
                    break;
                case 5:
                    ciclo = 6;
                    System.out.println("Adios vuelva pronto");
                    break;
                default:
                    System.out.println("Usted marco una opcion incorrecta.Adios");

            }

    }
    }

}
