/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vanrr7750
 */
public class E2L {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double dX1, dY1, dX2, dY2, dSlope;
        dX1 = 10;
        dY1 = 7;
        dX2 = 10;
        dY2 = 15;
        if ((dX2 - dX1) == 0) {
            System.out.println("The slope of a line between points (" + dX1 + ", " + dY1 + ") and (" + dX2 + ", " + dY2 + ") is undefined.");
        } else {
            dSlope = (dY2 - dY1) / (dX2 - dX1);
            System.out.println("The slope of a line between points (" + dX1 + ", " + dY1 + ") and (" + dX2 + ", " + dY2 + ") is " + dSlope + ".");
        }
    }
}
