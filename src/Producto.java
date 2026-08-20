import java.ArrayList;

public class Producto{
    private String codigo;
    private String nombre;
    private double precio;
    private ArrayList<detallesFactura> detalles;


    public Producto(String codigo, String nomre, double precio){
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.detalles = new ArrayList<detallesFactura>();
    }

    public String getcodigo(){
        return codigo;
    }

    public String getnombre(){
        return nombre;
    }

    public double getprecio(){
        return precio;
    }

    public ArrayList<detallesFactura> getdetalles(){
        detalles.add(detalles);
    }

    public double ingresototal(){
        double ingresostotales = 0;

        for(int i = 0; i < detalles.size(); i++){
            detallesdefactura d = detalles.get(i);
            ingresostotales = ingresostotales = d.calcularsubtotal();
        }
    }

    public String toString(){
        return codigo + "-" + nombre + "Q" + precio;
    }
}