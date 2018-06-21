
import java.util.*;
import java.io.*;
//import java.lang.*;
//import java.text.NumberFormat;
//import javax.swing.JOptionPane;

public class E81d {

    public static void main(String[] args) throws IOException {
        Scanner sin = new Scanner(new FileReader("E81dIN.txt"));
        Scanner sIn = new Scanner (System.in);
        String sFirst, sLast, sRate, sChoice;
        double dRate;
        int nHrs;
        boolean b300 = false;
        System.out.println ("Do you want all employees, or only over those over $300?");
        System.out.println ("(Reply 'All' or 'Over')");
        sChoice = sIn.next();
        if (sChoice.equals("All") || sChoice.equals("all")){
            b300 = false;
        }
        else if (sChoice.equals("Over") || sChoice.equals("over")){
            b300 = true;
        }
        else {
            System.out.println ("Invalid input. Restart the program and try again.");
            sin.close();
            System.exit(0);
        }
        for (int i = 0; i < 4; i++) {
            sFirst = sin.next();
            sLast = sin.next();
            sRate = sin.next(); // notice that a double must be read in as a string and then converted.
            nHrs = sin.nextInt();
            dRate = Double.valueOf(sRate);
            if (b300 == false || (dRate * nHrs) >= 300){
                  System.out.println (sFirst + " " + sLast + " $" + (dRate * nHrs));
            }
        }
        sin.close();
    }
}


