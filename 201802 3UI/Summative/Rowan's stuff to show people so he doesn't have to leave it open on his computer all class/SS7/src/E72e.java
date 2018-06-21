
import java.util.*;
//import java.lang.*;
//import java.text.NumberFormat;
//import javax.swing.JOptionPane;
public class E72e {
    
    public static void main(String[] args) {
        Scanner sin = new Scanner (System.in);
        int nWords = 0;
        System.out.println ("Gimme a sentence:");
        String sLine = sin.nextLine();
        String[] arsParse; 
        arsParse = sLine.split(" ");
        //System.out.println ("There are " + arsParse.length + " words.");
        //Took this out because if you had a double space it would count another word
        for (int i = 0; i < arsParse.length; i++){
            if (!arsParse[i].equals("")) nWords++;
        }
        System.out.println ("There are " + nWords + " words.");
    }

}
