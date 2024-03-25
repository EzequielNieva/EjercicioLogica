package vector;

import java.util.Scanner;

public class Vector {

    public static void main(String[] args) {
        
        int vector []= new int [4];
        
//        vector[0]=10;
//        vector[1]=20;
//        vector[2]=30;
//        vector[3]=40;

        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < vector.length; i++) {
            
            System.out.println("Ingrese el valor para el indice " + i);
            
            vector[i]=leer.nextInt();
        
        }
        
        
        for (int i = 0; i < vector.length; i++) {
            
            System.out.println("Estoy en el indice " + i + " se encuentra el numero: " + vector[i]);
            
            
        }


    }
    
}
