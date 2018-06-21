/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vanrr7750
 */
import java.util.*;
public class E2C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nRad;
        double dCirc, dArea;
        String sRequest;
        Scanner sin = new Scanner (System.in);
        System.out.println ("Gimme a radius");
        nRad = sin.nextInt();
        dCirc = 2 * nRad * Math.PI;
        dArea = Math.PI * Math.pow(nRad, 2);
        System.out.println ("Do you want the circumference or the area?");
        sRequest = sin.next();
        if (sRequest.equals("Circumference") || sRequest.equals("circumference")){
            System.out.println ("The circumference of radius " + nRad + " is " + dCirc + " units.");
        }
        else if (sRequest.equals("Area") || sRequest.equals("area")){
            System.out.println ("The area of radius " + nRad + " is " + dArea + " square units.");
        }
        else {
            System.out.println ("Invalid input. Try again.");
        }
    }
}
