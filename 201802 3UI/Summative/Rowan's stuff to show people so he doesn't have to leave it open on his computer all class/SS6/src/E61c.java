
import java.util.*;
//import java.text.NumberFormat;
public class E61c {
    
    public static void main(String[] args) {
        Scanner sin = new Scanner (System.in);
        int arnNums[] = new int [5], nHi = 0, nLo = 0;
        boolean isFull = false;
        String sRep;
        while (true){
            System.out.println("Do you want to input, output, or end?");
            sRep = sin.next();
            if (sRep.equals("Input") || sRep.equals("input")){
                for (int i = 0; i < 5; i++){
                    System.out.println ("Gimme a number:");
                    arnNums[i] = sin.nextInt();
                }
                isFull = true;
                nHi = arnNums[0];
                nLo = arnNums[0];
                for (int i = 1; i < 5; i++){
                    if (arnNums[i] > nHi){
                        nHi = arnNums[i];
                    }
                    if (arnNums[i] < nLo){
                        nLo = arnNums[i];
                    }
                }
            }
            else if (sRep.equals("Output") || sRep.equals("output")){
                if (isFull == false){
                    System.out.println ("You must input numbers before attempting to output them.");
                }
                else {
                    System.out.println ("Do you want the highest or the lowest number?");
                    if (sRep.equals("Highest") || sRep.equals("highest")){
                        System.out.println (nHi);
                    }
                    else if (sRep.equals("Lowest") || sRep.equals("lowest")){
                        System.out.println (nLo);
                    }
                    else {
                        System.out.println ("Invalid input. Try again.");
                    }
                }
            }
            else if (sRep.equals("End") || sRep.equals("end")){
                System.out.println ("Cy@");
                break;
            }
            else {
                System.out.println ("Invalid input. Try again owo.");
            }
        }
    }
}
