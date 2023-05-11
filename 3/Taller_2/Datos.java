
package Taller_2;


public class Datos {
    public void menorMayor(){
              int num1;
        int num2;
        int num3;
        int numMy;
        int numMn;
        int numIn;

        System.out.println("Ingrese el primer numero");
        num1 = Leer.datoInt();
        System.out.println("Ingrese el segundo numero");
        num2 = Leer.datoInt();
        System.out.println("Ingrese el tercer numero");
        num3 = Leer.datoInt();

        numMn = num1;
        numIn = num2;
        numMy = num3;

        if (num2 < num1 && num2 < num3){
            numMn = num2;
        }else if (num3 < num1 && num3 < num2){
            numMn = num3;
        }
        
        if (num1 > num3 && num1 > num2){
            numMy = num1;
        }else if (num2 > num3 && num2 > num1){
            numMy = num2;
        }
        
        if (num1 < num2 && num1 > num3 || num1 > num2 && num1 < num3){
            numIn = num1;
        }else if(num2 > num3 && num1 < num3 || num2 < num3 && num1 > num3){
            numIn = num3;
        }
        
        System.out.println("Ordenados de menor a mayor "+numMn+" "+numIn+" "+numMy);
    }
}
