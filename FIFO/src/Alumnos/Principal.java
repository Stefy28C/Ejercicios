package Alumnos;

public class Principal {

    public static void main(String[] args) {
        Cola cola = new Cola();
        int opcion = -1;
        while (opcion != 4) {
            System.out.println("MENU:");
            System.out.println("1. agregar");
            System.out.println("2. atender");
            System.out.println("3. listar");
            System.out.println("4. salir");
            opcion = Leer.datoInt();
            switch (opcion) {
                case 1:
                    {
                        Informacion info = new Informacion();
                        System.out.println("Digite el Nombre:");
                        info.Nombre = Leer.dato();
                        System.out.println("Digite la Nota 1:");
                        info.n1= Leer.datoFloat();
                        System.out.println("Digite la Nota 2:");
                        info.n2= Leer.datoFloat();
                         System.out.println("Digite la Nota 3:");
                        info.n3= Leer.datoFloat();
                        cola.agregar(info);
                        break;
                    }
                case 2:
                    {
                        Informacion info = cola.atender();
                        System.out.println("Nombre: " + info.Nombre); 
                        break;
                    }
                case 3:
                    cola.listar();
                    break;
                default:
                    break;
            }
        }
        System.out.println("terminado");
    }
}
