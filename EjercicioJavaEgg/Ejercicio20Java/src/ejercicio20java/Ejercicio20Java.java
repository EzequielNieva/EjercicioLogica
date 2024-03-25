
/*Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
*/
package ejercicio20java;

import java.util.Scanner;

public class Ejercicio20Java {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese un numero"+ i +", entre 1 y 20:");
            int num = leer.nextInt();
          
        if(num >= 1 && num <=20){
            System.out.print(num + " ");
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }else{
            System.out.println("El numero ingresado no es valido");
        }
        
    }
    
}
}
