
package ejercicio4poo;

import java.util.Scanner;


public class Rectangulo {
    
    private int base;
    private int altura;

    public Rectangulo() {
    }
    
    public void crearRectangulo(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo: ");
        int base = leer.nextInt();
        this.base=base;
        System.out.println("Ingrese la altura del rectangulo: ");
        int altura= leer.nextInt();
        this.altura=altura;
    }
    
    public void calcularSuperficie(){
        int superficie = base*altura;
        System.out.println("superficie = " + superficie);
    }
    
    public void calcularPerimetro(){
        int perimetro = (base+altura)*2;
        System.out.println("perimetro = " + perimetro);
    }
    
    public void dibujarRectangulo(){
         for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if(i==0 || i==altura-1 || j==0 || j==base-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
