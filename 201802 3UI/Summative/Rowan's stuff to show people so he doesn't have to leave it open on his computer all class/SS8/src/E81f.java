
import java.util.*;
import java.io.*;
//import java.lang.*;
import java.text.NumberFormat;
//import javax.swing.JOptionPane;
public class E81f {
    
    public static void main(String[] args) throws IOException {
        Scanner sin = new Scanner(new FileReader("E81fIN.txt"));
        NumberFormat nf = NumberFormat.getNumberInstance(); 
        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(2);
        String sFirst, sSecond;
        int nNum;
        double dOwed;
        for (int i = 0; i < 5; i++){
            sFirst = sin.next();
            sSecond = sin.next();
            nNum = sin.nextInt();
            dOwed = nNum * 0.15;
            if (nNum <= 5) System.out.println (sFirst + " " + sSecond + " $0.00");
            if (nNum > 5) System.out.println (sFirst + " " + sSecond + " $" + nf.format(dOwed));
        }
        sin.close();
    }

}
