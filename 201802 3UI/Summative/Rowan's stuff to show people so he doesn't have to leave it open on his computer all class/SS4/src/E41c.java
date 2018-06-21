
import java.text.NumberFormat;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vanrr7750
 */

public class E41c {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double dPrice, dService, dTax, dTotal;
        String sRepeat;
        Scanner sin = new Scanner (System.in);
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(2);
        while (true){
            System.out.println ("What is the price of the meal?");
            dPrice = sin.nextDouble();
            dService = dPrice * 0.1;
            dTax = dPrice * 0.05;
            dTotal = dPrice + dService + dTax;
            System.out.println ("Meal \tService \tTax \tTotal");
            System.out.println (nf.format(dPrice) + "\t" + nf.format(dService) 
                    + "\t       " + nf.format(dTax) + "\t" + nf.format(dTotal) + "\t");
            System.out.println ("Would you like to input another price?");
            sRepeat = sin.next();
            if (sRepeat.equals("Yes") || sRepeat.equals("Yes")) continue;
            else if (sRepeat.equals("No") || sRepeat.equals("no")) break;
            else {
                System.out.println ("Invalid command. Restarting program.");
            }
        }
        System.out.println ("End of program.");
    }
}
