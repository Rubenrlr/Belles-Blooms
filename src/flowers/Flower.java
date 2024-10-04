package flowers;

// Superclass for all other flowers to inherit from 
// include attributes and methods that would apply to all flowers

public class Flower {
    private String name;
    private String color;
    private String meaning;
    private double price;

    // constructor
    public Flower(String name, String color, String meaning, double price) {
        this.name = name;
        this.color = color;
        this.meaning = meaning;
        this.price = price;
    }

    public String getName() { return name; }
    public String getColor() { return color; }
    public String getMeaning() { return meaning; }
    public double getPrice() { return price; }

    // may need method for more flower details
}