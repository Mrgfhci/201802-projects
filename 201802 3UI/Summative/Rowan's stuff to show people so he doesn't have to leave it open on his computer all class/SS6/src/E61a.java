
import java.util.*;
//import java.text.NumberFormat;
public class E61a {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sin = new Scanner (System.in);
        int arnMark[] = new int [4], nSum = 0;
        for (int i = 0; i < arnMark.length ; i++){
            System.out.println ("Gimme a mark:");
            arnMark[i] = sin.nextInt();
        }
        for (int i = 0; i < arnMark.length; i++){
            nSum += arnMark[i];
        }
        System.out.println ("Your average is " + (nSum / arnMark.length));
    }

}
