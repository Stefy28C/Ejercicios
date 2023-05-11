
package ejercicio_listas;


public class Ejercicio_listas {

   
    public static void main(String[] args) {
        Nodo Cabeza=new Nodo();
    Cabeza.info=10;
    Cabeza.siguiente=new Nodo();
    Cabeza.siguiente.info=20;
    Cabeza.siguiente.siguiente = new Nodo(); 
    Cabeza.siguiente.siguiente.info = 30;
    Cabeza.siguiente.siguiente.siguiente = new Nodo(); 
    Cabeza.siguiente.siguiente.siguiente.info = 40;
    Cabeza.siguiente.siguiente.siguiente.siguiente = new Nodo(); 
    Cabeza.siguiente.siguiente.siguiente.siguiente.info = 50;
    Cabeza.siguiente.siguiente.siguiente.siguiente.siguiente = new Nodo(); 
    Cabeza.siguiente.siguiente.siguiente.siguiente.siguiente.info = 60;
    Cabeza.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente = new Nodo(); 
    Cabeza.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.info = 75;
    Cabeza.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente = new Nodo(); 
    Cabeza.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.info = 80;
    
    System.out.println(Cabeza.info);	
    System.out.println(Cabeza.siguiente.info);
    System.out.println(Cabeza.siguiente.siguiente.info);
    System.out.println(Cabeza.siguiente.siguiente.siguiente.info);
    System.out.println(Cabeza.siguiente.siguiente.siguiente.siguiente.info);
    System.out.println(Cabeza.siguiente.siguiente.siguiente.siguiente.siguiente.info);
    System.out.println(Cabeza.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.info );
    System.out.println(Cabeza.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.info);
        
     }   
}
