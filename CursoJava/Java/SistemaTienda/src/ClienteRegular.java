public class ClienteRegular implements Cliente{
    @Override
    public void realizarCompra(Vendible producto) {
        System.out.println("Cliente Regular realizando compra de: " + ((Producto) producto).getNombre());
        System.out.println("Precio a pagar: " + producto.calcularPrecio());
    }
}
