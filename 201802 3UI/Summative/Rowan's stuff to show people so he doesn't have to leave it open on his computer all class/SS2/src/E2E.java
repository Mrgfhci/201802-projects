
import java.util.Scanner;
public class E2E {
    public static void main(String[] args) {
        int nNum, nAbs;
        Scanner sin = new Scanner (System.in);
        System.out.println ("Enter a number...");
        nNum = sin.nextInt();
        nAbs = nNum;
        if (nNum < 0){
            nAbs = nNum * -1;
        }
        System.out.println ("The absolute value of " + nNum + " is " + nAbs + ".");
    }
}
