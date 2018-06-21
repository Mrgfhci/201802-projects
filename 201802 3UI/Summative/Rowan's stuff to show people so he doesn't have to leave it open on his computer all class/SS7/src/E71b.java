
import java.util.*;
//import java.lang.*;
//import java.text.NumberFormat;
//import javax.swing.JOptionPane;
public class E71b {
    
    public static void main(String[] args) {
        Scanner sin = new Scanner (System.in);
        String sIn;
        char ch;
        System.out.println ("Gimme a letter or a number");
        System.out.println ("If you give me more I'll just use the first one");
        sIn = sin.next();
        ch = sIn.charAt(0);
        if (Character.isDigit(ch)) System.out.println ("It is a number");
        else if (Character.isLetter(ch)) {
            System.out.print ("It is a letter");
            if (Character.isUpperCase(ch)) System.out.print(", and an upper case one too");
            else System.out.print (", and a lower case one too");
        }
        else System.out.println ("That is not a letter or a number, is it now?");
        
    }
}
