package Referencia2;

public class Persona {

    String nombre;
    int edad;

    public Persona(String nom, int ed){
        nombre=nom;
        edad=ed;
    }

    public String toString(){
        return "Nombre: "+nombre+"\n"+"Edad: "+edad+"\n";
    }
}
