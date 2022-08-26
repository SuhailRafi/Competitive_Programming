import java.util.Scanner;

public class Set3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        int testCases = sc.nextInt();
        
        for (int c=0; c<testCases; c++) {
            int n = sc.nextInt();
            int [] arr = new int [n];
            String s = sc.next();
            for (int i = 0; i<arr.length; i++) arr [i] = Character.getNumericValue(s.charAt(i));

            boolean result = checkIfGaussianCurveExists (arr, 0, arr.length-1);
            System.out.println (result==true? "YES":"NO");
        }
        sc.close();
    }

    public static int checkIfNotDescending (int [] arr, int start, int end) {
        int status=-1;
        for (int i = start; i<end; i++) {
            if (arr[i] > arr[i+1]) {
                status = i;
                break;
            }
        }
        return status;
    }

    public static int checkIfNotAscending (int [] arr, int start, int end) {
        int status=-1;
        for (int i = start; i<end; i++) {
            if (arr[i] < arr[i+1]) {
                status = i;
                break;
            }
        }
        return status;
    }

    public static boolean checkIfGaussianCurveExists (int [] arr, int start, int end) {
        int idx;
        
            idx = checkIfNotDescending (arr, start, end);
            if (idx == -1) return true;
            else if (idx != -1) {
                int tempStart = idx;
                idx = -1;
                idx = checkIfNotAscending (arr, tempStart, end);
                if (idx == -1) return true;
            }
        return false;
    }
}