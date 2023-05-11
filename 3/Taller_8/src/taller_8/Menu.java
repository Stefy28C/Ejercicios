
package taller_8;
public class Menu {
    public static void main(String[] args) {
        Nodo lista = null;
        int opcion = 0;
        while (opcion != 6) {
            System.out.println("1. agregar un nodo");
            System.out.println("2. eliminar un nodo");
            System.out.println("3. buscar un nodo");
            System.out.println("4. modificar un nodo");
            System.out.println("5. mostrar lista");
            System.out.println("6. salir");
            System.out.print("digite el numero de la opcion deseada: ");
            opcion = Leer.datoInt();
            if (opcion == 1) {
                Nodo nodo = new Nodo();
                System.out.println("ingrese la ciudad a agregar:");
                nodo.informacion.ciudad = Leer.dato();
                System.out.println("ingrese el departamento a agregar:");
                nodo.informacion.departamento = Leer.dato();
                lista = new Operaciones().añadir(lista, nodo);

            } else if (opcion == 2) {
                System.out.println("ingrese la ciudad a eliminar :");
                String nombreCiudad = Leer.dato();
                lista = new Operaciones().eliminar(lista, nombreCiudad);
            } else if (opcion == 3) {
                System.out.println("ingrese la ciudad a buscar :");
                String nombreCiudad = Leer.dato();
                Nodo buscado = new Operaciones().buscar(lista, nombreCiudad);
                if (buscado != null) {
                    System.out.println("ciudad: " + buscado.informacion.ciudad);
                    System.out.println("departamento: " + buscado.informacion.departamento);
                } else {
                    System.out.println("nodo no encontrado.");
                }
            } else if (opcion == 4) {
                System.out.println("ingrese la ciudad a modificar:");
                String ciudad = Leer.dato();
                System.out.println("ingrese el nuevo nombre de la ciudad:");
                String nciudad = Leer.dato();
                System.out.println("ingrese el nuevo nombre del departamento:");
                String ndepartamento = Leer.dato();
                lista = new Operaciones().modificar(lista, ciudad, nciudad, ndepartamento);
            } else if (opcion == 5) {
                new Operaciones().listar(lista);
            }
        }
        System.out.println("gracias por usarnos.");
    }
}
