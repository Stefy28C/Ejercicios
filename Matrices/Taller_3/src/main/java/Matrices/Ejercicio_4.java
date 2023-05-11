
package Matrices;


public class Ejercicio_4 {
     DatosMatrices obj4 = new DatosMatrices();
   
     
 int fila, col, nfilas, ncols;
 public void Conteo(){
     
 
        System.out.println("Ingrese el número de filas");
        nfilas = Leer.datoInt();
        System.out.println("Ingrese el número de columnas");
        ncols = Leer.datoInt();
        obj4.Matriz2 = new float[nfilas][ncols];

        System.out.println("Ingrese los datos ");
        for (fila = 0; fila < nfilas; fila++) {
            for (col = 0; col < ncols; col++) {
                System.out.print("m[" + fila + "][" + col + "| =  ");
                obj4.Matriz2[fila][col] = Leer.datoInt();
            }

        }

        System.out.println("Mostrar los datos");
        for (fila = 0; fila < nfilas; fila++) {
            for (col = 0; col < ncols; col++) {
                System.out.print(obj4.Matriz2[fila][col] + "\t");

            }
              System.out.println("");
        }
          for (fila = 0; fila < nfilas; fila++) {
            for (col = 0; col < ncols; col++) {
                if(obj4.Matriz2[fila][col]==0){
                    obj4.contc=obj4.contc+1;
                }else if (obj4.Matriz2[fila][col]<0){
                    obj4.contn=obj4.contn+1;
                }else if (obj4.Matriz2[fila][col]>0){
                    obj4.contp=obj4.contp+1;
                }
                  
            }
        }
          System.out.println("El numero de ceros es: "+obj4.contc);
          System.out.println("El numero de positivos es: "+obj4.contp);
          System.out.println("El numero de negativos es: "+obj4.contn);
     
    }
}
