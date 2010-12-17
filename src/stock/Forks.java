package stock;
/**
 * An enum for the known forks for bikes.
 * @author Guy Champollion
 *
 */
public enum Forks implements Component {
    FT("Fox Talas", 90.00), MB("Mazarocchi Bomber", 100.53), RSP(
            "Rock Shox Pike", 125.67), RSR("Rock Shox Revelation", 136.32);
    /** The name of the component. */
    private final String name;
    /** The price of the component, in euro. */
    private final double price; // in euro

    /** The constructor of the component */
    Forks(String name, double price) {
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
