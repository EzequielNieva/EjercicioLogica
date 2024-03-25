
package claabstractas;


public class Cuadrado implements Figura, Dibujable {

    private double lado;

    public Cuadrado() {
    }

    @Override //SOBRE ESCRITURA DE METODO.
    public double CacularArea() {
        double resultado = lado*lado;
        return resultado;
    }

    @Override
    public void dibujar() {
        System.out.println("ESTOY DIBUJANDO UN CUADRADO");
    }
      
}
