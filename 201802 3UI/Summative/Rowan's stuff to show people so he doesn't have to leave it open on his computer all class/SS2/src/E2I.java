/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vanrr7750
 */
import java.util.*;
public class E2I {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nX1, nY1, nX2, nY2, nDeltaX, nDeltaY;
        Scanner sin = new Scanner (System.in);
        System.out.println ("Gimme the first X, then first Y, then second X, then second Y.");
        System.out.println ("Like this:");
        System.out.println ("X (First)");
        System.out.println ("Y (First)");
        System.out.println ("X (Second)");
        System.out.println ("Y (Second)");
        nX1 = sin.nextInt();
        nY1 = sin.nextInt();
        nX2 = sin.nextInt();
        nY2 = sin.nextInt();
        nDeltaX = Math.abs(nX1 - nX2);
        nDeltaY = Math.abs(nY1 - nY2);
        if (nDeltaX == 0 && nDeltaY == 0){
            System.out.println ("IT'S A DOT!");
        }
        else if (nDeltaX == 0 || nDeltaY == 0){
            System.out.println ("IT'S A LINE!");
        }
        else if (nDeltaX == nDeltaY){
            System.out.println ("IT'S A SQUARE!");
        }
        else if (nDeltaX != nDeltaY){
            System.out.println ("IT'S A RECTANGLE!");
        }
        else {
            System.out.println ("IT'S A MESS!");
        }
    }
}
