package ejercicio_3listas;

public class Ejercicio_3listas {

    public static void main(String[] args) {

        Nodo Cabeza = new Nodo();
        Nodo recorrer = Cabeza;
        int contador = 20;
        while (contador <= 30) {
            recorrer.info = contador;
            if (contador < 30) {
                recorrer.siguiente = new Nodo();
         /*       if (recorrer.info == 28) {
                    recorrer = recorrer.siguiente;
                }*/
            }
            recorrer = recorrer.siguiente;
            contador += 2;
        }
        recorrer = Cabeza;
        while (recorrer != null) {
             if (recorrer.info == 28) {
                    recorrer = recorrer.siguiente;
             }
            System.out.println(recorrer.info);
            recorrer = recorrer.siguiente;
        }
    }
}
