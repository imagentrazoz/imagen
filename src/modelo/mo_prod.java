
package modelo;


public class mo_prod {

    public String getCod_producto() {
        return cod_producto;
    }

    public void setCod_producto(String cod_producto) {
        this.cod_producto = cod_producto;
    }

    public String getN_producto() {
        return n_producto;
    }

    public void setN_producto(String n_producto) {
        this.n_producto = n_producto;
    }

    public String getCod_proveedor() {
        return cod_proveedor;
    }

    public void setCod_proveedor(String cod_proveedor) {
        this.cod_proveedor = cod_proveedor;
    }

    public int getCantidad_p() {
        return cantidad_p;
    }

    public void setCantidad_p(int cantidad_p) {
        this.cantidad_p = cantidad_p;
    }
    String cod_producto,n_producto,cod_proveedor ;
    int cantidad_p;
}
