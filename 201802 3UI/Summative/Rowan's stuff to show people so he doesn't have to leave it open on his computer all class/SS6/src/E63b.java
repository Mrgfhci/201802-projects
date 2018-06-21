//I think this may be the most idiot-proof program I've ever written...
import java.util.*;
//import java.text.NumberFormat;
public class E63b {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sin = new Scanner (System.in);
        int nAns = (int)(Math.random() * 51) + 0, nGuess, nLowest = 0, nHighest = 51, nImbecile = 0;
        boolean arisGuessed[] = new boolean [51];
        System.out.println ("I'm thinking of a number from 0 to 50. Try to guess it."
                + " I'll even tell you if you're low or high, how's that?");
        while (true){
            nGuess = sin.nextInt();
            if (nImbecile == 10 && nGuess != nAns) {
                System.out.println ("Imbecile.");
                System.exit(0);
            }
            else if (nGuess > 50 || nGuess < 0) {
                System.out.println ("Dumbass.");
                nImbecile++;
            }
            else if (arisGuessed[nGuess] == true) {
                System.out.println ("Idiot.");
                nImbecile++;
            }
            else if (nGuess < nLowest || nGuess > nHighest) {
                System.out.println ("Moron.");
                arisGuessed[nGuess] = true;
                nImbecile++;
            }
            else if (nGuess == nAns) break;
            else if (nGuess < nAns) { 
                nLowest = nGuess;
                System.out.println ("Higher.");
                arisGuessed[nGuess] = true;
            }
            else if (nGuess > nAns) {
                nHighest = nGuess;
                System.out.println ("Lower.");
                arisGuessed[nGuess] = true;
            }
        }
        System.out.println ("Good job. You got it. Now get out.");
    }

}
