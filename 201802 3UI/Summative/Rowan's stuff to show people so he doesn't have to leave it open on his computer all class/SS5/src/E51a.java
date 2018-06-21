/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vanrr7750
 */
import java.util.*;
public class E51a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nC, nF;
        Scanner sin = new Scanner (System.in);
        System.out.println ("Gimme the degrees in centigrade:");
        nC = sin.nextInt();
        nF = convert(nC);
        System.out.println (nC + " *C = " + nF + " *F");
    }
    public static int convert(int nC){
        int nF;
        nF=(nC * 9) / 5 + 32;
        return nF;
    }
}
