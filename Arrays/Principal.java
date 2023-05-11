package Arrays;

import Taller1.Secuencia;

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
                    Ejercicio1 obj1 = new Ejercicio1();
                    obj1.SumaVectores();
                    break;
                case 2:
                    Ejercicio2 obj2 = new Ejercicio2();
                    obj2.MayorVector();
                    break;
                case 3:
                    Ejercicio3 obj3 = new Ejercicio3();
                    obj3.NegativosPositivosCeros();
                    break;
                case 4:
                    Ejercicio4 obj4 = new Ejercicio4();
                    obj4.buscarNumero();
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
