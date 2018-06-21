/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vanrr7750
 */
import java.util.*;
public class E2F {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double dNum1, dNum2;
        Scanner sin = new Scanner (System.in);
        System.out.println ("Gimme a number...");
        dNum1 = sin.nextDouble();
        System.out.println ("And another...");
        dNum2 = sin.nextDouble();
        if (dNum1 == dNum2){
            System.out.println ("The two numbers are equal.");
        }
        else if (dNum1 > dNum2){
            System.out.println ("The first number is greater than the second number.");
        }
        else if (dNum1 < dNum2){
            System.out.println ("The second number is greater than the first number.");
        }
        else {
            System.out.println ("Well I don't know how but you fucked the program. Cool.");
        }
    }
}
