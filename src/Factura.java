import java.time.LocalDate;
import java.util.ArrayList;

public class Factura{
    private int numero;
    private LocalDate fecha;
    private String nombredecliente;
    private ArrayList<detallesFactura> detalles;

    public Factura(int numero, LocalDate fecha, String nombredecliente){
        this.numero = numero;
        this.fecha = fecha;
        this.nombredecliente = nombredecliente;
        this.detalles = new ArrayList<detallesFactura>();
    }

    public int getnumero(){
        return numero;
    }

    public LocalDate getfecha(){
        return fecha;
    }

    public String getnombredecliente(){
        return nombredecliente;
    }

    public void adddetakkes(detallesdefactura detalle){
        detalles.add(detalle);
    }

    public double total(){
        double total = 0;

        for(int i = 0; i < detalles.size(); i++){
            detallesdefactura d = detalles.get(i);
            total = total + d.calcularsubtotal();
        }

        return total;
    }

    public String toString(){
        return "Factura" = numero + "/ cliente:" + nombredecliente + "/ fecha:" + fecha;
    }
}