public class CuentaBancaria {

    String numeroCuenta;
    double saldo;

    public CuentaBancaria(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public void depositar(double cantidad){
        if(cantidad>0){
            saldo += cantidad;
            System.out.println("cantidad = " + cantidad);
        }else{
            System.out.println("Error: La cantidad debe ser mayor a 0");
        }
    }

    public void consutlarSaldo(){
        System.out.println("Saldo actual: $" + saldo);
    }

    public void retirar(double cantidad){
        if(cantidad >0 && saldo >= cantidad){
            saldo -= cantidad;
            System.out.println("Retiro de $" + cantidad);
        }else{
            System.out.println("Error: Fondo insuficientes o cantidad no validad");
        }
    }
}
