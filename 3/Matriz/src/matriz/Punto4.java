
package matriz;

public class Punto4 {
    public void Ejercicio4(){
        int nElementos;
    int i;
        System.out.println("Ingrese el tamaño del vector");
        nElementos=Leer.datoInt();
        int [] n= new int [nElementos];
        int [] m= new int [nElementos];
        int [] o= new int [nElementos];
        System.out.println("Ingrese los datos del vector");
        for(i=0;i<nElementos;i++){
            System.out.print("m[" + i + "] = ");
            n[i]=Leer.datoInt();
        }
        for(i=0;i<nElementos;i++){
            System.out.print("n[" + n[i] + "] = ");
        }
        for(i=0; i<nElementos;i++){
         m[i]=n[n.length-1-i];
            
        }
        System.out.println("Los elementos a la inversa del vector son: ");
        for(i=0;i<nElementos;i++){
           System.out.print("n[" + m[i] + "] = ");
}
        System.out.println("");
        for(i=0;i<o.length;i++){
        o[i]=n[i]+m[i];
    }
        for(i=0;i<o.length;i++){
            System.out.print("n[" + o[i] + "] = ");
        }
        System.out.println(" ");
    }
}
