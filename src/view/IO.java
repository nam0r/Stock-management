package view;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Class to correctly handle user inputs.
 * 
 * @author Guy Champollion
 * @see Scanner
 */

public class IO {

    // Methods
    /**
     * Method to get an integer. If anything else than an integer is given, try
     * again.
     * 
     * @return integer An integer.
     */
    public static int readInt() {
        Scanner sc = new Scanner(System.in);
        try {
            return sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Integer required. Try again");
            return readInt();
        }
    }

}// End IO class
