package Prueba3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class MoviendoCeros {

    // Método que convierte el input del usuario a según que tipo de dato que es
    public static Object parseInput(String input) {
        // Intentar convertir el input a boolean
        if (input.equalsIgnoreCase("true")) {
            return true;
        } else if (input.equalsIgnoreCase("false")) {
            return false;
        }

        // Intentar convertir el input a entero
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            // No hace nada, intenta la siguiente opción
        }

        // Si no es booleano ni entero, devuelve el dato como String
        return input;
    }

    // Método que desplaza todos los ceros al final del array
    public static Object[] moverCerosFinal(Object[] array) {
        ArrayList<Object> arrCeros = new ArrayList<>();
        int ceroCont = 0;

        // Recorre el array y separa los ceros de los demás elementos
        for (Object element : array) {
            if (element instanceof Integer && (Integer) element == 0) {
                ceroCont++;
            } else {
                arrCeros.add(element);
            }
        }

        // Añade los ceros al final del array
        for (int i = 0; i < ceroCont; i++) {
            arrCeros.add(0);
        }

        return arrCeros.toArray();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la cantidad de elementos en el array: ");
        int n = sc.nextInt();
        sc.nextLine();  // Crea un salto de línea

        Object[] array = new Object[n];

        System.out.println("Introduce los elementos del array (usa 'true' o 'false' para booleanos, números enteros, y cadenas de texto sin comillas):");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            String input = sc.nextLine();
            array[i] = parseInput(input);
        }

        System.out.println("Array original: " + Arrays.toString(array));
        Object[] result = moverCerosFinal(array);
        System.out.println("Array con los ceros al final: " + Arrays.toString(result));

        sc.close();
    }
}
