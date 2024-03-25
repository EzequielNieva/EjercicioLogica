
package claabstractas;


public class Cuadrado extends Figura {

    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double CacularArea() {
        double resultado = lado*lado;
        return resultado;
    }

    
   
      
}
