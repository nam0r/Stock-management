package model;

/**
 * An enum for the known forks for bikes.
 * 
 * @author Guy Champollion
 * 
 */
public enum Fork implements Component {
    FT("Fox Talas", 90.00), MB("Mazarocchi Bomber", 100.53), RSP(
            "Rock Shox Pike", 125.67), RSR("Rock Shox Revelation", 136.32);
    /** The name of the component. */
    private final String name;
    /** The price of the component, in euro. */
    private final double price; // in euro

    /**
     * The constructor of the component.
     * 
     * @param name
     *            A String containing the name of the component.
     * @param price
     *            A double containing the price of the component.
     */
    Fork(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /** Returns the component's name. */
    public String getName() {
        return name;
    }

    /** Returns the component's price. */
    public double getPrice() {
        return price;
    }
}
