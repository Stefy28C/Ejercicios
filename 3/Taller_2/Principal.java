package Taller_2;

public class Principal {

    public static void main(String[] args) {
        int opcion, ciclo = 2;

        while (ciclo == 2) {
            System.out.println("------------------------------------");
            System.out.println(" M E N U    P R I N C I P A L");
            System.out.println("1.Serie");
            System.out.println("2.Multiplos");
            System.out.println("3.Laboratorio");
            System.out.println("4.Datos");
            System.out.println("5.Salir");

            opcion = Leer.datoInt();

            switch (opcion) {
                case 1:
                    Serie serie = new Serie();
                    serie.Patron();
                    break;
                case 2:
                    Multiplos multiplos = new Multiplos();
                    multiplos.Calcular();
                    break;
                case 3:
                    Laboratorio laboratorio = new Laboratorio();
                   laboratorio.Resultado();
                    break;
                case 4:
                    Datos datos = new Datos();
                    datos.menorMayor();
                    break;
                case 5:
                    ciclo = 6;
                    System.out.println("Adios vuelva pronto :)");
                default:
                    System.out.println("Usted marco una opción incorrecta. Adios");
            }
        }
    }

}
