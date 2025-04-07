public class Artista {
    int id;
    String nombre;
    String discoMasVendido;
    Double ventasTotales;

    private static int contadorIds = 1;

    public Artista(String nombre) {
        this.id = contadorIds++; // Asigna un id ascendente
        this.nombre = nombre;
        this.discoMasVendido = null; // Inicializa disco más vendido en null
        this.ventasTotales = 0.0; // Inicializa ventas totales en 0
    }

    // Métodos getter y setter si los necesitas
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDiscoMasVendido() {
        return discoMasVendido;
    }

    public Double getVentasTotales() {
        return ventasTotales;
    }
}
