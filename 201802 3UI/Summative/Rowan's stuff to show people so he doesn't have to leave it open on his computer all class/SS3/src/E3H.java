import java.util.*;
public class E3H {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sin = new Scanner (System.in);
        double dNum1In, dNum1R, dNum2, dNumRack;
        dNumRack = 0;
        System.out.println ("Gimme a number:");
        dNum1In = sin.nextDouble();
        System.out.println ("Gimme another number:");
        dNum2 = sin.nextDouble();
        dNum1R = dNum1In;
        System.out.print ("Range: ");
        for ( ; dNum1R != dNum2 + 1; dNum1R++){
            dNumRack += dNum1R;
            System.out.print (dNum1R);
            if (dNum1R != dNum2){
                System.out.print (", ");
            }
            else {
                System.out.print (".");
            }
        }
        System.out.println ("");
        System.out.println ("The sum of all the numbers in the range is " + dNumRack + ".");
    }
}
