package operadorternario;

import java.util.Scanner;

public class OperadorTernario {

    public static void main(String[] args) {

        double promedio;
        String condicionFinal;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el promedio general del alumno");
        promedio = leer.nextDouble();
        
        condicionFinal = (promedio >= 6) ? "Aprobado":"Desaprobado";
        
        System.out.println("La condicion final del alumno es: "+ condicionFinal);

    }
    
}
