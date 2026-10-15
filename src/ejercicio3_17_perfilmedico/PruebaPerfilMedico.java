package ejercicio3_17_perfilmedico;

import java.util.Scanner;

public class PruebaPerfilMedico {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese su primer nombre:");
        String primerNombre = entrada.nextLine();

        System.out.println("Ingrese su apellido:");
        String apellido = entrada.nextLine();

        System.out.println("Ingrese su sexo:");
        String sexo = entrada.nextLine();

        System.out.println("Ingrese su dia de nacimiento (numero):");
        int dia = entrada.nextInt();

        System.out.println("Ingrese su mes de nacimiento (numero):");
        int mes = entrada.nextInt();

        System.out.println("Ingrese su anio de nacimiento (numero):");
        int anio = entrada.nextInt();

        System.out.println("Ingrese su altura en centimetros (ej. 175):");
        double altura = entrada.nextDouble();

        System.out.println("Ingrese su peso en kilogramos (ej. 70.5):");
        double peso = entrada.nextDouble();

        // se crea el objeto perfil con los datos ingrezados
        PerfilMedico perfil =new PerfilMedico(primerNombre, apellido, sexo, dia, mes, anio, altura, peso);

        System.out.println("\n PERFIL MEDICO ");
        System.out.println("Nombre completo: " + perfil.getPrimerNombre() + " " + perfil.getApellido());
        System.out.println("Sexo: " + perfil.getSexo());
        System.out.println("Fecha de nacimiento: " + perfil.getDia() + "/" + perfil.getMes() + "/" + perfil.getAnio());
        System.out.println("Altura: " + perfil.getAltura() + " cm");
        System.out.println("Peso: " + perfil.getPeso() + " kg");

        System.out.println("\n CALCULOS ");
        System.out.println("Edad: " + perfil.edadUsuario() + " anios");
        System.out.println("Frecuencia cardiaca maxima: " + perfil.frecuenciaCardiacaMaxima() + " latidos por minuto");
        System.out.println("Rango de frecuencia esperada: " + perfil.frecuenciaCardiacaEsperada() + " latidos por minuto");
        System.out.println("Indice de Masa Corporal (BMI): " + String.format("%.2f", perfil.calcularBMI()));

        // tabla de los valores del BMI
        System.out.println("\n VALORES DE BMI ");
        System.out.println("Bajo peso:  menos de 18.5");
        System.out.println("Normal:     entre 18.5 y 24.9");
        System.out.println("Sobrepeso:  entre 25 y 29.9");
        System.out.println("Obeso:      30 o mas");

    }
}