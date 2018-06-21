//Rowan van Rhijn
//Test 3
//6/3/18

//I know you're gonna say the comments insult your intelligence
//They're really just here to make the code more readable 
//And also cause I'm stalling to make Shae feel better about taking longer
//Don't tell her that though

//Both imports that will be needed
import java.text.NumberFormat;
import java.util.*;

public class SS3_Test {

    public static void main(String[] args) {
        //Declaring variables, scanner, and the number formatting
        double dHeight, dSlant, dVolume, dSurface;
        Scanner sin = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(2);
        //Initial input of height
        System.out.println("Input the height of the cone:");
        dHeight = sin.nextDouble();
        //Template for columns
        System.out.println("Radius \t \tVolume \t \tSurface Area");
        //Loops the radius from 1 to 10
        for (int nRadius = 1; nRadius < 11; nRadius++) {
            //Three formulas, all in here because radius is needed
            dSlant = Math.sqrt(Math.pow(nRadius, 2) + Math.pow(dHeight, 2));
            dVolume = (Math.PI) * (Math.pow(nRadius, 2)) * (dHeight / 3);
            dSurface = (Math.PI) * Math.pow(nRadius, 2) + (Math.PI) * nRadius * dSlant;
            //Final output
            System.out.println(nRadius + "\t \t" + nf.format(dVolume) + "\t \t" + nf.format(dSurface));
        }
    }
}
