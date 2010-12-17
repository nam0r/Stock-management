package view;

import controler.Data;

/**
 * This is the main class, it starts the application.
 * 
 * @author Guy Champollion.
 * 
 */
public class Main {
    /** The view using the terminal */
    Terminal t;

    /**
     * The constructor starts the view.
     */
    public Main() {
        t = new Terminal(Data.getInstance());
        t.launchMenu();
    }

    /**
     * The main method.
     */
    public static void main(String Args[]) {
        new Main();
    }
}
