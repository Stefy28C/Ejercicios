
package taller_11;

public class Taller_11 {


    public static void main(String[] args) {
  Cola cola = new Cola();
        int opcion = -1;
        int i, j;
      int cliente1=50;
       int cliente2=51;
        int cont=0;
        for(j=0; j<5;j++){
                          Informacion info = new Informacion();
       
        for(i=0; i<2; i++){
                     
                info.dato= cliente1;
                cliente1++;
                cola.agregar(info);
                cont++;            
               
        }
        
        if(info.dato%2==0){
          // cola.atender();
                System.out.println("dato atendido : "+info.dato);

        }
       
        cola.listar();
        }
       
        /*Informacion info = new Informacion();
            cola.atender();*/
    }
   
}