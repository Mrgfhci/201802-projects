
import java.util.*;
//import java.lang.*;
//import java.text.NumberFormat;
//import javax.swing.JOptionPane;
public class E72i {
    
    public static void main(String[] args) {
        Scanner sin = new Scanner (System.in);
        char ch1;
        System.out.println ("Gimme a sentence:");
        String sLine = sin.nextLine();
        System.out.println ("Which letter would you like to encode?");
        String sCh = sin.next();
        char ch = sCh.charAt(0);
        System.out.println ("What would you like the number key to be?");
        int nKey = sin.nextInt();
        String sNew = "";
        for (int i = 0; i < sLine.length(); i++){
            if (sLine.charAt(i) != ch){
                sNew += sLine.charAt(i);
            }
            else {
                ch1 = sLine.charAt(i);
                if (ch1 + nKey > 26) sNew += ch1 + nKey - 26;
                else sNew += ch1 + nKey;
                System.out.println (ch1 + "               " + nKey);
            }
        }
        System.out.println ("Your encoded sentence is:\n"
                + sNew);
    }

}
