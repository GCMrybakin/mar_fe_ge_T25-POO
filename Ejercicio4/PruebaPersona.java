// Ejercicio4
public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();

        persona1.SetNombre("Juan");
        persona2.SetNombre("Pablo");

        persona1.Saludar();
        persona2.Saludar();
    }
}