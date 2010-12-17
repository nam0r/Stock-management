package stock;

import java.util.ArrayList;

/**
 * A class for managing a Bike article.
 * @author Guy Champollion
 * @see Article
 */
public class Bike extends Article {
    Brakes brakes;
    Forks forks;
    Frames frames;
    Suspensions suspensions;
    Wheels wheels;
    
    public Bike(int nbInStock, Brakes brakes, Forks forks, Frames frames, Suspensions suspensions, Wheels wheels){
        super(nbInStock);
        this.brakes = brakes;
        this.forks = forks;
        this.frames = frames;
        this.suspensions = suspensions;
        this.wheels = wheels;
        
        this.price = 0;
        for(Component c : this.getComponents()){
            this.price += c.getPrice();
        }
    }
    
    public ArrayList<Component> getComponents(){
        ArrayList<Component> list = new ArrayList<Component>();
        list.add(brakes);
        list.add(forks);
        list.add(frames);
        list.add(suspensions);
        list.add(wheels);
        return list;
    }
}
