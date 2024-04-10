public class DesarrolladorBackend extends Desarrollador{
    private String[] tecnologiasBackend;

    public DesarrolladorBackend(String nombre, double salarioMensual, String lenguaje, String[] tecnologiasBackend) {
        super(nombre, salarioMensual, lenguaje);
        this.tecnologiasBackend = tecnologiasBackend;
    }


    @Override
    public double calcularSalarioAnual() {
        // Se asume un bono adicional para desarrolladores backend
        return super.calcularSalarioAnual() * 1.15;
    }
}
