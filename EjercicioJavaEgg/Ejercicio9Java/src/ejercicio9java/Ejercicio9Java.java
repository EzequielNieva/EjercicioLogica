
/*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java*/

package ejercicio9java;

import java.util.Scanner;

public class Ejercicio9Java {

    public static void main(String[] args) {
        
        String frase;
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese una palabra: ");
        frase = leer.nextLine();
        
        if(frase.equals("eureka")){
            System.out.println("Correcto. ");
        }else{
            System.out.println("Incorrecto. ");
        }
        

    }
    
}
