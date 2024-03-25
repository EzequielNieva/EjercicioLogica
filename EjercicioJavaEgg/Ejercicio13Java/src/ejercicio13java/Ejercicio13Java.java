/*Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta. */
package ejercicio13java;

import java.util.Scanner;

public class Ejercicio13Java {

    public static void main(String[] args) {

        int nota;
        Scanner leer = new Scanner(System.in);
        
        do{
            System.out.println("Ingrese una ente 0 y 10 ");
            nota = leer.nextInt();
        }while (nota<0 || nota>10);


    }
    
}
