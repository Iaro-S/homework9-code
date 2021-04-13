package ro.fasttrackit.homework9.product;

public class Fridge extends Electronics {
    protected Fridge(String name, String description, double price, int quantity) {
        super (name, description, price, quantity);
    }

    @Override
    protected void describeProduct(String name, String description, double price, int quantity) {
        super.describeProduct (name, description, price, quantity);
    }

    @Override
    protected String describeElectronics(String length, String width, String height, String weight) {
        return super.describeElectronics (length, width, height, weight);
    }

    void describeFridge(String temperature) {
        System.out.println ("Fridge working temperature is: " + temperature);
    }
}
