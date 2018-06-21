
import java.util.*;
import java.io.*;
//import java.lang.*;
//import java.text.NumberFormat;
//import javax.swing.JOptionPane;
public class E82c {
    
    public static void main(String[] args) throws IOException {
        Scanner sin = new Scanner (new FileReader ("E82cIN.txt"));
        int nX1a, nY1a, nX1b, nY1b, nX2a, nY2a, nX2b, nY2b;
        //It's beautiful I know
        nX1a = sin.nextInt();
        nY1a = sin.nextInt();
        nX1b = sin.nextInt();
        nY1b = sin.nextInt();
        nX2a = sin.nextInt();
        nY2a = sin.nextInt();
        nX2b = sin.nextInt();
        nY2b = sin.nextInt();
        //I wish computers were smart
        int nRise1, nRun1, nRise2, nRun2;
        nRise1 = nY1a - nY1b;
        nRun1 = nX1a - nX1b;
        nRise2 = nY2a - nY2b;
        nRun2 = nX2a - nX2b;
        if ((nRise1 / nRun1) == ((nRun2 / nRise2) * -1)){
            System.out.println ("The lines are perpendicular.");
        }
        else System.out.println ("The lines are not perpendicular.");
        sin.close();
    }

}
