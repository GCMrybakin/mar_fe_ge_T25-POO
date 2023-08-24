
// Ejercicio1
public class Alumno {
	private String nombre;
    private int edad;
    
    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
    
    public void verificarEdad() {
        if (edad >= 18) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("No es mayor de edad.");
        }
    }
    
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Juan", 20);
        alumno1.imprimirDatos();
        alumno1.verificarEdad();
        
        System.out.println();
        
        Alumno alumno2 = new Alumno("María", 16);
        alumno2.imprimirDatos();
        alumno2.verificarEdad();
    }
}
