package flowers;
// Subclass flower that inherits from Flower.java
// Will have it's own unique attributes and methods specific to it


public class Rose extends Flower {
    public Rose(String name, String color, String meaning, double price){
        // call to Flower constructor
        super("Rose", color, meaning, price);
    }

    // any additional unique behaviors or attributes
}