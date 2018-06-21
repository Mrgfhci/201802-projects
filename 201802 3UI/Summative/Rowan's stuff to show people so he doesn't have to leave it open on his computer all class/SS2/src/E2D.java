/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vanrr7750
 */
import java.util.*;
public class E2D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nNum1, nNum2, nDif;
        Scanner sin = new Scanner (System.in);
        System.out.println ("Enter a number...");
        nNum1 = sin.nextInt();
        System.out.println ("And another...");
        nNum2 = sin.nextInt();
        nDif = nNum1 - nNum2;
        if (nDif < 0){
            nDif = nDif * -1;
        }
        System.out.println ("The absolute difference between " + nNum1 + " and " + nNum2 + " is " + nDif + ".");
    }
}
