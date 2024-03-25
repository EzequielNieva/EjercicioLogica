import java.util.Scanner;

/*- Ejercicios Prácticos 24/10 (Intro Java)

    **Ejercicio 1: Calculadora de IMC (Índice de Masa Corporal)**

    Crea un programa que solicite al usuario ingresar su peso (en kilogramos) y su altura (en metros). Luego, calcula el IMC
    (peso / altura^2) y muestra un mensaje indicando si la persona tiene un peso bajo, normal, sobrepeso o obesidad, según los
    valores típicos del IMC.

    **Ejercicio 2: Conversor de Monedas**

    Desarrolla un programa que permita al usuario convertir una cantidad de pesos argentinos a dolares. El usuario debe ingresar
    la cantidad en pesos, y el programa debe realizar la conversión y mostrar el resultado. Utiliza una tasa de conversión fija.

    **Ejercicio 3: Validación de Contraseña**

    Crea un programa que solicite al usuario ingresar una contraseña. El programa debe validar la contraseña según el criterio
    de una longitud mínima caracteres. Ingrese nuevamente la contraseña y corroborar que ambas sean iguales.

    **Ejercicio 4: Ordenar Tres Números**

    Escribe un programa que solicite al usuario ingresar tres números. El programa debe utilizar sentencias
    **`if-else`** para determinar y mostrar los números en orden ascendente.*/
public class Main {
    public static void main(String[] args) {
        //Ejericio 1:
        double peso,altura,imc;
     Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese su peso en Kg: ");
        peso = leer.nextDouble();
        System.out.println("Ingrese su altura en Metros: ");
        altura = leer.nextDouble();

        imc=peso/(altura*altura);
        System.out.println(imc);

        if(imc<18){
            System.out.println("Peso bajo");
        }else if(imc>25){
            System.out.println("Sobrepeso");
        }else if(imc>30){
            System.out.println("Obesidad");
        }else{
            System.out.println("Peso normal");
        }

        //Ejericio 2:

        System.out.println("Ingrese la cantidad de peso a convertir a dolares: ");
        double pesoArg = leer.nextDouble();

        double dolar = pesoArg * 0.0012;

        System.out.println("El equivale a dolar es : $"+dolar);

        //Ejercicio 3:

        System.out.println("Ingresar una constraseña");
        String clave = leer.next();
        System.out.println("Ingrese nuevamente la contraseña: ");
        String clave2 = leer.next();

        if(clave.length()>6 && clave.equals(clave2)){
            System.out.println("Contraseña creada correctamente");
        } else if (clave.length()<6) {
            System.out.println("La contraseña debe tener mas de 6 caracteres");
        } else if (!clave.equals(clave2)) {
            System.out.println("La contraseña no coinciden");
        }

        //Ejercicio 4

        System.out.println("Ingrese el primer numero: ");
        int n = leer.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int n2  = leer.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        int n3 = leer.nextInt();

        if (n > n2 && n > n3) {
            if (n2 > n3) {
                System.out.println(n + " " + n2 + " " + n3);
            } else {
                System.out.println(n + " " + n3 + " " + n2);
            }
        } else if (n2 > n && n2 > n3) {
            if (n > n3) {
                System.out.println(n2 + " " + n + " " + n3);
            } else {
                System.out.println(n2 + " " + n3 + " " + n);
            }
        } else if (n3 > n2 && n3 > n) {
            if (n2 > n) {
                System.out.println(n3 + " " + n2 + " " + n);
            } else {
                System.out.println(n3 + " " + n + " " + n2);
            }
        }
    }

 }
