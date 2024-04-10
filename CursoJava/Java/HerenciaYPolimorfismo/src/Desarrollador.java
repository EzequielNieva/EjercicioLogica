public class Desarrollador extends Empleado{
    private String lenguaje;

    public Desarrollador(String nombre, double salarioMensual, String lenguaje) {
        super(nombre, salarioMensual);
        this.lenguaje = lenguaje;
    }
}
