/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vanrr7750
 */
public class E1H {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double dX1, dY1, dX2, dY2, dSlope, dDistance;
        dX1 = 10;
        dY1 = 7;
        dX2 = 15;
        dY2 = 7;
        dSlope = (dY2 - dY1) / (dX2 - dX1);
        dDistance = Math.sqrt( Math.pow((dX2 - dX1), 2) + Math.pow((dY2 - dY1), 2));
        System.out.println ("The slope of a line between points (" + dX1 + ", " + dY1 + ") and (" + dX2 + ", " + dY2 + ") is " + dSlope + ", and the length is " + dDistance + ".");
    }
}
