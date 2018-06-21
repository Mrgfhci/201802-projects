/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vanrr7750
 * Gotta import the NumberFormat up here I guess
 */
import java.text.NumberFormat;
public class E1D {
    public static void main(String[] args) {
       double dNum1 = 8784, dNum2 = 5, dQuo = dNum1 / dNum2;
       NumberFormat nf = NumberFormat.getNumberInstance(); 
       nf.setMaximumFractionDigits(2);
       nf.setMinimumFractionDigits(2);
       System.out.println("The quotient is " + nf.format(dQuo) + ".");
   
       }
}

