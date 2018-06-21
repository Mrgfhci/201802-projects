
//import java.util.*;
//import java.text.NumberFormat;
public class Intro {

    public static void main(String[] args) {
        int arnDice[] = new int[10000];
        int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0;
        for (int i = 0; i < arnDice.length; i++) {
            arnDice[i] = (int) (Math.random() * 6) + 1;
            if (arnDice[i] == 1) n1++;
            if (arnDice[i] == 2) n2++;
            if (arnDice[i] == 3) n3++;
            if (arnDice[i] == 4) n4++;
            if (arnDice[i] == 5) n5++;
            if (arnDice[i] == 6) n6++;
        }
        for (int i = 0; i < arnDice.length; i++) {
            System.out.println(arnDice[i]);
        }
        System.out.println ("Ones: " + n1);
        System.out.println ("Twos: " + n2);
        System.out.println ("Threes: " + n3);
        System.out.println ("Fours: " + n4);
        System.out.println ("Fives: " + n5);
        System.out.println ("Sixes: " + n6);
    }

}
