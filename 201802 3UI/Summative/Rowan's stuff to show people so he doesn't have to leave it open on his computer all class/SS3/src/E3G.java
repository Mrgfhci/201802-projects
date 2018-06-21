/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vanrr7750
 */
import java.util.*;

public class E3G {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //This one is broken if you put in two words it prints twice
        //Still works but would be nice to fix
        boolean isGreen = false;
        String sReply;
        Scanner sin = new Scanner(System.in);
        while (isGreen == false) {
            System.out.println("Is the light green?");
            sReply = sin.next();
            if (sReply.equals("Yes") || sReply.equals("yes")) {
                isGreen = true;
                System.out.println("THEN GET THROUGH THE DAMN INTERSECTION");
            }
        }
    }
}
