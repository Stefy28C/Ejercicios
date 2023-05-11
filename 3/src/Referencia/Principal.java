package Referencia;

public class Principal {

    public static void main(String[] args) {
        /*p1 apunta a una direccion de memoria porque hemos creado un objeto
         * cada objeto que creemo sva tomando su espacio en memoria*/
        Persona p1 = new Persona("John", 40);
        Persona p2 = new Persona("Manuela", 30);
        System.out.println("P1:\n " + p1);
        System.out.println("P2:\n " + p2);
        p2 = p1;

        System.out.println("Despues de hacer p2=p1");
        System.out.println("p1:\n" + p1);
        System.out.println("p2:\n" + p2);

    }
}
