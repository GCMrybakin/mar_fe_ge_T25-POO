public class Persona {
    private String nombre;

    public void SetNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }

    public void Saludar() {
        System.out.println("Hola, soy " + nombre + ".");
    }
}