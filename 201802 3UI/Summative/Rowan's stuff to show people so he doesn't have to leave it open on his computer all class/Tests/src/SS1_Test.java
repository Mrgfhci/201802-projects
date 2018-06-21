//Rowan van Rhijn
//Test 1
//13/2/18
import java.text.NumberFormat;
public class SS1_Test {

    public static void main(String[] args) {
        //Declaration of variables and four base values
        //Split up to make program cleaner
        double dPrinciple, dRate, dTime, dPayments; 
        double dNumerator, dDenom1, dDenom2, dDenomExp, dDenomFull, dFinal;
        dPrinciple = 500000;
        dRate = 0.03;
        dTime = 10;
        dPayments = 26;
        //Number Formatting code to round the final answer
        NumberFormat nf = NumberFormat.getNumberInstance(); 
        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(2);
        //Starting the math
        dNumerator = dPrinciple * (dRate / dPayments);
        dDenom1 = 1 + (dRate / dPayments);
        dDenomExp = (-1 * dPayments) * dTime;
        dDenom2 = Math.pow(dDenom1, dDenomExp);
        dDenomFull = 1 - dDenom2;
        dFinal = dNumerator / dDenomFull;
        //Final output of values
        System.out.println ("Your payment is $" + nf.format(dFinal) + ".");
    }
}
