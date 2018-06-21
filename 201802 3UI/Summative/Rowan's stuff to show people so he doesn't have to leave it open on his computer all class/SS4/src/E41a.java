import java.util.*;

public class E41a {

    public static void main(String[] args) {
        //Declaring variables
        String sShape, sMeasure;
        double dRad, dLength, dWidth, dOutput;
        Scanner sin = new Scanner (System.in);
        //Initial question
        System.out.println ("Do you want to calculate a rectangle or a circle?");
        sShape = sin.next();
        //Circle route
        if (sShape.equals("Circle") || sShape.equals("circle")){
            System.out.println ("Do you want to calculate the circumference or the area?");
            sMeasure = sin.next();
            //Circumference route
            if (sMeasure.equals("Circumference") || sMeasure.equals("circumference")){
                System.out.println ("Okay, what's the radius of the circle?");
                dRad = sin.nextDouble();
                dOutput = 2 * dRad * Math.PI;
                System.out.println ("The circumference of the circle is " + dOutput + ".");
            }
            //Area route
            else if (sMeasure.equals("Area") || sMeasure.equals("area")){
                System.out.println ("Okay, what's the radius of the circle?");
                dRad = sin.nextDouble();
                dOutput = Math.PI * Math.pow(dRad, 2);
                System.out.println ("The area of the circle is " + dOutput + ".");
            }
            //In case of another answer
            else {
                System.out.println ("Invalid input. Restart the program and try again.");
            }
        }
        //Rectangle route
        else if (sShape.equals("Rectangle") || sShape.equals("rectangle")){
            System.out.println ("Do you want to calculate the perimeter or the area?");
            sMeasure = sin.next();
            //Perimeter route
            if (sMeasure.equals("Perimeter") || sMeasure.equals("perimeter")){
                System.out.println ("Okay, what's the length of the rectangle?");
                dLength = sin.nextDouble();
                System.out.println ("And the width?");
                dWidth = sin.nextDouble();
                dOutput = 2 * dLength + 2 * dWidth;
                System.out.println ("The perimeter of the rectangle is " + dOutput + ".");
            }
            //Area route
            else if (sMeasure.equals("Area") || sMeasure.equals("area")){
                System.out.println ("Okay, what's the length of the rectangle?");
                dLength = sin.nextDouble();
                System.out.println ("And the width?");
                dWidth = sin.nextDouble();
                dOutput = dLength * dWidth;
                System.out.println ("The area of the rectangle is " + dOutput + ".");
            }
            //In case of another answer
            else {
                System.out.println ("Invalid input. Restart the program and try again.");
            }
        }
        //In case of another answer
        else {
            System.out.println ("Invalid input. Restart the program and try again.");
        }
    }
}
