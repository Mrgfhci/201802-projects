/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vanrr7750
 */
public class E42a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        char Char;
        Char = 'a';
        i = 1;
        while (i <= 26) {
            System.out.print(Char + " ");
            if ((Char - 1) % 5 == 0) {
                System.out.println("");
            }
            Char++;
            i++;
        }

    }
}
