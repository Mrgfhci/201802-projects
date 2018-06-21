
import java.util.*;
import java.io.*;
//import java.lang.*;
//import java.text.NumberFormat;
//import javax.swing.JOptionPane;
public class E82d {
    
    public static void main(String[] args) throws IOException {
        Scanner sin = new Scanner (new FileReader ("E82dIN.txt"));
        int nX1, nX2, nX3, nY1, nY2, nY3;
        int nXMid, nYMid, nXCent, nYCent;
        nX1 = sin.nextInt();
        nY1 = sin.nextInt();
        nX2 = sin.nextInt();
        nY2 = sin.nextInt();
        nX3 = sin.nextInt();
        nY3 = sin.nextInt();
        nXMid = (nX2 + nX3) / 2;
        nYMid = (nY2 + nY3) / 2;
        nXCent = nX1 + ((nXMid - nX1) * 2 / 3);
        nYCent = nY1 + ((nYMid - nY1) * 2 / 3);
        System.out.println ("The centroid is at (" + nXCent + ", " + nYCent + ").");
        sin.close();
    }

}
