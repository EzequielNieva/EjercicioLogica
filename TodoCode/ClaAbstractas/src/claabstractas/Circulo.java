
package claabstractas;


public class Circulo extends Figura{

    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override //SOBRE ESCRITURA DE METODO.
    public double CacularArea() {
        double pi=3.14;
        double resultado= pi*radio*radio;
        return resultado;
    }
 
}
