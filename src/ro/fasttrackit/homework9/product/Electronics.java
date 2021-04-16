package ro.fasttrackit.homework9.product;

public class Electronics extends Product {
    private final String length;
    private final String width;
    private final String height;
    private final String weight;

    public Electronics(String name, String description, double price, int quantity, String length, String width, String height, String weight) {
        super (name, description, price, quantity);
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public String getLength() {
        return length;
    }

    public String getWeight() {
        return weight;
    }

    public String getWidth() {
        return width;
    }
}
