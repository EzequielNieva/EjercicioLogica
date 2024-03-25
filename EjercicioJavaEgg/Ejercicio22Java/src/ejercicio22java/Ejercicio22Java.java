/*Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
los muestre por pantalla en orden descendente.*/

package ejercicio22java;



public class Ejercicio22Java {

    public static void main(String[] args) {
        int[] vector =new int[100];
        for (int i = 0; i < vector.length; i++) {
             vector[i]=i;
        }
        
        System.out.println("Vector en orden descendente:");
        for (int i = vector.length - 1; i >= 0; i--) {
            System.out.println(vector[i]);
        }
       

    }
    
}
