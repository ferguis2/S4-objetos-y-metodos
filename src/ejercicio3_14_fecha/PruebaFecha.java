package ejercicio3_14_fecha;

public class PruebaFecha {
    public static void main(String[] args) {
        Fecha fecha_1 = new Fecha(10, 14, 2026);

        System.out.print("Fecha inicial: ");
        fecha_1.mostrarFecha();

        System.out.println("Mes: " + fecha_1.obtenerMes());
        System.out.println("Día: " + fecha_1.obtenerDia());
        System.out.println("Año: " + fecha_1.obtenerAnio());

        // se canbia la fecha con los metodos establecer
        fecha_1.establecerMes(12);
        fecha_1.establecerDia(25);
        fecha_1.establecerAnio(2027);

        System.out.print("Fecha modificada: ");
        fecha_1.mostrarFecha();
    }
}