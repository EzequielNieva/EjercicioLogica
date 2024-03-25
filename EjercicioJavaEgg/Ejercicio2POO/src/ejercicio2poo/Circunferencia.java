
package ejercicio2poo;

import static java.lang.Math.PI;
import java.util.Scanner;


public class Circunferencia {
    private double radio;
    

    public Circunferencia() {
    }
    
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio de la circunferencia: ");
        double radio = leer.nextDouble();
        this.radio=radio;
    }
    
    public void area(){
        double area = PI*(radio*radio);
        System.out.println("Area: " + area);
    }
    
    public void perimetro(){
        double perimetro = 2*PI*radio;
        System.out.println("Perimetro = " + perimetro);
    }
}
