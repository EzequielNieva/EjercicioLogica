import java.util.*;

public class CarritoCompra {
    List<Vendible> items;

    public CarritoCompra() {
        items = new ArrayList<>();
    }

    public void agregarProducto(Vendible producto) {
        items.add(producto);
    }

    public double calcularTotal(Cliente cliente) {
        double total = 0;
        for (Vendible item : items) {
            total += item.calcularPrecio();
        }
        if (cliente instanceof ClientePremium) {
            total *= 0.9;
        }
        return total;
    }
}
