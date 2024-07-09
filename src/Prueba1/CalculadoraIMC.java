package Prueba1;

import java.util.Scanner;

public class CalculadoraIMC {

    // Método que calcula el IMC
    public static double calcularIMC(double peso, double altura) {

      // Math.pow es una función que retorna la base elevada al exponente
      altura = Math.pow(altura, 2);
      return peso / altura;
    }

    // Método que según el c
    public static String clasificarIMC(double imc) {
        if (imc <= 18.5) {
            return "Infrapeso";
        } else if (imc <= 25.0){
            return "Normal";
        } else if (imc <= 30.0){
            return "Sobrepeso";
        } else {
            return "Obeso";
        }
    }

    public static void main(String[] args) {

        //Creamos el scanner para recoger los datos de la terminal
        Scanner sc = new Scanner(System.in);

        // Solicitamos el nombre del usuario
        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();

        // Solicitamos el peso del usuario
        System.out.print("Introduce tu peso (en kg): ");
        double peso = sc.nextDouble();

        // Solicitamos la altura del usuario
        System.out.print("Introduce tu altura (en metros): ");
        double altura = sc.nextDouble();

        // Llamamos al método para calcular el IMC
        double imc = calcularIMC(peso, altura);

        // Llamamos al método para clasificar el IMC
        String clasificacion = clasificarIMC(imc);

        // Mostramos en la terminal el resultado
        System.out.printf("Hola %s, tu IMC es %.2f y estas en la categoría: %s%n", nombre, imc, clasificacion);

        // Cerramos el scanner
        sc.close();
    }
}
