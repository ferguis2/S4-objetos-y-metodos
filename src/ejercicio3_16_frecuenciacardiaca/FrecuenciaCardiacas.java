package ejercicio3_16_frecuenciacardiaca;

import java.time.LocalDate;

public class FrecuenciaCardiacas {
    private String nombre;
    private String apellido;
    private int dia;
    private int mes;
    private int anio;

    public FrecuenciaCardiacas(String nombre, String apellido, int dia, int mes, int anio){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    // Métodos establecer y obtener
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getDia() {
        return dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getMes() {
        return mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getAnio() {
        return anio;
    }
    // metodos de calculo
    // calcula la edad, si todavia no a cumplido años en este año se le resta uno
    public int edad(){
        LocalDate Hoy = LocalDate.now();
        int edad_actual = Hoy.getYear() - this.anio;
        if (Hoy.getMonthValue() < this.mes || (Hoy.getMonthValue() == this.mes && Hoy.getDayOfMonth() < this.dia)) {
            edad_actual--;
        }
        return edad_actual;
    }

    // la frecuensia maxima es 220 menos la edad
    public int PulsosMaximos(){
        return 220 - this.edad();
    }

    // rango esperado entre el 50 y el 85 porciento de la maxima
    public String FrecuenciaEsperada (){
        return String.format("%.2f - %.2f", PulsosMaximos() * 0.50, PulsosMaximos() * 0.85);
    }

    public String getInfo (){
        return "Nombre: " + this.nombre + " " + this.apellido +
                "\nFecha de nacimiento: " + this.dia + "/" + this.mes + "/" + this.anio +
                "\nEdad: " + edad() + " anios" +
                "\nF. maxima: " + PulsosMaximos() +
                "\nF. Esperada: " + FrecuenciaEsperada();
    }
}