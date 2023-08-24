// Ejercicio10
public class Serie {

	private String titulo;
    private int numeroTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    public Serie() {
        this.numeroTemporadas = 3;
        this.entregado = false;
        this.genero = "No especificado";
        this.creador = "No especificado";
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = 3;
        this.entregado = false;
        this.genero = "No especificado";
        this.creador = creador;
    }

    public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.entregado = false;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public static void main(String[] args) {
        Serie seriePorDefecto = new Serie();
        Serie strangerThings = new Serie("Stranger Things", 4, "Sci-Fi", "The Duffer Brothers");
        Serie gameOfThrones = new Serie("Game of Thrones", 8, "Fantasy", "David Benioff & D. B. Weiss");
        
        System.out.println("Default Serie:");
        System.out.println("Titulo: " + seriePorDefecto.getTitulo());
        System.out.println("Numero de Temporadas: " + seriePorDefecto.getNumeroTemporadas());
        System.out.println("Entregado: " + seriePorDefecto.isEntregado());
        System.out.println("Genero: " + seriePorDefecto.getGenero());
        System.out.println("Creador: " + seriePorDefecto.getCreador());
        System.out.println();

        System.out.println("Titled Serie:");
        System.out.println("Titulo: " + strangerThings.getTitulo());
        System.out.println("Numero de Temporadas: " + strangerThings.getNumeroTemporadas());
        System.out.println("Entregado: " + strangerThings.isEntregado());
        System.out.println("Genero: " + strangerThings.getGenero());
        System.out.println("Creador: " + strangerThings.getCreador());
        System.out.println();

        System.out.println("Complete Serie:");
        System.out.println("Titulo: " + gameOfThrones.getTitulo());
        System.out.println("Numero de Temporadas: " + gameOfThrones.getNumeroTemporadas());
        System.out.println("Entregado: " + gameOfThrones.isEntregado());
        System.out.println("Genero: " + gameOfThrones.getGenero());
        System.out.println("Creador: " + gameOfThrones.getCreador());

    }
}
