/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vanrr7750
 */
import java.text.NumberFormat;
public class E1J {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double dX1, dX2, dA, dB, dC, dPlaceholder1;
        dA = 666;
        dB = 666;
        dC = 666;
        //some number formatting
        NumberFormat nf = NumberFormat.getNumberInstance(); 
        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(2);
        //okay now equation stuff
        dPlaceholder1 = (dB * dB) - (4 * dA * dC);
        dX1 = ((dB * -1) - dPlaceholder1) / (dA * 2);
        dX2 = ((dB * -1) + dPlaceholder1) / (dA * 2);
        System.out.println ("nX = " + nf.format(dX1) + " or " + nf.format(dX2));
    }
}
