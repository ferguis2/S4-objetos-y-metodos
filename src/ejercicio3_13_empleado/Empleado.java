package ejercicio3_13_empleado;

public class Empleado {

    // variables de instansia
    private String nombre;
    private String apellido;
    private double salario;

    // contructor
    public Empleado (String nombre, String apellido, double salario){
        this.nombre = nombre;
        this.apellido = apellido;
        // si el salario no es positivo no se estableze
        if (salario > 0) {
            this.salario = salario;
        }
    }

    public String getNombre (){
        return nombre;
    }

    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public String getApellido (){
        return apellido;
    }

    public void setApellido (String apellido){
        this.apellido = apellido;
    }
    public double getsalario (){
        return salario;
    }
    public void setsalario (double salario){
        if (salario > 0) {
            this.salario = salario;
        }
    }

    public double getsalarioAnual(){
        return salario * 12;
    }
}

