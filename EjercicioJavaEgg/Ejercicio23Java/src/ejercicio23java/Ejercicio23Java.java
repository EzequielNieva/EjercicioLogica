/*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
pida al usuario un numero a buscar en el vector. El programa mostrará donde se
encuentra el numero y si se encuentra repetido
*/
package ejercicio23java;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Ejercicio23Java {

  
    public static void main(String[] args) {
        Random random = new Random();
        int [] vector = new int [5];
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < vector.length; i++) {
            vector[i]=random.nextInt(11);
        }
        for (int i : vector) {
            System.out.println(i);
        }
        int contador = 0;
        System.out.println("Ingrese un numero a buscar: Vector de 5 posiciones del numero de 0 al 10");
        int numeroBuscado= leer.nextInt();
        
        ArrayList<Integer> indices = new ArrayList<>();
        
        for (int i = 0; i < vector.length; i++) {
            if(vector[i]==numeroBuscado){
                indices.add(i);
                contador++;
            }
        }
        
         if (contador > 0) {
            System.out.println("El número " + numeroBuscado + " se encontró en el vector.");
            if (contador > 1) {
                System.out.println("El número " + numeroBuscado + " se encontró repetido " + contador + " veces.");
            } else {
                System.out.println("El número " + numeroBuscado + " se encontró una vez en el vector.");
            }
            System.out.println("Índice(s) donde se encuentra el número:");
            for (int indice : indices) {
                System.out.println(indice);
            }
        } else {
            System.out.println("El número " + numeroBuscado + " no se encontró en el vector.");
        }
        
        
    }
    
}
