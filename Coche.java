// Ejercicio6
public class Coche {
    private String marca;
    private String modelo;
    private int cilindrada;
    private double potencia;

    public Coche(String marca, String modelo, int cilindrada, double potencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
        this.potencia = potencia;
    }

    public static void main(String[] args) {
        Coche miCoche = new Coche("Scarlet", "Nightshade", 3000, 350.5);

        System.out.println("Marca: " + miCoche.marca);
        System.out.println("Modelo: " + miCoche.modelo);
        System.out.println("Cilindrada: " + miCoche.cilindrada + " cc");
        System.out.println("Potencia: " + miCoche.potencia + " hp");
    }
}
