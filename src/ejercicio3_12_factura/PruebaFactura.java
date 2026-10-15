package ejercicio3_12_factura;

public class PruebaFactura {

    public static void main(String[] args) {

        // primera factura con valores normales
        Factura factura1 = new Factura("1234A", "Martillo", 3, 15.50);

        System.out.println("Numero de pieza: " + factura1.getNumeroDePieza());
        System.out.println("Descripcion: " + factura1.getDescricionPieza());
        System.out.println("Cantidad de venta: " + factura1.getCantidadCompra());
        System.out.println("Precio: " + factura1.getPrecio());
        System.out.println("El total es: " + factura1.obtenerMontoFactura());

        System.out.println();

        //prueva con valores negatibos
        Factura factura2 = new Factura("9876B", "Clavos", -5, -2.0);

        System.out.println("Numero de pieza: " + factura2.getNumeroDePieza());
        System.out.println("Descripcion: " + factura2.getDescricionPieza());
        System.out.println("Cantidad de venta: " + factura2.getCantidadCompra());
        System.out.println("Precio: " + factura2.getPrecio());
        System.out.println("El total es: " + factura2.obtenerMontoFactura());
        //se quedan en cero y no los valores negativos
    }
}
