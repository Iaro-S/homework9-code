package ro.fasttrackit.homework9.product;

public class Main {
    public static void main(String[] args) {
        Product product = new Product ();
        product.describeProduct ("Faina", "de grau", 10.00, 2);
        Electronics electronics = new Electronics ("Masina de spalat", "cu uscator rufe", 1500, 1);
        electronics.describeElectronics ("20", "45", "100", "27");
        Fridge fridge = new Fridge ("Arctic", "vitrina", 2000, 2);
        fridge.describeElectronics ("60", "200", "100", "125");
        fridge.describeFridge ("0-4 C");
        Cosmetics cosmetics = new Cosmetics ("Nivea", "gel de dus", 12.75, 2);
        cosmetics.describeCosmetics ("white", 100);
    }
}
