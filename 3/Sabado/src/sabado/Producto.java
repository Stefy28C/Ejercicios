
package sabado;


public class Producto {
    
    public String Nombre;
    public int codigo;
    public String Presentacion;
    private int cantidad;
    private float Valor;
    private String Proveedor;

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the Valor
     */
    public float getValor() {
        return Valor;
    }

    /**
     * @param Valor the Valor to set
     */
    public void setValor(float Valor) {
        this.Valor = Valor;
    }

    /**
     * @return the Proveedor
     */
    public String getProveedor() {
        return Proveedor;
    }

    /**
     * @param Proveedor the Proveedor to set
     */
    public void setProveedor(String Proveedor) {
        this.Proveedor = Proveedor;
    }
    
    
    
    
}
