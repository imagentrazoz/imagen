
package modelo;

//proceso para crear los metodos get y set de las varibles asignada: inset code despus selecionamos getteer y settery selecionamos todo
public class mo_com {

    public String getCod_compra() {
        return cod_compra;
    }

    public void setCod_compra(String cod_compra) {
        this.cod_compra = cod_compra;
    }

    public String getCod_factura() {
        return cod_factura;
    }

    public void setCod_factura(String cod_factura) {
        this.cod_factura = cod_factura;
    }

    public String getCod_producto() {
        return cod_producto;
    }

    public void setCod_producto(String cod_producto) {
        this.cod_producto = cod_producto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCantidad_c() {
        return cantidad_c;
    }

    public void setCantidad_c(int cantidad_c) {
        this.cantidad_c = cantidad_c;
    }

    String cod_compra , cod_factura,cod_producto ,fecha ;
    int cantidad_c ;
}
