/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fifo;

public class Principal {

    public static void main(String[] args) {
        Cola cola = new Cola();
        int opcion = -1;
        while (opcion != 4) {
            System.out.println("MENU:");
            System.out.println("1. agregar");
            System.out.println("2. atender");
            System.out.println("3. listar");
            System.out.println("4. contador");
            System.out.println("5. salir");
            opcion = Leer.datoInt();
            switch (opcion) {
                case 1: {
                    Informacion info = new Informacion();
                    System.out.println("digite el primer cliente :");
                    info.dato1 = Leer.dato();
                    cola.agregar(info);
                    break;
                }
                case 2: {
                    Informacion info = cola.atender();
                    System.out.println("primer dato: " + info.dato1);
                    break;
                }
                case 3:
                    cola.listar();
                    break;
                case 4:
                    cola.contador();
                    break;
                default:
                    break;
            }
        }
        System.out.println("terminado");
    }
}
