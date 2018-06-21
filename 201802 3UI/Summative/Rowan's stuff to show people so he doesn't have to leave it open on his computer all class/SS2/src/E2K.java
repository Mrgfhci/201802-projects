/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vanrr7750
 */
import java.util.*;

public class E2K {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nNum1, nNum2, nCorrect, nInput;
        Scanner sin = new Scanner(System.in);
        nNum1 = (int) (Math.random() * 1000 + 1);
        nNum2 = (int) (Math.random() * 1000 + 1);
        nCorrect = nNum1 + nNum2;
        System.out.println("Welcome to the math quiz! Here's the first question:");
        System.out.println(nNum1);
        System.out.println("+" + nNum2);
        System.out.println("----");
        nInput = sin.nextInt();
        if (nInput == nCorrect) {
            System.out.println("Congratulations! That was the only question. You passed.");
        } else if (nInput != nCorrect) {
            System.out.println("Congratulations! The answer was " + nCorrect + ". You failed.");
        } else {
            System.out.println("Congratulations! You fucked the program. You get a B.");
        }
    }
}
