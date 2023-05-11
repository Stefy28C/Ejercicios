
package taller3;


public class Menu {

    
    public static void main(String[] args) {
      int opc=0;
        System.out.println("Ingrese el número del ejercicio a ejecutar");
        opc=Leer.datoInt();
        switch(opc){
            case 1:
                Punto1 obj1 = new Punto1();
                obj1.primero();
                break;
            case 2:
                Punto2 obj2 = new Punto2();
                obj2.segundo();
                break;
            case 3:
                Punto3 obj3 = new Punto3();
                obj3.tercero();
                break;
            case 4:
                Punto4 obj4 = new Punto4();
                obj4.cuarto();
                break;               
            case 5:
                
                break;
            default:
                
            
       }
    }
    
}
