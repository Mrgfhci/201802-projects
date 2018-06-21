/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vanrr7750
 */
import java.util.*;
import java.text.NumberFormat;
public class E41b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double dBalance, dInput;
        String sFunction;
        Scanner sin = new Scanner (System.in);
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(2);
        System.out.println ("What is your bank balance?");
        dBalance = sin.nextDouble();
        while (true){
            System.out.println ("Would you like to deposit, withdraw, or exit?");
            sFunction = sin.next();
            if (sFunction.equals("Exit") || sFunction.equals("exit")) break;
            else if (sFunction.equals("Deposit") || sFunction.equals("deposit")){
                System.out.println ("How much would you like to deposit?");
                dInput = sin.nextDouble();
                dBalance += dInput;
                System.out.println ("Okay, deposited. Your balance is now $" + nf.format(dBalance) + ".");
            }
            else if (sFunction.equals("Withdraw") || sFunction.equals("withdraw")){
                System.out.println ("How much would you like to withdraw?");
                dInput = sin.nextDouble();
                dBalance -= dInput;
                System.out.println ("Okay, withdrawn. Your balance is now $" + nf.format(dBalance) + ".");
            }
            else {
                System.out.println ("Invalid command. Try again.");
            }
        }
        System.out.println ("Exited.");
    }
}
