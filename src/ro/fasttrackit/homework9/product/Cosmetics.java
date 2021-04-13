package ro.fasttrackit.homework9.product;

public class Cosmetics extends Product {

    protected Cosmetics(String name, String description, double price, int quantity) {
        super (name, description, price, quantity);
    }

    protected void describeCosmetics(String color, int weight) {
        describeProduct (name, description, price, quantity);
        System.out.println ("Cosmetics description:color is " + color + " and weight " + weight);
    }
}

