/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vanrr7750
 */
import java.util.*;
public class Intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nClass1, nClass2, nClass3, nClass4, nAverage;
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter your first mark from first semester:");
        nClass1 = sin.nextInt();
        System.out.println("Now your next one:");
        nClass2 = sin.nextInt();
        System.out.println("And the third one:");
        nClass3 = sin.nextInt();
        System.out.println("Guess what you put here:");
        nClass4 = sin.nextInt();
        nAverage = (nClass1 + nClass2 + nClass3 + nClass4) / 4;
        System.out.println("Your average is " + nAverage + "%.");
    }
}
