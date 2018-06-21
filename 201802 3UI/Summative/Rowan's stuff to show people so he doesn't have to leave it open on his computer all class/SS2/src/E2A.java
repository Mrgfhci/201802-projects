/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vanrr7750
 */
import java.util.*;
public class E2A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nFahrenheit, nCentigrade;
        String sCtoF, sFtoC, sYes;
        sYes = "Yes";
        Scanner sin = new Scanner (System.in);
        System.out.println ("Would you like to convert from Centigrade to Fahrenheit?");
        sCtoF = sin.next();
        
        if (sCtoF.equals ("Yes")){
            System.out.println("Input the temperature in Centigrade:");
            nCentigrade = sin.nextInt();
            nFahrenheit = (nCentigrade*9)/5 +32;
            System.out.println("The temperature in Fahrenheit is " + nFahrenheit + "*.");
        }
        
        else if (sCtoF.equals("No")){
            System.out.println ("Would you like to convert from Fahrenheit to Centigrade?");
            sFtoC = sin.next();
            
            if (sFtoC.equals("Yes")){
                System.out.println("Input the temperature in Fahrenheit:");
                nFahrenheit = sin.nextInt();
                nCentigrade = ((nFahrenheit - 32)*5)/9;
                System.out.println("The temperature in Centigrade is " + nCentigrade + "*.");
            }
            
            else if (sFtoC.equals("No")){
                System.out.println ("Then I can't really do much for you can I?");
            }
            
            else {
                System.out.println ("Invalid input. Restart program and try again.");
            }    
        }
        
        else{
            System.out.println("Invalid input. Restart program and try again.");
        }
    }
}
