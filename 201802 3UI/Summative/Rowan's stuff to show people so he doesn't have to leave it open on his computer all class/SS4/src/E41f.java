
import java.util.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vanrr7750
 */
public class E41f {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nX, nY;
        Scanner sin = new Scanner (System.in);
        System.out.println ("Gimme the X coordinate...");
        nX = sin.nextInt();
        System.out.println ("Gimme the Y coordinate...");
        nY = sin.nextInt();
        if (nX == 0 && nY == 0){
            System.out.println ("The point is on the origin.");
        }
        else if (nX == 0 && nY > 0){
            System.out.println ("The point is on the N axis.");
        }
        else if (nX == 0 && nY < 0){
            System.out.println ("The point is on the S axis.");
        }
        else if (nX > 0 && nY == 0){
            System.out.println ("The point is on the E axis.");
        }
        else if (nX < 0 && nY == 0){
            System.out.println ("The point is on the W axis.");
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
