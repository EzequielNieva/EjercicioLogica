
package test;

import aritmetica.Aritmetica;


public class TestExcepciones {
    public static void main(String[] args) {
        int resultado=0;
        resultado = Aritmetica.division(10, 0);
        System.out.println("resultado= "+resultado);
        
    }
    
}
