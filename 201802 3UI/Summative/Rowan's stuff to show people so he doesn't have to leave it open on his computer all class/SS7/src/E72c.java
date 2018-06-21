
import java.util.*;
//import java.lang.*;
//import java.text.NumberFormat;
//import javax.swing.JOptionPane;
public class E72c {
    
    public static void main(String[] args) {
        Scanner sin = new Scanner (System.in);
        String sWord;
        System.out.println ("Gimme a word:");
        sWord = sin.next();
        int arnE[] = new int [sWord.length()], nUsed = 0;
        char ch;
        for (int a = 0; a < sWord.length(); a++){
            ch = sWord.charAt(a);
            if (ch == 'e' || ch == 'E'){
                arnE[nUsed] = a;
                nUsed++;
            }
        }
        System.out.println ("There are " + (nUsed) + " e's. They're in positions ");
        for (int a = 0; a < nUsed; a++){
            System.out.println (arnE[a] + 1);
        }
    }

}
