
import java.util.*;
//import java.text.NumberFormat;
public class E61b {
    
    public static void main(String[] args) {
        Scanner sin = new Scanner (System.in);
        int arnNums[] = new int [5], nAv = 0;
        String sRep;
        boolean isFull = false;
        while (true){
            System.out.println("Do you want to input, output, or end?");
            sRep = sin.next();
            if (sRep.equals("Input") || sRep.equals("input")){
                nAv = 0;
                for (int i = 0; i < 5; i++){
                    System.out.println ("Gimme a number:");
                    arnNums[i] = sin.nextInt();
                    nAv += arnNums[i];
                }
                nAv /= 5;
                isFull = true;
            }
            else if (sRep.equals("Output") || sRep.equals("output")){
                if (isFull == false){
                    System.out.println ("You must input numbers before attempting to output them.");
                }
                else {
                    for (int i = 0; i < 5; i++){
                        System.out.println (arnNums[i]);
                    }
                    System.out.println ("Average: " + nAv);
                }
            }
            else if (sRep.equals("End") || sRep.equals("end")){
                System.out.println ("Cy@");
                break;
            }
            else {
                System.out.println ("Invalid input. Try again.");
            }
        }
    }

}
