public class Empleado {
    private String nombre;
    private double salarioMensual;

    public Empleado(String nombre, double salarioMensual) {
        this.nombre = nombre;
        this.salarioMensual = salarioMensual;
    }

    public double calcularSalarioAnual() {
        return salarioMensual * 12;
    }

    public String getNombre() {
        return nombre;
    }
}
