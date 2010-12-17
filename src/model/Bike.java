package model;

import java.util.ArrayList;

/**
 * A class for managing a Bike article.
 * @author Guy Champollion
 * @see Article
 */
public class Bike extends Article {
    Brakes brakes;
    Fork fork;
    Frame frame;
    Suspension suspension;
    Wheels wheels;
    /**
     * The constructor for the Bike class. It determines the Bike components,
     *   how many of this Bike have been sold or are available,
     *   and then find the price of the Bike.
     * @param nbInStock  The number of this new Bike in stock.
     * @param brakes     The Brakes model of the Bike.
     * @param fork       The Fork model of the Bike.
     * @param frame      The Frame model of the Bike.
     * @param suspension The Suspension model of the Bike.
     * @param wheels     The Wheels model of the Bike.
     */
    public Bike(int nbInStock, Brakes brakes, Fork fork, Frame frame, Suspension suspension, Wheels wheels){
        super(nbInStock);
        this.brakes = brakes;
        this.fork = fork;
        this.frame = frame;
        this.suspension = suspension;
        this.wheels = wheels;
        
        this.price = 0;
        for(Component c : this.getComponents()){
            this.price += c.getPrice();
        }
    }
    /**
     * A method to get the Bike's components and returns a list of Components.
     * @return list An ArrayList of Components.
     */
    public ArrayList<Component> getComponents(){
        ArrayList<Component> list = new ArrayList<Component>();
        list.add(brakes);
        list.add(fork);
        list.add(frame);
        list.add(suspension);
        list.add(wheels);
        return list;
    }
    /**
     * The toString method that returns a String about the current Bike.
     * @return string A String describing the bike.
     */
    public String toString(){
        String string="";
        string+="Frame: "     +frame.getName()     +"\n";
        string+="Fork: "      +fork.getName()      +"\n";
        string+="Suspension: "+suspension.getName()+"\n";
        string+="Wheels: "    +wheels.getName()    +"\n";
        string+="Brakes: "    +brakes.getName()    +"\n";
        string+="Price: "              + this.price     + "\n";
        string+="Available in stock: " + this.nbInStock + "\n";
        return string;
    }
}
