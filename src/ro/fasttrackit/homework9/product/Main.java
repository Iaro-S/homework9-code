package ro.fasttrackit.homework9.product;

public class Main {
    public static void main(String[] args) {
        Product product = new Product ("Product1", "simple product", 15.35, 25);
        System.out.println (product.getDescription ());
        System.out.println ("Prduct name is " + product.getName () + ",price is " + product.getPrice ());

        Fridge fridge = new Fridge ("Arctic", "combina frigorifica",
                1500, 5, "100", "120", "95", "75", "-10~C");
        System.out.println ("Fridge " + fridge.getName () + ",costs "
                + fridge.getPrice () + ", working temperature is " + fridge.getTemperature ());

        Electronics electronics = new Electronics ("Whirlpoll", "masina de spalat", 1000,
                1, "100", "60", "130", "190");
        System.out.println ("old quantity " + electronics.getQuantity ());
        electronics.setQuantity (3);
        System.out.println ("new quanntity is : " + electronics.getQuantity ());


    }
}
