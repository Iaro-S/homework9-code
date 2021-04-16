package ro.fasttrackit.homework9.product;

public class Fridge extends Electronics {
    private final String temperature;

    public Fridge(String name,
                  String description,
                  double price,
                  int quantity,
                  String length,
                  String width,
                  String height,
                  String weight,
                  String temperature) {
        super (name, description, price, quantity, length, width, height, weight);
        this.temperature = temperature;
    }

    public String getTemperature() {
        return temperature;
    }
}
