import java.util.Random;
import java.util.Scanner;

// Ejercicio8
public class Password {
    private int longitud;
    private String contraseña;

    public Password() {
        this.longitud = 8;
        generarContraseñaRandom();
    }

    public Password(int longitud) {
        this.longitud = longitud;
        generarContraseñaRandom();
    }

    private void generarContraseñaRandom() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";
        StringBuilder contraseñaGenerada = new StringBuilder();

        Random random = new Random();
        for (int i = 0; i < longitud; i++) {
            int index = random.nextInt(caracteres.length());
            contraseñaGenerada.append(caracteres.charAt(index));
        }

        contraseña = contraseñaGenerada.toString();
    }

    public int getLongitud() {
        return longitud;
    }

    public String getContraseña() {
        return contraseña;
    }

    public static void main(String[] args) {
        Password contraseñaPorDefecto = new Password(); // Contraseña por defecto
        System.out.println("Contraseña por defecto (8 characteres): " + contraseñaPorDefecto.getContraseña());
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Longitud de contraseña para generar: ");
        int longitudContra = scan.nextInt();

        Password contraseñaCustom = new Password(longitudContra); // Contraseña con longitud que nosotros pasemos
        System.out.println("Contraseña custom ("+longitudContra+" characteres): " + contraseñaCustom.getContraseña());
    }
}
