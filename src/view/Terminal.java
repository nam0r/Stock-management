package view;

import controler.Data;

/**
 * Class used as the IHM for the application. It intercepts user inputs and call
 * controllers to modify the model.
 */
public class Terminal {
    private Data data;

    /**
     * The constructor of the Terminal view class.
     * 
     * @param data
     *            The Data controller instance of the application.
     */
    public Terminal(Data data) {
        this.data = data;
    }

    /**
     * Displays the menu and the available commands.
     */
    public void launchMenu() {

        int choice;
        do {
            System.out.println();
            System.out.println("      **************************************");
            System.out.println("      *         Stock Management           *");
            System.out.println("      **************************************");
            System.out.println("      * 1- Displays inventory              *");
            System.out.println("      * 2- A product is sold               *");
            System.out.println("      *                                    *");
            System.out.println("      * 0- Quit                            *");
            System.out.println("      **************************************");
            System.out.println();
            do {
                System.out.print("      Your choice : ");
                choice = IO.readInt();
            } while (choice != 1 && choice != 2 && choice != 0);

            switch (choice) {
            case 1: {
                System.out.println(data);
                break;
            }
            case 2: {
                sellDisplay();
                break;
            }
            default:
                break;
            }
        } while (choice != 0);
    }

    /**
     * Manage the display for asking a sell.
     */
    public void sellDisplay() {
        System.out.print("      Which article number has beel sold ? : ");
        int input = IO.readInt();
        // Articles displayed starts with #1
        // Articles registered by data starts with #0
        System.out.println("      " + data.sell(input - 1));
    }
}
