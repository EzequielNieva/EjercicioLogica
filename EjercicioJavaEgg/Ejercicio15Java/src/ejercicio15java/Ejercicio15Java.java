
/*Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.*/

package ejercicio15java;

import java.util.Scanner;

public class Ejercicio15Java {

    public static void main(String[] args) {
        String salir = "N";
        double num1,num2;
        int opcion;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("---Calculadora Basica----");
        System.out.println("Ingrese el primer numero: ");
        num1 = leer.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        num2 = leer.nextDouble();

        do{
            System.out.println("Menu:"+"\n"+"1-Sumar"+"\n"+"2-Restar"+"\n"+"3-Multiplicar"+"\n"+"4-dividir"+"\n"+"5-Salir"+"\n"+"Elja opcion:");
            opcion = leer.nextInt();
            switch(opcion){
            case 1 :
                System.out.println("La suma es: " + (num1+num2));
                break;
            case 2 :
                System.out.println("La resta es: " + (num1-num2));
                break;
            case 3 :
                System.out.println("La multiplicacion es: " +(num1*num2));
                break;
            case 4 :
                if(num2==0){
                    System.out.println("No se puede dividir");
                }else{
                    System.out.println("La division es: "+ (num1/num2));
                }
                break;
            case 5 :
                System.out.println("¿Seguro quiere salir? S/N");
                salir = leer.next();
                break;
            default :
                System.out.println("Opcion Incorrecta");
                break;
            }
            
        }while(salir.equals("N"));

    }
    
}
