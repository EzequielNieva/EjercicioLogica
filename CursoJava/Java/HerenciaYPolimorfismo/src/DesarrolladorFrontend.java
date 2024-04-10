public class DesarrolladorFrontend extends Desarrollador{
    private String[] tecnologiasFrontend;

    public DesarrolladorFrontend(String nombre, double salarioMensual, String lenguaje, String[] tecnologiasBackend) {
        super(nombre, salarioMensual, lenguaje);
        this.tecnologiasFrontend = tecnologiasFrontend;
    }


    @Override
    public double calcularSalarioAnual() {
        // Se asume un bono adicional para desarrolladores frontend
        return super.calcularSalarioAnual() * 1.1;
    }
}
