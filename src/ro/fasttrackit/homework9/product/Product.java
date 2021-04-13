package ro.fasttrackit.homework9.product;

public class Product {
    String name;
    String description;
    public double price;
    public int quantity;

    public Product() {
    }

    public Product(String name, String description, double price, int quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    protected void describeProduct(String name, String description, double price, int quantity) {
        System.out.println ("Product information: " + name + " " + description + " pret:" + price + ",Cant:" + quantity);
    }
}