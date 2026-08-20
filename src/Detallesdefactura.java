public class Detallesdefactura {
    private Prodducto producto;
    private Factura factura;
    private int cantidad;

    public Detallesdefactura(Producto producto, Factura factura, int cantidad){
        this.producto = producto;
        this.factura = factura;
        this.cantidad = cantidad;
        producto.addDetalles(this);
        factura.addDetalles(this);
    }

    public Producto getproducto(){
        return producto;
    }

    public Factura getfactura(){
        return factura;
    }

    public int getcantidad(){
        return cantidad;
    }

    public doublr calcularsubtotal(){
        return cantidad * producto.getprecio();
    }

    public String toString(){
        return cantidad + " x " + producto.getnombre() + "=Q" + calcularsubtotal();
    }
}