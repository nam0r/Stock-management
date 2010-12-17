package controler;

import java.util.ArrayList;

import model.*;

/**
 * The Data class manages the shop. It controls every Article available.
 * The singleton pattern is used to ensure 
 *   there is only one stock managed : the current shop one.
 * @author Guy Champollion
 * @author Roman Mkrtchian
 */
public class Data {
    /** The list of available articles. */
    private ArrayList<Article> articles;
    /** The unique Data instance, according to the singleton pattern. */
    private static final Data DATA = new Data();
    /**
     * The constructor of the Data class.
     * The constructor is private to ensure only one instance
     *   of the Data class will be generated.
     */
    private Data(){
        articles = new ArrayList<Article>();
        Bike bike = new Bike(1,Brakes.HMM,Fork.RSR,Frame.SCBLT,
                               Suspension.FRP3,Wheels.MXM819);
        articles.add(bike);
        bike = new Bike(1,Brakes.AJ,Fork.RSP,Frame.SPP,
                Suspension.FRP3,Wheels.MC);
        articles.add(bike);
    }
    /**
     * Returns the unique Data instance of the application.
     * @return Data the unique Data object of the application.
     */
    public static Data getInstance(){
        return DATA;
    }
    /**
     * Returns the list of available articles.
     * @return articles an ArrayList of Articles.
     */
    public ArrayList<Article> getArticles(){
        return articles;
    }
    /**
     * Sells an Article. Informs if the article doesn't exist, 
     * @param number The number of the Article in stock.
     * @return string A string about the sell state.
     */
    public String sell(int number){
        try{ // Try to get the asked article
            Article article=articles.get(number);
            try{ // Try to sell the selected article
                article.sell();
                return "The article has been sold.";
            } catch (NotAvailableException e) {
                // The article is not available in stock.
                article.command();
                return "Product not available. The command of " +
                		"more of this article has been sent.";    
            }
        } catch (IndexOutOfBoundsException e) {
            // The asked article doesn't exist yet.
            return "Unknown or inexistant article asked.";
        }
    }
    /**
     * Method to display all informations about the stock : 
     * the available components,
     * the available articles with their price and stock informations,
     * and some money informations.
     * @return string A String about all known data.
     */
    public String toString(){
        String string = "";
        // Displays the components available.
        string+="Frames: ";
        for(Frame f : Frame.values()){
            string+=f.getName()+", ";
        }
        string+="\nForks: ";
        for(Fork f : Fork.values()){
            string+=f.getName()+", ";
        }
        string+="\nSuspensions: ";
        for(Suspension s : Suspension.values()){
            string+=s.getName()+", ";
        }
        string+="\nWheels: ";
        for(Wheels w : Wheels.values()){
            string+=w.getName()+", ";
        }
        string+="\nBrakes: ";
        for(Brakes b : Brakes.values()){
            string+=b.getName()+", ";
        }
        string+="\n";
        
        // Displays the inventory, also get some values for the next
        double priceAvailable = 0;
        double priceSold = 0;
        for (Article a : articles){
            string+=a;
            priceAvailable+= a.getPrice();
            priceSold     += a.soldValue();
        }
        
        // Displays the total value of the different Articles available
        string +="Total value of all different articles: "+priceAvailable+"\n";
        string +="Total value of sold articles: "+priceSold+"\n";
        
        return string;
    }
}
