/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vanrr7750
 */
import java.util.*;
public class E2B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String sName;
        int nAge;
        Scanner sin = new Scanner (System.in);
        System.out.println ("Input your name:");
        sName = sin.next();
        System.out.println ("Enter your age:");
        nAge = sin.nextInt();
        if (nAge > 120){
            System.out.println ("I don't think that's your age, " + sName + ".");
        }
        else if (nAge >= 18){
            System.out.println ("Step right up and vote, " + sName + "!");
        }
        else if (nAge < 18){
            System.out.println ("Maybe next year, " + sName + ".");
        }
    }
}
