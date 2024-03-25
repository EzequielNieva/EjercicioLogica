
/*Escribir un programa que pida dos números enteros por teclado y calcule la suma
de los dos. El programa deberá después mostrar el resultado de la suma*/

package ejercicio2java;

import java.util.Scanner;

public class Ejercicio2Java {

    public static void main(String[] args) {
        
        int num1,num2,suma;
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese el primer numero: ");
        num1 = leer.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2 = leer.nextInt();
        suma=num1+num2;
        System.out.println("El resultado de la suma es : " + suma);
    
        
    }
    
}
