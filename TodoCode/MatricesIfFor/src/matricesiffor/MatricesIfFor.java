package matricesiffor;

import java.util.Scanner;

public class MatricesIfFor {

    public static void main(String[] args) {

        double matriz [][]= new double[4][4];
        
        Scanner leer = new Scanner(System.in);
        
        double suma =0.0;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < 3 ; j++) {
                
                System.out.println("Alumno n° "+ i +" Nota: " + j);
                
                matriz[i][j]=leer.nextDouble();
                
                suma = suma + matriz [i][j];
                
            }
            matriz[i][3] = suma / 3;
            suma=0.0;
        }
    
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("La nota del alumno n° " + i +" son:");
            for (int j = 0; j < 3; j++) {
                System.out.println("Nota n° "+ j + " " + matriz[i][j]);
            }
            System.out.println("El promedio de las notas es : " + matriz [i][3]);
        }
    
    }
}
