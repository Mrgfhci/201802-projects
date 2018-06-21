/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vanrr7750
 */
import java.util.*;
public class E2H {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nNum1, nNum2, nMod;
        Scanner sin = new Scanner (System.in);
        System.out.println ("Gimme a number...");
        nNum1 = sin.nextInt();
        System.out.println ("Gimme another number...");
        nNum2 = sin.nextInt();
        nMod = nNum2 % nNum1;
        if (nMod == 0){
            System.out.println ("The second number is a multiple of the first.");
        }
        else {
            System.out.println ("The second number is not a multiple of the first.");
        }
        
    }
}
