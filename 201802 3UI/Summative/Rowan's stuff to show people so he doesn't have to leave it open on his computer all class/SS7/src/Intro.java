
//import javax.swing.JOptionPane;
//import java.util.*;
//import java.text.NumberFormat;

public class Intro {

    public static void main(String[] args) {

        String sLine = "I sexually Identify as an Attack Helicopter. Ever since I was a boy I dreamed of soaring over the oilfields dropping hot sticky loads on disgusting foreigners. People say to me that a person being a helicopter is Impossible and I’m fucking retarded but I don’t care, I’m beautiful. I’m having a plastic surgeon install rotary blades, 30 mm cannons and AMG-114 Hellfire missiles on my body. From now on I want you guys to call me “Apache” and respect my right to kill from above and kill needlessly. If you can’t accept me you’re a heliphobe and need to check your vehicle privilege. Thank you for your understanding.";
        String[] arsParse = null; // parse means to split up
        arsParse = sLine.split(" ");
        output(arsParse);
    }

    public static void output(String[] arsWords) {
        System.out.println("------------");
        for (int i = 0; i < arsWords.length; i++) {
            System.out.println(arsWords[i]);
        }
        System.out.println("------------");
    }

}
