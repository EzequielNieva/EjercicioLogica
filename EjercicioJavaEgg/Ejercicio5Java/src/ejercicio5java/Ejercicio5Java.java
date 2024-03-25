
/*Dada una cantidad de grados centígrados se debe mostrar su equivalente en
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/

package ejercicio5java;

import java.util.Scanner;

public class Ejercicio5Java {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        double grados,resultado;
        
        System.out.println("Ingrese los grados en centígrados: ");
        grados = leer.nextDouble();
        
        resultado = 32 + (9 * grados / 5);
        System.out.println("Los grados ingresado equivalen a : " + resultado + " grados Fahrenheit.");
    }
    
}
