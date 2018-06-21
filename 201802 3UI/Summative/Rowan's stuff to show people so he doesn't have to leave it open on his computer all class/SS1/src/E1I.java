/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vanrr7750
 */
public class E1I {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nX1, nY1, nX2, nY2, nDeltaX, nDeltaY, nPerimeter, nArea;
        nX1 = 2;
        nY1 = 17;
        nX2 = 9;
        nY2 = 5;
        nDeltaX = nX2 - nX1;
        nDeltaY = nY1 - nY2;
        nPerimeter = nDeltaX * 2 + nDeltaY * 2;
        nArea = nDeltaX * nDeltaY;
        System.out.println ("Perimeter = " + nPerimeter + " units");
        System.out.println ("Area = " + nArea + " units^2");
    }
}
