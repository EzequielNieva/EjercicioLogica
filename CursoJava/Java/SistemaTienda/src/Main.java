public class Main {
    public static void main(String[] args) {
        Ropa camisa = new Ropa("Camisa", 20.0, "M");
        Electronico laptop = new Electronico("Laptop", 1000.0, "Lenovo");
        Comestible fruta = new Comestible("Manzana", 2.0, 7);

        ClienteRegular clienteRegular = new ClienteRegular();
        ClientePremium clientePremium = new ClientePremium();

        CarritoCompra carrito = new CarritoCompra();
        carrito.agregarProducto(camisa);
        carrito.agregarProducto(laptop);
        carrito.agregarProducto(fruta);

        System.out.println("Total a pagar para cliente regular: " + carrito.calcularTotal(clienteRegular));
        System.out.println("Total a pagar para cliente premium: " + carrito.calcularTotal(clientePremium));

    }
}
