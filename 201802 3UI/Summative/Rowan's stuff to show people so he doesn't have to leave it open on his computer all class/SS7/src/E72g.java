
import java.util.*;
//import java.lang.*;
//import java.text.NumberFormat;
//import javax.swing.JOptionPane;
public class E72g {
    
    public static void main(String[] args) {
        Scanner sin = new Scanner (System.in);
        System.out.println ("Gimme a number:");
        String sNum = sin.next();
        int nCh, nRack = 0;
        char ch;
        for (int i = 0; i < sNum.length(); i++){
            ch = sNum.charAt(i);
            nCh = ch - '0';
            nRack += nCh;
        }
        if (nRack % 3 == 0) System.out.println ("The number is divisible by 3.");
        else System.out.println ("The number is not divisible by 3.");
    }

}
