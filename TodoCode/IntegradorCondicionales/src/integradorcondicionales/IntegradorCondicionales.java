
package integradorcondicionales;

import java.util.Scanner;


public class IntegradorCondicionales {

   
    public static void main(String[] args) {
        
        double sueldo = 0;
        int categoria;
        
        System.out.println("Ingrese el tipo de categoria que desea calcular el sueldo");
        
        Scanner leer = new Scanner(System.in);
        
        categoria=leer.nextInt();
        
        switch (categoria) {
            case 1 -> sueldo = 15890 + (15890*0.10);
            case 2 -> sueldo = 25630.89;
            case 3 -> sueldo = 35560.20 - (35560.20*.011);
            default -> System.out.println("Categoria invalida");
        }
        
        if(categoria == 1 || categoria == 2 || categoria==3){
        System.out.println("El total del sueldo para la categoria " + categoria +" es igual a: $"+ sueldo);
        }
        
    }
    
}
