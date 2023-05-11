
package matriz;

public class Punto1 {
   
    public void Ejercicio1(){
 int nElementos;
    System.out.print("Número de elementos del vector ");
    nElementos = Leer.datoInt();
    int[] m = new int[nElementos]; // crear la matriz m
    int i = 0; // subíndice
    float promedio=0;
    int contm=0;
    int contn=0;
    int suma = 0;
    System.out.println("Introducir los valores del vector.");
    for (i = 0; i < nElementos; i++)
    {
      System.out.print("m[" + i + "] = ");
      m[i] = Leer.datoInt();
       if(m[i]>=promedio){
        contm++;
      
    }else if(m[i]<=promedio){
        contn++;
    }
    }
    
    // Visualizar los elementos del vector
    System.out.println();
    for (i = 0; i < nElementos; i++){
      System.out.print(m[i] + " ");}
    
    //Suma y promedio de los elementos del vector
  
		for (i = 0; i < m.length; i++) {
			suma = suma + m[i];
                        
		
                }
    promedio = suma / m.length;
                System.out.println("Suma: "+suma+" Promedio: "+promedio+ " ");  
                System.out.println("La cantidad de números mayores que el promedio es; "+contm);
                System.out.println("La cantidad de números menores que el promedio es; "+contn);
    //determinar los mayores que el promedio
   System.out.println("\n\nFin del proceso.");
    
                
  } 
}
