
import java.util.*;
import java.io.*;
//import java.lang.*;
//import java.text.NumberFormat;
//import javax.swing.JOptionPane;
public class E82a {
    
    public static void main(String[] args) throws IOException {
        Scanner sin = new Scanner (new FileReader ("E82aIN.txt"));
        String sLine = sin.nextLine();
        String[] arsParse; 
        arsParse = sLine.split(" ");
        int nWords = 0;
        for (int i = 0; i < arsParse.length; i++){
            if (!arsParse[i].equals("")){
                nWords++;
            }
        }
        System.out.println ("There are " + nWords + " words.");
        sin.close();
    }

}
