
import java.util.*;
import java.io.*;
//import java.lang.*;
//import java.text.NumberFormat;
//import javax.swing.JOptionPane;
public class E81b {
    
    public static void main(String[] args) throws IOException {
        Scanner sin = new Scanner(new FileReader("E81bIN.txt"));
        String sFirst, sSecond;
        for (int i = 0; i < 6; i++){
            sFirst = sin.next();
            sSecond = sin.next();
            if (isGood(sFirst) && isGood(sSecond)){
                System.out.println (sFirst + " " + sSecond);
            }
        }
        sin.close();
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

}
