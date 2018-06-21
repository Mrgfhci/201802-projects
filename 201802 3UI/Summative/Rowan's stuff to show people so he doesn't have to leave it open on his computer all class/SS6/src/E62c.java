
import java.util.*;
//import java.text.NumberFormat;
public class E62c {
    
    public static void main(String[] args) {
        //y = a(x - q)^2 + k
        Scanner sin = new Scanner (System.in);
        int nA, nQ, nK;
        int arnY[] = new int [9];
        System.out.println ("For equation y = a(x - q)^2 + k:");
        System.out.println ("Gimme the a:");
        nA = sin.nextInt();
        System.out.println ("Gimme the q:");
        nQ = sin.nextInt();
        System.out.println ("Gimme the k:");
        nK = sin.nextInt();
        System.out.println ("X\tY");
        for (int x = 0; x < arnY.length; x++){
            arnY[x] = nA * (((x - 4) - nQ) * ((x - 4) - nQ)) + nK;
            System.out.println(x - 4 + "\t" + arnY[x]);
        }
    }

}
