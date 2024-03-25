import java.util.Scanner;

public class Main {

    private static String[] nombres = new String[100];
    private static String[] numerosTelefono = new String[100];
    private static int totalContactos = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\nMenú de Opciones:");
            System.out.println("1. Agregar Contacto");
            System.out.println("2. Buscar Contacto");
            System.out.println("3. Mostrar Contactos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    agregarContacto();
                    break;
                case 2:
                    buscarContacto();
                    break;
                case 3:
                    mostrarContactos();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 4);

    }

    public static void agregarContacto() {
        System.out.print("\nIngrese el nombre del contacto: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el número de teléfono: ");
        String telefono = scanner.nextLine();

        nombres[totalContactos] = nombre;
        numerosTelefono[totalContactos] = telefono;
        totalContactos++;

        System.out.println("Contacto agregado correctamente.");
    }

    public static void buscarContacto() {
        System.out.print("\nIngrese el nombre del contacto que desea buscar: ");
        String nombreBuscar = scanner.nextLine();

        boolean encontrado = false;
        for (int i = 0; i < totalContactos; i++) {
            if (nombres[i].equalsIgnoreCase(nombreBuscar)) {
                System.out.println("Nombre: " + nombres[i] + ", Teléfono: " + numerosTelefono[i]);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("El contacto no se encontró.");
        }
    }

    public static void mostrarContactos() {
        System.out.println("\nLista de Contactos:");
        if (totalContactos == 0) {
            System.out.println("No hay contactos para mostrar.");
        } else {
            for (int i = 0; i < totalContactos; i++) {
                System.out.println("Nombre: " + nombres[i] + ", Teléfono: " + numerosTelefono[i]);
            }
        }
    }
}