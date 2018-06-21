/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vanrr7750
 */
import java.util.*;

public class E41g {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nIn, nHun, nTen, nOne;
        Scanner sin = new Scanner(System.in);
        while (true) {
            System.out.println("Gimme a three digit number:");
            nIn = sin.nextInt();
            if (nIn > 999 || nIn < 100) {
                System.out.println ("I said three digits, try again.");
            }
            else break;
        }
        nHun = ( nIn - (nIn % 100) ) / 100;
        nTen = ( (nIn - (nHun * 100) - (nIn % 10) ) / 10);
        nOne = ( nIn - (nHun * 100) - (nTen * 10) );
        System.out.println("Forwards: \n" + nHun + "\n" + nTen + "\n" + nOne);
        System.out.println("Backwards: \n" + nOne + "\n" + nTen + "\n" + nHun);
    }
}
