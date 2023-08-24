// Ejercicio7
public class Ejercicio7 {
    private String nombre;
    private int edad;
    private final String DNI;
    private char sexo;
    private double peso;
    private double altura;
    private static final char GENERO_POR_DEFECTO = 'H';

    public Ejercicio7() {
        this("", 0, GENERO_POR_DEFECTO);
    }

    public Ejercicio7(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.DNI = generarDNI();
    }

    public Ejercicio7(String nombre, int edad, char sexo, double peso, double altura) {
        this(nombre, edad, sexo);
        this.peso = peso;
        this.altura = altura;
    }

    private char comprobarSexo(char sexo) {
        return (sexo == 'H' || sexo == 'M') ? sexo : GENERO_POR_DEFECTO;
    }

    private String generarDNI() {
        return "12345678X";
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\nEdad: " + edad +
                "\nDNI: " + DNI +
                "\nSexo: " + sexo +
                "\nPeso: " + peso +
                "\nAltura: " + altura;
    }

    public static void main(String[] args) {
        Ejercicio7 persona1 = new Ejercicio7(); // Por defecto
        Ejercicio7 persona2 = new Ejercicio7("Elena", 25, 'M');
        Ejercicio7 persona3 = new Ejercicio7("Carlos", 30, 'H', 75.5, 1.78);

        System.out.println("Persona 1:\n" + persona1);
        System.out.println("\nPersona 2:\n" + persona2);
        System.out.println("\nPersona 3:\n" + persona3);
    }
}
