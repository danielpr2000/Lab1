import java.util.HashSet;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static HashSet<Artista> artistas = new HashSet<>();
    static HashMap<String, Disco> discos = new HashMap<>(); // Un solo HashMap para todos los discos

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    registrarArtista();
                    break;
                case 2:
                    registrarDisco();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida, intente nuevamente.");
            }
        } while (opcion != 0);
    }

    private static void mostrarMenu() {
        System.out.println("\n===== Menú del Sistema =====");
        System.out.println("1. Registrar Artista");
        System.out.println("2. Registrar Disco");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    // Método para registrar un nuevo artista
    private static void registrarArtista() {
        System.out.print("Ingrese el nombre del artista: ");
        String nombre = scanner.nextLine();

        // Usamos stream para verificar si el artista ya existe en el HashSet
        boolean artistaExiste = artistas.stream().anyMatch(artista -> artista.getNombre().equalsIgnoreCase(nombre));

        if (artistaExiste) {
            System.out.println("El artista ya está registrado.");
            return;
        }

        Artista nuevoArtista = new Artista(nombre);
        artistas.add(nuevoArtista);
        System.out.println("Artista registrado exitosamente.");
    }

    private static void registrarDisco() {
        if (artistas.isEmpty()) {
            System.out.println("No hay artistas registrados. Primero registre un artista.");
            return;
        }

        // Mostrar la lista de artistas registrados
        System.out.println("Seleccione el artista para el nuevo disco:");
        int index = 1;
        for (Artista artista : artistas) {
            System.out.println(index++ + ". " + artista.getNombre());
        }

        // Selección del artista
        System.out.print("Seleccione el número del artista: ");
        int artistaSeleccionado = scanner.nextInt() - 1;
        scanner.nextLine();  // Limpiar el buffer

        if (artistaSeleccionado < 0 || artistaSeleccionado >= artistas.size()) {
            System.out.println("Selección inválida.");
            return;
        }

        Artista artista = (Artista) artistas.toArray()[artistaSeleccionado];

        System.out.print("Ingrese el título del disco: ");
        String titulo = scanner.nextLine();

        if (discos.containsKey(titulo)) {
            System.out.println("El disco ya está registrado.");
            return;
        }

        System.out.print("Ingrese las ventas totales del disco: ");
        int ventasTotales = scanner.nextInt();
        scanner.nextLine();

        Disco nuevoDisco = new Disco(artista, titulo, ventasTotales);
        discos.put(titulo, nuevoDisco);

        if (artista.getDiscoMasVendido() == null || ventasTotales > artista.getDiscoMasVendido().getVentasTotales()) {
            artista.discoMasVendido = nuevoDisco;
        }

        artista.ventasTotales += ventasTotales;

        System.out.println("Disco registrado exitosamente.");
    }

}
