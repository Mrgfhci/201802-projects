
//import java.util.*;
//import java.text.NumberFormat;
public class E63a {
    
    public static void main(String[] args) {
        int arnP[] = new int [100], nTry = 1;
        boolean isPrime;
        for (int i = 0; i < 100; i++){
            nTry++;
            isPrime = isPrime(nTry);
            if (isPrime == true){
                arnP[i] = nTry;
            }
            else i--;
        }
        System.out.println ("The first 100 prime numbers are:");
        for (int i = 0; i < 100; i++){
            System.out.println (arnP[i]);
        }
    }
    
    public static boolean isPrime(int nTry){
        for (int i = nTry - 1; i > 1; i --){
            if (nTry % i == 0){
                return false;
            }
        }
        return true;
    }

}