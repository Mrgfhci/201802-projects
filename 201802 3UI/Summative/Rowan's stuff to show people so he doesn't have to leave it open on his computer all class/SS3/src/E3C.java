/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vanrr7750
 */
public class E3C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nC, nF;
        System.out.println ("C \tF");
        for (nC = -10; nC < 11; nC++){
            nF = (nC*9)/5 +32;
            System.out.println (nC + "\t" + nF);
        }
    }
}
