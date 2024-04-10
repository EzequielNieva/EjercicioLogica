import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Empleado empleado = new Empleado("Juan", 2500);
        Gerente gerente = new Gerente("María", 3500, 1000);
        Desarrollador desarrollador = new Desarrollador("Pedro", 3000, "Java");

        System.out.println("Salario anual de " + empleado.getNombre() + ": " + empleado.calcularSalarioAnual());
        System.out.println("Salario anual de " + gerente.getNombre() + ": " + gerente.calcularSalarioAnual());
        System.out.println("Salario anual de " + desarrollador.getNombre() + ": " + desarrollador.calcularSalarioAnual());

        DesarrolladorFrontend desarrolladorFrontend = new DesarrolladorFrontend("Laura", 3000,"HTML"  ,new String[]{"HTML", "CSS", "JavaScript"});
        DesarrolladorBackend desarrolladorBackend = new DesarrolladorBackend("Carlos", 3500, "Java",new String[]{"Java", "Spring", "MySQL"});

        System.out.println("Salario anual de " + desarrolladorFrontend.getNombre() + ": " + desarrolladorFrontend.calcularSalarioAnual());
        System.out.println("Salario anual de " + desarrolladorBackend.getNombre() + ": " + desarrolladorBackend.calcularSalarioAnual());
    }
}