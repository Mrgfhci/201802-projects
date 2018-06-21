/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vanrr7750
 */
import java.util.*;
public class E41h {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nNum, nCount;
        Scanner sin = new Scanner (System.in);
        while (true){
        System.out.println ("Gimme a number (0 ends the program):");
        nNum = sin.nextInt();
        if (nNum == 0) break;
        nCount = 0;
        while (true){
            nCount++;
            if (nNum == 1) break;
            else if (nNum%2 == 0){
                nNum = nNum / 2;
            }
            else if (nNum%2 != 0){
                nNum = 3 * nNum + 1;
            }
        }
        System.out.println ("It took " + nCount + " loops to reach 1.");
    }
    }
}
