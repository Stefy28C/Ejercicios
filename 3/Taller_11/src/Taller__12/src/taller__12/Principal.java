package taller__12;

public class Principal {
    public static void main(String[] args) {
        Pila pila = new Pila();
        int opcion = -1;
        int i;
        while (opcion != 4) {
            System.out.println("MENU:");
            System.out.println("1. Agregar 3 estudiantes a la lista");
            System.out.println("2. atender");
            System.out.println("3. listar");
            System.out.println("4. salir");
            opcion = Leer.datoInt();
            if (opcion == 1) {
         //       for( i=0; i<3; i++){
                    
                Informacion info = new Informacion();
                System.out.println("Ingrese el nombre del estudiante:");
                info.Nombre = Leer.dato();
                System.out.println("Ingrese el Código del estudiante:");
                info.codigo = Leer.datoInt();
                System.out.println("Ingrese la nota 1 del estudiante:");
                info.n1 = Leer.datoInt();
                System.out.println("Ingrese la nota 2 del estudiante:");
                info.n2 = Leer.datoInt();
                System.out.println("Ingrese la nota 3 del estudiante:");
                info.n3 = Leer.datoInt();
                pila.agregar(info);
            //}
            } else if (opcion == 2) {
                Informacion info = pila.atender();
         //       System.out.println("dato atendido : " + info.dato);
            } else if (opcion == 3) {
                pila.listar();
            }
        }
        System.out.println("terminado");
    }
}

