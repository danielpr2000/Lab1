import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    //registrarArtista();
                    break;
                case 2:
                    //registrarDisco();
                    break;
                case 3:
                    //realizarVenta();
                    break;
                case 4:
                    //mostrarVentasDisco();
                    break;
                case 5:
                    //mostrarVentasArtista();
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
        System.out.println("3. Realizar Venta de Disco");
        System.out.println("4. Mostrar Ventas por Disco");
        System.out.println("5. Mostrar Ventas por Artista");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }
}