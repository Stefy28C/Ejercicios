package taller_11;

public class Cola {
    private Nodo cabeza;
    public void agregar(Informacion info) {
        if (cabeza == null) {
            cabeza = new Nodo();
            cabeza.info = info;
        } else {
            Nodo rec = cabeza;
            while (rec.siguiente != null) {
                rec = rec.siguiente;
            }
            rec.siguiente = new Nodo();
            rec.siguiente.info = info;
        }
    }
    public Informacion atender() {
        if (cabeza != null) {
            Nodo temp = cabeza;
            cabeza = cabeza.siguiente;
            temp.siguiente = null;
            return temp.info;
        }
        return new Informacion();
    }
    public void listar(){
      Nodo rec=cabeza;
        System.out.println("La cola esta conformada por ");
      while(rec!=null){
          System.out.print(rec.info.dato+ "  ");
          rec=rec.siguiente;
      }
    }
}
