
package vectoresfor.pkgif;

import java.util.Scanner;


public class VectoresForIf {

   
    public static void main(String[] args) {
        
        int vector [] = new int [15];
        
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < vector.length; i++) {

            System.out.println("Ingrese un valor para la posicion: " + i);
            vector[i]=leer.nextInt();
            
        }
        int cont=0;
        for (int i = 0; i < vector.length; i++) {
            
            if(vector[i]==3){
                cont++;
            }
        }
        
        System.out.println("El vector tiene una cantidad de numero 3 es : " + cont);
    }
    
}
