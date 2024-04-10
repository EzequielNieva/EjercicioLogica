public class Electronico extends Producto{
    String marca;

    public Electronico(String nombre, double precioBase, String marca) {
        super(nombre, precioBase);
        this.marca = marca;
    }

    @Override
    public double calcularPrecio() {
        return precioBase * 1.3;
    }

}
