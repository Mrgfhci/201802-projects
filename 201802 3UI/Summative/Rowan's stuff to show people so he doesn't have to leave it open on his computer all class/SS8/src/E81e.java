
import java.util.*;
import java.io.*;
//import java.lang.*;
//import java.text.NumberFormat;
//import javax.swing.JOptionPane;
public class E81e {
    
    public static void main(String[] args) throws IOException {
        Scanner sin = new Scanner(new FileReader("E81eIN.txt"));
        Scanner sIn = new Scanner(System.in);
        System.out.println ("Would you like to:\n" + 
                "a. Display names and averages of all students\n" + 
                "b. Display students with an 80% or higher in history\n" + 
                "c. Display students that passed all three courses\n" + 
                "d. Display students that passed either math or english\n" + 
                "e. Display students that failed one or no courses");
        char cAns = sIn.next().charAt(0);
        String sFirst, sSecond;
        int nHis, nMat, nEng;
        if (cAns != 'A' || cAns != 'a' || cAns != 'B' || cAns != 'b' || 
                cAns != 'C' || cAns != 'c' || cAns != 'D' || cAns != 'd' ||
                    cAns != 'E' || cAns != 'e'){
            System.out.println ("Invalid input. Restart the program and try again.");
            System.exit(0);
        }
        for (int i = 0; i < 7; i++){
            sFirst = sin.next();
            sSecond = sin.next();
            nHis = sin.nextInt();
            nMat = sin.nextInt();
            nEng = sin.nextInt();
            if (cAns == 'A' || cAns == 'a'){
                System.out.println (sFirst + " " + sSecond + " (" + ((nHis + nMat + nEng) / 3) + ")");
            }
            if ((cAns == 'B' || cAns == 'b') && nHis >= 80){
                System.out.println (sFirst + " " + sSecond + " (" + nHis + ")");
            }
            if ((cAns == 'C' || cAns == 'c') && nHis >= 50 && nMat >= 50 && nEng >= 50){
                System.out.println (sFirst + " " + sSecond);
            }
            if ((cAns == 'D' || cAns == 'd') && (nMat >= 50 || nEng >= 50)){
                System.out.println (sFirst + " " + sSecond);
            }
            if ((cAns == 'E' || cAns == 'e') && ((nHis >= 50 && nMat >= 50) || 
                    (nMat >= 50 && nEng >= 50) || (nHis >= 50 && nEng >= 50))){
                System.out.println (sFirst + " " + sSecond);
            }
        }
        sin.close();
    }

}
