package stock;

/**
 * This is an abstract class for all the Article that are sold.
 * @author Roman MKRTCHIAN
 *
 */

import java.util.ArrayList;

public abstract class Article {
    /** Price of the article, in euros */
    protected double price;
    /** Number of articles in the stock */
    protected int nbInStock;
    /** Number of articles sold */
    protected int nbSold;
    /** Number of articles in each command */
    public static final int COMMAND = 20;

    /**
     * The constructor for the Article class.
     * @param nbInStock  The number of this new Article in stock.
     */
    public Article(int nbInStock) {
        this.nbInStock = nbInStock;
        nbSold = 0;
    }

    /**
     * Get the Article's components and returns a list of Components.
     * @return An ArrayList of Components.
     */
    public abstract ArrayList<Component> getComponents();

    /**
     * Get the Article's price.
     * @return price An ArrayList of Components.
     */
    public double getPrice() {
        return price;
    }
    
    /**
     * Get the number of articles in stock.
     * @return nbInStock the number of articles in stock.
     */
    public int getInStock() {
        return nbInStock;
    }
    
    /**
     * Get the the number of articles sold.
     * @return nbSold the number of articles sold.
     */
    public int getSold() {
        return nbSold;
    }

    /** Sells an article.
     * That means, it removes an article in stock, and says that one has been sold. */
    public void sell() throws NotAvailableException {
        if (nbInStock > 0) {
            nbInStock--;
            nbSold++;
        }
        else throw new NotAvailableException();
    }

    /**
     * Get the total value of all sold bikes.
     * @return nbSold the total value of all sold bikes.
     */
    public double soldValue() {
        return nbSold * price;
    }
    
    /**
     * Command more of the current Article.
     */
    public void command(){
        nbInStock += COMMAND;
    }
}