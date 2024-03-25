
/*Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
*/
package ejercicio11java;

import java.util.Scanner;

public class Ejercicio11Java {

    public static void main(String[] args) {

        String palabra;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una palabra o frase: ");
        palabra = leer.nextLine();

        String palabra1= palabra.substring(0, 1);
        
        
        if(palabra1.equals("A")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        } 
        

    }
    
}
