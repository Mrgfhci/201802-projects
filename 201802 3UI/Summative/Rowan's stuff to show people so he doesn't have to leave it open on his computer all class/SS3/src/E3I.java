
import java.util.Scanner;
public class E3I {

    public static void main(String[] args) {
        // TODO code application logic here
                Scanner sin = new Scanner (System.in);
        int nNum1In, nNum1R, nNum2, nNumRack;
        nNumRack = 0;
        System.out.println ("Gimme the first number in centigrade:");
        nNum1In = sin.nextInt() *9 /5 +32;
        System.out.println ("Gimme the second number in centigrade:");
        nNum2 = sin.nextInt() *9 /5 +32;
        nNum1R = nNum1In;
        System.out.print ("Range (Fahrenheit): ");
        for ( ; nNum1R != nNum2 + 1; nNum1R++){
            nNumRack += nNum1R;
            System.out.print (nNum1R);
            if (nNum1R != nNum2){
                System.out.print (", ");
            }
            else {
                System.out.print (".");
            }
        }
        System.out.println ("");
        System.out.println ("The sum of all the numbers in the range is " + nNumRack + ".");
    }
}
