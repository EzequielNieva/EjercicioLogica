
/*Escribir un programa que pida una frase y la muestre toda en mayúsculas y
después toda en minúsculas. Nota: investigar la función toUpperCase() y
toLowerCase() en Java.*/

package ejercicio4java;

import java.util.Scanner;

public class Ejercicio4Java {
    
    public static void main(String[] args) {

        String frase;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase : " );
        frase = leer.nextLine();
        
        System.out.println("Mayuscula: " + frase.toUpperCase());
        System.out.println("Minuscula: " + frase.toLowerCase());


    }
    
}
