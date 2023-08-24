import java.util.Scanner;
//Ejercicio3
public class Operaciones {
    private Scanner teclado;
    private int n1, n2, suma, multiplicacion, resta, division;

    public void inicializar() {
        teclado = new Scanner(System.in);
        System.out.print("Numero 1: ");
        n1 = teclado.nextInt();
        System.out.print("Numero 2: ");
        n2 = teclado.nextInt();
    }

    public void calcularOperaciones() {
        suma = n1 + n2;
        resta = n1 - n2;
        multiplicacion = n1 * n2;
        division = n1 / n2;
    }

    public void mostrarCalculos() {
        System.out.println("La suma de los dos numeros: " + suma);
        System.out.println("La resta de los dos numeros: " + resta);
        System.out.println("La multiplicación de los dos numeros: " + multiplicacion);
        System.out.println("La división de los dos numeros: " + division);
    }

    public static void main(String args[]) {
        Operaciones operacion1 = new Operaciones();
        operacion1.inicializar();
        operacion1.calcularOperaciones();
        operacion1.mostrarCalculos();
    }
}
