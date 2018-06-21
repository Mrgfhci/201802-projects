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
        int nNum = 1, nTot, nAsk;
        Scanner sin = new Scanner (System.in);
        System.out.println ("How many perfect numbers would you like? \n"
                + "Careful, it kills itself if you ask for over four...");
        nAsk = sin.nextInt();
        for (; nAsk != 0; ) {
            nTot = sumFactors(nNum);
            if (nTot == nNum) {
                System.out.println(nNum + " is a perfect number");
                nAsk --;
            }
            nNum++;
        }

    }

    public static int sumFactors(int nNum) {
        int nSum, nDiv;
        nDiv = 1;
        nSum = 0;
        while (nDiv < nNum) {
            if (nNum % nDiv == 0) {
                nSum += nDiv;
            }
            nDiv++;
        }
        return nSum;

    }
}
