
package test;

import genericos.ClaseGenerica;


public class TestGenerics {
    public static void main(String[] args) {
        
        ClaseGenerica<Integer> integer = new ClaseGenerica(15);
        integer.obtenerTipo();
        
        ClaseGenerica<String> string = new ClaseGenerica("Hola");
        string.obtenerTipo();
    }
}
