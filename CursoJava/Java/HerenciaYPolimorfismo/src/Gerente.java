public class Gerente extends Empleado{
    private double bonoAnual;

    public Gerente(String nombre, double salarioMensual, double bonoAnual) {
        super(nombre, salarioMensual);
        this.bonoAnual = bonoAnual;
    }

    @Override
    public double calcularSalarioAnual() {
        return super.calcularSalarioAnual() + bonoAnual;
    }
}
