package ro.fasttrackit.homework9.product;

public class Main {
    public static void main(String[] args) {
        Product product = new Product ();
        product.describeProduct ("Faina", "de grau", 10.00, 150);
        Electronics electronics = new Electronics ("Masina de spalat", "cu uscare rufe", 1500, 10);
        electronics.describeElectronics ("20", "45", "100", "27");
        Fridge fridge = new Fridge ("Arctic", "vitrina", 2000, 8);
        fridge.describeElectronics ("60", "200", "100", "125");
        fridge.describeFridge ("0-4 C");
        fridge = new Fridge ("Zanussi", "combina frigorifica", 1749.99, 3);
        fridge.describeElectronics ("100", "120", "85", "200");
        fridge.describeFridge ("-5-10 C");
        Cosmetics cosmetics = new Cosmetics ("Nivea", "gel de dus", 12.75, 785);
        cosmetics.describeCosmetics ("white", 100);
        cosmetics = new Cosmetics ("Adidas", "deodorant", 15.00, 35);
        cosmetics.describeCosmetics ("black", 80);
    }
}
