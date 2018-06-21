//SHAELAH BURNETT
import java.util.*;

public class TestSS3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double dRadius, dHeight, dSlopeS, dSlope, dSA1, dSA2, dSuArea, dV1, dV2, dVolume;
        Scanner sin = new Scanner(System.in);
        System.out.println("Give me a height..");
        dHeight = sin.nextInt();
        for (dRadius = 1; dRadius < 11; dRadius++) {
            dSlopeS = Math.pow(dRadius, 2) + Math.pow(dHeight, 2);
            dSlope = Math.sqrt(dSlopeS);
            dSA1 = Math.PI * (Math.pow(dRadius, 2));
            dSA2 = Math.PI * dRadius * dSlope;
            dSuArea = dSA1 + dSA2;
            dV1 = 1/3;
            dV2 = Math.PI*Math.pow(dRadius, 2)*dHeight;
            dVolume = dV1*dV2;
             System.out.println ("Radius \t Volume \t Surface Area");
             System.out.println (dRadius + "\t" + dVolume + "\t" + dSuArea);
        }

        }
    }
    