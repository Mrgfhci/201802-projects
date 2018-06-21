//Rowan van Rhijn
//Test 4
//21/3/18

//I get a headache looking at all this code uncommented honestly
//I don't lose marks for having lots of comments do I
import java.util.*;

public class SS4_Test {

    public static void main(String[] args) {
        //Declaring variables and scanner
        int nSize, nMine1, nMine2;
        Scanner sin = new Scanner(System.in);
        //First question and answer
        System.out.println("How big is the map? (Between 1 and 30)");
        nSize = sin.nextInt();
        //If it's the right size, I know you said not to but I forgot until
        //after I'd coded it and saw no point deleting it
        if (nSize >= 1 && nSize <= 30) {
            //Second question and answer
            System.out.println("Where will the first mine be?");
            nMine1 = sin.nextInt();
            //No grenades in minesweeper
            if (nMine1 > nSize || nMine1 < 1) {
                System.out.println("Invalid input. Restart and retry.");
            } 
            else {
                //Same thing again, second mine
                System.out.println("Where will the second mine be?");
                nMine2 = sin.nextInt();
                //Dunno how they'd ever trip this if they got past the first one
                if (nMine2 > nSize || nMine2 < 1) {
                    System.out.println("Invalid input. Restart and retry.");
                } 
                else {
                    //Loop to print the map
                    for (int i = 1; i <= nSize; i++) {
                        if (i == nMine1 || i == nMine2) {
                            System.out.print("* ");
                        } 
                        else {
                            System.out.print(". ");
                        } //A
                    } //Lot
                } //Of
            } //Brackets
        } 
        //Last part of the totally necessary error checking for the initial input 
        else {
            System.out.println("Invalid input. Restart and retry.");
        }
    }
}
