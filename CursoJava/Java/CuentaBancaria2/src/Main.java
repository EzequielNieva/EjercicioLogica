import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria();
        CuentaBancaria cuenta2 = new CuentaBancaria();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese la cantida a depositar en la cuenta 1 :");
        double deposito = leer.nextDouble();
        cuenta1.depositar(deposito);

        System.out.println("Ingrese la cantidad a retirar de la cuenta 1: ");
        double retiro  = leer.nextDouble();
        cuenta1.retirar(retiro);

        System.out.println("Ingrese la cantidad a transferir a la cuenta 2 :");
        double transferir = leer.nextDouble();
        cuenta1.transferir(transferir, cuenta2);

        System.out.println("Saldo de cuenta1: " + cuenta1.getSaldo());
        System.out.println("Saldo de cuenta2: " + cuenta2.getSaldo());

        System.out.println("\nHistorial de transacciones de cuenta1:");
        cuenta1.imprimirHistorialTransacciones();

        System.out.println("\nHistorial de transacciones de cuenta2:");
        cuenta2.imprimirHistorialTransacciones();

    }
}