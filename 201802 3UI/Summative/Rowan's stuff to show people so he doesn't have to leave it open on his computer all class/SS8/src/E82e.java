
import java.util.*;
import java.io.*;
//import java.lang.*;
//import java.text.NumberFormat;
//import javax.swing.JOptionPane;
public class E82e {
    
    public static void main(String[] args) throws IOException {
        Scanner sin = new Scanner (new FileReader ("E82eIN.txt"));
        int nX1, nY1, nX2, nY2, nX3, nY3;
        double dL1, dL2, dL3;
        double dBig, dMid, dLit;
        double dABig, dAMid, dALit;
        nX1 = sin.nextInt();
        nY1 = sin.nextInt();
        nX2 = sin.nextInt();
        nY2 = sin.nextInt();
        nX3 = sin.nextInt();
        nY3 = sin.nextInt();
        dL1 = Math.sqrt(Math.pow((nX3 - nX2), 2) + Math.pow((nY3 - nY2), 2));
        dL2 = Math.sqrt(Math.pow((nX3 - nX1), 2) + Math.pow((nY3 - nY1), 2));
        dL3 = Math.sqrt(Math.pow((nX2 - nX1), 2) + Math.pow((nY2 - nY1), 2));
        dBig = dL1;
        if (dL2 > dBig) {
            dMid = dBig;
            dBig = dL2;
        }
        else {
            dMid = dL2;
        }
        if (dL3 > dBig){
            dLit = dMid;
            dMid = dBig;
            dBig = dL3;
        }
        else if (dL3 > dMid){
            dLit = dMid;
            dMid = dL3;
        }
        else {
            dLit = dL3;
        }
        dABig = Math.acos((Math.pow(dMid, 2) + Math.pow(dLit, 2) - Math.pow(dBig, 2)) / (2 * dMid * dLit))*180/Math.PI;
        dAMid = Math.asin((dMid * Math.sin(dABig / 180 * Math.PI)) / dBig)*180/Math.PI;
        dALit = 180 - dABig - dAMid;
//        System.out.println (dABig);
//        System.out.println (dAMid);
//        System.out.println (dALit);
        if (dABig == dAMid && dABig == dALit){
            System.out.println ("The triangle is equilateral.");
        }
        else if (dABig == dAMid || dAMid == dALit || dALit == dABig){
            System.out.println ("The triangle is isosceles.");
        }
        else {
            System.out.println ("The triangle is neither equilateral or isosceles.");
        }
        if (dABig > 89 && dABig < 91){
            System.out.println ("The hypoteneuse is the side that is " + dBig + " units long.");
        }
        else if (dAMid > 89 && dAMid < 91){
            System.out.println ("The hypoteneuse is the side that is " + dMid + " units long.");
        }
        else if (dALit > 89 && dALit < 91){
            System.out.println ("The hypoteneuse is the side that is " + dLit + " units long.");
        }
        else System.out.println ("The triangle is not right, therefore there is no hypoteneuse.");
        sin.close();
    }

}
