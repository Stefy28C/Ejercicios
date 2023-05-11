package taller2;

public class Taller2 {

    public static void main(String[] args) {
        int opc = 0, ciclo = 2;

        while (ciclo == 2) {
            System.out.println(" M E N U    P R I N C I P A L");
            System.out.println("1. Serie");
            System.out.println("2. Multiplos");
            System.out.println("3. Sangre");
            System.out.println("4. Mayor y menor");
            System.out.println("5..Salir");
            System.out.println("Ingrese la opcion que desea ");
            opc = Leer.datoInt();

            switch (opc) {
                case 1:
                    Ejercicio1 obj1 = new Ejercicio1();
                    obj1.primero();
                    break;
                case 2:
                    Ejercicio2 obj2 = new Ejercicio2();
                    obj2.dos();
                    break;
                case 3:
                    Ejercicio3 obj3 = new Ejercicio3();
                    obj3.tres();
                    break;
                case 4:
                    Ejercicio4 obj4 = new Ejercicio4();
                    obj4.cuatro();
                    break;
                case 5:
                    
                default:

            }
        }
    }
}
