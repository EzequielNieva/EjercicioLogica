
/*. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere
el límite inicial. */

package ejercicio14java;

import java.util.Scanner;

public class Ejercicio14Java {

   
    public static void main(String[] args) {
        
        int limite,suma;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un limite: ");
        limite = leer.nextInt();
        
        for (suma = 0; suma < limite; suma ++) {
            System.out.println("Ingrese otro numero: ");
            int num = leer.nextInt();
            suma=suma+num;
        }
        
    }
    
}
