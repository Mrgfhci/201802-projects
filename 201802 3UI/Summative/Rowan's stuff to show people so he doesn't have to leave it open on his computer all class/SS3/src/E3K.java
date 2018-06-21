/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vanrr7750
 */
import java.util.*;
public class E3K {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nNum;
        double dNumFac;
        dNumFac = 1;
        Scanner sin = new Scanner (System.in);
        System.out.println ("Gimme a number:");
        nNum = sin.nextInt();
        while (nNum > 0){
            dNumFac *= nNum;
            nNum -= 1;
        }
        System.out.println ("The factorial of your number is " + dNumFac + ".");
    }
}
