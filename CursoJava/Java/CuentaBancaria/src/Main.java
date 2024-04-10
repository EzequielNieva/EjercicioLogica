public class Main {
    public static void main(String[] args) {

        CuentaBancaria cuenta = new CuentaBancaria("123456", 1.000);

        cuenta.consutlarSaldo();

        cuenta.depositar(500.0);
        cuenta.consutlarSaldo();

        cuenta.retirar(200.0);
        cuenta.consutlarSaldo();

        cuenta.retirar(2000.0);
        cuenta.consutlarSaldo();
    }
}