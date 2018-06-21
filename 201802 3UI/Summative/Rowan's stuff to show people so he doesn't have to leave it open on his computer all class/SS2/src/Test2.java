/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * @author burns1520
 */
import java.util.*;
public class Test2 {
    //Shaelah Burnett
    public static void main(String[] args) {
        double dNum, dSum1, dSum2;
          Scanner sin = new Scanner (System.in);
        System.out.println ("Enter a number.");
        dNum = sin.nextDouble();
        dSum1 = dNum/2;
        dSum2 = dNum/3;
        if (dSum1 == 0){
            System.out.println ("The number is divisible by 2.");
        }
        else if (dSum2 == 0){
            System.out.println("The number is divisible by 3.");
        }
        else if (dSum1 != 0 && dSum2 != 0){
            System.out.println("The number is divisible by 2 and 3.");
        }
        else if (dSum1 != 0){
            System.out.println("The number is not divisible by 2.");
        }
        else if (dSum2 != 0){
            System.out.println("The number is not divisible by 3.");
        }
        else if (dSum2 != 0 && dSum1 != 0){
            System.out.println("The number is not divisible by 2 or 3.");
        }
    }
}
