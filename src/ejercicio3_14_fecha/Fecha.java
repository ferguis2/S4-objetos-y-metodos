package ejercicio3_14_fecha;

public class Fecha {
    // Variables de instancia
    private int mes;
    private int dia;
    private int anio;

    // Constructor, se asume que los valores son correctos
    public Fecha(int mes, int dia, int anio) {
        this.mes = mes;
        this.dia = dia;
        this.anio = anio;
    }

    // Metodos establecer
    public void establecerMes(int mes) {
        this.mes = mes;
    }

    public void establecerDia(int dia) {
        this.dia = dia;
    }

    public void establecerAnio(int anio) {
        this.anio = anio;
    }

    // metodos obtenr
    public int obtenerMes() {
        return mes;
    }

    public int obtenerDia() {
        return dia;
    }

    public int obtenerAnio() {
        return anio;
    }

    // muestra la fecha separada con diagonales mes/dia/año
    public void mostrarFecha() {
        System.out.println(mes + "/" + dia + "/" + anio);
    }
}