
/*Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().*/

package ejercicio6java;

import java.util.Scanner;

public class Ejercicio6Java {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        double num,doble,triple,raiz;
        
        System.out.print("Ingrese un numero: ");
        num = leer.nextDouble();
        
        doble = Math.pow(num, 2);
        triple = Math.pow(num,3);
        raiz = Math.sqrt(num);
        
        System.out.println("raiz = " + raiz);
        System.out.println("triple = " + triple);
        System.out.println("doble = " + doble);
    }
    
}
