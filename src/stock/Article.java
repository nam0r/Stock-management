package stock;

/**
 * This is an abstract class for all the Article that are sold.
 * @author Zarmakuizz
 * @author Namor
 *
 */

import java.util.ArrayList;

public abstract class Article {
    /** Le prix de l'article, en euros. */
    protected double prix;
    /** Le nombre d'article encore disponible en stock. */
    protected int nbEnStock;
    /** Le nombre d'article vendu. */
    protected int nbVendus;
    /** Constante de commande */
    public static final int COMMAND = 20;

    public Article(int nbEnStock) {
        this.nbEnStock = nbEnStock;
        nbVendus = 0;
    }

    /** Renvoit les composants de l'article */
    public abstract ArrayList<Component> getComponents();

    /** Renvoit le prix de l'article */
    public double getPrice() {
        return prix;
    }
    
    /** Renvoit le nombre d'articles restant dans le stock */
    public int getInStock() {
        return nbEnStock;
    }
    
    /** Retourne le nombre d'articles vendus */
    public int getSold() {
        return nbVendus;
    }

    /** Permet de vendre un article */
    public void sell() {
        if (nbEnStock > 0) {
            nbEnStock--;
            nbVendus++;
        }
    }

    /** Renvoie le chiffre d'affaire généré par l'article en question */
    public double soldValue() {
        return nbVendus * prix;
    }
}