
import java.util.*;
//import java.lang.*;
//import java.text.NumberFormat;
//import javax.swing.JOptionPane;
public class E72h {
    
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        String sLine, sOut = "";
        char ch;
        System.out.println("Gimme a sentence:");
        sLine = sin.nextLine();
        for (int i = 0; i < sLine.length(); i++) {
            ch = sLine.charAt(i);
            if (!(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || 
                    ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || 
                        ch == 'u' || ch == 'U' || ch == 'y' || ch == 'Y')) {
                sOut += ch;
            }
        }
        System.out.println ("Your sentence without vowels is:\n"
                + sOut);
    }

}
