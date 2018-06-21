/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vanrr7750
 */
import java.util.*;
public class E51d {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sin = new Scanner (System.in);
        int nNum1, nDen1, nNum2, nDen2, nNumA, nDenA, nFac;
        System.out.println("Gimme the first numerator:");
        nNum1 = sin.nextInt();
        System.out.println("Gimme the first denominator:");
        nDen1 = sin.nextInt();
        System.out.println("Gimme the second numerator:");
        nNum2 = sin.nextInt();
        System.out.println("Gimme the second denominator:");
        nDen2 = sin.nextInt();
        
        nNumA = (nNum1 * nDen2) + (nNum2 * nDen1);
        nDenA = nDen1 * nDen2;
            
        nFac = hcf(nNumA, nDenA);
        
        nNumA = nNumA / nFac;
        nDenA = nDenA / nFac;
        System.out.println ("The sum is " + nNumA + "/" + nDenA + ".");
    }
    
    public static int hcf(int nNum, int nDen){
        int nDiv = nDen;
        for ( ; nDiv > 1 ; nDiv--){
            if (nNum % nDiv == 0 && nDen % nDiv == 0) break;
        }
        return nDiv;
    }
}
//I love row rooowwwwwwww