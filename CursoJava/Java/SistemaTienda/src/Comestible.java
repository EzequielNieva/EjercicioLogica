public class Comestible  extends Producto{
    int diasCaducidad;

    public Comestible(String nombre, double precioBase, int diasCaducidad) {
        super(nombre, precioBase);
        this.diasCaducidad = diasCaducidad;
    }
    @Override
    public double calcularPrecio() {
        return precioBase * 1.1;
    }
}
