
import java.util.*;
//import java.lang.*;
//import java.text.NumberFormat;
//import javax.swing.JOptionPane;
public class E72d {
    
    public static void main(String[] args) {
        Scanner sin = new Scanner (System.in);
        String sName;
        System.out.println("Gimme your name:");
        sName = sin.nextLine();
        System.out.println("Your name backwards is:");
        for (int i = sName.length() - 1; i >= 0; i--){
            System.out.print (sName.charAt(i));
        }
        System.out.println ();
    }

}
