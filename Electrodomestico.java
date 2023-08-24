// Ejercicio 9
public class Electrodomestico {

	private static final String COLOR_POR_DEFECTO = "blanco";
    private static final char CONSUMO_ENERGETICO_POR_DEFECTO = 'F';
    private static final double PRECIO_BASE_POR_DEFECTO = 100.0;
    private static final double PESO_POR_DEFECTO = 5.0;

    private static final String[] COLORES = {"blanco", "negro", "rojo", "azul", "gris"};

    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private double peso;

    public Electrodomestico() {
        this.precioBase = PRECIO_BASE_POR_DEFECTO;
        this.color = COLOR_POR_DEFECTO;
        this.consumoEnergetico = CONSUMO_ENERGETICO_POR_DEFECTO;
        this.peso = PESO_POR_DEFECTO;
    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.color = COLOR_POR_DEFECTO;
        this.consumoEnergetico = CONSUMO_ENERGETICO_POR_DEFECTO;
        this.peso = peso;
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        setColor(color);
        setConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    private void setColor(String color) {
        if (isValidColor(color)) {
            this.color = color.toLowerCase();
        } else {
            this.color = COLOR_POR_DEFECTO;
        }
    }

    private boolean isValidColor(String color) {
        for (String availableColor : COLORES) {
            if (availableColor.equalsIgnoreCase(color)) {
                return true;
            }
        }
        return false;
    }

    private void setConsumoEnergetico(char consumoEnergetico) {
        if (consumoEnergetico >= 'A' && consumoEnergetico <= 'F') {
            this.consumoEnergetico = consumoEnergetico;
        } else {
            this.consumoEnergetico = CONSUMO_ENERGETICO_POR_DEFECTO;
        }
    }
    
    public double getPeso() {
    	return peso;
    }
    
    public double getPrecioBase() {
    	return precioBase;
    }
    
    public String getColor() {
    	return color;
    }
    
    public char getConsumoEnergetico() {
    	return consumoEnergetico;
    }
    
    public static void main(String[] args) {
        Electrodomestico electrodomestico1 = new Electrodomestico();
        Electrodomestico electrodomestico2 = new Electrodomestico(150.0, 7.5);
        Electrodomestico electrodomestico3 = new Electrodomestico(200.0, "rojo", 'B', 6.0);

        System.out.println("Electrodomestico 1: (Por defecto)");
        System.out.println("Precio Base: " + electrodomestico1.getPrecioBase());
        System.out.println("Color: " + electrodomestico1.getColor());
        System.out.println("Consumo Energetico: " + electrodomestico1.getConsumoEnergetico());
        System.out.println("Peso: " + electrodomestico1.getPeso());

        System.out.println("\nElectrodomestico 2:");
        System.out.println("Precio Base: " + electrodomestico2.getPrecioBase());
        System.out.println("Color: " + electrodomestico2.getColor());
        System.out.println("Consumo Energetico: " + electrodomestico2.getConsumoEnergetico());
        System.out.println("Peso: " + electrodomestico2.getPeso());

        System.out.println("\nElectrodomestico 3:");
        System.out.println("Precio Base: " + electrodomestico3.getPrecioBase());
        System.out.println("Color: " + electrodomestico3.getColor());
        System.out.println("Consumo Energetico: " + electrodomestico3.getConsumoEnergetico());
        System.out.println("Peso: " + electrodomestico3.getPeso());
    }


}
