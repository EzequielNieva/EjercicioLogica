/*Crea una aplicación que a través de una función nos convierta una cantidad de
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
converir que será una cadena, este no devolverá ningún valor y mostrará un
mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 € */

package ejercicio21java;

import java.util.Scanner;

public class Ejercicio21Java {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double euro;
        System.out.println("Ingrese la cantidad de euro a convertir: ");
        euro= leer.nextDouble();
        cambio(euro);

    }
    
    public static void cambio(double euro){
        
        double libra= euro * 0.86;
        double dolar = euro * 1.2861;
        double yenes = euro * 129.852;
        
        System.out.println("Libra = $" + libra);
        System.out.println("Dolar = $" + dolar);
        System.out.println("Yenes = $" + yenes);
    }
}
