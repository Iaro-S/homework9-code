package ro.fasttrackit.homework9.product;

public class Product {
    String name;
    String description;
    public double price;
    public int quantity;

    protected Product(String name, String description, double price, int quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public Product() {

    }

    protected void describeProduct(String name, String description, double price, int quantity) {
        System.out.println ("\n"+"Product information: " + name + "-" + description + ", pret:" + price + ",Available quantity: " + quantity);
    }
}