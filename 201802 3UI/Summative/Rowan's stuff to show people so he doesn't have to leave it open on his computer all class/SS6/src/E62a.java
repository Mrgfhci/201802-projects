
//import java.util.*;
//import java.text.NumberFormat;
public class E62a {
    
    public static void main(String[] args) {
        int arnDice[] = new int[1000], nSum = 0;
        double d7 = 0, d11 = 0;
        for (int i = 0; i < arnDice.length; i++) {
            arnDice[i] = (int) (Math.random() * 11) + 2;
            System.out.println (arnDice[i]);
            nSum += arnDice[i];
            if (arnDice[i] == 7) d7++;
            if (arnDice[i] == 11) d11++;
        }
        System.out.println ("Sum: " + nSum +
                "\nProbability of a 7: " + d7 / 10 + "%" +
                "\nProbability of a 11: " + d11 / 10 + "%");
    }

}
