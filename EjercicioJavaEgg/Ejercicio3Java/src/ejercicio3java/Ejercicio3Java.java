
/*Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
por pantalla.*/

package ejercicio3java;

import java.util.Scanner;

public class Ejercicio3Java {

    public static void main(String[] args) {
        
        String nombre;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese su nombre: ");
        nombre = leer.nextLine();
        
        System.out.println("Bienvenido a tu primer programa : " + nombre);

    }
    
}
