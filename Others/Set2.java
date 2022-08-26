import java.util.Scanner;

public class Set2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        int testCases = sc.nextInt(), length, operations, minVal;
        
        for (int c=0; c<testCases; c++) {
            length = sc.nextInt();
            operations = sc.nextInt();
            String s = sc.next();
            int [] binArray = new int [length];
            for (int i=0; i<length; i++) binArray [i] = (int) (s.charAt(i)) - 48;

            binArray = makeOperations(binArray, operations);
            minVal = calculateValue(binArray);
            System.out.println (minVal);
        }
    sc.close();
    }

    public static int[] makeOperations (int [] binArray, int operations) {

        for (int i=binArray.length-2; i>-1; i--) {
            if (binArray [binArray.length-1] == 0) {
                if ((binArray[i] == 1) && ((binArray.length -1 - i) <= operations)) {
                    binArray [i] = 0;
                    binArray [binArray.length-1] = 1;
                    operations -= (binArray.length -1 - i);
                    break;
                }
                else if ((binArray.length -1 - i) > operations) break;
            }
        }

        for (int i=1; i<binArray.length-1; i++) {
            if (binArray [0] == 0) {
                if ((binArray [i] == 1) && (i <= operations)) {
                    binArray [i] = 0;
                    binArray [0] = 1;
                    break;
                }
                else if (i > operations) break;
            }
        }
        return binArray;
    }

    public static int calculateValue (int [] binArray) {
        
        int total1s=0, val = 0;
        for (int i=0; i<binArray.length; i++) if (binArray[i] == 1) total1s+= 1;
        val = total1s*11;
        
        if ( binArray[0] == 1) val -= 1;
        if (binArray [binArray.length-1] == 1) val -= 10;

        return val;
    }
}