package ro.fasttrackit.homework9.product;

public class Electronics extends Product {

    protected Electronics(String name, String description, double price, int quantity) {
        super (name, description, price, quantity);
    }

    @Override
    protected void describeProduct(String name, String description, double price, int quantity) {
        super.describeProduct (name, description, price, quantity);
    }

    protected String describeElectronics(String length, String width, String height, String weight) {
        describeProduct (name, description, price, quantity);
        System.out.println ("Electronics dimensions are - length:" + length + ",widith:" + width + ",height:" + height + ",weight:" + weight);
        return "";
    }
}
