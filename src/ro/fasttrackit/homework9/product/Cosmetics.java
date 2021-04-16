package ro.fasttrackit.homework9.product;

public class Cosmetics extends Product {
    private final String color;
    private final int weight;

    public Cosmetics(String name, String description, double price, int quantity, String color, int weight) {
        super (name, description, price, quantity);
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }
}

