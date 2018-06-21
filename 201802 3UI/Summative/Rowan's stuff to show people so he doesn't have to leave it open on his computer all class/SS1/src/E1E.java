/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vanrr7750
 */
public class E1E {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nNum1, nNum2, nRe, nQuo;
        nNum1 = 37;
        nNum2 = 7;
        nRe = nNum1 % nNum2;
        nQuo = ( nNum1 - nRe ) / nNum2;
        System.out.println ("The quotient is " + nQuo + " with remainder " + nRe);
    }
}
