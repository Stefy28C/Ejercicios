package taller__12;

public class Principal {

    public static void main(String[] args) {
        Pila pila = new Pila();
        int opcion = -1;
        int i;
        double acum = 0;
        while (opcion != 4) {
            System.out.println("MENU:");
            System.out.println("1. Agregar 3 estudiantes a la lista");
            System.out.println("2. atender");
            System.out.println("3. listar");
            System.out.println("4. salir");
            opcion = Leer.datoInt();
            switch (opcion) {
                case 1:
                    for (i = 0; i < 3; i++) {

                        Informacion info = new Informacion();
                        System.out.println("Ingrese el nombre del estudiante:");
                        info.Nombre = Leer.dato();
                        System.out.println("Ingrese el Código del estudiante:");
                        info.codigo = Leer.datoInt();
                        System.out.println("Ingrese la nota 1 del estudiante:");
                        info.n1 = Leer.datoDouble();
                        System.out.println("Ingrese la nota 2 del estudiante:");
                        info.n2 = Leer.datoDouble();
                        System.out.println("Ingrese la nota 3 del estudiante:");
                        info.n3 = Leer.datoDouble();

                        acum += info.promedio();

                        pila.agregar(info);
                    }
                    System.out.println("El promedio total es " + acum / (i - 1));
                    break;
                case 2:
                    Informacion info = pila.atender();
                    //       Sy pila.agregar(info);stem.out.println("dato atendido : " + info.dato);
                    break;
                case 3:
                    pila.listar();
                    break;
                default:
                    break;
            }
        }
        System.out.println("terminado");
    }
}
