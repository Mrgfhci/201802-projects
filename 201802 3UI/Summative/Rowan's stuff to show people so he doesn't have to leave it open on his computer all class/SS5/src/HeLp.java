/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author burns1520
 */
import java.util.*;

public class HeLp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nGiven, nSqr;
        Scanner sin = new Scanner(System.in);
        while (true) {
            System.out.println("Pls gib number pls. Press the 0 if you wanna run away.");
            nGiven = sin.nextInt();
            if (nGiven == 0) break;
            nSqr = PlsSquare(nGiven);
            System.out.println(nGiven + " squared is " +nSqr + ".");
        }
    }
public static int PlsSquare (int nGiven){
   int nSqr = nGiven * nGiven;
   return (nSqr);
}
}
