package ejercicio3_17_perfilmedico;

import java.time.LocalDate;

public class PerfilMedico {

    private String primerNombre;
    private String apellido;
    private String sexo;
    private int dia;
    private int mes;
    private int anio;
    private double altura;
    private double peso;

    public PerfilMedico(String primerNombre, String apellido, String sexo, int dia, int mes, int anio, double altura, double peso ){
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.altura = altura;
        this.peso = peso;
    }

    public void setPrimerNombre(String primerNombre){
        this.primerNombre = primerNombre;
    }

    public String getPrimerNombre(){
        return primerNombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public String getApellido(){
        return apellido;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public String getSexo(){
        return sexo;
    }

    public void setDia(int dia){
        this.dia = dia;
    }

    public int getDia(){
        return dia;
    }

    public void setMes(int mes){
        this.mes = mes;
    }

    public int getMes(){
        return mes;
    }

    public void setAnio(int anio){
        this.anio = anio;
    }

    public int getAnio(){
        return anio;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getAltura(){
        return altura;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public double getPeso(){
        return peso;
    }

    // metodos para calcular
    public int edadUsuario(){

        LocalDate fechaHoy = LocalDate.now();
        int AnioActual = fechaHoy.getYear();
        int edad = AnioActual - anio;

        if (fechaHoy.getMonthValue() < mes || (fechaHoy.getMonthValue() == mes && fechaHoy.getDayOfMonth() < dia)) {
            edad--;
        }
        return edad;
    }

    // frecuencia cardiaca maxima = 220 - edad
    public int frecuenciaCardiacaMaxima(){

        return 220 - edadUsuario();
    }

    public String frecuenciaCardiacaEsperada(){

        int maxima = frecuenciaCardiacaMaxima();
        double minimoEsperado = maxima * 0.50;
        double maximoEsperado = maxima * 0.85;

        return String.format("%.2f - %.2f", minimoEsperado, maximoEsperado);
    }

    // indice de masa corporal, la altura se combierte de centimetros a metros
    public double calcularBMI(){

        double altura_metros = altura / 100.0;
        return peso / (altura_metros * altura_metros);
    }
}
