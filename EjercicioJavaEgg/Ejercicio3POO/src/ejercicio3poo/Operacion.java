
package ejercicio3poo;

import java.util.Scanner;


public class Operacion {
    
    private double numero1;
    private double numero2;

    public Operacion() {
    }

    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperacion(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero:");
        double numero1 = leer.nextDouble();
        System.out.println("Ingrese el segundo numero:");
        double numero2 = leer.nextDouble();
        this.numero1=numero1;
        this.numero2=numero2;
    }
    
    public void sumar(){
        double sumar = numero1 + numero2;
        System.out.println("sumar = " + sumar);
    }
    
    public void restar(){
        double resta = numero1 - numero2;
        System.out.println("resta = " + resta);
    }
    
    public void multiplicar(){
        if(numero1 == 0 || numero2==0){
            System.out.println("Error, el resultado es 0");
        }else{
            double mult = numero1*numero2;
            System.out.println("multiplicacion = " + mult);
        }
    }
    public void dividir(){
        if(numero2==0){
            System.out.println("Error, no se puede dividir por cero");
        }else{
            double division = numero1/numero2;
            System.out.println("division = " + division);
        }
    }
}
