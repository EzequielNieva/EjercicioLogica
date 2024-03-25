
package claabstractas;


public class Circulo implements Figura, Dibujable, Rotable{

    private double radio;

    public Circulo() {
    }
    
    @Override //SOBRE ESCRITURA DE METODO.
    public double CacularArea() {
        double pi=3.14;
        double resultado= pi*radio*radio;
        return resultado;
    }

    @Override
    public void dibujar() {
        System.out.println("Estoy dibujando un circulo");
    }

    @Override
    public void rotar() {
        System.out.println("Estoy rotando un circulo");
    }
 
}
