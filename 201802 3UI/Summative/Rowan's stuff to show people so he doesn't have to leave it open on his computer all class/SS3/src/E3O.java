//Big program so gonna stick in some notes
import java.text.NumberFormat;
import java.util.*;
//Imports for number format and input
public class E3O {
//Nothing to see here

    public static void main(String[] args) {
        //Five variables, so all the right values get to the right places
        double dPr, dPrStart, dPrEnd, dRate, dYears, dMonths, dInterest, dPayment, dDebt;
        //Declaring input and number format codes
        Scanner sin = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(2);
        //Initial inputs of the three values and some math
        System.out.println("Input the amount you're borrowing:");
        dPr = sin.nextDouble();
        dPrEnd = dPr;
        System.out.println("Input the annual interest:");
        dRate = sin.nextDouble() / 12;
        System.out.println("Input the number of years you're borrowing for:");
        dYears = sin.nextDouble();
        dMonths = dYears * 12;
        //Template for the output columns
        System.out.println("Months \tPayment \tDebt      \tInterest \tRemaining");
        System.out.println("       \tMade    \tPaid      \tPaid     \tDebt");
        //The actual repetition of the outputted math
        for (int nCount = 1; nCount < dMonths + 1; nCount++) {
            dPrStart = dPrEnd;
            dPayment = dPr * ((dRate * (Math.pow((1 + dRate), dMonths))) / ( Math.pow((1 + dRate), dMonths) - 1 ));
            dInterest = dPrStart * dRate;
            dDebt = dPayment - dInterest;
            dPrEnd = dPrStart - dDebt;
            System.out.println(nCount + "\t" + nf.format(dPayment) + "\t" + nf.format(dDebt) + "\t" + nf.format(dInterest) + "     \t" + nf.format(dPrEnd));
        }
    }
}