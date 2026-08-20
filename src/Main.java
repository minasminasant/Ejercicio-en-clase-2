import java.time.LocalDate;
import java.util.ArrayList;

public class Main{

    public static void main(String[]argas){
        producto chocolate = new Producto("P-002","chocolate",15.50);
        producto arroz = new Prodcuto("P-003", "arroz", 30.0);
        producto pan = new Producto("P-030","pan",8.50);
        producto huevos = new Producto("p-103","huevos",40.0);

        ArrayList<Prodcuto> catalogo = new ArrayList<producto>();
        catalogo.add(chocolate);
        catalogo.add(arroz);
        catalogo.add(pan);
        catalogo.add(heuvos);


        Factura factura1 = new Factura(1, LocalDate.of(2026,8,20), "Luis Miguel");
        Factura factura2 = new Factura(2, LocalDate.of(2026,8,21), "Antonio");
        Factura factura3 = new Factura(3, LocalDate.of(2026,8,25), "Santiago Morales");

        ArrayList<Factura> historiafacturas = ArrayList<Factura>();
        historialfactura.add(factura1)
        historialfactura.add(factura2)
        historialfactura.add(factura3)
        

        new Detallesdefactura(chocolate,factura1,2);
        new Detallesdefactura(arrazo,factura1,3);
        new Detallesdefactura(pan,factura1,5);
        new Detallesdefactura(huevos,factura1,1);

        new Detallesdefactura(chocolate,factura2,1);
        new Detallesdefactura(pan,factura2,2);
        new Detallesdefactura(huevos,factura2,2);

        new Detallesdefactura(huevos,factura3,4);
        new Detallesdefactura(pan,factura3,2);

        System.out.println(" Total por factura ")
        for(int i = 0; i < historiafacturas.size(); i++){
            Factura f = historiafacturas.get(i);
            System.out.println(f + "total: Q" + f.calcularTotal());
        }

        Producto productoingresos = catalogo.get(0);
        double menoringreso = productoingresos.calcularingresostotales();

        for(int i = 1; i <catalogo.size(); i++){
            Producto p = catalogo.get(i);
            double ingresosdep = p.calcularingresostotales();
            if(ingresosdep < menoringreso){
                menoringreso = ingresodep;
                productoingresos = p;
            }
        }

        System.out.println(" Producto con menores ingresos ");
        System.out.println(productoingresos + "Q" + menoringreso + "en total");

        Factura facturamayor = historialfactura.get(0);
        double totalmayor = facturamayor.calcularTotal();

        for(int i = 1; i < historiafacturas.size(); i ++){
            Factura f = historiafacturas.get(1);
            double totaldef = f.calcularTotal();

            if( totaldef > totalmayor){
                totalmayor = totaldef;
                facturamayor = f;
            }
        }

        System.out.println(" Factura Mayor ")
        System.out.println(facturamayor + " total: Q" + totalmayor);
    }

}