package model;
/**
 * An enum for the known suspensions for bikes.
 * @author Guy Champollion
 *
 */
public enum Suspension implements Component {
    FRP23("Fox RP23", 30.00),
    FRP3 ("Fox RP3",  40.00);
    /** The name of the component. */
    private final String name;
    /** The price of the component, in euro. */
    private final double price; // in euro
    /** The constructor of the component.
     * @param name A String containing the name of the component.
     * @param price A double containing the price of the component.
     */
    Suspension(String name, double price){
        this.name = name;
        this.price = price;
    }
    /** Returns the component's name. */
    public String getName() { return name; }
    /** Returns the component's price. */
    public double getPrice(){ return price; }
    }
