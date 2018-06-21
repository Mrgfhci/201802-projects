/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vanrr7750
 */
import java.util.*;
public class E3J {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nNumIn, nNumTotal, nCounter;
        double dNumAverage;
        Scanner sin = new Scanner (System.in);
        nNumIn = 1;
        nNumTotal = 0;
        nCounter = 0;
        System.out.println ("Gimme as many numbers as you'd like. Giving me 0 ends the loop.");
        while (nNumIn != 0){
            System.out.println ("Gimme a number:");
            nNumIn = sin.nextInt();
            nNumTotal += nNumIn;
            if (nNumIn != 0){
                nCounter ++;
            }
        }
        dNumAverage = nNumTotal / nCounter;
        System.out.println ("The total is " + nNumTotal + ".");
        System.out.println ("The average is " + dNumAverage + ".");
    }
}
