package ejercicio3_16_frecuenciacardiaca;

import java.util.Scanner;

public class PruebaFrecuenciaCardiacas {

    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);

        // se piden los datos al usuario
        System.out.println("Ingrese su nombre:");
        String nombre = entrada.nextLine();

        System.out.println("Ingrese su apellido:");
        String apellido = entrada.nextLine();

        System.out.println("Ingrese su dia de nacimiento:");
        int dia = entrada.nextInt();

        System.out.println("Ingrese su mes de nacimiento:");
        int mes = entrada.nextInt();

        System.out.println("Ingrese su anio de nacimiento:");
        int anio = entrada.nextInt();

        // se crea el objeto con los datos que se ingresaron
        FrecuenciaCardiacas persona = new FrecuenciaCardiacas(nombre, apellido, dia, mes, anio);

        System.out.println("\n--- RESULTADOS ---");
        System.out.println(persona.getInfo());
    }
}