
import java.util.*;
import java.io.*;
//import java.lang.*;
//import java.text.NumberFormat;
//import javax.swing.JOptionPane;
public class E81c {
    
    public static void main(String[] args) throws IOException {
        Scanner sin = new Scanner(new FileReader("E81cIN.txt"));
        int nWords = 0, nE = 0;
        String sLine = sin.nextLine();
        String[] arsParse; 
        arsParse = sLine.split(" ");
        int nLength[] = new int [arsParse.length];
        for (int i = 0; i < arsParse.length; i++){
            if (!arsParse[i].equals("")){
                nWords++;
                for (int a = 0; a < arsParse[i].length(); a++){
                    if (arsParse[i].charAt(a) != '.' && arsParse[i].charAt(a) != '!' &&
                            arsParse[i].charAt(a) != '?' && arsParse[i].charAt(a) != ','){
                    nLength[i]++;
                    }
                    if (arsParse[i].charAt(a) == 'e' || arsParse[i].charAt(a) == 'E') nE++;
                }
            }
        }
        System.out.println ("There are " + nWords + " words.");
        System.out.print ("The lengths of the words, in order, are: ");
        for (int i = 0; i < nWords; i++){
            System.out.print (nLength[i] + " ");
        }
        System.out.println (". \nThere are " + nE + " E's.");
        sin.close();
    }

}
