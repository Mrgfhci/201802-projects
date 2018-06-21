
import java.util.*;
import java.io.*;
//import java.lang.*;
//import java.text.NumberFormat;
//import javax.swing.JOptionPane;
public class E81a {

    public static void main(String[] args) throws IOException {
        Scanner sin = new Scanner(new FileReader("E81aIN.txt"));
        int arnNum[] = new int[4];
        for (int i = 0; i < 4; i++) {// read in 4 lines of marks.
            for (int j = 0; j < 4; j++) { // 4 marks per line
                arnNum[j] = sin.nextInt();
                System.out.print(arnNum[j] + " ");
            }
            System.out.println();
        }
        sin.close();
    }

}
