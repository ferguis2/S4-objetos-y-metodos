package ejercicio3_12_factura;

public class Factura{

    // varibles de instancia
    private String numeroDePieza;
    private String descricionPieza;
    private int cantidadCompra;
    private double precio;

    // contructor que inisializa las cuatro variables
    public Factura(String numeroDePieza, String descricionPieza, int cantidadCompra, double precio){

        this.numeroDePieza = numeroDePieza;
        this.descricionPieza = descricionPieza;

        // si la cantida no es positiva se pone en 0
        if (cantidadCompra > 0) {
            this.cantidadCompra = cantidadCompra;
        } else {
            this.cantidadCompra = 0;
        }

        // si el presio no es positivo se pone en 0.0
        if (precio > 0) {
            this.precio = precio;
        } else {
            this.precio = 0.0;
        }
    }

    // metodos establecer y obtener
    public void setNumeroDePieza(String numeroDePieza){
        this.numeroDePieza = numeroDePieza;
    }

    public String getNumeroDePieza(){
        return numeroDePieza;
    }

    public void setDescricionPieza(String descricionPieza){
        this.descricionPieza = descricionPieza;
    }

    public String getDescricionPieza(){
        return descricionPieza;
    }

    public void setCantidadCompra(int cantidadCompra){
        if (cantidadCompra > 0) {
            this.cantidadCompra = cantidadCompra;
        } else {
            this.cantidadCompra = 0;
        }
    }

    public int getCantidadCompra(){
        return cantidadCompra;
    }

    public void setPrecio(double precio){
        if (precio > 0) {
            this.precio = precio;
        } else {
            this.precio = 0.0;
        }
    }

    public double getPrecio(){
        return precio;
    }

    // multiplica la cantidad por el precio y regresa el total
    public double obtenerMontoFactura(){

        double montoTotal = cantidadCompra * precio;

        if (montoTotal < 0){
            montoTotal = 0.0;
        }

        return montoTotal;
    }

}
