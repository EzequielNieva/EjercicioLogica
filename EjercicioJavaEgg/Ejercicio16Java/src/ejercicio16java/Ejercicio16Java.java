
/*Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.*/

package ejercicio16java;

import java.util.Scanner;

public class Ejercicio16Java {

    public static void main(String[] args) {
        
        int num,suma=0;
        
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            
            System.out.println("Ingrese un numero: ");
            num = leer.nextInt();
            
            if(num == 0){
                System.out.println("Se capturo el numero cero");
                break;
            }else if (num >0 ){
                suma=suma+num;
            }
        }
        System.out.println("La suma total de los numero es: " + suma);



    }
    
}
