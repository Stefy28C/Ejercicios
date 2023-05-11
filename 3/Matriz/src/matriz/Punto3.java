
package matriz;


public class Punto3 {
    public void Ejercicio3(){
        int n;
        int c=0;
        int i;
        int nElementos;      
        System.out.println("Ingrese el tamaño del vector");
        nElementos=Leer.datoInt();
        int []vector= new int [nElementos];
          System.out.println("Ingrese los datos del vector");
        for(i=0; i<nElementos;i++){        
            System.out.print("m[" + i + "] = ");
            vector[i]=Leer.datoInt();
            
        }
        
        System.out.println("Ingrese el número a buscar");
        n=Leer.datoInt();
        for(i=0;i<nElementos;i++){
         if(n==vector[i]){
             System.out.println("El numero: "+n+" Se encuentra en la posición: "+i);
             c++;
         }
         
         
    }
        if(c==0){
            System.out.println("El número: "+n+" No se encuentra en el vector");
        }
    }
}
