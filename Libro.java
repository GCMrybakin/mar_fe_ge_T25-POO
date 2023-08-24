// Ejercicio5
public class Libro {
    private String autor;
    private String titulo;
    private String ubicacion;

    public Libro(String autor, String titulo, String ubicacion) {
        this.autor = autor;
        this.titulo = titulo;
        this.ubicacion = ubicacion;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public static void main(String[] args) {
        Libro miLibro = new Libro("Sun tzu", "Arte de la guerra", "China");

        System.out.println("Autor: " + miLibro.getAutor());
        System.out.println("Titulo: " + miLibro.getTitulo());
        System.out.println("Ubicacion: " + miLibro.getUbicacion());
    }
}
