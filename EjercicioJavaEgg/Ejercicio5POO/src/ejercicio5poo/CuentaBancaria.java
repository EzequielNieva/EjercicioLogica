package ejercicio5poo;

import java.util.Scanner;

public class CuentaBancaria {
    private Scanner leer = new Scanner(System.in);
    int numeroCuenta;
    long dni;
    double saldoActual;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numeroCuenta, long dni, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    public void crearCuenta(){
        
        
        System.out.println("Ingrese el numero de la cuenta: ");
        int numeroCuenta= leer.nextInt();
        System.out.println("Igrese el DNI del cliente: ");
        long dni= leer.nextLong();
        System.out.println("Ingrese el saldo actual de la cuenta: ");
        double saldoActual=leer.nextDouble();
        this.dni=dni;
        this.numeroCuenta=numeroCuenta;
        this.saldoActual=saldoActual;
    }
    
    public void ingresar(){
        System.out.println("Ingrese la cantida de dinero a ingresear: ");
        double dinero = leer.nextDouble();
        this.saldoActual=saldoActual + dinero;
    }
    
    public void retirar(){
        System.out.println("Ingrese la cantidad de dinero a retirar: ");
        double retirar = leer.nextDouble();
        if(this.saldoActual==0){
            System.out.println("Saldo actual es 0");
        }else{
            this.saldoActual= saldoActual - retirar;
        }
    }
    
   public void extraccionRapida(){
        System.out.println("Solo podra retirar el 20%");
        this.saldoActual= saldoActual-(saldoActual*0.20);
   }
    
   public void consultarSaldo(){
       System.out.println("Saldo: $"+ saldoActual );
   }
   
   public void consultarDatos(){
       System.out.println("Numero de cuenta: " + numeroCuenta);
       System.out.println("DNI: " + dni);
       System.out.println("Saldo actual: $"+saldoActual);
   }
}
