import java.util.ArrayList;
import java.util.Date;

public class CuentaBancaria {
    private double saldo;
    private ArrayList<String> historialTransacciones;

    public CuentaBancaria() {
        saldo = 0.0;
        historialTransacciones = new ArrayList<>();
    }

    public void setSaldo(double nuevoSaldo) {
        saldo = nuevoSaldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
        registrarTransaccion("Depósito", cantidad);
    }

    public void retirar(double cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
            registrarTransaccion("Retiro", cantidad);
        } else {
            System.out.println("Fondos insuficientes para retirar " + cantidad + " unidades.");
        }
    }

    public void transferir(double cantidad, CuentaBancaria cuentaDestino) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
            cuentaDestino.depositar(cantidad);
            registrarTransaccion("Transferencia a " + cuentaDestino.getClass().getSimpleName(), cantidad);
        } else {
            System.out.println("Fondos insuficientes para transferir " + cantidad + " unidades.");
        }
    }

    private void registrarTransaccion(String tipoTransaccion, double cantidad) {
        Date fechaHoraActual = new Date();
        historialTransacciones.add("[" + fechaHoraActual.toString() + "] " + tipoTransaccion + ": " + cantidad);
    }

    public void imprimirHistorialTransacciones() {
        System.out.println("Historial de Transacciones:");
        for (String transaccion : historialTransacciones) {
            System.out.println(transaccion);
        }
    }
}
