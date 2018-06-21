
import java.util.*;
import java.io.*;
//import java.lang.*;
//import java.text.NumberFormat;
//import javax.swing.JOptionPane;
public class E82b {
    
    public static void main(String[] args) throws IOException {
        Scanner sin = new Scanner (new FileReader ("E82bIN.txt"));
        String sLine = sin.nextLine();
        String[] arsParse; 
        arsParse = sLine.split(" ");
        int nLongest = arsParse[0].length();
        for (int i = 0; i < arsParse.length; i++){
            if (arsParse[i].length() > nLongest){
                nLongest = arsParse[i].length();
            }
        }
        System.out.println ("The longest word is " + nLongest + " characters long.");
        sin.close();
    }

}
