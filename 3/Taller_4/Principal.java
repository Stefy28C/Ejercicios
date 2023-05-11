
package Taller_4;


public class Principal {

   
    public static void main(String[] args) {
      int opcion, ciclo = 2;

        while (ciclo == 2) {
            System.out.println("------------------------------------");
            System.out.println(" M E N U    P R I N C I P A L");
            System.out.println("1.Suma de matrices ");
            System.out.println("2.Suma de columnas");
            System.out.println("3.Diagonal");
            System.out.println("4.Matriz en un vector ");
            System.out.println("5.Salir");

            opcion = Leer.datoInt();

            switch (opcion) {
                case 1:
                    Sum_Matriz suma_matriz = new Sum_Matriz();
                    suma_matriz.sumaMatriz();
                    break;
                case 2:
                    Sum_Colum suma_columnas = new Sum_Colum();
                    suma_columnas.sumaColumna();
                    break;
                case 3:
                    Diagonal diagonal= new Diagonal();
                   diagonal.calcularDiagonal();
                    break;
                case 4:
                    Matriz_Vector matriz_vector = new Matriz_Vector();
                    matriz_vector.calcularVector();
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
