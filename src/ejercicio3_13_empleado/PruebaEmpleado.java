package ejercicio3_13_empleado;

public class PruebaEmpleado{
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Jose", "Garcia", 200);
        Empleado e2 = new Empleado("Maria", "Martinez", 100);
        double aumento = 1.10; // aumento del 10 porsiento
        System.out.println("Salario anual: ");
        System.out.println(e1.getNombre() + " " + e1.getApellido() + ": $ " + String.format("%.2f", e1.getsalarioAnual()));
        System.out.println(e2.getNombre() + " " + e2.getApellido() + ": $ " + String.format("%.2f", e2.getsalarioAnual()));
        // se le aplica el aumeto a cada empleado
        e1.setsalario(e1.getsalario() * aumento);
        e2.setsalario(e2.getsalario() * aumento);
        System.out.println("Salario anual con 10%: ");
        System.out.println(e1.getNombre() + " " + e1.getApellido() + ": $ " + String.format("%.2f", e1.getsalarioAnual()));
        System.out.println(e2.getNombre() + " " + e2.getApellido() + ": $ " + String.format("%.2f", e2.getsalarioAnual()));
    }
}