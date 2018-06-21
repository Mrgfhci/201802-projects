/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vanrr7750
 */
import java.util.*;
public class E2J {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nX, nY;
        Scanner sin = new Scanner (System.in);
        System.out.println ("Gimme the X coordinate (it better not be zero)...");
        nX = sin.nextInt();
        System.out.println ("Gimme the Y coordinate (it better not be zero)...");
        nY = sin.nextInt();
        if (nX == 0 || nY == 0){
            System.out.println ("I said not fucking zero!");
        }
        else if (nX > 0 && nY > 0){
            System.out.println ("The point is in the NE quadrant.");
        }
        else if (nX > 0 && nY < 0){
            System.out.println ("The point is in the SE quadrant.");
        }
        else if (nX < 0 && nY > 0){
            System.out.println ("The point is in the NW quadrant.");
        }
        else if (nX < 0 && nY < 0){
            System.out.println ("The point is in the SW quadrant.");
        }
        else {
            System.out.println ("Well you broke it I guess. Nice.");
        }
    }
}
