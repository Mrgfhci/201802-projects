
//import java.util.*;
//import java.text.NumberFormat;
public class E62b {
    
    public static void main(String[] args) {
        int arnFreq[] = new int[31], nRand;
        System.out.println ("Thinking...");
        for (int i = 0; i < 2000; i++) {
            nRand = (int) (Math.random() * 21) + 10;
            arnFreq[nRand] ++;
        }
        for (int i = 10; i < arnFreq.length; i++){
            System.out.println (i + "'s :" + arnFreq[i]);
        }
    }

}
