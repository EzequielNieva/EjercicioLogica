/*- Ejercicio N1 - **Análisis de Datos**

    **Programa de Análisis de Datos**

    Diseña un programa en Java que permita a un usuario ingresar una serie de números y realice un análisis de esos datos. El programa debe incluir las siguientes funciones:

    1. **`encontrarMaximo`**: Esta función debe tomar un arreglo de números como entrada y encontrar el número máximo en el conjunto. Devuelve el número máximo encontrado.
    2. **`encontrarMinimo`**: Esta función debe tomar un arreglo de números como entrada y encontrar el número mínimo en el conjunto. Devuelve el número mínimo encontrado.
    3. **`calcularPromedio`**: Esta función debe calcular y devolver el promedio de los números en el conjunto.
    4. **`contarNumerosPares`**: Esta función debe contar la cantidad de números pares en el conjunto y devolver ese número.

    El programa principal debe realizar lo siguiente:

    - Solicitar al usuario la cantidad de números que desea ingresar.
    - Pedir al usuario que ingrese los números uno por uno y almacenarlos en un arreglo.
    - Utilizar las funciones mencionadas para calcular y mostrar lo siguiente:
        - El número máximo en el conjunto.
        - El número mínimo en el conjunto.
        - El promedio de los números en el conjunto.
        - La cantidad de números pares en el conjunto.

    El programa debe ser modular y utilizar las funciones mencionadas para llevar a cabo estas tareas. Asegúrate de manejar adecuadamente las entradas de usuario y proporcionar
    salidas claras y comprensibles.*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese la cantidad de números que desea ingresar:");
        int cantidadNumeros = leer.nextInt();

        int[] numeros = new int[cantidadNumeros];

        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Ingrese el número #" + (i + 1) + ": ");
            numeros[i] = leer.nextInt();
        }
        System.out.println("Número máximo: " + encontrarMaximo(numeros));
        System.out.println("Número mínimo: " + encontrarMinimo(numeros));
        System.out.println("Promedio: " + calcularPromedio(numeros));
        System.out.println("Cantidad de números pares: " + contarNumerosPares(numeros));

    }

    public static int encontrarMaximo(int[] numeros) {
        int maximo = numeros[0];
        for (int numero : numeros) {
            if (numero > maximo) {
                maximo = numero;
            }
        }
        return maximo;
    }

    public static int encontrarMinimo(int[] numeros) {
        int minimo = numeros[0];
        for (int numero : numeros) {
            if (numero < minimo) {
                minimo = numero;
            }
        }
        return minimo;
    }

    public static double calcularPromedio(int[] numeros) {
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        return (double) suma / numeros.length;
    }

    public static int contarNumerosPares(int[] numeros) {
        int contador = 0;
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }

}

