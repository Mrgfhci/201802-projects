
import java.util.*;
//import java.lang.*;
//import java.text.NumberFormat;
//import javax.swing.JOptionPane;
public class E72b {
    
    public static void main(String[] args) {
        Scanner sin = new Scanner (System.in);
        String sFirst, sSecond;
        System.out.println ("Gimme your name:");
        sFirst = sin.next();
        sSecond = sin.next();
        if (!isGood(sFirst)) {
            sFirst = fixIt(sFirst);
            System.out.println ("You done messed up your own first name");
        }
        if (!isGood(sSecond)) {
            sSecond = fixIt(sSecond);
            System.out.println ("You done messed up your own second name");
        }
        System.out.println ("Your name is " + sFirst + " " + sSecond);
        
    }
    public static boolean isGood (String sName){
        char ch = sName.charAt(0);
        if (!Character.isUpperCase(ch)) return false;
        if (!Character.isLetter(ch)) return false;
        for (int a = 1; a < sName.length(); a++){
            ch = sName.charAt(a);
            if (!Character.isLowerCase(ch)) return false;
            if (!Character.isLetter(ch)) return false;
        }
        return true;
    }
    
    public static String fixIt(String sName){
        char ch = sName.charAt (0);
        String sNew = "";
        if (Character.isLetter(ch)) sNew += Character.toUpperCase(ch);
        for (int a  = ch + 1; a < sName.length(); a++){
            ch = sName.charAt(a);
            if (Character.isLetter(ch)) sNew += Character.toLowerCase(ch);
        }
        return sNew;
    }

}
