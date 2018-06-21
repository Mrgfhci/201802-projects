
import java.util.*;
import java.io.*;
//import java.lang.*;
//import java.text.NumberFormat;
//import javax.swing.JOptionPane;
public class E81g {
    
    public static void main(String[] args) throws IOException {
        Scanner sin = new Scanner(new FileReader("E81gIN.txt"));
        int nNum1, nNum2, nHCF;
        for (int i = 0; i < 4; i++){
            nNum1 = sin.nextInt();
            nNum2 = sin.nextInt();
            nHCF = hcf(nNum1, nNum2);
            System.out.println (nHCF);
        }
        sin.close();
    }
    
    public static int hcf(int nNum1, int nNum2){
        int nHCF = nNum1;
        while (true){
            if (nNum1 % nHCF == 0 && nNum2 % nHCF == 0) break;
            nHCF--;
        }
        return nHCF;
    }
}
