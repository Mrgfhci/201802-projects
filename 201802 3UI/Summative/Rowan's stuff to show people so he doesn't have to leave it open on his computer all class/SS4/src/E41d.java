/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vanrr7750
 */
import java.util.*;
public class E41d {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nNum1, nNum2, nRe, nQuo;
        Scanner sin = new Scanner (System.in);
        System.out.println ("Gimme a number:");
        nNum1 = sin.nextInt();
        System.out.println ("Gimme another number:");
        nNum2 = sin.nextInt();
        if (nNum1 >= nNum2){
            nRe = nNum1 % nNum2;
            nQuo = (nNum1 - nRe ) / nNum2;
            System.out.println ("The quotient is " + nQuo + " with remainder " + nRe);
        }
        else if (nNum2 > nNum1){
            nRe = nNum2 % nNum1;
            nQuo = (nNum2 - nRe ) / nNum1;
            System.out.println ("The quotient is " + nQuo + " with remainder " + nRe);
        }
        else {
            System.out.println ("you fucked it again stop doing this");
        }
    }
}
