/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vanrr7750
 */
import java.util.*;
public class E2G {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double dNum, dMod;
        Scanner sin = new Scanner (System.in);
        System.out.println ("Gimme a number...");
        dNum = sin.nextDouble();
        dMod = dNum%2;
        if (dMod == 1){
            System.out.println ("The number is odd.");
        }
        else if (dMod == 0){
            System.out.println ("The number is even.");
        }
        else {
            System.out.println ("Either your number is a decimal or you fucked the program again.");
        }
    }
}
