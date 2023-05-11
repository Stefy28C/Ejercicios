/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_2listas;


public class Ejercicio_2listas {

    
    public static void main(String[] args) {
        Nodo Cabeza = new Nodo();
     Cabeza.Nombre="Pedro";
     Cabeza.Marca="Renault";
     Cabeza.color="Rojo";
     Cabeza.modelo=93;
     
     Cabeza.siguiente = new Nodo();
     Cabeza.siguiente.Nombre = "Carlos";
     Cabeza.siguiente.Marca="Ford";
     Cabeza.siguiente.color="negro";
     Cabeza.siguiente.modelo=2012; 
    
    Cabeza.siguiente.siguiente = new Nodo();
    Cabeza.siguiente.siguiente.Nombre = "Jose";
    Cabeza.siguiente.siguiente.Marca="Kia";
    Cabeza.siguiente.siguiente.color="Azul";
    Cabeza.siguiente.siguiente.modelo=90;

    Cabeza.siguiente.siguiente.siguiente=new Nodo();
    Cabeza.siguiente.siguiente.siguiente.Nombre="maria";
    Cabeza.siguiente.siguiente.siguiente.Marca="Chevrolet";
    Cabeza.siguiente.siguiente.siguiente.color="verde";
    Cabeza.siguiente.siguiente.siguiente.modelo=99;
 
     System.out.println(Cabeza.Nombre); 
    System.out.println(Cabeza.Marca);
    System.out.println(Cabeza.color);
    System.out.println(Cabeza.modelo);

    System.out.println(Cabeza.siguiente.Nombre); 
    System.out.println(Cabeza.siguiente.Marca);
    System.out.println(Cabeza.siguiente.color);
    System.out.println(Cabeza.siguiente.modelo);

    System.out.println(Cabeza.siguiente.siguiente.Nombre); 
    System.out.println(Cabeza.siguiente.siguiente.Marca);
    System.out.println(Cabeza.siguiente.siguiente.color);
    System.out.println(Cabeza.siguiente.siguiente.modelo);

    System.out.println(Cabeza.siguiente.siguiente.siguiente.Nombre); 
    System.out.println(Cabeza.siguiente.siguiente.siguiente.Marca);
    System.out.println(Cabeza.siguiente.siguiente.siguiente.color);
    System.out.println(Cabeza.siguiente.siguiente.siguiente.modelo);
    
  


    }
}

    

