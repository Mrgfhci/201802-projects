/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vanrr7750
 */
import java.util.*;

public class E3M {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nIn, nWork, nBinary = 0;
        Scanner sin = new Scanner(System.in);
        System.out.println("Gimme a number (max 1023):");
        nIn = sin.nextInt();
        nWork = nIn;
        while (nWork > 0) {
            if (nWork >= 512){
                nWork -= 512;
                nBinary += 1000000000;
            }
            else if (nWork >= 256) {
                nWork -= 256;
                nBinary += 100000000;
            } 
            else if (nWork >= 128) {
                nWork -= 128;
                nBinary += 10000000;
            } 
            else if (nWork >= 64) {
                nWork -= 64;
                nBinary += 1000000;
            } 
            else if (nWork >= 32) {
                nWork -= 32;
                nBinary += 100000;
            } 
            else if (nWork >= 16) {
                nWork -= 16;
                nBinary += 10000;
            } 
            else if (nWork >= 8) {
                nWork -= 8;
                nBinary += 1000;
            } 
            else if (nWork >= 4) {
                nWork -= 4;
                nBinary += 100;
            } 
            else if (nWork >= 2) {
                nWork -= 2;
                nBinary += 10;
            } 
            else if (nWork >= 1) {
                nWork -= 1;
                nBinary += 1;
            }
        }
        System.out.println(nIn + " in binary is " + nBinary + ".");
    }
}
