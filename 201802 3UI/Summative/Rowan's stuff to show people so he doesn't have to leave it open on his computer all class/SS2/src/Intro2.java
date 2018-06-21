/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vanrr7750
 */
import java.io.*;
public class Intro2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sNum;
        int nNum, nSquare;
        System.out.print("Please enter a number: ");
        sNum = br.readLine();
        nNum = Integer.parseInt(sNum); // this is the important part!!
        nSquare = nNum * nNum;
        System.out.println(nNum + " squared is " + nSquare);
    }
}
