// Ejercicio2
public class Empleado {
    private String nombre;
    private double sueldo;
    
    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    
    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Sueldo: $" + sueldo);
    }
    
    public void verificarImpuestos() {
        if (sueldo > 3000) {
            System.out.println("El empleado debe pagar impuestos.");
        } else {
            System.out.println("El empleado no debe pagar impuestos.");
        }
    }
    
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 2500);
        empleado1.imprimirDatos();
        empleado1.verificarImpuestos();
        
        System.out.println();
        
        Empleado empleado2 = new Empleado("María", 3500);
        empleado2.imprimirDatos();
        empleado2.verificarImpuestos();
    }
}
