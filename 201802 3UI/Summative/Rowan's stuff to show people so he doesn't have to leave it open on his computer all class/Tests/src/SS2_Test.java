//Rowan van Rhijn
//Test 2
//21/2/18

import java.util.*;

public class SS2_Test {

    public static void main(String[] args) {
        //Declaring variables and scanner
        int nInput, nMod2, nMod3;
        Scanner sin = new Scanner(System.in);
        //Starting input sequence and the accompanying math
        System.out.println("Gimme an integer:");
        nInput = sin.nextInt();
        nMod2 = nInput % 2;
        nMod3 = nInput % 3;
        //If structure and answer output
        if (nInput == 0){
            System.out.println("Well, technically, 0 IS divisible by 2 and 3.");
        }
        else if (nMod2 == 0 && nMod3 == 0) {
            System.out.println(nInput + " is divisible by 2 and 3.");
        } 
        else if (nMod2 == 0 && nMod3 != 0) {
            System.out.println(nInput + " is divisible by 2.");
        } 
        else if (nMod2 != 0 && nMod3 == 0) {
            System.out.println(nInput + " is divisible by 3.");
        } 
        else if (nMod2 != 0 && nMod3 != 0) {
            System.out.println(nInput + " is not divisible by 2 or 3.");
        } 
        //Just in case of some other scenario
        else {
            System.out.println("Invalid input. Please try again.");
        }
    }
}
