
/*Implementar un programa que dado dos números enteros determine cuál es el
mayor y lo muestre por pantalla*/

package ejercicio7java;

import java.util.Scanner;

public class Ejercicio7Java {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num1,num2;
        
        System.out.print("Ingrese el primer numero: ");
        num1 = leer.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2 = leer.nextInt();

        if(num1==num2){
            System.out.println("Los numero son iguales: " + num1);
        }else if (num1>num2){
            System.out.println("El primer numero es mayor: " + num1);
        }else{
            System.out.println("El segundo numero es mayor: " + num2);
        }

    }
    
}
