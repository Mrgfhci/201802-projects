
import java.util.*;
//import java.text.NumberFormat;
//import javax.swing.JOptionPane;
public class E71a {
    
    public static void main(String[] args) {
        String sRee;
        Scanner sin = new Scanner (System.in);
        System.out.println ("Gimme a letter:");
        sRee = sin.next();
        if (sRee.toUpperCase().equals(sRee)) System.out.println ("It's upper case... Woah...");
        else if (sRee.toLowerCase().equals(sRee))System.out.println ("It's lower case... Cool...");
        else System.out.println ("It's a bit of both... Hey... That's not one letter...");
        //Only problem with this is inputting a non-letter thing still returns true
    }

}
