
import java.util.Scanner;

public class E51b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nClass1, nClass2, nClass3, nClass4, nAverage;
        nClass1= askMark();
        nClass2= askMark();
        nClass3= askMark();
        nClass4= askMark();
        nAverage = (nClass1 + nClass2 + nClass3 + nClass4) / 4;
        System.out.println("Your average is " + nAverage + "%.");
    }
    public static int askMark(){
        int nMark;
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter mark:");
        nMark = sin.nextInt();
        return nMark;
    }
}
