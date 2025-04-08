public class Disco {
    Artista artista;
    String titulo;
    int ventasTotales;

    public Disco(Artista artista, String titulo, int ventasTotales) {
        this.artista = artista;
        this.titulo = titulo;
        this.ventasTotales = ventasTotales;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getVentasTotales() {
        return ventasTotales;
    }

    public void setVentasTotales(Integer ventasTotales) {
        this.ventasTotales = ventasTotales;
    }

    @Override
    public String toString() {
        return "Disco{" +
                "Artista: " + artista.getNombre() + ", " +  // Supongo que 'Artista' tiene un método 'getNombre'
                "Título: '" + titulo + "', " +
                "Ventas Totales: " + ventasTotales +
                "}";
    }

}
