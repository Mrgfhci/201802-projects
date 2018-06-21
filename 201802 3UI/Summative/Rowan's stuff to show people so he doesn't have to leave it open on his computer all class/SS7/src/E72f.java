
import java.util.*;
//import java.lang.*;
//import java.text.NumberFormat;
//import javax.swing.JOptionPane;

public class E72f {

    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        String sWord;
        char ch;
        int nFirst = -1;
        System.out.println("Gimme a word:");
        sWord = sin.next();
        for (int i = 0; i < sWord.length(); i++) {
            ch = sWord.charAt(i);
            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || 
                    ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || 
                        ch == 'u' || ch == 'U' || ch == 'y' || ch == 'Y') {
                nFirst = i;
                break;
            }
        }
        if (nFirst == -1) System.out.println ("There are no vowels...");
        else {
            System.out.println("The first vowel is '" + sWord.charAt(nFirst) + 
                    "', which is letter number " + (nFirst + 1) + ".");
        }
    }

}
