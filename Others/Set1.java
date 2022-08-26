import java.util.Scanner;
import java.lang.Math;

public class Set1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        int testCases = sc.nextInt(), range, totalSum;
        
        for (int c=0; c<testCases; c++) {
            range = sc.nextInt(); totalSum = 0;
            totalSum = range*(range+1)/2;
            totalSum -= allPowersOf2(range);
            System.out.println (totalSum);
        }
        sc.close();
    }
    
    public static int allPowersOf2 (int range) {
        int sumOfAllPowersOf2 = 0;
        for (int i=0; i<= (int) (Math.log(range)/Math.log(2)); i++) sumOfAllPowersOf2 += Math.pow(2, i);
        if (range <3) return sumOfAllPowersOf2;
        return sumOfAllPowersOf2*2;
    }
}