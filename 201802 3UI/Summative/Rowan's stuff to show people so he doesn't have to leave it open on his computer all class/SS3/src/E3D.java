/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vanrr7750
 */
public class E3D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double dX, dX2, dX3;
        System.out.println ("x \tx^2 \tx^3");
        for (dX = 1; dX < 11; dX++){
            dX2 = Math.pow (dX, 2);
            dX3 = Math.pow (dX, 3);
            System.out.println (dX + "\t" + dX2 + "\t" + dX3);
        }
    }
}
