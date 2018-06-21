
import java.util.*;
import java.io.*;
//import java.lang.*;
//import java.text.NumberFormat;
//import javax.swing.JOptionPane;
public class E82f {
    
    public static void main(String[] args) throws IOException {
        Scanner sin = new Scanner (new FileReader ("E82fIN.txt"));
        int nStart, nStop, nDiff;
        nStart = sin.nextInt();
        nStop = sin.nextInt();
        if (nStop >= nStart){
            nDiff = nStop - nStart;
            if (nStart%100 > nStop%100){
                nDiff -=40;
            }
        }
        else {
            nDiff = 2400 - nStart + nStop;
            if (nDiff%100 != 0){
                nDiff -= 40;
            }
        }
        System.out.println ("The times are " + nDiff + " hours apart.");
        sin.close();
    }

}
