//Big program so gonna stick in some notes
import java.text.NumberFormat;
import java.util.*;
//Imports for number format and input
public class E3N {
//Nothing to see here

    public static void main(String[] args) {
        //Five variables, so all the right values get to the right places
        double dPrStart, dPrEnd, dRate, dMonths, dInterest;
        //Declaring input and number format codes
        Scanner sin = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(2);
        //Initial inputs of the three values and some math
        System.out.println("Input the amount you're saving:");
        dPrEnd = sin.nextDouble();
        System.out.println("Input the annual interest:");
        dRate = sin.nextDouble() / 12;
        System.out.println("Input the number of years you're saving for:");
        dMonths = sin.nextDouble() * 12;
        //Template for the output columns
        System.out.println("Months \tBeginning \tInterest \tEnding");
        //The actual repetition of the outputted math
        for (int nCount = 1; nCount < dMonths + 1; nCount++) {
            dPrStart = dPrEnd;
            dInterest = dPrStart * dRate;
            dPrEnd += dPrStart * dRate;
            System.out.println(nCount + "\t" + nf.format(dPrStart) + "\t" + nf.format(dInterest) + "     \t" + nf.format(dPrEnd));
        }
    }
}