package sabado;

public class Reportes {

    public void salida() {
        Producto obj1 = new Producto();
        System.out.println("Digite su nombre ");
        obj1.Nombre = Leer.dato();

        System.out.println("Digite el valor ");
        obj1.setValor(Leer.datoInt());

        System.out.println("Digite el codigo ");
        obj1.codigo = Leer.datoInt();

        System.out.println("Ingrese la presentacion ");
        obj1.Presentacion = Leer.dato();

        System.out.println("Ingrese la cantidad ");
        obj1.setCantidad(Leer.datoInt());

        System.out.println("Ingrese el proveedor");
        obj1.setProveedor(Leer.dato());

        System.out.println(obj1.Nombre);
        System.out.println(obj1.getValor());
        System.out.println(obj1.codigo);
        System.out.println(obj1.Presentacion);
        System.out.println(obj1.getCantidad());
        System.out.println(obj1.getProveedor());
    }
}
