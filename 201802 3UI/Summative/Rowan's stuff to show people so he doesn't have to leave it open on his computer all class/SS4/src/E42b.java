/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vanrr7750
 */
public class E42b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nX, nY;
        nX = 1;
        nY = 1;
        for ( ; nY < 21 ; nY ++){
            for ( ; nX < 21 ; nX ++){
                if (Math.abs(nY * nX) < 10){
                    System.out.print(nY * nX + "   ");
                }
                else if (Math.abs(nY * nX) < 100){
                    System.out.print(nY * nX + "  ");
                }
                else if (Math.abs(nY * nX) < 1000){
                    System.out.print(nY * nX + " ");
                }
                //System.out.print(nY * nX + " ");
            }
            System.out.print ("\n");
            nX = 1;
        }
    }
}
