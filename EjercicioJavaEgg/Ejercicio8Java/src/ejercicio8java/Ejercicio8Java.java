
/*Crear un programa que dado un numero determine si es par o impar*/

package ejercicio8java;

import java.util.Scanner;

public class Ejercicio8Java {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int num1;
        
        System.out.print("Ingrese un numero: ");
        num1 = leer.nextInt();
        
        if(num1 % 2 ==0){
            System.out.println("El numero es par. ");
        }else{
            System.out.println("El numero es impar. ");
        }
        
        

    }
    
}
