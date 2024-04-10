public class ClientePremium implements Cliente{
    @Override
    public void realizarCompra(Vendible producto) {
        double precio = producto.calcularPrecio() * 0.9; // 10% de descuento para clientes premium
        System.out.println("Cliente Premium realizando compra de: " + ((Producto) producto).getNombre());
        System.out.println("Precio a pagar con descuento: " + precio);
    }
}
