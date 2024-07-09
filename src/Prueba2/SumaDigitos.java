package Prueba2;

import java.util.Scanner;

public class SumaDigitos {

    // Método que calcula la suma de los dígitos de un número
    public static int calcSumaDigitos(int num) {
        int suma = 0;
        while (num > 0){
            suma += num % 10;
            num /= 10;
        }
        return suma;
    }

    // Método que calcula la suma total de los dígitos de los números de 1 a N
    public static int sumaTotalDigitos(int N) {
        int sumaTotal = 0;
        for (int i = 1; i <= N; i++){
            sumaTotal +=calcSumaDigitos(i);
        }
        return sumaTotal;
    }

    public static void main(String[] args) {

        //Creamos el scanner para recoger los datos de la terminal
        Scanner sc = new Scanner(System.in);

        // Solicitamos un número al usuario
        System.out.print("Introduce un número: ");
        int n = sc.nextInt();

        // Llamamos al método para calcular la suma de los dígitos de los números de 1 a N
        int sumaTotal = sumaTotalDigitos(n);

        // Devolvemos el resultado a través de la terminal
        System.out.println("La suma total de los dígitos de 1 a " + n + " es: " + sumaTotal);

        // Cerramos el scanner
        sc.close();
    }
}
