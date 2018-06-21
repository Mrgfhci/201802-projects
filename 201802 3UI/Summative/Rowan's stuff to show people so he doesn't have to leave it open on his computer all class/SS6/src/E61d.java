
import java.util.*;
//import java.text.NumberFormat;

public class E61d {

    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int arnNums[] = new int[20], nUsed = 0, nSum = 0, nAv = 0, nHi, nLo;
        System.out.println("Input up to " + arnNums.length + " numbers (input 0 when done):");
        for (int i = 0; i < arnNums.length; i++) {
            arnNums[i] = sin.nextInt();
            nSum += arnNums[i];
            if (arnNums[i] == 0) {
                nUsed = i;
                break;
            }
            else nUsed = 20;
        }
        nHi = arnNums[0];
        nLo = arnNums[0];
        for (int i = 1; i < nUsed; i++) {
            if (arnNums[i] > nHi) {
                nHi = arnNums[i];
            }
            if (arnNums[i] < nLo) {
                nLo = arnNums[i];
            }
        }
        nAv = nSum / nUsed;
        System.out.println ("Sum: " + nSum + 
                "\nAverage: " + nAv +
                "\nHighest: " + nHi +
                "\nLowest: " + nLo);
    }
}
