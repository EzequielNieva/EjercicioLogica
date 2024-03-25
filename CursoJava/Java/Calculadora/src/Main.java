import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese el primer numero: ");
        double num1 = leer.nextDouble();
        System.out.println("Ingrese el segundo numero:");
        double num2 = leer.nextDouble();

        int opcion;
        do {
            System.out.println("\nMenú de Opciones:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = leer.nextInt();
            leer.nextLine();

            switch (opcion) {
                case 1:
                    double suma = num1 + num2;
                    System.out.println("suma = " + suma);
                    break;
                case 2:
                    double resta = num1-num2;
                    System.out.println("resta = " + resta);
                    break;
                case 3:
                    double multiplicacion = num1*num2;
                    System.out.println("multiplicacion = " + multiplicacion);
                    break;
                case 4:
                    if(num2!=0) {
                        double division  = num1/num2;
                        System.out.println("division = " + division);
                    }else {
                        System.out.println("No se puede dividir por cero");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 5);

    }
}
