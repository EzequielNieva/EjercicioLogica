import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Mascota mascota = new Mascota("Fido", 5.0);

        do {
            System.out.println("Selecciona una acción:");
            System.out.println("1. Comer");
            System.out.println("2. Dormir");
            System.out.println("3. Despertar");
            System.out.println("4. Caminar");
            System.out.println("5. Correr");
            System.out.println("6. Obtener Energía");
            System.out.println("7. Salir");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    mascota.comer();
                    break;
                case 2:
                    mascota.dormir();
                    break;
                case 3:
                    mascota.despertar();
                    break;
                case 4:
                    mascota.caminar();
                    break;
                case 5:
                    mascota.correr();
                    break;
                case 6:
                    mascota.obtenerEnergia();
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }

            System.out.println("Energía de la mascota: " + mascota.getEnergia());
            System.out.println("Peso de la mascota: " + mascota.getPeso());
            System.out.println("Humor de la mascota: " + mascota.getHumor());
            System.out.println("¿Está vivo? " + mascota.estaVivo());
        } while (mascota.estaVivo());
    }
}

