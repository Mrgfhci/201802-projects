/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vanrr7750
 */
import java.util.*;
public class E3L {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nNumTarget = (int)(Math.random() * 1000 + 1), nNumIn;
        nNumIn = 0;
        Scanner sin = new Scanner (System.in);
        while (nNumIn != nNumTarget){
            System.out.println ("Take a guess...");
            nNumIn = sin.nextInt();
            if (nNumIn == nNumTarget){
                System.out.println ("You got it!");
            }
            else if (nNumIn > nNumTarget){
                System.out.println ("Lower...");
            }
            else if (nNumIn < nNumTarget){
                System.out.println ("Higher...");
            }
            else {
                System.out.println ("what the fuck");
            }
        }
    }
}
